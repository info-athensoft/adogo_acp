/**
 * Package:	advertiser
 * Module:  business profile
 */


function getSubIndustryCode(parentIndustryCode,nextLevelIndex){
	//alert("parent code = "+parentIndustryCode);
	
	$("#industryCodeLevel"+nextLevelIndex+"").empty().append('<option value="">-- choose a sub-category --- </option>');
	
	$.ajax({
		type:"get",
		url:"/acp/advertiser/industrycode/class/"+parentIndustryCode,
		dataType:"json",
		/*data: {	parentIndustryCode : parentCode }, */
		timeout : 5000,
		success:function(data){	
			var items = data.listIndustryCode;
			
			$.each(items, function (i, item) {
			    $('#industryCodeLevel'+nextLevelIndex).append($('<option>', { 
			       // value: item.parentCode,
			    	value: item.industryCode,
			        text : item.industryCode+" : "+item.industryName 
			    }));
			});
			
		}		
	});
	
}





