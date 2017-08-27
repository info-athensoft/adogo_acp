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
    var p19 = $("#adPost-slide-img-title1").val();
    var p20 = $("#adPost-slide-img-url1").val();
    var p21 = $("#adPost-slide-img-short-desc1").val();
    
    var p22 = $("#adPost-slide-img-title2").val();
    var p23 = $("#adPost-slide-img-url2").val();
    var p24 = $("#adPost-slide-img-short-desc2").val();
    
    var p25 = $("#adPost-slide-img-title3").val();
    var p26 = $("#adPost-slide-img-url3").val();
    var p27 = $("#adPost-slide-img-short-desc3").val();
    
    var p28 = $("#adPost-slide-img-title4").val();
    var p29 = $("#adPost-slide-img-url4").val();
    var p30 = $("#adPost-slide-img-short-desc4").val();
    
    var p31 = $("#adPost-slide-img-title5").val();
    var p32 = $("#adPost-slide-img-url5").val();
    var p33 = $("#adPost-slide-img-short-desc5").val();
    
    var p34 = $("#adPost-slide-img-title6").val();
    var p35 = $("#adPost-slide-img-url6").val();
    var p36 = $("#adPost-slide-img-short-desc6").val();
    
    var p37 = $("#adPost-slide-img-title7").val();
    var p38 = $("#adPost-slide-img-url7").val();
    var p39 = $("#adPost-slide-img-short-desc7").val();
    
    var p40 = $("#adPost-slide-img-title8").val();
    var p41 = $("#adPost-slide-img-url8").val();
    var p42 = $("#adPost-slide-img-short-desc8").val();
    
    var p43 = $("#adPost-slide-img-title9").val();
    var p44 = $("#adPost-slide-img-url9").val();
    var p45 = $("#adPost-slide-img-short-desc9").val();
    
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
    		
    		adPostSlideImgTitle1	      :   p19,
    		adPostSlideImgUrl1 		      :   p20,
    		adPostSlideImgShortDesc1      :   p21,
    		adPostSlideImgTitle2	      :   p22,
    		adPostSlideImgUrl2 		      :   p23,
    		adPostSlideImgShortDesc2      :   p24,
    		adPostSlideImgTitle3	      :   p25,
    		adPostSlideImgUrl3 		      :   p26,
    		adPostSlideImgShortDesc3      :   p27,
    		adPostSlideImgTitle4	      :   p28,
    		adPostSlideImgUrl4 		      :   p29,
    		adPostSlideImgShortDesc4      :   p30,
    		adPostSlideImgTitle5	      :   p31,
    		adPostSlideImgUrl5 		      :   p32,
    		adPostSlideImgShortDesc5      :   p33,
    		adPostSlideImgTitle6	      :   p34,
    		adPostSlideImgUrl6 		      :   p35,
    		adPostSlideImgShortDesc6      :   p36,
    		adPostSlideImgTitle7	      :   p37,
    		adPostSlideImgUrl7 		      :   p38,
    		adPostSlideImgShortDesc7      :   p39,
    		adPostSlideImgTitle8	      :   p40,
    		adPostSlideImgUrl8 		      :   p41,
    		adPostSlideImgShortDesc8      :   p42,
    		adPostSlideImgTitle9	      :   p43,
    		adPostSlideImgUrl9 		      :   p44,
    		adPostSlideImgShortDesc9      :   p45
    };
    
    return businessObject;
}
