/**
 * Package:	support
 * Module:  support
 * Page:	create.jsp
 */

/* create support - button:Save support */
function saveSupport(){
//	alert("saveSupport called!");
	var businessObject = getBusinessObject();
	
	$.ajax({
		type:"post",
		url:"/acp/support/saveSupport",
		dataType:"json",
		data: {	supportJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){	
		}		
	});
	
}
