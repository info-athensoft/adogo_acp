/**
 * Package:	ad
 * Module:  ad-adpost
 */

/* event news - global variables and functions*/
function getBusinessObject(){	
//	create a json object
    var p1 = "test01";
    var p2 = $("#adPost-lang").val();        
    var p3 = $("#adPost-title").val();
    var p4 = $("#adPost-author").val();
    var p5 = $("#adPost-category").val();
    var p6 = $("#adPost-tags").val();
    var p7 = $("#adPost-short-desc").val();
    var p8 = $("#adPost-cover-img-title").val();
    var p9 = $("#adPost-cover-img-url").val();
    var p10 = $("#adPost-cover-img-short-desc").val();
    var p11 = 1011;		//user id: long  , temperorily set
    var p12 = $("#adPost-text-content-long-desc").val();
    var p13 = $("#adPost-video-content-title").val();
    var p14 = $("#adPost-video-content-url").val();
    var p15 = $("#adPost-video-content-short-desc").val();
    var p16 = $("#adPost-audio-content-title").val();
    var p17 = $("#adPost-audio-content-url").val();
    var p18 = $("#adPost-audio-content-short-desc").val();
    
    var businessObject =
    {
    		adPostId    			      :   p1,
    		adPostLangNo   		    	  :   p2,
    		adPostTitle    		    	  :   p3,
    		adPostAuthor    		      :   p4,
    		adPostCategory			      :   p5,            
    		adPostTags    			      :   p6,            
    		adPostShortDesc 		      :   p7,
    		adPostCoverImgTitle		      :   p8,
    		adPostCoverImgUrl  		      :   p9,
    		adPostCoverImgShortDesc	      :   p10,
    		adPostUserId			      :	  p11,
    		adPostTextContentLongDesc     :   p12,
    		adPostVideoContentTitle		  :   p13,
    		adPostVideoContentUrl  		  :   p14,
    		adPostVideoContentShortDesc	  :   p15,
    		adPostAudioContentTitle		  :   p16,
    		adPostAudioContentUrl  		  :   p17,
    		adPostAudioContentShortDesc	  :   p18
    };
    
    return businessObject;
}





/*
var adPostId = "test01";
var adPostLang = $("#adPost-lang").val();
var adPostTitle = $("#adPost-title").val();
var adPostAuthor = $("#adPost-author").val();
var adPostCategory = $("#adPost-category").val();
var adPostTags = $("#adPost-tags").val();
var adPostShortDesc = $("#adPost-short-desc").val();
var adPostCoverImgTitle = $("#adPost-cover-img-title").val();
var adPostCoverImgUrl = $("#adPost-cover-img-url").val();
var adPostCoverImgShortDesc = $("#adPost-cover-img-short-desc").val();



data: {	adPostId:adPostId,
		adPostLang:adPostLang,
		adPostTitle:adPostTitle,
		adPostAuthor:adPostAuthor,
		adPostCategory:adPostCategory,
		adPostTags:JSON.stringify(adPostTags),
		adPostShortDesc:adPostShortDesc,
		adPostCoverImgTitle:adPostCoverImgTitle,
		adPostCoverImgUrl:adPostCoverImgUrl,
		adPostCoverImgShortDesc:adPostCoverImgShortDesc}, */




