
package com.adogo.ad.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.adogo.ad.entity.AdPost;

import com.adogo.ad.entity.AdPostAudio;
import com.adogo.ad.entity.AdPostBody;
import com.adogo.ad.entity.AdPostCoverImage;
import com.adogo.ad.entity.AdPostGalleryImage;
import com.adogo.ad.entity.AdPostHead;
import com.adogo.ad.entity.AdPostMediaBody;
import com.adogo.ad.entity.AdPostText;
import com.adogo.ad.entity.AdPostVideo;
import com.adogo.ad.service.AdPostService;
import com.adogo.ad.service.AdTagService;
import com.athensoft.util.id.UUIDHelper;

@Controller
@RequestMapping("/ad/adpost")
public class AdPostController {
	
	private static final Logger logger = Logger.getLogger(AdPostController.class);
	
public static final int BUF_SIZE = 2 * 1024;
	
	private static final String RESP_SUCCESS = "{\"jsonrpc\" : \"2.0\", \"result\" : \"OK\", \"id\" : \"id\"}";
	private static final String RESP_ERROR = "{\"jsonrpc\" : \"2.0\", \"error\" : {\"code\": 101, \"message\": \"Failed to open input stream.\"}, \"id\" : \"id\"}";
	
	
	private int chunk;
	private int chunks;
	private String name;
	private String user;
	private String time;
	private String curl;
	
	private static Properties pro = new Properties();
	
	@Autowired
	private AdPostService adPostService;
		
	@Autowired
	public void setAdPostService(AdPostService adPostService) {
		this.adPostService = adPostService;
	}
	
	@Autowired
	private AdTagService adTagService;
		
	@Autowired
	public void setAdTagService(AdTagService adTagService) {
		this.adTagService = adTagService;
	}
	
	@RequestMapping("/create.html")
	public String gotoCreate(){
		String viewName = "ad/ad_post_create";
		return viewName;
	}
	
	@RequestMapping("/edit.html")
	public String gotoEdit(){
		System.out.println("entering -- /edit");
		String viewName = "ad/ad_post_edit";
		System.out.println("exiting -- /edit");
		return viewName;
	}
	
