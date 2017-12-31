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
<title>Adogo | Ad Post - Edit</title>
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
                    <h1 class="page-title"> Advertiser | Ad Post <small>edit an Ad Post</small></h1>
                    <div class="page-bar">
                        <ul class="page-breadcrumb">
							<li><i class="fa fa-home"></i><a href="#">Home</a><i class="fa fa-angle-right"></i></li>
							<li><a href="${webapp_name}/advertiser/">Advertiser</a><i class="fa fa-angle-right"></i></li>
							<li><a href="${webapp_name}/advertiser/adpost/">Ad Post</a><i class="fa fa-angle-right"></i></li>
							<li><a href="#">Edit an Ad Post</a></li>
						</ul>
                        <div class="page-toolbar">
                            <div class="btn-group pull-right">
                                <button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true"> Actions
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
                            <!-- Begin: life time stats -->
                            <!-- End: life time stats -->
                        </div>
                    </div>
                    
                    <div class="row">
                    	<div class="col-md-6">
                    		
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
                                    <form class="form-horizontal" role="form">
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
                                    </form>
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
                                    <form class="form-horizontal" role="form">
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
                                        	
                                        	<div><br/></div>
                                        	
                                        	<div class="row">
	                                        	<div class="col-md-3">
	                                        		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhmsvleK8PbprHaMLNmWXoKofr2C67oZmUGCsWCN9U-T99fqdK" width="100%"/>
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
                                        	
                                        	<div><br/></div>
                                        	
                                        	<div class="row">
	                                        	<div class="col-md-3">
	                                        		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvx3KD_H2-JO2KR-7EaUKJQ0ahVF9iyBCTg3soIRoh-AAsBmlK"  width="100%"/>
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
                                        	
                                        	<div><br/></div>
                                        	
                                        	<div class="row">
	                                        	<div class="col-md-3">
	                                        		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQaAS7SLrVIVvWYft53UQDhK0h1uf0tBsCWQl7AOzl_YmyTaCgm"  width="100%"/>
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
                                        	
                                        	<div><br/></div>
                                        	
                                        	<div class="row">
	                                        	<div class="col-md-3">
	                                        		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAN1rudxgC_XPsZ7YMBqFykZPxasit8eG2uQvcaYZkJAdM9jF-"  width="100%"/>
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
                                        	
                                        	<div><br/></div>
                                        	
                                        	<div class="row">
	                                        	<div class="col-md-3">
	                                        		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3AVF1BKRUvN28gJpDizcMZ9868BbpdVJJQGIRL0cnS19vM4nVqg"  width="100%"/>
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
                                        	
                                        	<div><br/></div>
                                        	
                                        	<div class="row">
	                                        	<div class="col-md-3">
	                                        		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3AVF1BKRUvN28gJpDizcMZ9868BbpdVJJQGIRL0cnS19vM4nVqg"  width="100%"/>
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
                                        	
                                        	<div><br/></div>
                                        	
                                        	<div class="row">
	                                        	<div class="col-md-3">
	                                        		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3AVF1BKRUvN28gJpDizcMZ9868BbpdVJJQGIRL0cnS19vM4nVqg"  width="100%"/>
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
                                        	
                                        	<div><br/></div>
                                        	
                                        	<div class="row">
	                                        	<div class="col-md-3">
	                                        		<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3AVF1BKRUvN28gJpDizcMZ9868BbpdVJJQGIRL0cnS19vM4nVqg"  width="100%"/>
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
                                    </form>
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
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/js.cookie.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery.blockui.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/datatable.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/datatables/datatables.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.pack.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<!-- <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script> -->
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/app.js"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/global-validate.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/event-news.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/event-news-list.js"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js"></script>

<!-- 
<script type="text/javascript" src="${webapp_name}/assets/layouts/global/scripts/quick-sidebar.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/global/scripts/quick-nav.min.js"></script>
 -->
<!-- END THEME LAYOUT SCRIPTS -->
<script>
EventNewsList.init();
</script>
</body>

</html>