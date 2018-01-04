/**
 * Package:	advertiser
 * Module:  adpost
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
    var p8 = $("#langBizDesc").val();
    
    //booth cover url
    var p9 = $("#booth-cover-img-url").val();
    if(p9.trim()==''){
    	p9 = "http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image";
    }
    
    var businessObject =
    {
//    		userId    		:   p1,
    		advertiserId    :   p2,
    		bizId    		:   p3,
    		bizName    		:   p4,
    		langNo    		:   p5,
    		langBoothName	:   p6,
    		categoryNo		:   p7,
    		langBizDesc		:   p8,
    		
    		boothImg		: 	p9
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
		$("#msgLangBizDesc").text("Business descrption must be in "+langName);
	}else{
		$("#msgLangBoothName").text("");
		$("#msgLangBizDesc").text("");
	}
}


/**
 * Trigger : button link [Upload] @ Section: Booth Cover Image
 * @Author Athens
 */
function clickUpload(advertiserId,bizId) {
//alert("INFO: clickUpload(id)");	
		
	var path =  $("#ufile").val();	
	console.log("path from file chooser at web page : "+path);
	
	var filename = path.replace(/^.*[\\\/]/, '');
	console.log("file name after clean : "+filename);
	
	//getting the properties of file from file field
	var file_data = $("#ufile").prop("files")[0]; 
	
	//creating object of FormData class
	var form_data = new FormData(); 
	
	//adding extra parameters to form_data
	form_data.append("name", filename); 

	//Appending parameter named file with properties of file_field to form_data
	form_data.append("file", file_data); 
	
	//langNo
	var langNo = $("#langNo").val();
	if(langNo==0){
		alert("WARNING: Please choose a language for your booth first!");
		return;
	}
		  
	//execute file upload
	$.ajax({
		
//		url			:	'/acp/advertiser/adpost/imageUpload?eventUUID='+id,
		url			:	'/acp/resource/image/upload/BOOTH_COVER?advertiserId='+advertiserId+'&bizId='+bizId+'&langNo='+langNo,
	    cache		: 	false,
	    contentType	: 	false,
	    processData	: 	false,
	    data		: 	form_data, // setting the data attribute of AJAX with file_data
	    type		: 	'post',
	    error		: 	function (xhr, status) {
	        				alert(status);
	    				},
	    success		: 	function(data) {
	    					//alert("INFO: clickUpload success");
	    	
	    					//BlockUI
					    	App.blockUI({
					    		target	: '#div_boothCover',
					    		message	: 'UPLOADING ......  '
					    	});
	
					    	//UnblockUI
					    	window.setTimeout(function() {
					    		App.unblockUI('#div_boothCover');
					    	}, 4000);
	        
					    	//set image URL value into input element
					    	$("#booth-cover-img-url").val(data["url"]);
					    	$("#fileinput-new-img").attr("src",data["url"]);
	    				}
	  });	//end of AJAX
}




/**
 * Trigger : button link [Upload] @ Section: Booth Cover Image
 * @Author Athens
 */
function clickUploadBoothBanner(advertiserId,bizId) {
//alert("INFO: clickUpload(id)");	
		
	var path =  $("#ufile_boothBanner").val();	
	console.log("path from file chooser at web page : "+path);
	
	var filename = path.replace(/^.*[\\\/]/, '');
	console.log("file name after clean : "+filename);
	
	//getting the properties of file from file field
	var file_data = $("#ufile_boothBanner").prop("files")[0]; 
	
	//creating object of FormData class
	var form_data = new FormData(); 
	
	//adding extra parameters to form_data
	form_data.append("name", filename); 

	//Appending parameter named file with properties of file_field to form_data
	form_data.append("file", file_data); 
	
	//langNo
	var langNo = $("#langNo").val();
	if(langNo==0){
		alert("WARNING: Please choose a language for your booth first!");
		return;
	}
		  
	//execute file upload
	$.ajax({
		
//		url			:	'/acp/advertiser/adpost/imageUpload?eventUUID='+id,
		url			:	'/acp/resource/image/upload/BOOTH_BANNER?advertiserId='+advertiserId+'&bizId='+bizId+'&langNo='+langNo,
	    cache		: 	false,
	    contentType	: 	false,
	    processData	: 	false,
	    data		: 	form_data, // setting the data attribute of AJAX with file_data
	    type		: 	'post',
	    error		: 	function (xhr, status) {
	        				alert(status);
	    				},
	    success		: 	function(data) {
	    					//alert("INFO: clickUpload success");
	    	
	    					//BlockUI
					    	App.blockUI({
					    		target	: '#div_boothBanner',
					    		message	: 'UPLOADING ......  '
					    	});
	
					    	//UnblockUI
					    	window.setTimeout(function() {
					    		App.unblockUI('#div_boothBanner');
					    	}, 4000);
	        
					    	//set image URL value into input element
					    	$("#booth-banner-img-url").val(data["url"]);
					    	$("#fileinput-new-img_boothBanner").attr("src",data["url"]);
	    				}
	  });	//end of AJAX
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
