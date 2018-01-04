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

function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();
        
        reader.onload = function (e) {
            $('#blah').attr('src', e.target.result);
        }
        
        reader.readAsDataURL(input.files[0]);
    }
}


function clickUpload(id) {
	var path =  $("#ufile").val();
	var filename = path.replace(/^.*[\\\/]/, '');
	//alert("filename="+filename);
	var file_data = $("#ufile").prop("files")[0]; // Getting the properties of file from file field
	  var form_data = new FormData(); // Creating object of FormData class
	  form_data.append("name", filename); // Adding extra parameters to form_data
	  //form_data.append("curl", curl); 
	  form_data.append("file", file_data); // Appending parameter named file with properties of file_field to form_data
	  
	  $.ajax({
		url:'/acp/advertiser/adpost/imageUpload?eventUUID='+id,
	    //dataType: 'script',
	    cache: false,
	    contentType: false,
	    processData: false,
	    data: form_data, // Setting the data attribute of ajax with file_data
	    type: 'post',
	    error: function (xhr, status) {
            alert(status);
        },
	    success: function(data) {
	      // Do something after Ajax completes 
	      //alert(data["url"]);
	      $("#adPost-cover-img-url").val(data["url"]);
	      $("#fileinput-new-img").attr("src",data["url"]);
	      //for (var i in data) {
	    	//  alert(i);
	      //}
	    }
	  });
}