/**
 * Package:	advertiser
 * Module:  booth
 * Page:	booth_create.jsp
 */


function getBusinessCreateObject(){
//  var p1 = $("#userId").val();
    var p2 = $("#advertiserId").val();
    var p3 = $("#bizId").val();
    var p4 = $("#bizName").val();
    var p5 = $("#langNo").val();
    var p6 = $("#langBoothName").val();
    var p7 = $("#categoryNo").val();
    var p8 = $("#langBizDesc").val();	//booth description in specified language
    
    //booth cover image
    var p9 = $("#booth-cover-img-url").val();
    if(p9.trim()==''){
    	p9 = "http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image";
    }
    
    //booth banner image
    var p10 = $("#booth-banner-img-url").val();
    if(p10.trim()==''){
    	p10 = "http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image";
    }
    
    //booth introduction - text content
    var p41 = $("#textTitle1").val();
    var p42 = $("#text1").val();
    var p43 = $("#textTitle2").val();
    var p44 = $("#text2").val();
    var p45 = $("#textTitle3").val();
    var p46 = $("#text3").val();
    
    
    //business hours
    var p61 = $("#day1_start_time").val();        
    var p62 = $("#day1_end_time").val();
    var p63 = $("#day2_start_time").val();        
    var p64 = $("#day2_end_time").val();
    var p65 = $("#day3_start_time").val();        
    var p66 = $("#day3_end_time").val();
    var p67 = $("#day4_start_time").val();        
    var p68 = $("#day4_end_time").val();
    var p69 = $("#day5_start_time").val();        
    var p70 = $("#day5_end_time").val();
    var p71 = $("#day6_start_time").val();        
    var p72 = $("#day6_end_time").val();
    var p73 = $("#day7_start_time").val();        
    var p74 = $("#day7_end_time").val();
    var p75 = $("#comment").val();
    
    var businessObject =
    {
//    		userId    		:   p1,		//booth basic info.
    		advertiserId    :   p2,
    		bizId    		:   p3,
    		bizName    		:   p4,
    		langNo    		:   p5,
    		langBoothName	:   p6,
    		categoryNo		:   p7,
    		langBizDesc		:   p8,    		
    		boothImg		: 	p9,		//booth cover image
    		
    		
    		boothBannerImg	:	p10,	//booth banner image
    		
    		textTitle1		:	p41,	//booth introduction
    		text1			:	p42,
    		textTitle2		:	p43,
    		text2			:	p44,
    		textTitle3		:	p45,
    		text3			:	p46,
    		
    		day1StartTime   :   p61,	//business hours
    		day1EndTime    	:   p62,
    		day2StartTime   :   p63,
    		day2EndTime    	:   p64,          
    		day3StartTime   :   p65,
    		day3EndTime    	:   p65,
    		day4StartTime   :   p66,
    		day4EndTime    	:   p67,
    		day5StartTime   :   p68,
    		day5EndTime    	:   p69,          
    		day6StartTime   :   p70,
    		day6EndTime    	:   p71,
    		day7StartTime   :   p72,
    		day7EndTime    	:   p73,
    		comment         :   p74   		
    		
    };
    
//  alert("INFO: businessObject="+businessObject);    
    return businessObject;
}

/**
 * Trigger : button link [Quick Save]
 * @Author Athens
 */
function createBooth(){
//	alert("INFO: createBooth()");
	var businessObject = getBusinessCreateObject();
	
	$.ajax({
		type	:	"post",
		url		:	"/acp/advertiser/booth/create",
		dataType:	"json",
		data	: 	{boothJSONString : JSON.stringify(businessObject) },
		timeout : 	5000,
		success	:	function(data){
//			alert("INFO: createBooth success");
			window.location.href="/acp/advertiser/booth/";
		}
	});
}

function chooseLanguage(){
//	alert("INFO: chooseLanguage()");
	var langName=$("#langNo").find("option:selected").text();
	var langNoValue = $("#langNo").val();
//	alert(langNoValue);
	if(langNoValue!=0){
		$("#msgLangBoothName").text("Booth name must be in "+langName);
		$("#msgLangBizDesc1").text("This must be written in "+langName);
		$("#msgLangBizDesc2").text("This must be written in "+langName);
		$("#msgLangBizDesc3").text("This must be written in "+langName);
		$("#msgLangBizDesc4").text("This must be written in "+langName);
	}else{
		$("#msgLangBoothName").text("");
		$("#msgLangBizDesc1").text("");
		$("#msgLangBizDesc2").text("");
		$("#msgLangBizDesc3").text("");
		$("#msgLangBizDesc4").text("");
	}
}




//----------------------------------------------------------------

function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();
        
        reader.onload = function (e) {
            $('#blah').attr('src', e.target.result);
        }
        
        reader.readAsDataURL(input.files[0]);
    }
}


function testButtonConfirmLang(){
	alert("ok");
}

//may be a problem, not perfect yet
function showCategoryList(){
//	alert("INFO: showCategoryList()");	
	
	$("#boothCategoryDiv").toggle(
		function() {
	    	$("#boothCategoryChooser").text("Collpase");
		},
		function() {
		    $("#boothCategoryChooser").html("&nbsp;&nbsp;Choose&nbsp;&nbsp;");
		}
	);
}
