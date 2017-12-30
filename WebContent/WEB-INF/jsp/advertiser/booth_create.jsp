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
<meta charset="utf-8"/>
<title>Adogo | Booth - Create</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8"/>

<meta content="width=device-width, initial-scale=1" name="viewport"/>
<meta content="" name="description" />
<meta content="" name="author" />

<meta http-equiv="pragma" content="no-cache"/>
<meta http-equiv="cache-control" content="no-cache"/>
<meta http-equiv="expires" content="0"/>
      
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" />
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/font-awesome/css/font-awesome.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/datatables/datatables.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.css"/>
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
        <!-- BEGIN HEADER -->
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
        <!-- END HEADER -->
        <!-- BEGIN HEADER & CONTENT DIVIDER -->
        <div class="clearfix"> </div>
        <!-- END HEADER & CONTENT DIVIDER -->
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
                    <!-- BEGIN THEME PANEL -->
                    <!-- END THEME PANEL -->
                    <h1 class="page-title"> Advertiser | Booth <small>create a booth</small></h1>
                    <div class="page-bar">
                        <ul class="page-breadcrumb">
                        	<li><i class="icon-home"></i><a href="${webapp_name}/">Home</a><i class="fa fa-angle-right"></i></li>
                            <li><a href="${webapp_name}/advertiser/">Advertiser</a><i class="fa fa-angle-right"></i></li>
                            <li><a href="${webapp_name}/advertiser/booth/">Booth</a><i class="fa fa-angle-right"></i></li>
                            <li><span>Create a Booth</span></li>
						</ul>
                 <div class="page-toolbar">
                 <div class="btn-group pull-right">
                     <button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true"> Quick Links
                         <i class="fa fa-angle-down"></i>
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
                        <div class="col-md-12">
                            <div class="portlet light portlet-fit ">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class=" icon-layers font-green"></i>
                                        <span class="caption-subject font-green bold uppercase">Quick steps</span>
                                    </div>
                                </div>
                                <div class="portlet-body">
                                    <div class="mt-element-step">
                                        
                                        <div class="row step-thin">
                                            <div class="mt-step-desc">
                                                <div class="font-dark bold uppercase">Publish a booth</div>
                                                <div class="caption-desc font-grey-cascade"></div>
                                                <br/>
                                            </div>
                                            <div class="col-md-4 bg-grey mt-step-col">
                                                <div class="mt-step-number bg-white font-grey">1</div>
                                                <div class="mt-step-title uppercase font-grey-cascade">Choose Business</div>
                                                <div class="mt-step-content font-grey-cascade">Choose a business for booths</div>
                                            </div>
                                            <div class="col-md-4 bg-grey mt-step-col done">
                                                <div class="mt-step-number bg-white font-grey">2</div>
                                                <div class="mt-step-title uppercase font-grey-cascade">Create Booth</div>
                                                <div class="mt-step-content font-grey-cascade">Input booth information</div>
                                            </div>
                                            <div class="col-md-4 bg-grey mt-step-col">
                                                <div class="mt-step-number bg-white font-grey">3</div>
                                                <div class="mt-step-title uppercase font-grey-cascade">Publish Booth</div>
                                                <div class="mt-step-content font-grey-cascade">Activate and publish</div>
                                            </div>
                                        </div>
                                        
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    
                    
                    <div class="row">
                        <div class="col-md-12">
                            <!-- Begin: life time stats -->
                            <div class="portlet light">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class="fa fa-shopping-cart"></i>Create a booth <span class="caption-helper">write contents for your booth to present</span></div>
                                    <div class="actions">
                                        <a href="#" class="btn btn-circle btn-info">
                                            <i class="fa fa-plus"></i><span class="hidden-xs"> Create </span>
                                        </a>
                                        <div class="btn-group">
                                            <a class="btn btn-circle btn-default dropdown-toggle" href="javascript:;" data-toggle="dropdown">
                                                <i class="fa fa-share"></i>
                                                <span class="hidden-xs"> Tools </span>
                                                <i class="fa fa-angle-down"></i>
                                            </a>
                                            <ul class="dropdown-menu pull-right">
                                                <li><a href="javascript:;"> Export to Excel </a></li>
                                                <li><a href="javascript:;"> Export to CSV </a></li>
                                                <li><a href="javascript:;"> Export to XML </a></li>
                                                <li class="divider"></li>
                                                <li><a href="javascript:;"> Print Invoices </a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="portlet-body">
                                    <div class="table-container">
                                        <div class="table-actions-wrapper">
                                            <span> </span>
                                            <select class="table-group-action-input form-control input-inline input-small input-sm" name="groupOption">
                                                <option value="">Select...</option>
												<option value="1">Publish</option>
												<option value="2">Wait to post</option>
												<option value="3">Delete</option>
												<option value="4">Out of date</option>
												<option value="5">Suspend</option>
                                            </select>
                                            <button class="btn btn-sm yellow table-group-action-submit"><i class="fa fa-check"></i> Submit</button>
                                        </div>
                                        
                                    </div>
                                </div>
                            </div>
                            <!-- End: life time stats -->
                        </div>
                    </div>
                    
                    <div class="row">
                    	<div class="col-md-6">
                    		
                    		
                    		<div class="portlet light">
                    			<div class="portlet-title">
                                    <div class="caption font-red-sunglo">
                                        <i class="icon-settings"></i>
                                        <span class="caption-subject sbold uppercase">Booth Basic Info.</span>
                                    </div>
                                    <div class="actions">
                                    	<button class="btn btn-success" onclick="createBooth(); return false;">
                                                <i class="fa fa-check"></i> Quick Save</button>
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
                                                <label class="col-md-3 control-label">User Id</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text" disabled="disabled" id="userId" value="12345678">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Advertiser Id</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text"  disabled="disabled" id="advertiserId" value="1712010001">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Business Id</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text"  disabled="disabled" id="bizId" value="${bizProfile.bizId}">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Business Name</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text"  disabled="disabled" id="bizName" value="${bizProfile.bizName}">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Language</label>
                                                <div class="col-md-9">
                                                    <select id="langNo" class="form-control" onchange="chooseLanguage();return false;">
                                                    	<option value="0" selected="selected">--- Choose a language for the booth ---</option>
                                                    	<option value="1033">English</option>
                                                    	<option value="3084">French</option>
                                                    	<option value="2052">Chinese (Simplified)</option>
                                                    </select>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Booth Name</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text" id="langBoothName">
                                                    <span class="help-inline"> Shown on screen</span><span class="help-inline"></span>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Category</label>
                                                <div class="col-md-7">
                                                    <input type="text" class="form-control" placeholder="Enter text" id="categoryNo">
                                                </div>
                                                <div class="col-md-2">
                                                    <button class="btn btn-success" onclick="showCategoryList();return false;" id="boothCategoryChooser">&nbsp;&nbsp;&nbsp; Choose &nbsp;&nbsp;&nbsp;</button>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group" id="boothCategoryDiv">
                                                <label class="col-md-3 control-label"></label>
                                                <div class="col-md-9" id="boothCategoryList"></div>
                                            </div>
                                                                                        
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Business Description</label>
                                                <div class="col-md-9">
                                                    <textarea class="form-control" rows="2" id="langBizDesc"></textarea>
                                                    <span class="help-inline"> Shown on screen</span><span class="help-inline"></span>
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
                                        <span class="caption-subject sbold uppercase">Cover Image</span>
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
                                                <label class="col-md-3 control-label">Image Title</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">URL</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text">
                                                </div>
                                            </div> 
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Short Description</label>
                                                <div class="col-md-9">
                                                    <textarea class="form-control" rows="2"></textarea>
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
                                        <span class="caption-subject sbold uppercase">Text Content</span>
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
                                    <form class="form-horizontal" role="form">
                                        <div class="form-body">
                                        
                                        	<div class="form-group">
                                                <label class="col-md-3 control-label">Ad Title</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Short Description</label>
                                                <div class="col-md-9">
                                                    <textarea class="form-control" rows="3"></textarea>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Long Description</label>
                                                <div class="col-md-9">
                                                    <textarea class="form-control" rows="5"></textarea>
                                                </div>
                                            </div>
                                        	
                                        </div>
                                    </form>
                                </div>
                    		</div>
                    		
                    		
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
                                    <form class="form-horizontal" role="form">
                                        <div class="form-body">
                                        
                                        	<div class="form-group">
                                                <label class="col-md-3 control-label">Title</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">URL</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text">
                                                </div>
                                            </div>
                                        	
                                        	<div class="form-group">
                                                <label class="col-md-3 control-label">Short Description</label>
                                                <div class="col-md-9">
                                                    <textarea class="form-control" rows="2"></textarea>
                                                </div>
                                            </div>
                                        	
                                        </div>
                                    </form>
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
                                    <form class="form-horizontal" role="form">
                                        <div class="form-body">
                                        
                                        	<div class="form-group">
                                                <label class="col-md-3 control-label">Title</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">URL</label>
                                                <div class="col-md-9">
                                                    <input type="text" class="form-control" placeholder="Enter text">
                                                </div>
                                            </div>
                                        	
                                        	<div class="form-group">
                                                <label class="col-md-3 control-label">Short Description</label>
                                                <div class="col-md-9">
                                                    <textarea class="form-control" rows="2"></textarea>
                                                </div>
                                            </div>
                                        	
                                        </div>
                                    </form>
                                </div>
                    		</div>
                    		
                    	</div>
                    	
                    	
                    	  
                    	<div class="col-md-6">
                    		<div class="portlet light">
                    			<div class="portlet-title">
                                    <div class="caption font-red-sunglo">
                                        <i class="icon-settings"></i>
                                        <span class="caption-subject sbold uppercase">Gallery</span>
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
                                        
                                        	<div class="row">
	                                        	<div class="col-md-3">
	                                        		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3AVF1BKRUvN28gJpDizcMZ9868BbpdVJJQGIRL0cnS19vM4nVqg" width="100%"/>
	                                        	</div>
	                                        	<div class="col-md-9">
		                                        	<div class="form-group">
		                                                <label class="col-md-3 control-label">Title</label>
		                                                <div class="col-md-9">
		                                                    <input type="text" class="form-control" placeholder="Enter text">
		                                                </div>
		                                            </div>
		                                            
		                                            <div class="form-group">
		                                                <label class="col-md-3 control-label">URL</label>
		                                                <div class="col-md-9">
		                                                    <input type="text" class="form-control" placeholder="Enter text">
		                                                </div>
		                                            </div>
		                                        	
		                                        	<div class="form-group">
		                                                <label class="col-md-3 control-label">Desc</label>
		                                                <div class="col-md-9">
		                                                    <textarea class="form-control" rows="2"></textarea>
		                                                </div>
		                                            </div>
	                                        	</div>
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
            <!-- BEGIN ${webapp_name} SIDEBAR -->
            <!-- Removed to quick_sidebar.html -->
            <!-- END QUICK SIDEBAR -->
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
<script src="${webapp_name}/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="${webapp_name}/assets/global/scripts/datatable.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/datatables/datatables.min.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<!-- <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script> -->
<script src="${webapp_name}/assets/global/scripts/app.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/booth.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/booth-create.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/global-validate.js"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js" type="text/javascript"></script>

