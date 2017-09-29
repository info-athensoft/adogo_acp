/** event_news_edit.jsp */

/* edit news - init */
var EventNewsEdit = function (option) {
	
	var imgNo = ["9", "8", "7", "6", "5", "4", "3", "2", "1"];
	//var num = "1";

    var handleImages = function(option) {

        // see http://www.plupload.com/
        var uploader = new plupload.Uploader({
            runtimes : 'html5,flash,silverlight,html4',
             
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

                    $('#tab_images_uploader_filelist').on('click', '.col-md-3 .added-files .remove', function(){
                    	imgNo.push($(this).attr("id"));
                        uploader.removeFile($(this).parent('.added-files').attr("id"));
                        $(this).parent('.added-files').parent().next().remove();
//                        $(this).parent('.added-files').remove();
                        $(this).parent('.added-files').parent().remove();
                    });
                    
                },
         
                FilesAdded: function(up, files) {
                	$.each(files, function (index, file) {
//                		alert('index='+index+' file2.name='+file.name);
//                		var file = files[0];
	            		var num = imgNo.pop();
	                	if (typeof num == 'undefined') {
	                		alert('Over limit!');
	                	}
	                    else { 
	                		var img = new mOxie.Image();
	                		img.onload = function () {
	                			$('#preview').empty();
	                			this.embed($('#preview').get(0), {
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
	                		$('#tab_images_uploader_filelist').append('<div class="col-md-3"  style="display: none;"><div  style="display: none;" class="alert alert-warning added-files" id="uploaded_file_' + file.id + '">' + file.name + '(' + plupload.formatSize(file.size) + ')<a href="javascript:;" id = "'+num+'" class="remove pull-right btn btn-sm red"><i class="fa fa-times"></i> remove</a></div></div>');
	                		file.name = num + "." + file.name.split('.')[1];
	                    }
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


