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

function saveAdvertiserProfile(){
	alert('saveAdvertiserProfile called!');
	var businessObject = getBusinessObject();
	
	//alert("saveAdPost(), adPostLang="+adPostLang);
	
	$.ajax({
		type:"post",
		url:"/acp/advertiser/saveAdvertiserProfile",
		dataType:"json",
		data: {	bizProfileJSONString : JSON.stringify(businessObject) },
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


/* bizProfile - global variables and functions*/
function getBusinessObject(){	
//	create a json object
    var p1 = $("#bizName").val();
    var p2 = $("#bizNo").val();
    var p3 = $("#bizOwner").val();
    var p4 = $("#legalFormNo").val();
//  var p5 = $("#industryCodeLevel4").val();
    var p5 = $("#industryCode").val();
//  var p6 = getBizTypeValue(); 				//$("#businessType").val();
    var p6 = $("#bizType").val();
    var p7 = $("#bizPhone").val();
    var p8 = $("#bizFax").val();
    var p9 = $("#bizEmail").val();
    var p10 = $("#bizWebsite").val();
    var p11 = $("#bizDesc").val();
    
    var p12 = $("#streetNo").val();
    var p13 = $("#streetType").val();
    var p14 = $("#streetName").val();
    var p15 = $("#portNo").val();
    var p16 = $("#cityName").val();
    var p17 = $("#provName").val();
    var p18 = $("#postalCode").val();
    
    
    var businessObject =
    {
    		bizName    		:   p1,
    		bizNo    		:   p2,
    		bizOwner    	:   p3,
    		legalFormNo    	:   p4,
    		industryCode    :   p5,
    		bizType    		:   p6,
    		bizPhone		:	p7,	
    		bizFax			:	p8,	
    		bizEmail		:	p9,	
    		bizWebsite		:	p10,
    		bizDesc			:	p11,
    		streetNo		:	p12,
    		streetType		:	p13,
    		streetName		:	p14,
    		portNo			:	p15,
    		cityName		:	p16,
    		provName		:	p17,
    		postalCode		:	p18
    };
    
    return businessObject;
}

function getBizTypeValue(){
	var val = 0;
    $('input.businessType:checkbox:checked').each(function(i){
      val += parseInt($(this).val());
    });
    return val;
}



