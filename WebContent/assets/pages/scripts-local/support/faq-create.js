/**
 * Package:	support
 * Module:  support
 * Page:	create.jsp
 */

/* create support - button:Save support */
function saveCreateSupport(){
//	alert("saveCreateSupport called!");
	var businessObject = getBusinessObject();
	
	$.ajax({
		type:"post",
		url:"/acp/support/faq/create",
		dataType:"json",
		data: {	supportJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){
			alert("saveCreateSupport called successfully!");
			window.location.href="/acp/support/faq/";
		}		
	});
	
}
