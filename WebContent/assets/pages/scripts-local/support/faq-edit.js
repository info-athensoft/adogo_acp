/**
 * Package:	support
 * Module:  support
 * Page:	edit.jsp
 */

/* create support - button:Save support */
function saveEditSupport(){
//	alert("updateSupport called!");
	var businessObject = getBusinessObjectForEdit();
	
	$.ajax({
		type:"post",
		url:"/acp/support/faq/update",
		dataType:"json",
		data: {	supportJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){	
//			alert("saveEditSupport called successfully!");
			window.location.href="/acp/support/faq/";
		}		
	});
	
}
