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
		dataType:"html",
		data: {	businessProfileJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){	
			alert("saveBusinessProfile ajax ok");
			window.location.href="/acp/advertiser/biz/register.html";
		}		
	});
}

function cancelBusinessRegistration(){
	alert("cancelBusinessRegistration()");
}
