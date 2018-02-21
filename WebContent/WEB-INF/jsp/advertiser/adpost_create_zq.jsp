<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- global variables settings -->
<c:set var="webapp_name" value="/acp"/>
<!-- END global variables settings -->

<!-- page variables  -->
<c:set var="inc_dir" value="../inc"/>
<!-- END page variables -->

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<title>Adogo | Ad Post - Create</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8"/>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<meta name="description" content=""/>
<meta name="author" content="Informatique Athensoft"/>
      
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" />
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/font-awesome/css/font-awesome.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"/>        
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.css" />
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-wysihtml5/wysiwyg-color.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css" />
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-summernote/summernote.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/datatables/datatables.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-fileinput/bootstrap-fileinput.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput-typeahead.css"/>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL STYLES -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/css/components.min.css" id="style_components"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/css/plugins.min.css"/>
<!-- END THEME GLOBAL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/layout.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/themes/blue.min.css" id="style_color" />
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/custom.min.css"/>
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="${webapp_name}/assets/athensoft/ico/favicon.ico"/>
</head>

<body class="page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid">
    <div class="page-header navbar navbar-fixed-top">
            <!-- BEGIN HEADER INNER -->
            <div class="page-header-inner ">
                <!-- BEGIN LOGO -->
                <jsp:include page="${inc_dir}/page-logo.jsp"></jsp:include>
                <!-- END LOGO -->
                <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                <a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"> </a>
                <!-- END RESPONSIVE MENU TOGGLER -->
                <!-- BEGIN PAGE ACTIONS -->
                <!-- DOC: Remove "hide" class to enable the page header actions -->
                <jsp:include page="${inc_dir}/page-action.jsp"></jsp:include>
                <!-- END PAGE ACTIONS -->
                <!-- BEGIN PAGE TOP -->
                <jsp:include page="${inc_dir}/page-top.jsp"></jsp:include>
                <!-- END PAGE TOP -->
            </div>
            <!-- END HEADER INNER -->
        </div>
    <div class="clearfix"> </div>
        
    <!-- BEGIN CONTAINER -->
    <div class="page-container">
    	<!-- BEGIN SIDEBAR -->
        <jsp:include page="${inc_dir}/page-sidebar.jsp"></jsp:include>
        <!-- END SIDEBAR -->
        
        <!-- BEGIN CONTENT -->
        <div class="page-content-wrapper">
        <!-- BEGIN CONTENT BODY -->
        <div class="page-content">
        	<!-- BEGIN PAGE HEADER-->
            <h1 class="page-title"> Advertiser | Ad Post <small>create an Ad post</small></h1>
            <div class="page-bar">
            	<ul class="page-breadcrumb">
					<li><i class="fa fa-home"></i><a href="#">Home</a><i class="fa fa-angle-right"></i></li>
					<li><a href="${webapp_name}/advertiser/">Advertiser</a><i class="fa fa-angle-right"></i></li>
					<li><a href="${webapp_name}/advertiser/adpost/">Ad Post</a><i class="fa fa-angle-right"></i></li>
					<li><a href="#">Create Ad Post</a></li>
				</ul>
                <div class="page-toolbar">
                	<div class="btn-group pull-right">
	                    <button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" 
	                    		data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true"> 
	                    		Quick Links <i class="fa fa-angle-down"></i>
	                    </button>
                        <ul class="dropdown-menu pull-right" role="menu">
		                	<li><a href="${webapp_name}/advertiser/"><i class="icon-bag"></i> Advertiser Dashboard</a></li>
			                <li><a href="${webapp_name}/advertiser/biz/"><i class="icon-bell"></i> Goto Business</a></li>
			                <li><a href="${webapp_name}/advertiser/booth/"><i class="icon-shield"></i> Goto Booths</a></li>
			                <li><a href="${webapp_name}/advertiser/adpost/"><i class="icon-user"></i> Goto Ad Post</a></li>
			                <li class="divider"> </li>
			                <li><a href="#"><i class="icon-bag"></i> Export Report</a></li>
			            </ul>
                    </div>
                </div>
            </div>
            <!-- END PAGE HEADER-->
                    
            <div class="row">
            	<div class="col-md-9">
                	<div class="form-horizontal form-row-seperated">
                    	<div class="portlet">
                            <div class="portlet-title">
                                <div class="caption">
                                    Create an Ad Post<span class="caption-helper"> writing Ad details, associated medias, pictures, etc.</span>
								</div>
                                <div class="actions btn-set">
                                    <button type="button" name="back" class="btn btn-secondary-outline" onclick="backToNewsList(); return false;">
                                        <i class="fa fa-angle-left"></i> Back</button>
                                    <button class="btn btn-secondary-outline" onclick="resetNews(); return false;">
                                        <i class="fa fa-reply"></i> Reset</button>
                                    <button class="btn btn-success" onclick="saveAdPost(); return false;">
                                        <i class="fa fa-check"></i> Save</button>
                                    <button class="btn btn-success" onclick="updateNewsAndContinue(); return false;">
                                        <i class="fa fa-check-circle"></i> Save &amp; Continue Edit</button>
                                    <div class="btn-group">
                                        <a class="btn btn-success dropdown-toggle" href="javascript:;" data-toggle="dropdown">
                                            <i class="fa fa-share"></i> More
                                            <i class="fa fa-angle-down"></i>
                                        </a>
                                        <div class="dropdown-menu pull-right">
                                        	<ul>
	                                            <li><a href="javascript:;"> Duplicate </a></li>
	                                           	<li><a href="javascript:;"  onclick="markNewsStatusDeleted('${newsObject.eventUUID}'); return false;">Mark Deleted </a></li>
	                                            <li class="dropdown-divider"> </li>
	                                            <li><a href="javascript:;"> Print </a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="portlet-body">
                                <div class="tabbable-bordered" id="tabs_event">
                                    <ul class="nav nav-tabs">
                                        <li class="active"><a href="#tab_adpost_head" data-toggle="tab"> Ad Post Head </a></li>
                                        <li><a href="#tab_images" data-toggle="tab"> Images </a></li>
                                        <li><a href="#tab_media" data-toggle="tab"> Media </a></li>
                                        <!-- <li><a href="#tab_meta" data-toggle="tab"> Meta </a></li>  -->
                                    </ul>
                                    <div class="tab-content" >
                                    	<div class="tab-pane active" id="tab_adpost_head">
                                        	<div class="portlet light">
					                  			<div class="portlet-title">
					                                  <div class="caption font-red-sunglo">
					                                      <i class="icon-settings"></i>
					                                      <span class="caption-subject sbold uppercase">Basic Information of Ad Post</span>
					                                  </div>
					                                  <div class="actions">
					                                      <div class="btn-group">
					                                          <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
					                                              <i class="fa fa-angle-down"></i>
					                                          </a>
					                                          <ul class="dropdown-menu pull-right">
					                                              <li>
					                                                  <a href="javascript:;">
					                                                      <i class="fa fa-pencil"></i> Edit </a>
					                                              </li>
					                                              <li>
					                                                  <a href="javascript:;"><i class="fa fa-trash-o"></i> Delete </a>
					                                              </li>
					                                              <li>
					                                                  <a href="javascript:;"><i class="fa fa-ban"></i> Ban </a>
					                                              </li>
					                                              <li class="divider"> </li>
					                                              <li>
					                                              <a href="javascript:;"> Make admin </a>
					                                              </li>
					                                          </ul>
					                                      </div>
					                                  </div>
					                              </div>
					          					<div class="portlet-body form">
                                  					<form class="form-horizontal" role="form">
					                                	<div class="form-body">
					                                    	<div class="form-group">
					                                        	<label class="col-md-3 control-label">Choose a language</label>
					                                        	<div class="col-md-9">
					                                              	<select id="adPost-lang" class="form-control">
					                                                	<option value="1033" selected="selected">English</option>
					                                                	<option value="3084" >French</option>
					                                                	<option value="2052">Chinese (Simplified)</option>
					                                                 	<option value="31748">Chinese (Traditional)</option>
					                                              	</select>
						                                        </div>
					                                 		</div>
					                                      	
						                                    <div class="form-group">
						                                    	<label class="col-md-3 control-label">Title</label>
						                                        <div class="col-md-9">
						                                    		<input type="text" id="adPost-title" class="form-control" placeholder="Enter text">
						                                     	</div>
						                                    </div>
					                                          
				                                          	<div class="form-group">
				                                            	<label class="col-md-3 control-label">Author</label>
				                                            	<div class="col-md-9">
				                                            		<input type="text" id="adPost-author" class="form-control" placeholder="Enter text">
				                                            	</div>
				                                          	</div> 
						                                          
						                                    <div class="form-group">
						                                    	<label class="col-md-3 control-label">Category</label>
						                                    	<div class="col-md-9">
						                                    		<input type="text" id="adPost-category" class="form-control" placeholder="Enter text">
						                                    	</div>
						                                    </div>
						                                          
						                                    <div class="form-group">
						                                    	<label class="col-md-3 control-label">Tags</label>
						                                    	<div class="col-md-9">
						                                    		<input type="text" id="adPost-tags" class="form-control" value="a,b,c" data-role="tagsinput">
						                                    	</div>
						                                    </div> 
						                                          
						                                    <div class="form-group">
						                                    	<label class="col-md-3 control-label">Short Description</label>
						                                        <div class="col-md-9">
						                                        	<textarea id="adPost-short-desc" class="form-control" rows="3"></textarea>
						                                        </div>
						                                    </div>
					                                	</div>
                                  					</form>
                              					</div>
                  							</div>
                                        	
                                        	<!-- cover image -->
					                       	<div class="portlet light">
					                  			<div class="portlet-title">
					                             	<div class="caption font-red-sunglo">
					                             		<i class="icon-settings"></i>
					                                	<span class="caption-subject sbold uppercase">Cover Image</span>
					                          		</div>
					                                <div class="actions">
					                                      <div class="btn-group">
					                                          <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
					                                              <i class="fa fa-angle-down"></i>
					                                          </a>
					                                          <ul class="dropdown-menu pull-right">
					                                              <li>
					                                                  <a href="javascript:;"><i class="fa fa-pencil"></i> Edit </a>
					                                              </li>
					                                              <li>
					                                                  <a href="javascript:;"><i class="fa fa-trash-o"></i> Delete </a>
					                                              </li>
					                                              <li>
					                                                  <a href="javascript:;"><i class="fa fa-ban"></i> Ban </a>
					                                              </li>
					                                              <li class="divider"> </li>
					                                              <li>
					                                                  <a href="javascript:;"> Make admin </a>
					                                              </li>
					                                          </ul>
					                                      </div>
					                                  </div>
					                         	</div>
					                  			<div class="portlet-body form">
					                            	<form class="form-horizontal" role="form">
						                            	<div class="form-body" id="blockui_sample_id">
						                                	<div class="row">
						                                    	<div class="col-md-4">
						                                      		<div class="fileinput fileinput-new" data-provides="fileinput">
					                                                      <div class="fileinput-new thumbnail" style="width: 200px; height: 150px;">
					                                                          <img id="fileinput-new-img" src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image" alt="" /> </div>
					                                                      <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"> </div>
					                                                      <div>
					                                                          <span class="btn default btn-file">
					                                                              <span class="fileinput-new"> Select image </span>
					                                                              <span class="fileinput-exists"> Change </span>
					                                                              <input type="file" id="ufile" name="..."> </span>
					                                                          <a href="javascript:;" class="btn red fileinput-exists" data-dismiss="fileinput"> Remove </a>
					                                                          <a href="javascript:;" class="btn green fileinput-exists" data-dismiss="fileinput" onclick=" clickUpload('1011')"> Upload </a>
					                                                      </div>
					                                             	</div>
						                                        	<div class="clearfix margin-top-10">
	                                                					<span class="label label-danger">NOTE!</span> Image dimension must be 900X400
	                                                				</div>
						                                      	</div>
						                                    	<div class="col-md-8">
					                                      			<div class="form-group">
						                                                <label class="col-md-2 control-label">Image Title</label>
						                                                <div class="col-md-10">
						                                                    <input type="text" id="adPost-cover-img-title" class="form-control" placeholder="Enter text">
						                                                </div>
						                                            </div>
						                                            
						                                            <div class="form-group">
						                                                <label class="col-md-2 control-label">URL</label>
						                                                <div class="col-md-10">
						                                                    <input type="text" id="adPost-cover-img-url" class="form-control" placeholder="Enter text">
						                                                </div>
						                                            </div> 
						                                            
					                                            	<div class="form-group">
						                                                <label class="col-md-2 control-label">Description</label>
						                                                <div class="col-md-10">
						                                                    <textarea id="adPost-cover-img-short-desc" class="form-control" rows="2"></textarea>
						                                                </div>
						                                            </div>
					                                      		</div>
						                                    </div>
						                                </div>
					                            	</form>
					                          	</div>
					                  		</div><!-- END cover image -->
                                        	
                                        	<!-- text content -->
					                        <div class="portlet light">
					                  			<div class="portlet-title">
			                                  	<div class="caption font-red-sunglo">
			                                    	<i class="icon-settings"></i>
			                                    	<span class="caption-subject sbold uppercase">Text Content</span>
			                                  	</div>
				                                <div class="actions">
				                                	<div class="btn-group">
				                                          <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
				                                              <i class="fa fa-angle-down"></i>
				                                          </a>
				                                          <ul class="dropdown-menu pull-right">
				                                              <li><a href="javascript:;"><i class="fa fa-pencil"></i> Edit </a></li>
				                                              <li><a href="javascript:;"><i class="fa fa-trash-o"></i> Delete </a></li>
				                                              <li><a href="javascript:;"><i class="fa fa-ban"></i> Ban </a></li>
				                                              <li class="divider"> </li>
				                                              <li><a href="javascript:;"> Make admin </a></li>
				                                          </ul>
				                                      </div>
				                                </div>
					                            </div>
					                  			<div class="portlet-body form">
					                                <form class="form-horizontal" role="form">
					                                    <div class="form-body">
				                                          	<div class="form-group">
					                                            <label class="col-md-3 control-label">Long Description</label>
					                                            <div class="col-md-9">
					                                            	<textarea id="adPost-text-content-long-desc" class="wysihtml5 form-control" rows="5"></textarea>
					                                            </div>
				                                          	</div>
					                                    </div>
					                                </form>
					                            </div>
					                  		</div><!-- END text content -->
		        							
		        							<div class="form-actions">
				                                <div class="row">
				                                	<hr/>
				                                    <div class="col-md-offset-5 col-md-7">
				                                        <a class="btn green" onclick="createAdPost(); return false;">Save and Create</a>
				                                        <a class="btn default" onclick="cancelCreateAdPost(); return false;">Cancel</a>
				                                    </div>
				                                </div>
                            				</div>
		                            	</div>
		                               
			                           
			                        	<div class="tab-pane" id="tab_images">
			                           		<!--
			                            	<div class="alert alert-success margin-bottom-10">
			                            		<button type="button" class="close" data-dismiss="alert" aria-hidden="true"></button>
			                            		<i class="fa fa-warning fa-lg"></i> Image type and information need to be specified. 
			                            	</div> 
			                                -->
		                                    <div id="tab_images_uploader_container" class="text-align-reverse margin-bottom-10">
		                                        <a id="tab_images_uploader_pickfiles" href="javascript:;" class="btn btn-success">
		                                            <i class="fa fa-plus"></i> Select Files </a>
		                                        <a id="tab_images_uploader_uploadfiles" href="javascript:;" class="btn btn-primary">
		                                            <i class="fa fa-share"></i> Upload Files </a>
		                                    </div>
		                                    <div class="row">
		                                        <div id="tab_images_uploader_filelist" class="col-md-6 col-sm-12"> </div>
		                                    </div>
		                                    <table class="table table-bordered table-hover">
		                                        <thead>
		                                            <tr role="row" class="heading">
		                                                <th width="8%">Image</th>
														<th width="20%">Title</th>
														<th width="8%">Sort Number</th>
														<th width="15%">Post Time</th>
														<th width="10%">Primary Media</th>
														<th width="10%">Action</th>
		                                            </tr>
		                                        </thead>
		                                        <tbody>
		                                            <c:forEach items="${eventMediaList}" var="eventMedia">
														<tr>
														<td>
															<a href="${eventMedia.mediaURL}" class="fancybox-button" data-rel="fancybox-button">
																<img class="img-responsive" src="${eventMedia.mediaURL}" alt="">
															</a>
														</td>
														<td>
															<input type="text" class="form-control" name="mediaLabel" value="${eventMedia.mediaLabel}" onblur="changeMediaLabel(this,${eventMedia.mediaId},'${eventMedia.eventUUID}');">
														</td>
														<td>
															<input type="text" class="form-control" name="sortNumber" value="${eventMedia.sortNumber}" onblur="changeSortNumber(this,${eventMedia.mediaId},'${eventMedia.eventUUID}');">
														</td>
														
														<td>
															<input type="text" class="form-control" name="postTimestamp" value="${eventMedia.postTimestamp}" disabled="disabled">
														</td>
														<td>
															<input type="text" class="form-control" name="primaryMedia" value="${eventMedia.primaryMedia}" disabled="disabled">
														</td>
														<td>
															<a href="javascript:;" onclick="setCoverMedia(${eventMedia.mediaId},'${eventMedia.eventUUID}');return false;" class="btn default btn-sm">
																<i class="fa fa-edit"></i> Set Cover </a>
															<a href="javascript:test();" class="btn default btn-sm">
																<i class="fa fa-times"></i> Remove </a>
														</td>
														</tr>
													</c:forEach>
		                                   		</tbody>
				                            </table>
										</div>
			                 
										<div class="tab-pane" id="tab_media">
			                 				<div class="portlet light">
					                  			<div class="portlet-title">
						                        	<div class="caption font-red-sunglo">
						                                	<i class="icon-settings"></i>
						                                	<span class="caption-subject sbold uppercase">Video Content</span>
						                              	</div>
						                        	<div class="actions">
						                                      <div class="btn-group">
						                                          <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
						                                              <i class="fa fa-angle-down"></i>
						                                          </a>
						                                          <ul class="dropdown-menu pull-right">
						                                              <li>
						                                                  <a href="javascript:;">
						                                                      <i class="fa fa-pencil"></i> Edit </a>
						                                              </li>
						                                              <li>
						                                                  <a href="javascript:;">
						                                                      <i class="fa fa-trash-o"></i> Delete </a>
						                                              </li>
						                                              <li>
						                                                  <a href="javascript:;">
						                                                      <i class="fa fa-ban"></i> Ban </a>
						                                              </li>
						                                              <li class="divider"> </li>
						                                              <li>
						                                                  <a href="javascript:;"> Make admin </a>
						                                              </li>
						                                          </ul>
						                                      </div>
						                                  </div>
						              			</div>
					                  			<div class="portlet-body form">
				                                	<div class="form-horizontal" role="form">
				                                    	<div class="form-body">
				                                    		<div class="form-group">
					                                        	<label class="col-md-3 control-label">URL</label>
					                                        	<div class="col-md-9">
					                                        		<input type="text" id="adPost-video-content-url" class="form-control" placeholder="Enter text">
					                                        	</div>
					                                        </div>
				                                    		
					                                      	<div class="form-group">
				                                          		<label class="col-md-3 control-label">Title</label>
				                                            	<div class="col-md-9">
				                                            		<input type="text" id="adPost-video-content-title" class="form-control" placeholder="Enter text">
				                                            	</div>
				                                          	</div>
					                                        
					                                      	<div class="form-group">
					                                        	<label class="col-md-3 control-label">Short Description</label>
					                                        	<div class="col-md-9">
					                                        		<textarea id="adPost-video-content-short-desc" class="form-control" rows="2"></textarea>
					                                        	</div>
					                                       	</div>
				                                      	</div>
				                                	</div>
					                     		</div>
					                  		</div>
					                  		
			                 				<div class="portlet light">
					                  			<div class="portlet-title">
					                            	<div class="caption font-red-sunglo">
					                                      <i class="icon-settings"></i>
					                                      <span class="caption-subject sbold uppercase">Audio Content</span>
					                                  </div>
					                            	<div class="actions">
					                                      <div class="btn-group">
					                                          <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
					                                              <i class="fa fa-angle-down"></i>
					                                          </a>
					                                          <ul class="dropdown-menu pull-right">
					                                              <li>
					                                                  <a href="javascript:;">
					                                                      <i class="fa fa-pencil"></i> Edit </a>
					                                              </li>
					                                              <li>
					                                                  <a href="javascript:;">
					                                                      <i class="fa fa-trash-o"></i> Delete </a>
					                                              </li>
					                                              <li>
					                                                  <a href="javascript:;">
					                                                      <i class="fa fa-ban"></i> Ban </a>
					                                              </li>
					                                              <li class="divider"> </li>
					                                              <li>
					                                                  <a href="javascript:;"> Make admin </a>
					                                              </li>
					                                          </ul>
					                                      </div>
					                                  </div>
					                            </div>
					                  			<div class="portlet-body form">
					                            	<div class="form-horizontal" role="form">
					                                	<div class="form-body">
					                                		<div class="form-group">
					                                        	<label class="col-md-3 control-label">URL</label>
					                                        	<div class="col-md-9">
					                                        		<input type="text" id="adPost-audio-content-url" class="form-control" placeholder="Enter text">
					                                        	</div>
					                                        </div>
					                                     
					                                    	<div class="form-group">
					                                        	<label class="col-md-3 control-label">Title</label>
					                                        	<div class="col-md-9">
					                                        		<input type="text" id="adPost-audio-content-title" class="form-control" placeholder="Enter text">
					                                        	</div>
					                                        </div>
					                                        
					                                      	<div class="form-group">
					                                        	<label class="col-md-3 control-label">Short Description</label>
					                                        	<div class="col-md-9">
					                                        		<textarea id="adPost-audio-content-short-desc" class="form-control" rows="2"></textarea>
					                                        	</div>
					                                        </div>
					                           			</div>
					                                </div>
					                            </div>
					                  		</div>
			                 			</div>
			                       			
				                       		
			                       		<!--         
				                           <div class="tab-pane" id="tab_meta">
				                               <div class="form-body">
				                                   <div class="form-group">
				                                       <label class="col-md-2 control-label">Meta Title:</label>
				                                       <div class="col-md-10">
				                                           <input type="text" class="form-control maxlength-handler" name="product[meta_title]" maxlength="100" placeholder="">
				                                           <span class="help-block"> max 100 chars </span>
				                                       </div>
				                                   </div>
				                                   <div class="form-group">
				                                       <label class="col-md-2 control-label">Meta Keywords:</label>
				                                       <div class="col-md-10">
				                                           <textarea class="form-control maxlength-handler" rows="8" name="product[meta_keywords]" maxlength="1000"></textarea>
				                                           <span class="help-block"> max 1000 chars </span>
				                                       </div>
				                                   </div>
				                                   <div class="form-group">
				                                       <label class="col-md-2 control-label">Meta Description:</label>
				                                       <div class="col-md-10">
				                                           <textarea class="form-control maxlength-handler" rows="8" name="product[meta_description]" maxlength="255"></textarea>
				                                           <span class="help-block"> max 255 chars </span>
				                                       </div>
				                                   </div>
				                               </div>
				                           </div>
			                            -->
			                       
			                       </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- END CONTENT BODY -->
        </div>
        <!-- END CONTENT -->
        </div>
    <!-- END CONTAINER -->
    
    <!-- BEGIN FOOTER -->
    <jsp:include page="${inc_dir}/page-footer.jsp"></jsp:include>
    <!-- END FOOTER -->
            
