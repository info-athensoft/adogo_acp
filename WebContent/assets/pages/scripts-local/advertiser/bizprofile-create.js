/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	advertiser_bizprofile_create.jsp
 */

/**/
function saveBusinessProfile(){
	//alert("saveBusinessProfile()");
	
	var businessObject = getBusinessObject();
	
	$.ajax({
		type:"post",
		url:"/acp/advertiser/biz/create",		//TODO
		dataType:"json",
		data: {	businessProfileJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){	
//			alert("saveBusinessProfile ajax ok");
			//window.location.href="/acp/advertiser/biz/register.html";
//			var businessProfile = JSON.stringify(data.businessProfile);
			var b = data.businessProfile;
			var bizId = b.bizId;
			//alert(bizId);
			window.location.href="/acp/advertiser/biz/complete.html?bizId="+bizId;
			
			alert("saveBusinessProfile ajax ok2");
		}		
	});
}

function cancelBusinessRegistration(){
	alert("cancelBusinessRegistration()");
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
//  var p6 = $("#bizType").val();
    
    var p6a;
    var p6b;
    var p6c;
    
    if($('#bizTypeProduct').prop('checked')){
    	p6a = $("#bizTypeProduct").val();
    }else{
    	p6a = "0";
    }
    if($('#bizTypeEProduct').prop('checked')){
    	p6b = $("#bizTypeEProduct").val();
    }else{
    	p6b = "0";
    }
    if($('#bizTypeService').prop('checked')){
    	p6c = $("#bizTypeService").val();
    }else{
    	p6c = "0";
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
    
    
    var businessObject =
    {
    		bizName    		:   p1,
    		bizNo    		:   p2,
    		bizOwner    	:   p3,
    		legalFormNo    	:   p4,
    		industryCode    :   p5,
//    		bizType    		:   p6,
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
    
    return businessObject;
}

/*
function getBizTypeValue(){
	var val = 0;
    $('input.businessType:checkbox:checked').each(function(i){
      val += parseInt($(this).val());
    });
    return val;
}*/
