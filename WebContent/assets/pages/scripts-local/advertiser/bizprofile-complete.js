/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	bizprofile_complete.jsp
 */

/**/
function saveBusinessOnlinePresence(event){
	
	alert("saveBusinessOnlinePresence()");
	
	//here I want to prevent default
    event.preventDefault();
	
	var businessObject = getBusinessOnlinePresenceObject();
	
	$.ajax({
		type:"post",
		url:"/acp/advertiser/biz/complete",		//TODO
		dataType:"json",
		data: {	businessProfileJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){	
			alert("saveBusinessOnlinePresence ajax ok");
			//var b = data.businessProfile;
			//var bizId = b.bizId;
			window.location.href="/acp/advertiser/biz/";
			
			alert("saveBusinessOnlinePresence ajax ok2");
		},
		complete:function(){
			alert("complete saveBusinessOnlinePresence()");
		}
	});
}

/* bizProfile - global variables and functions*/
function getBusinessOnlinePresenceObject(){
	
	var p01 = $("#userId").val();
	var p02 = $("#advertiserId").val();
	var p03 = $("#bizId").val();

	
    var p11 = $("#presenceNo1").val();
    var p12 = $("#presenceURL1").val();
    
    var p21 = $("#presenceNo2").val();
    var p22 = $("#presenceURL2").val();
    
    var p31 = $("#presenceNo3").val();
    var p32 = $("#presenceURL3").val();
    
    var p41 = $("#presenceNo4").val();
    var p42 = $("#presenceURL4").val();
    
    var p51 = $("#presenceNo5").val();
    var p52 = $("#presenceURL5").val();
   
    var p61 = $("#presenceNo6").val();
    var p62 = $("#presenceURL6").val();
    
    var businessObject =
    {
    		userId			: 	p01,
    		advertiserId	: 	p02,
    		bizId			: 	p03,
    		
    		presenceNo1    	:   p11,
    		presenceURL1    :   p12,
    		
    		presenceNo2    	:   p21,
    		presenceURL2    :   p22,
    		
    		presenceNo3    	:   p31,
    		presenceURL3    :   p32,
    		
    		presenceNo4    	:   p41,
    		presenceURL4    :   p42,

    		presenceNo5    	:   p51,
    		presenceURL5    :   p52,
    		
    		presenceNo6    	:   p61,
    		presenceURL6    :   p62
    		
    };
    
    return businessObject;
}