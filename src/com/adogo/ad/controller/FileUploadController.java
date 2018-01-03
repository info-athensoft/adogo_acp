package com.adogo.ad.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/resource/")
public class FileUploadController {

	private static final Logger logger = Logger.getLogger(FileUploadController.class);

	private static final String RESP_SUCCESS = "{\"jsonrpc\" : \"2.0\", \"result\" : \"OK\", \"id\" : \"id\"}";
	private static final String RESP_ERROR = "{\"jsonrpc\" : \"2.0\", \"error\" : {\"code\": 101, \"message\": \"Failed to open input stream.\"}, \"id\" : \"id\"}";

	private int chunk;
	private int chunks;
	private String name;
	private String user;
	private String time;
	// private String curl; //TODO

	private static Properties pro = new Properties();

	/**
	 * upload files and then create corresponding records
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/image/upload", produces = "application/json")
	@ResponseBody
	public Map<String, Object> imageUpload(HttpServletRequest request) {
		logger.info("entering... /resource/image/upload");

		// parameter
		String advertiserId = (String) request.getParameter("advertiserId");
		logger.info("advertiserId=" + advertiserId);
		
		// parameter
		String bizId = (String) request.getParameter("bizId");
		logger.info("bizId=" + bizId);

		String responseString = RESP_SUCCESS;

		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		logger.info("isMultipart:" + isMultipart);

		if (isMultipart) {
			ServletFileUpload upload = new ServletFileUpload();
			try {
				FileItemIterator iter = upload.getItemIterator(request);
				while (iter.hasNext()) {
					FileItemStream item = iter.next();
					InputStream input = item.openStream();

					// Handle a form field
					if (item.isFormField()) {
						String fieldName = item.getFieldName();
						String value = Streams.asString(input);

						if ("name".equals(fieldName)) {
							this.name = value;
						} else if ("chunks".equals(fieldName)) {
							this.chunks = Integer.parseInt(value);
						} else if ("chunk".equals(fieldName)) {
							this.chunk = Integer.parseInt(value);
						} else if ("user".equals(fieldName)) {
							this.user = value;
						} else if ("time".equals(fieldName)) {
							this.time = value;
						} 
						//else if("curl".equals(fieldName)){ this.curl = value; }
						
						logger.info("name:" + this.name);
						logger.info("chunks:" + this.chunks);
						logger.info("chunk:" + this.chunk);
						logger.info("user:" + this.user);
						logger.info("time:" + this.time);
						// logger.info("curl:" + this.curl);
					}

					// Handle a multi-part MIME encoded file.
					else {

						String fileBaseDir = getFileBaseDir(getLoadedProperties()); 
						String fileDir = fileBaseDir + File.separator + advertiserId + File.separator + bizId +  File.separator + "logo";		// construct the file path: /userimg/{advertiserId}/{bizId}/logo
						
						File dstFile = new File(fileDir);
						if (!dstFile.exists()) {
							dstFile.mkdirs();
						}
						
						File dst = new File(dstFile.getPath() + File.separator + this.name);

						logger.info("fileDir:" + fileDir);
						logger.info("fileName:" + this.name);

						saveUploadFile(input, dst);
						
					}
				} // end-of-while-loop
			} catch (Exception e) {
				responseString = RESP_ERROR;
				e.printStackTrace();
			}

		}else {// Not a multi-part MIME request.
			responseString = RESP_ERROR;
		}

		logger.info("responseString:" + responseString);

		String fileUrlFull = getFileBaseUrl(getLoadedProperties()) 
							+ File.separator + advertiserId + File.separator + bizId +  File.separator + "logo" + File.separator + this.name;
		fileUrlFull = fileUrlFull.replaceAll("\\\\", "/");
		
		/* assemble data and view */
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		/* set data */
		model.put("url", fileUrlFull);
// 		model.put("jsonrpc", "2.0");
// 		model.put("result", "OK");
// 		model.put("id", "id");
// 		model.put("url", "url");
		
		logger.info("exiting... /resource/image/upload");
		return model;
	}

	/**
	 * @param input
	 * @param dst
	 * @throws IOException
	 */
	private void saveUploadFile(InputStream input, File dst) throws IOException {
		final int BUF_SIZE = 2 * 1024;
		
		OutputStream out = null;
		try {
			if (dst.exists()) {
				out = new BufferedOutputStream(new FileOutputStream(dst, true), BUF_SIZE);
			} else {
				out = new BufferedOutputStream(new FileOutputStream(dst), BUF_SIZE);
			}

			byte[] buffer = new byte[BUF_SIZE];
			int len = 0;
			while ((len = input.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != input) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != out) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static String getFileBaseDir(Properties pro) {
		/* property: docBase of photo at server side */
		String path = pro.getProperty("file.photo.docbase");
		System.out.println("image base path in file system=" + path);
		return path;
	}

	private static String getFileBaseUrl(Properties pro) {
		/* property: docBase of photo at server side */
		String path = pro.getProperty("file.photo.baseurl");
		System.out.println("image base url =" + path);
		return path;
	}

	private static Properties getLoadedProperties() {
		/* get the docbase of uploading photos */
		InputStream is = AdPostController.class.getResourceAsStream("file-upload-adogo.properties");
		// Properties pro = new Properties();
		try {
			pro.load(is);
			is.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return pro;
	}

	public static void main(String[] arg) {
		Properties pro = getLoadedProperties();
		String path = getFileBaseDir(pro);
		System.out.println(path);

		String url = getFileBaseUrl(pro);
		System.out.println(url);

	}
}
