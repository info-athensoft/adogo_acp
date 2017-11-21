/** ad_post_create.jsp */


/* create adpost - button:Save AdPost */

function saveAdPost(){
	//alert("saveAdPost called!");
	
	var businessObject = getBusinessObject();
	
	//alert("saveAdPost(), adPostLang="+adPostLang);
	
	$.ajax({
		type:"post",
		url:"saveAdPost",
		dataType:"json",
		data: {	adPostJSONString : JSON.stringify(businessObject) },
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

function clickUpload(id) {
	//alert(id);
	//$('#ufile').focus().trigger('click');
/*	var elem = document.getElementById('ufile');
    if(elem && document.createEvent) {
       var evt = document.createEvent("MouseEvents");
       evt.initEvent("click", true, false);
       elem.dispatchEvent(evt);
    }
	$.ajax({
		//type:"post",
		url:'/acp/ad/adpost/imageUpload?eventUUID='+id,
		//dataType:"json",
		//data: {	adpostId:adpostId },
		timeout : 5000,
		success:function(data){	
//			var msg = data.info_msg;
			//var userAccount = data.userAccount;
//				$("#sec_activate").html(msg);
//			$("#ua1").text(userAccount.acctId);
//				
			//alert(msg);
			//location = "goactivateresult?resultMsg="+msg;
		}		
	}); */
	
	//var formData = new FormData();
	//formData.append('file', $('#file')[0].files[0]);
	
	var path =  $("#ufile").val();
	var filename = path.replace(/^.*[\\\/]/, '');
	//var curl = window.location.href;
	//alert("filename="+filename);
	var file_data = $("#ufile").prop("files")[0]; // Getting the properties of file from file field
	  var form_data = new FormData(); // Creating object of FormData class
	  form_data.append("name", filename); // Adding extra parameters to form_data
	  //form_data.append("curl", curl); 
	  form_data.append("file", file_data); // Appending parameter named file with properties of file_field to form_data
	  
	  $.ajax({
		url:'/acp/ad/adpost/imageUpload?eventUUID='+id,
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
	      //Blockui App
	      App.blockUI({
              target: '#blockui_sample_id',
              message: 'LOADING ......  YOU CAN REPLACE YOUR OWN MESSAGE HERE!'
          });

          window.setTimeout(function() {
              App.unblockUI('#blockui_sample_id');
          }, 4000);
            
	      $("#adPost-cover-img-url").val(data["url"]);
	      $("#fileinput-new-img").attr("src",data["url"]);
	      //for (var i in data) {
	    	//  alert(i);
	      //}
	    }
	  });
}