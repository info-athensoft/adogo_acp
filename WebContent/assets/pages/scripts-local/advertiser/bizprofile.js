/**
 * Package:	advertiser
 * Module:  business profile
 */
/*
function getSubIndustryCode(parentIndustryCode){
	//alert("parent code = "+parentIndustryCode);
	
	
	$.ajax({
		type:"get",
		url:"/acp/advertiser/industrycode/class/"+parentIndustryCode,
		dataType:"json",
		//data: {	parentIndustryCode : parentCode },
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
	
}*/

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
			
			//$("#industryCodeLevel"+nextLevelIndex+" option").empty().append('<option value="">-- choose a sub-category --- </option>');
			
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




/* bizProfile - global variables and functions*/
function getBusinessObject(){	
//	create a json object
    var p1 = $("#bizName").val();
    var p2 = $("#bizNo").val();
    var p3 = $("#bizOwner").val();
    var p4 = $("#legalFormNo").val();
    
    var businessObject =
    {
    		bizName    			      	  :   p1,
    		bizNo    			      	  :   p2,
    		bizOwner    			      :   p3,
    		legalFormNo    			      :   p4

    };
    
    return businessObject;
}



