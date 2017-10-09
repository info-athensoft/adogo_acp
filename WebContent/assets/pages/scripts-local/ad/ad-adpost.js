/**
 * Package:	ad
 * Module:  ad-adpost
 */

/* event news - global variables and functions*/
function getBusinessObject(){	
//	create a json object
    var p1 = "";
    var p2 = $("#adPost-lang").val();        
    var p3 = $("#adPost-title").val();
    var p4 = $("#adPost-author").val();
    var p5 = $("#adPost-category").val();
    if (p5.trim()=="") { // default category
    	p5="999";
    }
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
    var p19 = $("#adPost-gallery-img-title1").val();
    var p20 = $("#adPost-gallery-img-url1").val();
    var p21 = $("#adPost-gallery-img-short-desc1").val();
    
    var p22 = $("#adPost-gallery-img-title2").val();
    var p23 = $("#adPost-gallery-img-url2").val();
    var p24 = $("#adPost-gallery-img-short-desc2").val();
    
    var p25 = $("#adPost-gallery-img-title3").val();
    var p26 = $("#adPost-gallery-img-url3").val();
    var p27 = $("#adPost-gallery-img-short-desc3").val();
    
    var p28 = $("#adPost-gallery-img-title4").val();
    var p29 = $("#adPost-gallery-img-url4").val();
    var p30 = $("#adPost-gallery-img-short-desc4").val();
    
    var p31 = $("#adPost-gallery-img-title5").val();
    var p32 = $("#adPost-gallery-img-url5").val();
    var p33 = $("#adPost-gallery-img-short-desc5").val();
    
    var p34 = $("#adPost-gallery-img-title6").val();
    var p35 = $("#adPost-gallery-img-url6").val();
    var p36 = $("#adPost-gallery-img-short-desc6").val();
    
    var p37 = $("#adPost-gallery-img-title7").val();
    var p38 = $("#adPost-gallery-img-url7").val();
    var p39 = $("#adPost-gallery-img-short-desc7").val();
    
    var p40 = $("#adPost-gallery-img-title8").val();
    var p41 = $("#adPost-gallery-img-url8").val();
    var p42 = $("#adPost-gallery-img-short-desc8").val();
    
    var p43 = $("#adPost-gallery-img-title9").val();
    var p44 = $("#adPost-gallery-img-url9").val();
    var p45 = $("#adPost-gallery-img-short-desc9").val();
    
    var businessObject =
    {
    		adPostId    			      :   p1,
    		adPostLangNo   		    	  :   p2,
    		adPostTitle    		    	  :   p3,
    		adPostAuthor    		      :   p4,
    		adPostCategory			      :   p5,            
    		adPostTags    			      :   p6,
    		adPostUserId			      :	  p11,
    		adPostShortDesc 		      :   p7,
    		
    		adPostCoverImgTitle		      :   p8,
    		adPostCoverImgUrl  		      :   p9,
    		adPostCoverImgShortDesc	      :   p10,
    		
    		
    		adPostTextContentLongDesc     :   p12,
    		
    		adPostVideoContentTitle		  :   p13,
    		adPostVideoContentUrl  		  :   p14,
    		adPostVideoContentShortDesc	  :   p15,
    		
    		adPostAudioContentTitle		  :   p16,
    		adPostAudioContentUrl  		  :   p17,
    		adPostAudioContentShortDesc	  :   p18,
    		
    		adPostGalleryImgTitle1	      :   p19,
    		adPostGalleryImgUrl1 		  :   p20,
    		adPostGalleryImgShortDesc1    :   p21,
    		adPostGalleryImgTitle2	      :   p22,
    		adPostGalleryImgUrl2 		  :   p23,
    		adPostGalleryImgShortDesc2    :   p24,
    		adPostGalleryImgTitle3	      :   p25,
    		adPostGalleryImgUrl3 		  :   p26,
    		adPostGalleryImgShortDesc3    :   p27,
    		adPostGalleryImgTitle4	      :   p28,
    		adPostGalleryImgUrl4 		  :   p29,
    		adPostGalleryImgShortDesc4    :   p30,
    		adPostGalleryImgTitle5	      :   p31,
    		adPostGalleryImgUrl5 		  :   p32,
    		adPostGalleryImgShortDesc5    :   p33,
    		adPostGalleryImgTitle6	      :   p34,
    		adPostGalleryImgUrl6 		  :   p35,
    		adPostGalleryImgShortDesc6    :   p36,
    		adPostGalleryImgTitle7	      :   p37,
    		adPostGalleryImgUrl7 		  :   p38,
    		adPostGalleryImgShortDesc7    :   p39,
    		adPostGalleryImgTitle8	      :   p40,
    		adPostGalleryImgUrl8 		  :   p41,
    		adPostGalleryImgShortDesc8    :   p42,
    		adPostGalleryImgTitle9	      :   p43,
    		adPostGalleryImgUrl9 		  :   p44,
    		adPostGalleryImgShortDesc9    :   p45
    };
    
    return businessObject;
}