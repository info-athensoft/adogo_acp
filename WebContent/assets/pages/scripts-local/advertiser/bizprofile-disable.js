/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	bizprofile_disable.jsp
 */

/**
 * @Author Athens
 */
function getBusinessProfileDisableObject(){	
	var p1 = $("#bizId").val();
	
	var businessObject = {
		bizId : p1
	};
	
//  alert("INFO: businessObject="+businessObject);
	return businessObject;
}

/**
 * Trigger : button link [Disable]
 * @Author Athens
 */
function disableBusinessProfile(){
//	alert("INFO: disableBusinessProfile()");
	
	var businessObject = getBusinessProfileDisableObject();
	
	$.ajax({
		type	:	"post",
		url		:	"/acp/advertiser/biz/disable",
		dataType:	"json",
		data	: 	{bizProfileJSONString : JSON.stringify(businessObject)},
		timeout : 	5000,
		success	:	function(data){
//			alert("INFO: disableBusinessProfile success");			
			var bizProfile = data.bizProfile;
			var bizId = bizProfile.bizId;
			window.location.href="/acp/advertiser/biz/?bizId="+bizId;
		}		
	});
}

/**
 * Trigger : button link [Cancel]
 * @Author Athens
 */
function cancelDisableBusinessProfile(){
//	alert("INFO: cancelDisableBusinessProfile()");
	
	window.location.href="/acp/advertiser/biz/manage.html";
}