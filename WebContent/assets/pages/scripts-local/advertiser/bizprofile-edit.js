/**
 * Package:	advertiser
 * Module:  business profile
 * Page:	advertiser_bizprofile_edit.jsp
 */

function getBusinessProfileEditObject(){	
//	create a json object
	
	alert("getBusinessProfileEditObject()");
	
	var p01 = $("#bizId").val();
	
    var p1 = $("#bizName").val();
    var p2 = $("#bizNo").val();
    var p3 = $("#bizOwner").val();
    var p4 = $("#legalFormNo").val();
    var p5 = $("#industryCode").val();
    var p6 = $("#bizType").val();
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
    		bizId    		:   p01,
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
    		portType		:	p15,
    		portNo			:	p16,
    		cityName		:	p17,
    		provName		:	p18,
    		postalCode		:	p19
    };
    
    return businessObject;
}


//function saveAdvertiserProfile(){
function saveBusinessProfile(){
	alert('saveAdvertiserProfile called!');
	var businessObject = getBusinessProfileEditObject();
	
	//alert("saveAdPost(), adPostLang="+adPostLang);
	
	$.ajax({
		type:"post",
//		url:"/acp/advertiser/saveAdvertiserProfile",
		url:"/acp/advertiser/biz/save",
		dataType:"json",
		data: {	bizProfileJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){	
		}		
	});
}

function cancelSave(){
	alert("cancel save business profile");
}


function test(){
	var checkText=$("#industryCodeLevel1").find("option:selected").text();  //Select - Text
	var parentCode=$("#industryCodeLevel1").val();  //Select - Value
	//alert(checkValue+" : "+checkText);
	getSubIndustryCode(parentCode);
}

function industryCodeOnChange(level){
	//alert("industryCodeOnChange(level)");
	//var checkText=$("#industryCodeLevel1").find("option:selected").text();  //Select - Text
	var parentCode=$("#industryCodeLevel"+level).val();  //Select - Value
	$("#industryCode").val(parentCode);
	//alert(parentCode+" : "+parentCode);
	if (level<4) {
		$.ajax({
			type:"GET",
			url: "/acp/advertiser/industrycode/class/"+parentCode,		//TODO
			//url: "/acp/advertiser/industrycode",		 //working
			dataType:'json',
			//data: {	parentIndustryCode : parentCode },
			timeout : 10000,
			//beforeSend: function() { alert('beforeSend'); },		
			//complete: function() { alert('completed'); },
			success:function(data){	
				var listIndustryCode = data.listIndustryCode;
				var $el = $("#industryCodeLevel"+(level+1));
				$el.empty();
				//Choose sub category for your business
				$el.append($("<option></option>")
		       	   .attr("value", "").text("Choose sub category for your business"));
				listIndustryCode.forEach(function(indCode, index) {
					//alert("IndustryCode.name:"+indCode.industryName);
					$el.append($("<option></option>")
				       .attr("value", indCode.industryCode).text(indCode.industryCode + " " + indCode.industryName));
					});
				//reset the rest levels
				for (var i=level+2; i <= 4; i++) { 
					$("#industryCodeLevel"+i).find('option:first').attr("value", "").text("--/--");
					$("#industryCodeLevel"+i).find('option').not(':first').remove();
				} 
			}		
		});
	}
}

function setBizTypeValue(){
	var val = 0;
    $('input.businessType:checkbox:checked').each(function(i){
      val += parseInt($(this).val());
    });
    $('#businessType').val(val);
}

function showCategoryList(){
	//alert("ok");
	//$("#boothCategoryList").show();
	//$("#boothCategoryChooser").html("&nbsp;&nbsp;&nbsp;Collpase&nbsp;&nbsp;&nbsp;");
	
	$.ajax({
		type:"GET",
		url:"/acp/advertiser/categoryChooseClick",
		dataType:"json",
		//data: { },
		timeout : 5000,
		success:function(data){	
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

function boothCategorySelectionOnchange(sel) {
	var sv = sel.options[sel.selectedIndex].value;
	var st = sel.options[sel.selectedIndex].text;
	//alert('value:'+sv+' text:'+st);
	$('#categoryNo').val(st);
	$("#boothCategoryDiv").hide();
}

$(document).ready(function(){
	$("#boothCategoryDiv").hide();
	
	//init
//	$("#boothCategoryList").html(
//			"1,1,1,1<br/>1,1,1,1<br/>"
//	);
			
});