<!-- 
<script type="text/javascript" src="${webapp_name}/assets/layouts/global/scripts/quick-sidebar.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/global/scripts/quick-nav.min.js"></script>
 -->
<!-- END THEME LAYOUT SCRIPTS -->
<script>
//EventNewsList.init();

function chooseLanguage(){
	var langName=$("#langNo").find("option:selected").text();
	$("#langBoothName").text("in "+langName);
	$("#langBizDesc").text("in "+langName);
	//alert(checkText);
}


//TODO
//may be a problem, not perfect yet
function showCategoryList(){
	//alert("ok");
	//$("#boothCategoryList").show();
	//$("#boothCategoryChooser").html("&nbsp;&nbsp;&nbsp;Collpase&nbsp;&nbsp;&nbsp;");
	
	$("#boothCategoryDiv").toggle(
			function() {
		    	$("#boothCategoryChooser").text("Collpase");
			},
			function() {
			    $("#boothCategoryChooser").html("&nbsp;&nbsp;&nbsp;&nbsp;Choose&nbsp;&nbsp;&nbsp;&nbsp;");
			}
		);
}

$(document).ready(function(){
	$("#boothCategoryDiv").hide();
	
	//init
	$("#boothCategoryList").html(
			"1,1,1,1<br/>1,1,1,1<br/>"
	);
			
});

</script>
</body>

</html>