	/**
	 * @param adpostId
	 * @param tags
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping("/saveTags")
	public String saveTags(@RequestParam String adpostId, @RequestParam String tags){
		logger.info("entering -- /saveTags ... adpostId= " + adpostId + ", tags="+String.valueOf(tags));
		String viewName = "ad/ad_post";
		
		this.adPostService.saveTags(adpostId, tags);
		
		this.adTagService.updateTagList(tags);
		
		logger.info("exiting -- /saveTags ");
		return viewName;
	}
	
	/**
	 * @param adPostJSONString
	 * @return
	 * 
	 * @author sfz
	 */
	@RequestMapping("/saveAdPost")
	public ModelAndView saveAdPost(@RequestParam String adPostJSONString){		
		logger.info("entering... /ad/adpost/saveAdPost");
		
		/* initial settings */
		ModelAndView mav = new ModelAndView();
		
		/* prepare data */		
		JSONObject jsonObj= new JSONObject(adPostJSONString);
		
		Long adPostId 			= UUIDHelper.getUniqueLongId();
		Long adPostUserId 		= jsonObj.getLong("adPostUserId");
		Integer adPostLangNo 	= jsonObj.getInt("adPostLangNo");
		String adPostTitle 		= jsonObj.getString("adPostTitle");
		String adPostAuthor		= jsonObj.getString("adPostAuthor");
		Integer adPostCategory	= jsonObj.getInt("adPostCategory");
		String adPostTags		= jsonObj.getString("adPostTags").replaceAll("^\"|\"$", "");
		String adPostShortDesc	= jsonObj.getString("adPostShortDesc");
		logger.info("adPostCategory="+adPostCategory);
		logger.info("adPostShortDesc="+adPostShortDesc);
		
		//cover image
		String adPostCoverImgTitle		= jsonObj.getString("adPostCoverImgTitle");
		String adPostCoverImgUrl		= jsonObj.getString("adPostCoverImgUrl");
		String adPostCoverImgShortDesc	= jsonObj.getString("adPostCoverImgShortDesc");
		logger.info("cover image:adPostCoverImgTitle="+adPostCoverImgTitle);
		logger.info("cover image:adPostCoverImgUrl="+adPostCoverImgUrl);
		logger.info("cover image:adPostCoverImgShortDesc="+adPostCoverImgShortDesc);
		
		//text
		String adPostTextContentLongDesc = jsonObj.getString("adPostTextContentLongDesc");
		logger.info("text:adPostTextContentLongDesc="+adPostTextContentLongDesc);
		
		//video
		String adPostVideoContentTitle 		= jsonObj.getString("adPostVideoContentTitle");
		String adPostVideoContentUrl 		= jsonObj.getString("adPostVideoContentUrl");
		String adPostVideoContentShortDesc 	= jsonObj.getString("adPostVideoContentShortDesc");
		logger.info("video:adPostVideoContentTitle="+adPostVideoContentTitle);
		logger.info("video:adPostVideoContentUrl="+adPostVideoContentUrl);
		logger.info("video:adPostVideoContentShortDesc="+adPostVideoContentShortDesc);
		
		//audio
		String adPostAudioContentTitle 		= jsonObj.getString("adPostAudioContentTitle");
		String adPostAudioContentUrl 		= jsonObj.getString("adPostAudioContentUrl");
		String adPostAudioContentShortDesc 	= jsonObj.getString("adPostAudioContentShortDesc");
		logger.info("audio:adPostAudioContentTitle="+adPostAudioContentTitle);
		logger.info("audio:adPostAudioContentUrl="+adPostAudioContentUrl);
		logger.info("audio:adPostAudioContentShortDesc="+adPostAudioContentShortDesc);
		
		//gallery image
/*		final int SIZE_OF_ADPOST_GALLERY_IMAGE = 9;
		String[] adPostGalleryImgTitleList		= new String[SIZE_OF_ADPOST_GALLERY_IMAGE];
		String[] adPostGalleryImgUrlList		= new String[SIZE_OF_ADPOST_GALLERY_IMAGE];
		String[] adPostGalleryImgShortDescList	= new String[SIZE_OF_ADPOST_GALLERY_IMAGE];
		
		for(int i=0; i<SIZE_OF_ADPOST_GALLERY_IMAGE; i++){
			adPostGalleryImgTitleList[i] 		= jsonObj.getString("adPostGalleryImgTitle"+(i+1));
			adPostGalleryImgUrlList[i] 			= jsonObj.getString("adPostGalleryImgUrl"+(i+1));
			adPostGalleryImgShortDescList[i] 	= jsonObj.getString("adPostGalleryImgShortDesc"+(i+1));
			logger.info("gallery image:adPostGalleryImgTitleList["+i+"]="+adPostGalleryImgTitleList[i]);
			logger.info("gallery image:adPostGalleryImgUrlList["+i+"]="+adPostGalleryImgUrlList[i]);
			logger.info("gallery image:adPostGalleryImgShortDescList["+i+"]="+adPostGalleryImgShortDescList[i]);
		}
*/		
		
		/*create a new record of adpost into master table*/
		AdPostHead adPostHead = new AdPostHead();
		adPostHead.setAdPostId(adPostId);
		adPostHead.setUserId(adPostUserId);
		adPostHead.setLangNo(adPostLangNo);
		adPostHead.setPostTitle(adPostTitle);
		adPostHead.setPostAuthor(adPostAuthor);
		adPostHead.setPostCategory(adPostCategory);
		adPostHead.setTags(adPostTags);
		adPostHead.setShortDesc(adPostShortDesc);
				
		this.adPostService.create(adPostHead);
		
		/*update tags*/
		this.adTagService.updateTag(adPostTags);
		
		/*create AdPostBody for common fields*/
		AdPostBody adPostBody = new AdPostBody();
		adPostBody.setUserId(jsonObj.getLong("adPostUserId"));
		adPostBody.setAdPostId(adPostId);
		adPostBody.setMediaIndex(0);
		adPostBody.setLangNo(jsonObj.getInt("adPostLangNo"));
		
		/*create AdPostText*/
		AdPostText tContent = getAdPostText(adPostBody,adPostTextContentLongDesc);
		logger.info("tContent.getLongDesc()="+tContent.getLongDesc());
		this.adPostService.create(tContent);
		
		/*create AdPostCoverImage*/
		AdPostCoverImage cImg = getAdPostCoverImage(adPostBody, adPostCoverImgTitle, adPostCoverImgUrl, adPostCoverImgShortDesc);
		this.adPostService.create(cImg);
				
		/*create AdPostVideo*/
		AdPostVideo vContent = getAdPostVideo(adPostBody, adPostVideoContentTitle, adPostVideoContentUrl, adPostVideoContentShortDesc);
		this.adPostService.create(vContent);
		
		/*create AdPostAudio*/
		AdPostAudio aContent = getAdPostAudio(adPostBody, adPostAudioContentTitle, adPostAudioContentUrl, adPostAudioContentShortDesc);
		this.adPostService.create(aContent);
		
		/*create AdPostGalleryImage*/
/*		for(int i = 0; i < SIZE_OF_ADPOST_GALLERY_IMAGE; i++) {
			AdPostGalleryImage gImg = getAdPostGalleryImage(adPostBody, adPostGalleryImgTitleList[i], adPostGalleryImgUrlList[i], adPostGalleryImgShortDescList[i]);
			this.adPostService.create(gImg);
		}
*/
		
		/* assemble model and view */
		String viewName = "ad/ad_post";
        mav.setViewName(viewName);
		
		logger.info("exiting... /ad/adpost/saveAdPost");
		return mav;
	}

	
	/**
	 * search and get all AdPost objects
	 * @return
	 */
	@RequestMapping(value="/adposts",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Map<String,Object> getDataAdPostList(){
		logger.info("entering RESTFUL API... /ad/adpost/adposts");
		
		ModelAndView mav = new ModelAndView();
		
		//data
		Map<String, Object> model = mav.getModel();
		
		//retrieve data from database via service and dao		
		List<AdPost> listAdPost = new ArrayList<AdPost>();
		//TODO
		
		List<AdPostHead> listAdPostHead = new ArrayList<AdPostHead>();
		listAdPostHead = adPostService.getAllAdPostHead();
		
		Long numOfAdPost = adPostService.getAdPostHeadCount();
		logger.info(">>> Num of AdPost (header) is: "+numOfAdPost);
		
		
		
		
		model.put("listAdPost", listAdPost);
		model.put("listAdPostHead", listAdPostHead);
		model.put("countAdPost", numOfAdPost+"");
		
		logger.info("exiting RESTFUL API... /ad/adpost/adposts");
		return model;
	}
	
	
	/**
	 * search and get an AdPost object by id
	 * @param adPostId
	 * @return
	 * 
	 * @author sfz
	 */
/*	@RequestMapping(value="/adposts/{adPostId}",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Map<String,Object> getDataAdPost(@PathVariable long adPostId){
		logger.info("entering RESTFUL API... /ad/adpost/adposts/"+adPostId);
		
		ModelAndView mav = new ModelAndView();
		
		//data
		Map<String, Object> model = mav.getModel();
		
		//retrieve data from database via service and dao		
		AdPost adPost = new AdPost();
		//TODO
		
		AdPostHead adPostHead = adPostService.getAdPostHeadByAdPostId(adPostId);
		
		adPost.setAdPostHead(adPostHead);
		
		//
		model.put("adPost", adPost);
		model.put("adPostHead", adPostHead);
		
		logger.info("exiting RESTFUL API... /ad/adpost/adposts"+adPostId);
		return model;
	} */
	@RequestMapping(value="/{adPostId}",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getDataAdPost(@PathVariable long adPostId){
		logger.info("entering RESTFUL API... /ad/adpost/"+adPostId);
		
		//retrieve data from database via service and dao		
		AdPost adPost = new AdPost();
		AdPostHead adPostHead = adPostService.getAdPostHeadByAdPostId(adPostId);
		adPost.setAdPostHead(adPostHead);
		
		List<AdPostCoverImage> adPostCoverImage = adPostService.getAdPostCoverImageByAdPostId(adPostId);
		adPost.setListAdPostCoverImage(adPostCoverImage);
		
		List<AdPostCoverImage> adPostCoverImage2 = adPost.getListAdPostCoverImage();
/*		for (AdPostCoverImage cImg : adPostCoverImage2) {
			logger.info("cImg getMediaUrl()="+cImg.getMediaUrl());
		} */
		AdPostCoverImage primaryCoverImage = adPost.getPrimaryMediaObject(adPostCoverImage2);
		logger.info("primaryCoverImage getMediaUrl()="+primaryCoverImage.getMediaUrl());
		
		
		List<AdPostAudio> adPostAudio = adPostService.getAdPostAudioByAdPostId(adPostId);
		adPost.setListAdPostAudio(adPostAudio);
		
		List<AdPostAudio> adPostAudio2 = adPost.getListAdPostAudio();
				
		AdPostAudio primaryAudio = adPost.getPrimaryMediaObject(adPostAudio2);
		logger.info("primaryAudio getMediaUrl()="+primaryAudio.getMediaUrl());
		
		
		List<AdPostVideo> adPostVideo = adPostService.getAdPostVideoByAdPostId(adPostId);
		adPost.setListAdPostVideo(adPostVideo);
		
		List<AdPostVideo> adPostVideo2 = adPost.getListAdPostVideo();
				
		AdPostVideo primaryVideo = adPost.getPrimaryMediaObject(adPostVideo2);
		logger.info("primaryVideo getMediaUrl()="+primaryVideo.getMediaUrl());
		
		
		List<AdPostGalleryImage> adPostGalleryImage = adPostService.getAdPostGalleryImageByAdPostId(adPostId);
		adPost.setListAdPostGalleryImage(adPostGalleryImage);
		
		List<AdPostGalleryImage> adPostGalleryImage2 = adPost.getListAdPostGalleryImage();
		for (AdPostGalleryImage gImg : adPostGalleryImage2) {
			logger.info("gImg getMediaUrl()="+gImg.getMediaUrl());
		} 
		AdPostGalleryImage primaryGalleryImage = adPost.getPrimaryMediaObject(adPostGalleryImage2);
		logger.info("primaryGalleryImage getMediaUrl()="+primaryGalleryImage.getMediaUrl());
		
		
		logger.info("exiting RESTFUL API... /ad/adpost/"+adPostId);
		
		
		if (adPostHead == null) {
            logger.info("AdPost with id {"+ adPostId+"} not found.");
            
            return new ResponseEntity<AdPost>(HttpStatus.NOT_FOUND);
        }
		else {
			return new ResponseEntity<AdPost>(adPost, HttpStatus.OK);
		}
        
	}	
	
	/**
	 * create an AdPost object
	 * @param adPostJSONString
	 * @return
	 * 
	 * @author Athens
	 */
	@RequestMapping(value="/adposts",method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Boolean> createAdPost(@RequestParam String adPostJSONString){
		
		
		
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	
	/**
	 * update an AdPost object with entire object data
	 * @param adPostId
	 * @return
	 * 
	 * @author Athens
	 */
	@RequestMapping(value="/adposts/{adPostId}",method=RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Boolean> updateAdPost(@PathVariable String adPostId){
		
		
		
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	
	
	/**
	 * delete an AdPost object with entire object data
	 * @param adPostId
	 * @return
	 * 
	 * @author Athens
	 */
	@RequestMapping(value="/adposts/{adPostId}",method=RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Boolean> deleteAdPost(@PathVariable String adPostId){
		
		
		
		return new ResponseEntity<Boolean>(true,HttpStatus.NO_CONTENT);
	}


	
	
	private AdPostText getAdPostText(AdPostBody adPostBody, String mediaDesc){
		AdPostText contentObj = new AdPostText(adPostBody);
		contentObj.setLongDesc(mediaDesc);
		return contentObj;
	}

	private AdPostCoverImage getAdPostCoverImage(AdPostBody adPostBody, String mediaTitle, String mediaUrl, String mediaDesc){
		AdPostMediaBody mediaBody = getAdPostMediaBody(adPostBody, mediaTitle, mediaUrl, mediaDesc);		
		AdPostCoverImage contentObj = new AdPostCoverImage(mediaBody);
		return contentObj;
	}
	
	private AdPostGalleryImage getAdPostGalleryImage(AdPostBody adPostBody, String mediaTitle, String mediaUrl, String mediaDesc){
		AdPostMediaBody mediaBody = getAdPostMediaBody(adPostBody, mediaTitle, mediaUrl, mediaDesc);		
		AdPostGalleryImage contentObj = new AdPostGalleryImage(mediaBody);
		return contentObj;
	}

	private AdPostVideo getAdPostVideo(AdPostBody adPostBody, String mediaTitle, String mediaUrl, String mediaDesc){
		AdPostMediaBody mediaBody = getAdPostMediaBody(adPostBody, mediaTitle, mediaUrl, mediaDesc);		
		AdPostVideo contentObj = new AdPostVideo(mediaBody);
		return contentObj;
	}
	
	private AdPostAudio getAdPostAudio(AdPostBody adPostBody, String mediaTitle, String mediaUrl, String mediaDesc){
		AdPostMediaBody mediaBody = getAdPostMediaBody(adPostBody, mediaTitle, mediaUrl, mediaDesc);		
		AdPostAudio contentObj = new AdPostAudio(mediaBody);
		return contentObj;
	}
	
	private AdPostMediaBody getAdPostMediaBody(AdPostBody adPostBody, String mediaTitle, String mediaUrl, String mediaDesc){
		AdPostMediaBody mediaBody = new AdPostMediaBody(adPostBody);
		mediaBody.setMediaTitle(mediaTitle);
		mediaBody.setMediaUrl(mediaUrl);
		mediaBody.setMediaDesc(mediaDesc);
		return mediaBody;
	}
	
	/**
	 * upload files and then create corresponding records
	 * @param req
	 * @return
	 */
	@RequestMapping(value="/imageUpload",produces="application/json")
	@ResponseBody
	public Map<String,Object> imageUpload(HttpServletRequest req){
		
		logger.info("entering /ad/adpost/imageUpload");
		
		//parameter
		String eventUUID = (String)req.getParameter("eventUUID");
		logger.info("eventUUID="+eventUUID);
		
		
		String responseString = RESP_SUCCESS;
		
		boolean isMultipart = ServletFileUpload.isMultipartContent(req);
		logger.info("isMultipart:" + isMultipart);
		
		if(isMultipart){
			ServletFileUpload upload = new ServletFileUpload();
			try {
				FileItemIterator iter = upload.getItemIterator(req);
				while (iter.hasNext()) {
				    FileItemStream item = iter.next();
				    InputStream input = item.openStream();
				    
				    // Handle a form field.
				    if(item.isFormField()){
				        String fieldName = item.getFieldName();
				        String value = Streams.asString(input);

				        if("name".equals(fieldName)){
				        	this.name = value;
				        }
				        else if("chunks".equals(fieldName)){
				        	this.chunks = Integer.parseInt(value);
				        }else if("chunk".equals(fieldName)){
				        	this.chunk = Integer.parseInt(value);
				        }else if("user".equals(fieldName)){
				        	this.user = value;
				        }else if("time".equals(fieldName)){
				        	this.time = value;
				        }/*else if("curl".equals(fieldName)){
				        	this.curl = value;
				        }*/
				        logger.info("name:" + this.name);
				        logger.info("chunks:" + this.chunks);
				        logger.info("chunk:" + this.chunk);
				        logger.info("user:" + this.user);
				        logger.info("time:" + this.time);
				        //logger.info("curl:" + this.curl);
				    }
				    
				    // Handle a multi-part MIME encoded file.
				    else {
//				    	String fileDir = req.getSession().getServletContext().getRealPath("/")+FileDir;
				    	
				    	String fileBaseDir = getFileBaseDir(getLoadedProperties());	//modified by Athens on 2017-06-12
				    	String fileDir = fileBaseDir+File.separator+eventUUID;
//						
				    	File dstFile = new File(fileDir);
						if (!dstFile.exists()){
							dstFile.mkdirs();
						}
//						
						File dst = new File(dstFile.getPath()+ "/" + this.name);
						
						logger.info("fileDir:" + fileDir);
						logger.info("fileName:" + this.name);
						
				        saveUploadFile(input, dst);
				        
//				        String mediaURL = fileDir+File.separator+this.name;
				        /*
				        // persist media record into database
				        logger.info("Start creating event media - Name:" + this.name);
				        EventMedia eventMedia = new EventMedia();
				        eventMedia.setEventUUID(eventUUID);
				        eventMedia.setMediaName(this.name);
				        eventMedia.setMediaLabel(this.name);
				        String fileBaseUrl = getFileBaseUrl(getLoadedProperties());	//modified by Athens on 2017-06-12
				        String fileUrl = fileBaseUrl+File.separator+eventUUID+File.separator+this.name;		//modified by Athens on 2017-06-12
				        eventMedia.setMediaURL(fileUrl);
				        eventMedia.setPostTimestamp(new Date());
				        
				        eventMediaService.creatEventMedia(eventMedia); */
				    }
				}//end-of-while-loop
			}
			catch (Exception e) {
				responseString = RESP_ERROR;
				e.printStackTrace();
			}
			
			
			
		}
		
		// Not a multi-part MIME request.
		else {
			responseString = RESP_ERROR;
		}
		
		logger.info("responseString:" + responseString);
		
		ModelAndView mav = new ModelAndView();
		
		//view
		String viewName = "";
		mav.setViewName(viewName);
		
		//data
		Map<String, Object> model = mav.getModel();
		
		//model.put("jsonrpc", "2.0");
		//model.put("result", "OK");
		//model.put("id", "id");
		//model.put("url", "url");
		model.put("url", getFileBaseDir(getLoadedProperties()) + File.separator + eventUUID + File.separator +  this.name);
		
		logger.info("leaving /ad/adpost/imageUpload");
		return model;
	}


	/**
	 * @param input
	 * @param dst
	 * @throws IOException
	 */
	private void saveUploadFile(InputStream input, File dst) throws IOException {
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
	
	private static String getFileBaseDir(Properties pro){
		/* property: docBase of photo at server side */
		String path = pro.getProperty("file.photo.docbase");		
		System.out.println("image base path in file system="+path);
		return path;
	}
	
	private static String getFileBaseUrl(Properties pro){
		/* property: docBase of photo at server side */
		String path = pro.getProperty("file.photo.baseurl");		
		System.out.println("image base url ="+path);
		return path;
	}
	
	private static Properties getLoadedProperties(){
		/* get the docbase of uploading photos*/
		InputStream is = AdPostController.class.getResourceAsStream("file-upload-adogo.properties");		
		//Properties pro = new Properties();
		try {
			pro.load(is);
			is.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return pro;
	}
	
	public static void main(String[] arg){
		Properties pro = getLoadedProperties();
		String path = getFileBaseDir(pro);
		System.out.println(path);
		
		String url = getFileBaseUrl(pro);
		System.out.println(url);
		
	}

	
}

