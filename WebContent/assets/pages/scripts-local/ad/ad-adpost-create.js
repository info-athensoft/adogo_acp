/** ad_post_create.jsp */


/* create adpost - button:Save AdPost */

function saveAdPost(){
	//alert("saveAdPost called!");
	
	var businessObject = getBusinessObject();
	
	//alert("saveAdPost(), adPostLang="+adPostLang);
	
	$.ajax({
		type:"post",
		url:"saveAdPost",
		dataType:"json",
		data: {	adPostJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){	
//			var msg = data.info_msg;
			//var userAccount = data.userAccount;
/*				$("#sec_activate").html(msg);
			$("#ua1").text(userAccount.acctId);
*/				
			//alert(msg);
			//location = "goactivateresult?resultMsg="+msg;
		}		
	});
}