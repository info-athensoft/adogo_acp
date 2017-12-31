/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	bizprofile_trash.jsp
 */

/**
 * @Author Athens
 */
function getBusinessProfileTrashObject(){	
	var p1 = $("#bizId").val();
	
	var businessObject = {
		bizId : p1
	};
	
//  alert("INFO: businessObject="+businessObject);	
	return businessObject;
}

/**
 * Trigger : button link [Trash]
 * @Author Athens
 */
function trashBusinessProfile(){
//	alert("INFO: trashBusinessProfile()");
	var businessObject = getBusinessProfileTrashObject();
	
	$.ajax({
		type	:	"post",
		url		:	"/acp/advertiser/biz/trash",
		dataType:	"json",
		data	: 	{bizProfileJSONString : JSON.stringify(businessObject)},
		timeout : 	5000,
		success:function(data){
//			alert("INFO: trashBusinessProfile success");
			var bizProfile = data.bizProfile;
			var bizId = bizProfile.bizId;
			window.location.href="/acp/advertiser/biz/manage.html";
		}		
	});
}

/**
 * Trigger : button link [Cancel]
 * @Author Athens
 */
function cancelTrashBusinessProfile(){
//	alert("INFO: cancelTrashBusinessProfile()");
	
	window.location.href="/acp/advertiser/biz/manage.html";
}