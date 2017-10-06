/** event_news_edit.jsp */

/* edit news - init */
var EventNewsEdit = function (option) {
	
//	var imgNo = ["9", "8", "7", "6", "5", "4", "3", "2", "1"];
	//var num = "1";

    var handleImages = function(option) {

        // see http://www.plupload.com/
        var uploader = new plupload.Uploader({
            runtimes : 'html5,flash,silverlight,html4', //
             
            browse_button : document.getElementById('tab_images_uploader_pickfiles'), // you can pass in id...
            container: document.getElementById('tab_images_uploader_container'), // ... or DOM Element itself
             
//            url : "http://localhost:8080/acp/events/fileUpload", //TODO: Change to relative url
            url : "", //TODO: Change to relative url
             
            filters : {
                max_file_size : '10mb',
                mime_types: [
                    {title : "Image files", extensions : "jpg,gif,png"},
                    {title : "Zip files", extensions : "zip"}
                ]
            },
         
            // Flash settings
            flash_swf_url : 'assets/plugins/plupload/js/Moxie.swf',
     
            // Silverlight settings
            silverlight_xap_url : 'assets/plugins/plupload/js/Moxie.xap',             
         
            init: {
                PostInit: function() {
                    $('#tab_images_uploader_filelist').html("");
         
                    $('#tab_images_uploader_uploadfiles').click(function() {
                        uploader.start();
                        return false;
                    });

                    //$('#tab_images_uploader_filelist').on('click', '.col-md-3 .added-files .remove', function(){
                	$('#tab_images_uploader_filelist').on('click', '.added-files .remove', function(){
//                    	imgNo.push($(this).attr("id"));
                        uploader.removeFile($(this).parent('.added-files').attr("id"));
//                        $(this).parent('.added-files').parent().next().remove();
//                        $(this).parent('.added-files').parent().remove();
                    });
                    
                },
         
                FilesAdded: function(up, files) {
                	$.each(files, function (i, file) {
                		$('#fileinput-new'  + (i+1)).show();
//                		var i = index +1;
                		var deleteHandle = function(uploaderObject, fileObject) {
                	        return function(event) {
                	            event.preventDefault();
                	            uploaderObject.removeFile(fileObject);
                	            $(this).closest("div#" + fileObject.id).remove();
                	            $('#uploaded_file_' + (i+1)).remove();
                	            $('#fileinput-new'  + (i+1)).text('Select Image');
                	            $("#preview"  + (i+1)).empty();
                	            $("#preview"  + (i+1)).prepend('<img src="http://www.placehold.it/100x75/EFEFEF/AAAAAA&amp;text=no+image" alt="" />');
                	        };
                	    };
//                		alert('index='+index+' file2.name='+file.name);
//                		var file = files[0];
	            	/*	var num = imgNo.pop();
	                	if (typeof num == 'undefined') {
	                		alert('Over limit!');
	                	}
	                    else { */
                	   
	                		var img = new mOxie.Image();
	                		img.onload = function () {
	                			$('#preview'  + (i+1)).empty();
	                			this.embed($('#preview'  + (i+1)).get(0), {
	                				width: 100,
	                				height: 75
	                			});
	                		};
	                		img.onembedded = function () {
	                			this.destroy();
	                		};
	                		img.onerror = function () {
	                			this.destroy();
	                		};
	                		img.load(this.getSource()); 
	                		
	                		//$("input:hidden").remove();
                	    /*
                	    alert('ie0');
                	    document.getElementById('previmg').src = "file:///" + document.getElementById("tab_images_uploader_pickfiles").value;
                	    if (navigator.appName === "Microsoft Internet Explorer") {
                	    	alert('ie');
                	    	document.getElementById('previmg').src = "file:///" + document.getElementById("tab_images_uploader_pickfiles").value;
                	    }
//                	    
                	    if (files && file) {
//                	    	alert('before new FileReader');
                	        var reader = new FileReader();
//                	        alert('after new FileReader');
                	        reader.onload = function (e) {
                	        	alert(e);
                	        	alert(e.target.result);
                	            $('#previmg').attr('src', e.target.result);
                	            
                	        }
                	        alert('before reader.readAsDataURL');
                	        reader.readAsDataURL(file);
                	        alert('after reader.readAsDataURL');
                	    }
	                	*/	
	                		if ($('#fileinput-new'  + (i+1)).text() == 'Change') {
	                			var pre_id = $('#uploaded_file_' + (i+1) +' :first-child').attr("id").substring(14);
//	                			alert($('#uploaded_file_' + (i+1) +' :first-child').attr("id").substring(14));
//	                			alert('file-name='+uploader.getFile($('#uploaded_file_' + i +' :first-child').attr("id").substring(14)).name);
//	                			up.removeFile(up.getFile($('#uploaded_file_' + i +' :first-child').attr("id")));
	                			up.removeFile(pre_id);
//	                			alert('attr.id-change='+$('#uploaded_file_' + i +' :first-child').attr("id") + '    file.id='+file.id + '    file.name='+file.name);
	                			$('#uploaded_file_' + (i+1)).remove();
	                			$('#' + pre_id).remove();
	                		}
	                		else {
//	                			alert('attr.id-select='+$('#uploaded_file_' + i +' :first-child').attr("id") + '    file.id='+file.id + '    file.name='+file.name);
	                		}
	                		
	                		/*
	                		var dataURI = $("#preview canvas")[0].toDataURL();
	                		alert('dataURI='+dataURI);
	                		*/
	                    	/*
	                		$('#preview').empty();
	                		var $canvas = $("<canvas></canvas>");
	                		$('#preview').append($canvas);
	                		var context = $canvas.get(0).getContext('2d');
	                		$canvas.attr('width', '100');
	                		$canvas.attr('height', '100');
	                		$('#preview').append($canvas);
	                		var image = new Image();
	                		image.onload = function () {
	                			context.drawImage(image, 0, 0, 100, 100);
	                		};
	                		image.src = $scope.data.user.image; */
	                		$('#tab_images_uploader_filelist').append('<div id="uploaded_file_' + (i+1) + '" class="col-md-3" style="display: none;"><div  style="display: none;" class="alert alert-warning added-files" id="uploaded_file_' + file.id + '">' + file.name + '(' + plupload.formatSize(file.size) + ')<a href="javascript:;" id = "'+ (i+1) +'" class="remove pull-right btn btn-sm red"><i class="fa fa-times"></i> remove</a></div></div>');
	                		//$('#tab_images_uploader_filelist').append('<div  style="display: none;" class="alert alert-warning added-files" id="uploaded_file_' + file.id + '">' + file.name + '(' + plupload.formatSize(file.size) + ')<a href="javascript:;" id = "'+i+'" class="remove pull-right btn btn-sm red"><i class="fa fa-times"></i> remove</a></div>');
	                		
	                		$('#fileinput-new'  + (i+1)).text('Change');
	                		$('#tab_images_uploader_container').append($('<div id="' + files[i].id + '" class="btn"  stype="background-color: pink;">' + '<a href="#" id="deleteFile' + files[i].id + '">Remove</a></div>'));
	                        $('#deleteFile' + files[i].id).click(deleteHandle(up, files[i]));
	                		file.name = (i+1) + "." + file.name.split('.')[1];
	                    //}
                    });
                	//alert('FilesAdded ...');
/*                    plupload.each(files, function(file) {
                    	//alert('plupload.each ...');
                    	var num = imgNo.pop();
                    	if (typeof num == 'undefined') {
                    		alert('Over limit!');
                    	}
                        else { 
                    		
                        	$('#tab_images_uploader_filelist').append('<div class="col-md-3"  style="display: none;"><div  style="display: none;" class="alert alert-warning added-files" id="uploaded_file_' + file.id + '">' + file.name + '(' + plupload.formatSize(file.size) + ')<a href="javascript:;" id = "'+num+'" class="remove pull-right btn btn-sm red"><i class="fa fa-times"></i> remove</a></div></div>');
                            //$('#tab_images_uploader_filelist').append('<div class="col-md-9" style="float: right; width: 250px;"><div class="form-group"><label class="col-md-3 control-label">Title</label><div class="col-md-9"><input type="text" id="adPost-gallery-img-title'+num+'" class="form-control" placeholder="Enter text"></div></div><div class="form-group"><label class="col-md-3 control-label">URL</label><div class="col-md-9"><input type="text" id="adPost-gallery-img-url'+num+'" class="form-control" placeholder="Enter text"></div></div><div class="form-group"><label class="col-md-3 control-label">Desc</label><div class="col-md-9"><textarea id="adPost-gallery-img-short-desc'+num+'" class="form-control" rows="2"></textarea></div></div></div>');
//                            file.name = num + "." + file.name.split('.')[1];
//                        	up.refresh();
                        }
                       		
                    }); */
                },
         
                UploadProgress: function(up, file) {
                	//alert('UploadProgress ...');
                	
                    $('#uploaded_file_' + file.id + ' > .status').html(file.percent + '%');
                },

                FileUploaded: function(up, file, response) {
                	//alert('FileUploaded ...');
                    var response = $.parseJSON(response.response);

                    if (response.result && response.result == 'OK') {
                    	//alert(file.id);
                        var id = response.id; // uploaded file's unique name. Here you can collect uploaded file names and submit an jax request to your server side script to process the uploaded files and update the images tabke

                        $('#uploaded_file_' + file.id + ' > .status').removeClass("label-info").addClass("label-success").html('<i class="fa fa-check"></i> Done'); // set successfull upload
                        
                        //create media record to database
                        
                        $('#adPost-gallery-img-url' + file.name.split('.')[0]).val(file.name);
                        
                    } else {
                        $('#uploaded_file_' + file.id + ' > .status').removeClass("label-info").addClass("label-danger").html('<i class="fa fa-warning"></i> Failed'); // set failed upload
                        Metronic.alert({type: 'danger', message: 'One of uploads failed. Please retry.', closeInSeconds: 10, icon: 'warning'});
                    }
                },
         
                Error: function(up, err) {
                    Metronic.alert({type: 'danger', message: err.message, closeInSeconds: 10, icon: 'warning'});
                },
                
                UploadComplete: function(){
                	var eventUUID = option;
                	//refresh tab_images when uploading done
                	//reloadEventMedia(eventUUID);
                	
                }
            }
        });

        
        uploader.setOption('url','/acp/ad/adpost/imageUpload?eventUUID='+option);
        uploader.init();

    }

    return {

        //main function to initiate the module
        init: function (option) {
//            initComponents();
        	//alert('return > init, before handleImages ...');
            handleImages(option);
//            handleReviews();
            //handleHistory();
        }

    };

}();

