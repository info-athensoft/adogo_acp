/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	bizprofile_trash.jsp
 */
function getBusinessProfileTrashObject(){	
//	alert("getBusinessProfileEditObject()");
	
	var p1 = $("#bizId").val();
	
	var businessObject = {
		bizId : p1
	};
	
	return businessObject;
}

function trashBusinessProfile(){
	var businessObject = getBusinessProfileTrashObject();
	
//	alert(businessObject);
	
	$.ajax({
		type:"post",
		url:"/acp/advertiser/biz/disable",
		dataType:"json",
		data: {	bizProfileJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){
			var bizProfile = data.bizProfile;
			var bizId = bizProfile.bizId;
//			alert("Disabled BusinessProfile!");
			window.location.href="/acp/advertiser/biz/?bizId="+bizId;
		}		
	});
}    