/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	advertiser_bizprofile_complete.jsp
 */

/**/
function saveBusinessOnlinePresence(){
	
	alert("saveBusinessOnlinePresence()");
	
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
			
			alert("saveBusinessProfile ajax ok2");
		},
		complete:function(){
			alert("complete saveBusinessOnlinePresence()");
		}
	});
}

/* bizProfile - global variables and functions*/
function getBusinessOnlinePresenceObject(){
	
	//var p01 = $("#userId").val();
	//var p02 = $("#advertiserId").val();
	//var p03 = $("#bizId").val();
	
	
	//TODO
	var p01 = "123";					//userId
	var p02 = "12342343";				//advertiserId
	var p03 = "2342345612";				//bizId
	
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
    		userId			: 	"101001",
    		advertiserId	: 	"387428374",
    		bizId			: 	"2423424",
    		
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