/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	advertiser_bizprofile_edit.jsp
 */

//function saveAdvertiserProfile(){
function saveBusinessProfile(){
	alert('saveAdvertiserProfile called!');
	var businessObject = getBusinessObject();
	
	//alert("saveAdPost(), adPostLang="+adPostLang);
	
	$.ajax({
		type:"post",
//		url:"/acp/advertiser/saveAdvertiserProfile",
		url:"/acp/advertiser/biz/save",
		dataType:"json",
		data: {	bizProfileJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){	
		}		
	});
}

function cancelSave(){
	alert("cancel save business profile");
}