/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	bizprofile_publish.jsp
 */


function getBusinessProfilePublishObject(){	
	
	var p1 = $("#bizId").val();
	
	var businessObject = {
		bizId : p1
	};
	
	return businessObject;
}

/**
 * Trigger : button link [Publish]
 * @Author Athens
 */
function publishBusinessProfile(){
//	alert("INFO: publishBusinessProfile()");
	var businessObject = getBusinessProfilePublishObject();
	
	$.ajax({
		type	:	"post",
		url		:	"/acp/advertiser/biz/publish",
		dataType:	"json",
		data	: 	{bizProfileJSONString : JSON.stringify(businessObject)},
		timeout : 	5000,
		success	:	function(data){
//			alert("INFO: publishBusinessProfile success");			
			var bizProfile = data.bizProfile;
			var bizId = bizProfile.bizId;
			window.location.href="/acp/advertiser/biz/";
		}		
	});
}

/**
 * Trigger : button link [Cancel]
 * @Author Athens
 */
function cancelPublishBusinessProfile(){
//	alert("INFO: cancelPublishBusinessProfile()");
	
	window.location.href="/acp/advertiser/biz/manage.html";
}