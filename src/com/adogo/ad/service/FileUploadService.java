package com.adogo.ad.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.adogo.ad.controller.FileUploadController;

@Service
public class FileUploadService {
	private static final Logger logger = Logger.getLogger(FileUploadService.class);
	
	private static final String RESP_SUCCESS = "{\"jsonrpc\" : \"2.0\", \"result\" : \"OK\", \"id\" : \"id\"}";
	private static final String RESP_ERROR = "{\"jsonrpc\" : \"2.0\", \"error\" : {\"code\": 101, \"message\": \"Failed to open input stream.\"}, \"id\" : \"id\"}";

	private static final String FOLDER_NAME_LOGO 	= "logo";
	private static final String FOLDER_NAME_COVER 	= "cover";
	private static final String FOLDER_NAME_BANNER 	= "banner";
	private static final String FOLDER_NAME_SLIDER 	= "slider";
	
	
	private int chunk;
	private int chunks;
	private String name;
	private String user;
	private String time;
	// private String curl; //TODO
	
	public String uploadImageBizLogo(HttpServletRequest request){
		// parameter
		String advertiserId = (String) request.getParameter("advertiserId");
		logger.info("advertiserId=" + advertiserId);
		
		// parameter
		String bizId = (String) request.getParameter("bizId");
		logger.info("bizId=" + bizId);
		
		String filePath = File.separator + advertiserId + File.separator + bizId +  File.separator + FOLDER_NAME_LOGO;
		
		String fileUrlFull = processUploadFile(request, filePath);
		return fileUrlFull;
	}
	
	public String uploadImageBoothCover(HttpServletRequest request){
		// parameter
		String advertiserId = (String) request.getParameter("advertiserId");
		logger.info("advertiserId=" + advertiserId);
		
		// parameter
		String bizId = (String) request.getParameter("bizId");
		logger.info("bizId=" + bizId);
		
		// parameter
		String langNo = (String) request.getParameter("langNo");
		logger.info("langNo=" + langNo);
		
		String filePath = File.separator + advertiserId + File.separator + bizId +  File.separator + langNo + File.separator + FOLDER_NAME_COVER;
		
		String fileUrlFull = processUploadFile(request, filePath);
		return fileUrlFull;
	}
	
	public String uploadImageBoothSlider(HttpServletRequest request){
		// parameter
		String advertiserId = (String) request.getParameter("advertiserId");
		logger.info("advertiserId=" + advertiserId);
		
		// parameter
		String bizId = (String) request.getParameter("bizId");
		logger.info("bizId=" + bizId);
		
		// parameter
		String langNo = (String) request.getParameter("langNo");
		logger.info("langNo=" + langNo);
		
		String filePath = File.separator + advertiserId + File.separator + bizId +  File.separator + langNo + File.separator + FOLDER_NAME_SLIDER;
		
		String fileUrlFull = processUploadFile(request, filePath);
		return fileUrlFull;
	}
	
	public String uploadImageBoothBanner(HttpServletRequest request){
		// parameter
		String advertiserId = (String) request.getParameter("advertiserId");
		logger.info("advertiserId=" + advertiserId);
		
		// parameter
		String bizId = (String) request.getParameter("bizId");
		logger.info("bizId=" + bizId);
		
		// parameter
		String langNo = (String) request.getParameter("langNo");
		logger.info("langNo=" + langNo);
		
		String filePath = File.separator + advertiserId + File.separator + bizId +  File.separator + langNo + File.separator + FOLDER_NAME_BANNER;
		
		String fileUrlFull = processUploadFile(request, filePath);
		return fileUrlFull;
	}
	
	
	/**
	 * process multi-part data of form submitted
	 * @param request	
	 * @param filePath  exclude doc base such as /userimg
	 * @return
	 */
	private String processUploadFile(HttpServletRequest request, String filePath){
		String fileUrlFull ="";
		
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
						
						// construct the file path: /userimg/{advertiserId}/{bizId}/logo
						String fileDir = fileBaseDir + filePath;		
						
						File dstFile = new File(fileDir);
						if (!dstFile.exists()) {
							dstFile.mkdirs();
						}
						
						File dst = new File(dstFile.getPath() + File.separator + this.name);

						logger.info("fileDir:" + fileDir);
						logger.info("fileName:" + this.name);

						doUploadFile(input, dst);
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

		fileUrlFull = getFileBaseUrl(getLoadedProperties()) + filePath + File.separator + this.name;
		fileUrlFull = fileUrlFull.replaceAll("\\\\", "/");
		
		return fileUrlFull;
	}
	
	/**
	 * @param input
	 * @param dst
	 * @throws IOException
	 */
	private void doUploadFile(InputStream input, File dst) throws IOException {
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
		Properties pro = new Properties();
		
		/* get the docbase of uploading photos */
		InputStream is = FileUploadController.class.getResourceAsStream("file-upload-adogo.properties");
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