<!--[if lt IE 9]>
<script src="${webapp_name}/assets/global/plugins/respond.min.js"></script>
<script src="${webapp_name}/assets/global/plugins/excanvas.min.js"></script> 
<script src="${webapp_name}/assets/global/plugins/ie8.fix.min.js"></script> 
<![endif]-->
<!-- BEGIN CORE PLUGINS -->
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/js.cookie.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery.blockui.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-wysihtml5/wysihtml5-0.3.0.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-markdown/lib/markdown.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-summernote/summernote.min.js"></script>

<script type="text/javascript" src="${webapp_name}/assets/global/scripts/datatable.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/datatables/datatables.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.pack.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/plupload/js/plupload.full.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-fileinput/bootstrap-fileinput.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/handlebars.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/typeahead.bundle.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<!-- <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script> -->
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/app.js"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts/components-bootstrap-tagsinput.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts/components-editors.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts/ui-blockui.min.js"></script>

<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js"></script>
<!-- END THEME LAYOUT SCRIPTS -->

<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/global-validate.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/adpost.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/adpost-create.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/temp/adpost-create-test.js"></script>
<script>
jQuery(document).ready(function() {
	EventNewsEdit.init('1011');		//TODO to change
})
</script>




<script type="text/javascript">
/* by Athens on 2018-02-21 */

var mock_param_data = {
		'test_name' : 	'tname',
		'test_value':	'tvalue'
};

function createAdPost(){
	$.ajax({
		cache: 			false,
//	    contentType: 	false,
//	    processData: 	false,
		url		:		'/acp/advertiser/adpost/adposts',
	    data	: 		{adPostJSONString : JSON.stringify(mock_param_data) }, 
//		dataType: 		'json',
	    type	: 		'post',
	    error: function (xhr, status) {
        	alert(status);
        },
	    success: function(data) {
	    	// Do something after Ajax completes
	    	alert("INFO: createAdPost() ajax ok.");
	    }
	  });
}
</script>




<script>

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
</script>
</body>

</html>