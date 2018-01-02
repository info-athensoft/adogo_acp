/**
 * Package:	advertiser
 * Module:  adpost
 * Page:	booth_create.jsp
 */


function getBusinessCreateObject(){
//    var p1 = $("#userId").val();
    var p2 = $("#advertiserId").val();
    var p3 = $("#bizId").val();
    var p4 = $("#bizName").val();
    var p5 = $("#langNo").val();
    var p6 = $("#langBoothName").val();
    var p7 = $("#categoryNo").val();
    var p8 = $("#langBizDesc").val();
    
    var businessObject =
    {
//    		userId    		:   p1,
    		advertiserId    :   p2,
    		bizId    		:   p3,
    		bizName    		:   p4,
    		langNo    		:   p5,
    		langBoothName	:   p6,
    		categoryNo		:   p7,
    		langBizDesc		:   p8
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

//----------------------------------------------------------------

function clickUpload(id) {
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

function testButtonConfirmLang(){
	alert("ok");
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
