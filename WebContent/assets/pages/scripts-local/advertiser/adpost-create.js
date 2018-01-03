/**
 * Package:	advertiser
 * Module:  adpost
 * Page:	adpost_create.jsp
 */

/* create adpost - button:Save AdPost */
function saveAdPost(){
	//alert("saveAdPost called!");
	var businessObject = getBusinessObject();
	
	$.ajax({
		type:"post",
		url:"/acp/adevertiser/adpost/saveAdPost",
		dataType:"json",
		data: {	adPostJSONString : JSON.stringify(businessObject) },
		timeout : 5000,
		success:function(data){	
		}		
	});
}



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
	  
	//execute file upload
	$.ajax({
		
//		url			:	'/acp/advertiser/adpost/imageUpload?eventUUID='+id,
		url			:	'/acp/resource/image/upload?advertiserId='+advertiserId+'&bizId='+bizId,
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
					    		target	: '#blockui_sample_id',
					    		message	: 'UPLOADING ......  '
					    	});
	
					    	//UnblockUI
					    	window.setTimeout(function() {
					    		App.unblockUI('#blockui_sample_id');
					    	}, 4000);
	        
					    	//set image URL value into input element
					    	$("#adPost-cover-img-url").val(data["url"]);
					    	$("#fileinput-new-img").attr("src",data["url"]);
	    				}
	  });	//end of AJAX
}

function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();
        
        reader.onload = function (e) {
            $('#blah').attr('src', e.target.result);
        }
        
        reader.readAsDataURL(input.files[0]);
    }
}