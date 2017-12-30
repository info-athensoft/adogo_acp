/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	bizprofile_disable.jsp
 */
function getBusinessProfileDisableObject(){	
	
	var p1 = $("#bizId").val();
	
	var businessObject = {
		bizId : p1
	};
	
	return businessObject;
}

function disableBusinessProfile(){
	var businessObject = getBusinessProfileDisableObject();
	
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