var imgNo = ["9", "8", "7", "6", "5", "4", "3", "2", "1"];

function add_gallery_img_section() {
	var num = imgNo.pop();
	var new_html = '\
		<div class="row">\
    	<div class="col-md-3">\
    		<div class="fileinput fileinput-new" data-provides="fileinput">\
                <div id="preview" class="fileinput-new thumbnail" style="width: 100px; height: 75px;">\
                    <img src="http://www.placehold.it/100x75/EFEFEF/AAAAAA&amp;text=no+image" alt="" /> </div>\
                <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"> </div>\
                <div id="tab_images_uploader_container">\
                    <span class="btn default btn-file">\
                        <span id="fileinput-new1" class="fileinput-new"> Select Image </span>\
                        <input type="file" id="tab_images_uploader_pickfiles" name="..."> </span>\
                </div>\
            </div>\
    	</div>\
    	<div class="col-md-9">\
        	<div class="form-group">\
                <label class="col-md-3 control-label">Title</label>\
                <div class="col-md-9">\
                    <input type="text" id="adPost-gallery-img-title1" class="form-control" placeholder="Enter text">\
                </div>\
            </div>\
            <div class="form-group">\
                <label class="col-md-3 control-label">URL</label>\
                <div class="col-md-9">\
                    <input type="text" id="adPost-gallery-img-url1" class="form-control" placeholder="Enter text">\
                </div>\
            </div>\
        	<div class="form-group">\
                <label class="col-md-3 control-label">Desc</label>\
                <div class="col-md-9">\
                    <textarea id="adPost-gallery-img-short-desc1" class="form-control" rows="2"></textarea>\
                </div>\
            </div>\
    	</div>\
	</div>\
	';
	if (typeof num == 'undefined') {
		alert('Over limit!');
	}
    else {
//    	$( "#add_gallery_img_section" ).appendTo(new_html);
    	$( "#gallery_img_section" + num).show();
    }
}

function PreviewImg(input) {
/*	
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#previmg').attr('src', e.target.result);
        }

        reader.readAsDataURL(input.files[0]);
    } */
	alert('onchange');
}
