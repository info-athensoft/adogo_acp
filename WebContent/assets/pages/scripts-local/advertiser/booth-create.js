/*booth_create.jsp*/

/* create booth - button:Quick save */
function createBooth(){
	var businessObject = getBusinessObject();
	
	$.ajax({
		type:"post",
		url:"/acp/advertiser/booth/create",		//TODO
		dataType:"json",
		data: {	boothJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){	
			alert("saveBooth ajax ok");
			window.location.href="/acp/advertiser/booth/";
		}		
	});
}