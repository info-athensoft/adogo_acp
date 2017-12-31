/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	bizprofile_edit.jsp
 */

/**
 * @Author Athens
 */
function getBusinessProfileEditObject(){	
	var p01 = $("#bizId").val();
    var p1 = $("#bizName").val();
    var p2 = $("#bizNo").val();
    var p3 = $("#bizOwner").val();
    var p4 = $("#legalFormNo").val();
    var p5 = $("#industryCode").val();
    var p6a = "0";
    var p6b = "0";
    var p6c = "0";
    
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
    
    var p31 = $("#presenceNo1").val();
    var p32 = $("#presenceURL1").val();
    
    var p33 = $("#presenceNo2").val();
    var p34 = $("#presenceURL2").val();
    
    var p35 = $("#presenceNo3").val();
    var p36 = $("#presenceURL3").val();
    
    var p37 = $("#presenceNo4").val();
    var p38 = $("#presenceURL4").val();
    
    var p39 = $("#presenceNo5").val();
    var p40 = $("#presenceURL5").val();
    
    var p41 = $("#presenceNo6").val();
    var p42 = $("#presenceURL6").val();
    
    var businessObject = {
		bizId    		:   p01,
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
		postalCode		:	p19,
		
		presenceNo1		:	p31,
		presenceURL1	:	p32,
		presenceNo2		:	p33,
		presenceURL2	:	p34,
		presenceNo3		:	p35,
		presenceURL3	:	p36,
		presenceNo4		:	p37,
		presenceURL4	:	p38,
		presenceNo5		:	p39,
		presenceURL5	:	p40,
		presenceNo6		:	p41,
		presenceURL6	:	p42
    };
    
//  alert("INFO: businessObject="+businessObject);
    return businessObject;
}

/**
 * Trigger : button link [Save and Exit]
 * @Author Athens
 */
function saveBusinessProfile(){
//	alert("INFO: disableBusinessProfile()");
	var businessObject = getBusinessProfileEditObject();
	
	$.ajax({
		type	:	"post",
		url		:	"/acp/advertiser/biz/save",
		dataType:	"json",
		data	: 	{bizProfileJSONString : JSON.stringify(businessObject)},
		timeout : 	5000,
		success	:	function(data){
//			alert("INFO: saveBusinessProfile success");
			var bizProfile = data.bizProfile;
			var bizId = bizProfile.bizId;
			window.location.href="/acp/advertiser/biz/manage.html";
		}		
	});
}

/**
 * Trigger : button link [Cancel]
 * @Author Athens
 */
function cancelSaveBusinessProfile(){
//	alert("INFO: cancelSaveBusinessProfile()");
	
	window.location.href="/acp/advertiser/biz/";
}


//------------------------------------------------------------------------------------------


/**
 * 
 * @Author Athens
 * 
 * Status:	IN TEST
 */
function test(){
	var checkText=$("#industryCodeLevel1").find("option:selected").text();  //Select - Text
	var parentCode=$("#industryCodeLevel1").val();  //Select - Value
	getSubIndustryCode(parentCode);
}


/**
 * @param level
 * @returns
 * 
 * @Author sfz
 * 
 * Status:	IN TEST
 */
function industryCodeOnChange(level){
//	alert("INFO: cancelSaveBusinessProfile(level)");
	
	var parentCode=$("#industryCodeLevel"+level).val();  //Select - Value
	
	//put the value of last level of industry code into input element 'industryCode'
	$("#industryCode").val(parentCode);
	
	//4 stands for the number of industry code level
	//only handle for level 1 to level 3
	if (level<4) {
		$.ajax({
			type	:	"GET",
			url		: 	"/acp/advertiser/industrycode/class/"+parentCode,
			dataType:	'json',
			timeout : 	10000,
			success	:	function(data){
//				alert("INFO: industryCodeOnChange success");
				
				//get list of sub-industry code
				var listIndustryCode = data.listIndustryCode;
				
				//set list value into drop-down element of current level
				var industryCodeElement = $("#industryCodeLevel"+(level+1));
				industryCodeElement.empty();
				
				//add the first entry of 'Choose sub category for your business' into the drop-down element
				industryCodeElement.append($("<option></option>")
		       	   .attr("value", "").text("Choose sub category for your business"));
				
				//add data entries
				listIndustryCode.forEach(function(indCode, index) {
					industryCodeElement.append($("<option></option>")
				       .attr("value", indCode.industryCode).text(indCode.industryCode + " " + indCode.industryName));
				});
				
				//empty the rest levels
				for (var i=level+2; i <= 4; i++) { 
					$("#industryCodeLevel"+i).find('option:first').attr("value", "").text("--/--");
					$("#industryCodeLevel"+i).find('option').not(':first').remove();
				} 
			}		
		});
	}
}


/**
 * @param level
 * @returns
 * 
 * @Author sfz
 * 
 * Status:	IN TEST
 */
function showCategoryList(){

	//$("#boothCategoryList").show();
	//$("#boothCategoryChooser").html("&nbsp;&nbsp;&nbsp;Collpase&nbsp;&nbsp;&nbsp;");
	
	$.ajax({
		type	:	"GET",
		url		:	"/acp/advertiser/categoryChooseClick",
		dataType:	"json",
		//data: { },
		timeout : 	5000,
		success	:	function(data){	
			//alert('return successfully!'+ data.categoryList.length);
			var list = data.categoryList;
			var $el = $("#boothCategorySelection");
			//$el.empty();
//			$el.append($("<option></option>")
//	       	   .attr("value", "").text("Choose the category"));
			list.forEach(function(cat, index) {
				//alert("IndustryCode.name:"+indCode.industryName);
				$el.append($("<option></option>")
			       .attr("value", cat.industryCode).text(cat.industryCode + " : " + cat.industryName));
				});
			
			$("#boothCategoryDiv").toggle(
					function() {
				    	$("#boothCategoryChooser").text("Collpase");
					},
					function() {
					    $("#boothCategoryChooser").html("&nbsp;&nbsp;&nbsp;&nbsp;Choose&nbsp;&nbsp;&nbsp;&nbsp;");
					}
				);
		}		
	});
	
	
}

/**
 * @param sel
 * @returns
 * 
 * @Author sfz
 * 
 * Status:	IN TEST
 */
function boothCategorySelectionOnchange(sel) {
	var sv = sel.options[sel.selectedIndex].value;
	var st = sel.options[sel.selectedIndex].text;
	//alert('value:'+sv+' text:'+st);
	$('#categoryNo').val(st);
	$("#boothCategoryDiv").hide();
}

/**
 * initializing of page
 */
$(document).ready(function(){
	$("#boothCategoryDiv").hide();
});


/*
function setBizTypeValue(){
	var val = 0;
    $('input.businessType:checkbox:checked').each(function(i){
      val += parseInt($(this).val());
    });
    $('#bizType').val(val);
}*/