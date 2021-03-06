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
<title>Adogo | Booth - Edit</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8"/>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<meta name="description" content=""/>
<meta name="author" content="Informatique Athensoft"/>

<link rel="shortcut icon" href="${webapp_name}/assets/athensoft/ico/favicon.ico"/>
     
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
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/themes/blue.min.css"id="style_color" />
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/custom.min.css"/>
<!-- END THEME LAYOUT STYLES -->
</head>

<body class="page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid">
        <!-- BEGIN HEADER -->
        <div class="page-header navbar navbar-fixed-top">
        <!-- BEGIN HEADER INNER -->
        	<div class="page-header-inner ">
                <!-- BEGIN LOGO -->
                <jsp:include page="${inc_dir}/page-logo.jsp"></jsp:include>
                <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                <a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"> </a>
                <!-- BEGIN PAGE ACTIONS -->
                <jsp:include page="${inc_dir}/page-action.jsp"></jsp:include>
                <!-- BEGIN PAGE TOP -->
                <jsp:include page="${inc_dir}/page-top.jsp"></jsp:include>
            </div>
        <!-- END HEADER INNER -->
        </div>
        <!-- END HEADER -->
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
                    <h1 class="page-title"> Advertiser | Booth <small>edit my booth</small></h1>
                    <div class="page-bar">
                        <ul class="page-breadcrumb">
							<li><i class="fa fa-home"></i><a href="#">Home</a><i class="fa fa-angle-right"></i></li>
							<li><a href="${webapp_name}/advertiser/">Advertiser</a><i class="fa fa-angle-right"></i></li>
							<li><a href="${webapp_name}/advertiser/booth/">Booth</a></li>
							<li><span>Edit a Booth</span></li>
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
                            <div class="portlet light">
                                <div class="portlet-title">
                                    <div class="caption">
                                        Edit a booth <span class="caption-helper">write contents for your booth to present</span></div>
                                    <div class="actions">
                                        <a href="#" class="btn btn-circle btn-info">
                                            <i class="fa fa-plus"></i><span class="hidden-xs"> Save booth </span>
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
                        </div>
                    </div>
                    
                    <div class="row">
                    	<div class="col-md-6">
                    		<!-- Section of Basic info -->
                    		<div class="portlet light">
                    			<div class="portlet-title">
                                    <div class="caption font-red-sunglo">
                                        <i class="icon-settings"></i>
                                        <span class="caption-subject sbold uppercase">Basic Information</span>
                                    </div>
                                </div>
                    			<div class="portlet-body form">
                                    <form class="form-horizontal" role="form">
                                        <div class="form-body">
                                        	<div class="form-group">
                                                <label class="col-md-2 control-label">Business no.</label>
                                                <div class="col-md-10">
                                                    <input type="text" id="business_id" class="form-control" placeholder="Business no." value="42001" readonly="readonly"/>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-2 control-label">Booth ID</label>
                                                <div class="col-md-10">
                                                    <input type="text" id="business_id" class="form-control" placeholder="Business no." value="${booth.boothId}" readonly="readonly"/>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-2 control-label">Language</label>
                                                <div class="col-md-10">
                                                    <select id="lang_no" class="form-control" disabled="disabled">
                                                    	<option value="1033">English</option>
                                                    	<option value="3084">French</option>
                                                    	<option value="2052">Chinese (Simplified)</option>
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                    		</div>
                    		<!-- End of Section -->
                    		
                    		<!-- Section of Business Contact -->
                    		<div class="portlet light">
                    			<div class="portlet-title">
                                    <div class="caption font-red-sunglo">
                                        <i class="icon-settings"></i>
                                        <span class="caption-subject sbold uppercase">Contact Information</span>
                                    </div>
                                    <div class="actions">
                                    	<button class="btn btn-success" onclick="saveContactInfo(); return false;">
                                                <i class="fa fa-check"></i> Quick Save</button>
                                        <div class="btn-group">
                                            <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
                                                <i class="fa fa-angle-down"></i>
                                            </a>
                                            <ul class="dropdown-menu pull-right">
                                                <li>
                                                    <a href="javascript:;" onclick="saveContactInfo(); return false;" >
                                                        <i class="fa fa-pencil"></i> Save this section </a>
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
                                                <label class="col-md-2 control-label">Phone</label>
                                                <div class="col-md-10">
                                                    <input type="text" id="contact_phone_no" class="form-control" placeholder="Phone no."/>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-2 control-label">Fax</label>
                                                <div class="col-md-10">
                                                    <input type="text" id="contact_fax_no" class="form-control" placeholder="Fax no."/>
                                                </div>
                                            </div>
                                        	<div class="form-group">
                                                <label class="col-md-2 control-label">Email</label>
                                                <div class="col-md-5">
                                                    <input type="text" id="contact_email_1" class="form-control" placeholder="Email #1 - Primary"/>
                                                </div>
                                                <div class="col-md-5">
                                                    <input type="text" id="contact_email_2" class="form-control" placeholder="Email #2 - Optional"/>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-2 control-label"></label>
                                                <div class="col-md-5">
                                                    <input type="text" id="contact_email_3" class="form-control" placeholder="Email #3 - Optional"/>
                                                </div>
                                                <div class="col-md-5">
                                                    <input type="text" id="contact_email_4" class="form-control" placeholder="Email #4 - Optional"/>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-2 control-label">Website</label>
                                                <div class="col-md-5">
                                                    <input type="text" id="contact_website_1" class="form-control" placeholder="Primary website"/>
                                                </div>
                                                <div class="col-md-5">
                                                    <input type="text" id="contact_website_2" class="form-control" placeholder="Secondary Website"/>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                    		</div>
							<!-- End of Section -->
                    		
                    		<!-- Section of Business Location -->
                    		<div class="portlet light">
                    			<div class="portlet-title">
                                    <div class="caption font-red-sunglo">
                                        <i class="icon-settings"></i>
                                        <span class="caption-subject sbold uppercase">Business Location</span>
                                    </div>
                                    <div class="actions">
                                    	<button class="btn btn-success" onclick="saveBusinessLocation(); return false;">
                                                <i class="fa fa-check"></i> Quick Save</button>
                                        <div class="btn-group">
                                            <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
                                                <i class="fa fa-angle-down"></i>
                                            </a>
                                            <ul class="dropdown-menu pull-right">
                                                <li>
                                                    <a href="javascript:;" onclick="saveBusinessLocation(); return false;" >
                                                        <i class="fa fa-pencil"></i> Save this section </a>
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
                                                <label class="col-md-2 control-label">Business no.</label>
                                                <div class="col-md-10">
                                                    <input type="text" id="business_id" class="form-control" placeholder="start time" value="42001" readonly="readonly"/>
                                                    <span class="help-block"> Hard code for test only</span>
                                                </div>
                                            </div>
                                        	
                                            <div class="form-group">
                                                <label class="col-md-2 control-label">Address Line1</label>
                                                <div class="col-md-2">
                                                    <input id="street_no" type="text" class="form-control" placeholder="Street no.">
                                                </div>
                                                <div class="col-md-8">
                                                    <input id="day1_end_time" type="text" class="form-control" placeholder="Street name">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-2 control-label"></label>
                                                <div class="col-md-2">
                                                    <select id="unit_type" class="form-control">
                                                    	<option value="Port">Port</option>
                                                    	<option value="Suite">Suite</option>
                                                    	<option value="Apt">Apt</option>
                                                    	<option value="na">N/A</option>
                                                    </select>
                                                </div>
                                                <div class="col-md-8">
                                                    <input id="unit_type" type="text" class="form-control" placeholder="Port no./Unit no.">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-2 control-label">Address Line2</label>
                                                <div class="col-md-10">
                                                    <input id="address_line2" type="text" class="form-control" placeholder="Additional content of address">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-2 control-label"></label>
                                                <div class="col-md-5">
                                                    <input id="loction_city" type="text" class="form-control" placeholder="City">
                                                </div>
                                                <div class="col-md-5">
                                                    <input id="loction_province" type="text" class="form-control" placeholder="Province/State">
                                                </div>
                                            </div>
                                            
                                             <div class="form-group">
                                                <label class="col-md-2 control-label"></label>
                                                <div class="col-md-5">
                                                    <input id="postal_code" type="text" class="form-control" placeholder="Postal code">
                                                </div>
                                                <div class="col-md-5">
                                                    <input id="loction_country" type="text" class="form-control" placeholder="Country">
                                                </div>
                                            </div>
                                            
                                            
                                            <div class="form-group">
                                                <label class="col-md-2 control-label">Comment</label>
                                                <div class="col-md-10">
                                                    <textarea id="location_comment" class="form-control" rows="2"></textarea>
                                                </div>
                                            </div>
                                            
                                        	
                                        </div>
                                    </form>
                                </div>
                    		</div>
							<!-- End of Section -->
						</div>
                    	
                    	
                    	<!-- Section of Business Hours -->
                    	<div class="col-md-6">
                    		<div class="portlet light">
                    			<div class="portlet-title">
                                    <div class="caption font-red-sunglo">
                                        <i class="icon-settings"></i>
                                        <span class="caption-subject sbold uppercase">Opening hours</span>
                                    </div>
                                    <div class="actions">
                                    	<button class="btn btn-success" onclick="saveBusinessHours(); return false;">
                                                <i class="fa fa-check"></i> Quick Save</button>
                                        <div class="btn-group">
                                            <a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown"> Actions
                                                <i class="fa fa-angle-down"></i>
                                            </a>
                                            <ul class="dropdown-menu pull-right">
                                                <li>
                                                    <a href="javascript:;" onclick="saveBusinessHours(); return false;" >
                                                        <i class="fa fa-pencil"></i> Save this section </a>
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
                                        <div class="form-body" id="blockui_buz_hrs_id">
                                        	
                                        	<div class="form-group">
                                                <label class="col-md-3 control-label">Business no.</label>
                                                <div class="col-md-9">
                                                    <input type="text" id="business_id" class="form-control" placeholder="start time" value="42001" readonly="readonly"/>
                                                    <span class="help-block"> Hard code for test only</span>
                                                </div>
                                            </div>
                                        	
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Monday</label>
                                                <div class="col-md-4">
                                                    <input id="day1_start_time" type="text" class="form-control" placeholder="start time">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day1_end_time" type="text" class="form-control" placeholder="end time">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Tuesday</label>
                                                <div class="col-md-4">
                                                    <input id="day2_start_time" type="text" class="form-control" placeholder="start time">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day2_end_time" type="text" class="form-control" placeholder="end time">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Wednesday</label>
                                                <div class="col-md-4">
                                                    <input id="day3_start_time" type="text" class="form-control" placeholder="start time">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day3_end_time" type="text" class="form-control" placeholder="end time">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Thursday</label>
                                                <div class="col-md-4">
                                                    <input id="day4_start_time" type="text" class="form-control" placeholder="start time">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day4_end_time" type="text" class="form-control" placeholder="end time">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Friday</label>
                                                <div class="col-md-4">
                                                    <input id="day5_start_time" type="text" class="form-control" placeholder="start time">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day5_end_time" type="text" class="form-control" placeholder="end time">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Saturday</label>
                                                <div class="col-md-4">
                                                    <input id="day6_start_time" type="text" class="form-control" placeholder="start time">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day6_end_time" type="text" class="form-control" placeholder="end time">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Sunday</label>
                                                <div class="col-md-4">
                                                    <input id="day7_start_time" type="text" class="form-control" placeholder="start time">
                                                </div>
                                                <div class="col-md-1">
                                                    &nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>
                                                <div class="col-md-4">
                                                    <input id="day7_end_time" type="text" class="form-control" placeholder="end time">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Announcement</label>
                                                <div class="col-md-9">
                                                    <textarea id="comment" class="form-control" rows="2"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                    		</div>
                    	</div>
                    	<!-- End of Section -->
                    	
                    	<!-- Section of Gallery -->
                    	<!-- 
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
                                        </div>
                                    </form>
                                </div>
                    		</div>
                    	</div>
                    	 -->
                    	<!-- End of Section -->	
                    </div>
                    
                  
                </div>
                <!-- END CONTENT BODY -->
            </div>
            <!-- END CONTENT -->
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
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/global-validate.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts/ui-blockui.min.js"></script>
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
	$(document).ready(function(){
		var langValue = ${booth.langNo};
		$("#lang_no").val(langValue);
	});
</script>
</body>
</html>