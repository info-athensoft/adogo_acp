/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	advertiser_bizprofile_create.jsp
 */

/**/
function saveBusinessProfile(){
	//alert("saveBusinessProfile()");
	
	var businessObject = getBusinessObject();
	
	$.ajax({
		type:"post",
		url:"/acp/advertiser/biz/create",		//TODO
		dataType:"json",
		data: {	businessProfileJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){	
//			alert("saveBusinessProfile ajax ok");
			//window.location.href="/acp/advertiser/biz/register.html";
//			var businessProfile = JSON.stringify(data.businessProfile);
			var b = data.businessProfile;
			var bizId = b.bizId;
			//alert(bizId);
			window.location.href="/acp/advertiser/biz/complete.html?bizId="+bizId;
			
			alert("saveBusinessProfile ajax ok2");
		}		
	});
}

function cancelBusinessRegistration(){
	alert("cancelBusinessRegistration()");
}
