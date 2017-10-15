function getSubIndustryCode(parentIndustryCode){
	//alert("parent code = "+parentIndustryCode);
	
	
	$.ajax({
		type:"get",
		url:"/acp/uaas/advertiser/industrycode/class/"+parentIndustryCode,
		dataType:"json",
		/*data: {	parentIndustryCode : parentCode }, */
		timeout : 5000,
		success:function(data){	
			var items = data.listIndustryCode;
			
			$("#industryCodeLevel2 option").remove().append('<option value="whatever">text</option>');
			
			$.each(items, function (i, item) {
			    $('#industryCodeLevel2').append($('<option>', { 
			        value: item.parentCode,
			        text : item.industryCode+" : "+item.industryName 
			    }));
			});
			
		}		
	});
	
}