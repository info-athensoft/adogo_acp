/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	bizprofile_create.jsp
 */


/**
 * @Author Athens
 */
function getBusinessCreateObject(){	
    var p1 = $("#bizName").val();
    var p2 = $("#bizNo").val();
    var p3 = $("#bizOwner").val();
    var p4 = $("#legalFormNo").val();
    var p5 = $("#industryCode").val();    
    var p6a= "0";	//bizType
    var p6b= "0";	//bizType
    var p6c= "0";	//bizType
    
    if($('#bizTypeProduct').prop('checked')){
    	p6a = $("#bizTypeProduct").val();
    }
    if($('#bizTypeEProduct').prop('checked')){
    	p6b = $("#bizTypeEProduct").val();
    }
    if($('#bizTypeService').prop('checked')){
    	p6c = $("#bizTypeService").val();
    }
    var p7 = $("#bizPhone").val();
    var p8 = $("#bizFax").val();
    var p9 = $("#bizEmail").val();
    var p10 = $("#bizWebsite").val();
    var p11 = $("#bizDesc").val();
    
    var p12 = $("#streetNo").val();
    var p13 = $("#streetType").val();
    var p14 = $("#streetName").val();
    var p15 = $("#portType").val();
    var p16 = $("#portNo").val();
    var p17 = $("#cityName").val();
    var p18 = $("#provName").val();
    var p19 = $("#postalCode").val();
    
    var businessObject = {
		bizName    		:   p1,
		bizNo    		:   p2,
		bizOwner    	:   p3,
		legalFormNo    	:   p4,
		industryCode    :   p5,
//    	bizType    		:   p6,
		bizTypeProduct	:   p6a,
		bizTypeEProduct :   p6b,
		bizTypeService  :   p6c,
		bizPhone		:	p7,	
		bizFax			:	p8,	
		bizEmail		:	p9,	
		bizWebsite		:	p10,
		bizDesc			:	p11,
		streetNo		:	p12,
		streetType		:	p13,
		streetName		:	p14,
		portType		:	p15,
		portNo			:	p16,
		cityName		:	p17,
		provName		:	p18,
		postalCode		:	p19
    };
//  alert("INFO: businessObject="+businessObject);
    return businessObject;
}


/**
 * Trigger : button link [Save and Create]
 * @Author Athens
 */
function createBusinessProfile(){
//	alert("INFO: createBusinessProfile()");
	
	var businessObject = getBusinessCreateObject();
	
	$.ajax({
		type	:	"post",
		url		:	"/acp/advertiser/biz/create",
		dataType:	"json",
		data	: 	{businessProfileJSONString : JSON.stringify(businessObject)},
		timeout : 	5000,
		success	:	function(data){	
//			alert("INFO: createBusinessProfile success");
			var b = data.businessProfile;
			var bizId = b.bizId;
			window.location.href="/acp/advertiser/biz/complete.html?bizId="+bizId;
		}		
	});
}

/**
 * Trigger : button link [Cancel]
 * @Author Athens
 */
function cancelCreateBusinessProfile(){
//	alert("INFO: cancelCreateBusinessProfile()");
	
	window.location.href="/acp/advertiser/biz/";
}



function getSubIndustryCode1(){
	//selectObject=$("#industryCodeLevel1")
	var checkText=$("#industryCodeLevel1").find("option:selected").text();  //Select - Text
	var parentCode=$("#industryCodeLevel1").val();  //Select - Value
	var nextLevelIndex = 2;
	getSubIndustryCode(parentCode,nextLevelIndex);
	$("#industryCode").val(parentCode);
}

function getSubIndustryCode2(){
	var parentCode=$("#industryCodeLevel2").val();  //Select - Value
	var checkText=$("#industryCodeLevel2").find("option:selected").text();  //Select - Text
	var nextLevelIndex = 3;
	getSubIndustryCode(parentCode,nextLevelIndex);
	//var parentCode=$("#industryCodeLevel2").val();  //Select - Value
	//alert(checkValue+" : "+checkText);
	$("#industryCode").val(parentCode);
}

function getSubIndustryCode3(){
	var parentCode=$("#industryCodeLevel3").val();  //Select - Value
	var checkText=$("#industryCodeLevel3").find("option:selected").text();  //Select - Text
	var nextLevelIndex = 4;
	getSubIndustryCode(parentCode,nextLevelIndex);
	//alert(checkValue+" : "+checkText);
	$("#industryCode").val(parentCode);
}

function getSubIndustryCode4(){
	var parentCode=$("#industryCodeLevel4").val();  //Select - Value
	var checkText=$("#industryCodeLevel4").find("option:selected").text();  //Select - Text
	
	$("#industryCode").val(parentCode);
}


function getSubIndustryCode(parentIndustryCode,nextLevelIndex){
	//alert("parent code = "+parentIndustryCode);
	
	$("#industryCodeLevel"+nextLevelIndex+"").empty().append('<option value="">-- choose a sub-category --- </option>');
	//empty the rest levels
	for (var i=nextLevelIndex+1; i <= 4; i++) { 
		$("#industryCodeLevel"+i).find('option:first').attr("value", "").text("--/--");
		$("#industryCodeLevel"+i).find('option').not(':first').remove();
	}
	
	
	$.ajax({
		type	:	"get",
		url	:"/acp/advertiser/biz/industrycode/class/"+parentIndustryCode,
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