package com.adogo.ad.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adogo.ad.service.FileUploadService;

@Controller
@RequestMapping("/resource/")
public class FileUploadController {

	private static final Logger logger = Logger.getLogger(FileUploadController.class);
	
	//image business type
	private final String BIZ_LOGO = "BIZ_LOGO";
	private final String BOOTH_BANNER = "BOOTH_BANNER";
	private final String BOOTH_COVER = "BOOTH_COVER";
	private final String BOOTH_SLIDER = "BOOTH_SLIDER";
	
	@Autowired
	private FileUploadService fileUploadService;
	
	@Autowired
	public void setFileUploadService(FileUploadService fileUploadService) {
		this.fileUploadService = fileUploadService;
	}


	/**
	 * upload files and then create corresponding records
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/image/upload/{imageBizType}", produces = "application/json")
	@ResponseBody
	public Map<String, Object> imageUpload(HttpServletRequest request, @PathVariable final String imageBizType) {
		logger.info("entering... /resource/image/upload/"+imageBizType);
		
		String fileUrlFull = "";
		switch(imageBizType){
			case BIZ_LOGO :
				fileUrlFull = fileUploadService.uploadImageBizLogo(request);
				break;
				
			case BOOTH_COVER :
				fileUrlFull = fileUploadService.uploadImageBoothCover(request);
				break;
				
			case BOOTH_BANNER :
				fileUrlFull = fileUploadService.uploadImageBoothBanner(request);
				break;
				
			case BOOTH_SLIDER :
				fileUrlFull = fileUploadService.uploadImageBoothSlider(request);
				break;
				
			default:
				break;
		}
		
		
		
		/* assemble data and view */
		ModelAndView mav = new ModelAndView();
		Map<String, Object> model = mav.getModel();
		
		/* set data */
		model.put("url", fileUrlFull);
// 		model.put("jsonrpc", "2.0");
// 		model.put("result", "OK");
// 		model.put("id", "id");
// 		model.put("url", "url");
		
		logger.info("exiting... /resource/image/upload/"+imageBizType);
		return model;
	}


}
