<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- global variables settings -->
<c:set var="webapp_name" value="/acp"/>

<!-- page variables  -->
<c:set var="inc_dir" value="../inc"/>
<!-- ENDS page variables -->

<!DOCTYPE html>
<!-- 
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.3.7
Version: 4.7.5
Author: KeenThemes
Website: http://www.keenthemes.com/
Contact: support@keenthemes.com
Follow: www.twitter.com/keenthemes
Dribbble: www.dribbble.com/keenthemes
Like: www.facebook.com/keenthemes
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
Renew Support: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
License: You must have a valid license purchased only from themeforest(the above link) in order to legally use the theme for your project.
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->
    <head>
        <meta charset="utf-8" />
        <title>Adogo | Business Profile - Editing</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta http-equiv="Content-type" content="text/html; charset=utf-8"/>
        
        <meta content="width=device-width, initial-scale=1" name="viewport"/>
        <meta content="" name="description" />
        <meta content="" name="author" />
        
        <meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
        
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
        <link href="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.css" rel="stylesheet" type="text/css" />
        <link href="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput-typeahead.css" rel="stylesheet" type="text/css" />
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN THEME GLOBAL STYLES -->
        <link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/css/components.min.css" id="style_components"/>
        <link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/css/plugins.min.css"/>
        <!-- END THEME GLOBAL STYLES -->
        <!-- BEGIN THEME LAYOUT STYLES -->
        <link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/layout.min.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/themes/blue.min.css"id="style_color" />
        <link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/custom.min.css"/>
        <!-- END THEME LAYOUT STYLES -->
        <link rel="shortcut icon" href="${webapp_name}/assets/global/plugins/datatables/media/images/favicon.ico"/>
    </head>
    <!-- END HEAD -->

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
                    <jsp:include page="${inc_dir}/theme-panel.jsp"></jsp:include>
                    <!-- END THEME PANEL -->
                    <h1 class="page-title"> Advertiser | Business Profile <small>edit my business profile</small></h1>
                    <div class="page-bar">
                        <ul class="page-breadcrumb">
							<li>
                                <i class="icon-home"></i>
                                <a href="${webapp_name}/">Home</a>
                                <i class="fa fa-angle-right"></i>
                            </li>
                            <li>
                                <a href="${webapp_name}/advertiser/">Advertiser</a>
                                <i class="fa fa-angle-right"></i>
                            </li>
                            <li>
                                <a href="${webapp_name}/advertiser/">Manage business</a>
                                <i class="fa fa-angle-right"></i>
                            </li>
                            <li>
                                <span>Edit business profile</span>
                            </li>
						</ul>
                        <div class="page-toolbar">
                            <div class="btn-group pull-right">
                                <button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true"> Actions
                                    <i class="fa fa-angle-down"></i>
                                </button>
                                <ul class="dropdown-menu pull-right" role="menu">
                                    <li><a href="#"><i class="icon-bell"></i> Action</a></li>
                                    <li><a href="#"><i class="icon-shield"></i> Another action</a></li>
                                    <li><a href="#"><i class="icon-user"></i> Something else here</a></li>
                                    <li class="divider"> </li>
                                    <li><a href="#"><i class="icon-bag"></i> Separated link</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <!-- END PAGE HEADER-->
                   
                    <div class="row">
                        <div class="col-md-12">
                            <!-- Begin: life time stats -->
                            <div class="portlet light">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class="fa fa-shopping-cart"></i>Apply for Advertiser <span class="caption-helper">to post ads</span></div>
                                    <div class="actions">
                                        <a href="eventsNewsCreate" class="btn btn-circle btn-info">
                                            <i class="fa fa-plus"></i><span class="hidden-xs"> Create news </span>
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
                                                <li><a href="javascript:;"> Print  </a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                               
                            </div>
                            <!-- End: life time stats -->
                        </div>
                    </div>
                    
                    <div class="row">
                    	<div class="col-md-12">
                    		
                    		<div class="portlet light ">
	                            <div class="portlet-title">
	                                <div class="caption">
	                                    <i class="icon-equalizer font-red-sunglo"></i>
	                                    <span class="caption-subject font-red-sunglo bold uppercase">Application Form</span>
	                                    <span class="caption-helper">become an advertiser</span>
	                                </div>
	                                <div class="actions">
	                                    <a class="btn btn-circle btn-icon-only btn-default" href="javascript:;">
	                                        <i class="icon-cloud-upload"></i>
	                                    </a>
	                                    <a class="btn btn-circle btn-icon-only btn-default" href="javascript:;">
	                                        <i class="icon-wrench"></i>
	                                    </a>
	                                    <a class="btn btn-circle btn-icon-only btn-default" href="javascript:;">
	                                        <i class="icon-trash"></i>
	                                    </a>
	                                </div>
	                            </div>
	                            
                                <div class="portlet-body form">
                                    <!-- BEGIN FORM-->
                                    <form action="#" class="form-horizontal">
                                        <div class="form-body">
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Business Name</label>
                                                <div class="col-md-4">
                                                    <input type="text" id="bizName" class="form-control" value="${businessProfile.getBizName()}" placeholder="Enter text">
                                                    <span class="help-block"> Your legal company name or real business name</span>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Business No.</label>
                                                <div class="col-md-4">
                                                    <input type="text" id="bizNo" class="form-control" value="${businessProfile.getBizNo()}" placeholder="Enter text">
                                                    <span class="help-block"> Your business no. issued by government</span>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Business Owner</label>
                                                <div class="col-md-4">
                                                    <input type="text" id="bizOwner" class="form-control" value="${businessProfile.getBizOwner()}" placeholder="Business owner">
                                                    <span class="help-block"> Business owner</span>
                                                </div>
                                            </div>
                                            
                                            
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Legal Form</label>
                                                <div class="col-md-4">
                                                    <select id="legalFormNo" class="form-control">
                                                    <!-- 	<option value="">Choose a legal form</option>
                                                    	<option value="">Solo business - Not registered</option>
                                                    	<option value="">Solo business - Registered</option>
                                                    	<option value="">Partnership</option>
                                                    	<option value="">Corporation, LLC</option>  -->
                                                    	<c:forEach var="category" items="${listOfBizCategories}">
															<option value="${category.getKey()}" <c:if test="${category.getKey()==businessProfile.getLegalFormNo()}">selected="selected"</c:if>>${category.getValue()}</option>
														</c:forEach>
                                                    </select>
                                                    <span class="help-block"> The legal form of your business</span>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Industry Code</label>
                                                <div class="col-md-4">
                                                    <select class="form-control" id="industryCodeLevel1" onchange="industryCodeOnChange(1);">
                                                    	<option value="">Choose a category for your business</option>
                                                    	<c:forEach items="${NAICS_level_1}" var="item">
                                                    		<option value="${item.getIndustryCode()}" <c:if test="${businessProfile.isSubIndustrySelected(item.getIndustryCode(),1)}">selected="selected"</c:if>>${item.getIndustryCode()} ${item.getIndustryName()}</option>
                                                    	</c:forEach>
                                                    </select>
                                                    <p></p>
                                                    <select class="form-control" id="industryCodeLevel2" onchange="industryCodeOnChange(2);">
                                                    	<option value="">Choose sub category for your business</option>
                                                    	<c:forEach items="${NAICS_level_2}" var="item">
                                                    		<option value="${item.getIndustryCode()}" <c:if test="${businessProfile.isSubIndustrySelected(item.getIndustryCode(),2)}">selected="selected"</c:if>>${item.getIndustryCode()} ${item.getIndustryName()}</option>
                                                    	</c:forEach>
                                                    </select>
                                                    <p></p>
                                                    <select class="form-control" id="industryCodeLevel3" onchange="industryCodeOnChange(3);">
                                                    	<option value="">Choose sub category for your business</option>
                                                    	<c:forEach items="${NAICS_level_3}" var="item">
                                                    		<option value="${item.getIndustryCode()}" <c:if test="${businessProfile.isSubIndustrySelected(item.getIndustryCode(),3)}">selected="selected"</c:if>>${item.getIndustryCode()} ${item.getIndustryName()}</option>
                                                    	</c:forEach>
                                                    </select>
                                                    <p></p>
                                                    <select class="form-control" id="industryCodeLevel4" onchange="industryCodeOnChange(4);">
                                                    	<option value="">Choose sub category for your business</option>
                                                    	<c:forEach items="${NAICS_level_4}" var="item">
                                                    		<option value="${item.getIndustryCode()}" <c:if test="${item.getIndustryCode()==businessProfile.getIndustryCode()}">selected="selected"</c:if>>${item.getIndustryCode()} ${item.getIndustryName()}</option>
                                                    	</c:forEach>
                                                    </select>
                                                    <span class="help-block"> Select the industry code for your business </span>
			                                        <p></p>
			                                        <input type="text" class="form-control" value="${businessProfile.getIndustryCode()}" placeholder="industryCode" id="industryCode" />
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                            	<c:set var="bizType" value="${businessProfile.getBizType()}" />
                                                <label class="col-md-3 control-label">Business Type</label>
                                                <div class="col-md-4">
                                                    <div class="mt-checkbox-list mt-checkbox-inline">
			                                            <label class="mt-checkbox mt-checkbox-outline"> Product
			                                                <input type="checkbox" value="1" class="businessType" name="businessType[]" <c:if test="${bizType==1||bizType==3||bizType==5||bizType==7}">checked</c:if> />
			                                                <span></span>
			                                            </label>
			                                            <label class="mt-checkbox mt-checkbox-outline"> e-Product
			                                                <input type="checkbox" value="2" class="businessType" name="businessType[]" <c:if test="${bizType==2||bizType==3||bizType==6||bizType==7}">checked</c:if> />
			                                                <span></span>
			                                            </label>
			                                            <label class="mt-checkbox mt-checkbox-outline"> Service
			                                                <input type="checkbox" value="4" class="businessType" name="businessType[]" <c:if test="${bizType==4||bizType==5||bizType==6||bizType==7}">checked</c:if> />
			                                                <span></span>
			                                            </label>
			                                        </div>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Business Description</label>
                                                <div class="col-md-4">
                                                    <input type="text" id="bizDesc" class="form-control" value="${businessProfile.getBizDesc()}" placeholder="Brief description of your business">
                                                    <span class="help-block"> Your business description</span>
                                                </div>
                                            </div>
                                            
	                               			 <div class="form-group">
	                                               <label class="col-md-3 control-label">Head Office Address</label>
	                                               <div class="col-md-9">
	                                               	<div class="row">
	                                               		<div class="col-md-2">
	                                               			<input type="text" class="form-control" placeholder="Street no.">
	                                               		</div>
	                                               		<div class="col-md-2">
	                                               			<select class="form-control">
		                                                    	<option value="">Rue</option>
		                                                    	<option value="">Avenue/Av.</option>
		                                                    	<option value="">Boulevard/Blvd.</option>
		                                                    	<option value="">St.</option>
	                                                   		</select>
	                                               		</div>
	                                               		<div class="col-md-6">
	                                               			<input type="text" class="form-control" placeholder="Street name">
	                                               		</div>
	                                               		<div class="col-md-2">
	                                               			<input type="text" class="form-control" placeholder="Port no.">
	                                               		</div>
	                                               	</div>
	                                               	<p></p>
	                                               	<div class="row">
	                                               		<div class="col-md-4">
	                                               			<input type="text" class="form-control" placeholder="City">
	                                               		</div>
	                                               		<div class="col-md-4">
	                                               			<input type="text" class="form-control" placeholder="Province">
	                                               		</div>
	                                               		<div class="col-md-4">
	                                               			<input type="text" class="form-control" placeholder="Postal code">
	                                               		</div>
	                                               	</div>
	                                               </div>
	                                            </div>
	                                            
	                                            <div class="form-group">
	                                               <label class="col-md-3 control-label">Phone no.</label>
	                                                <div class="col-md-4">
	                                                    <input type="text" class="form-control" placeholder="Phone no.">
	                                                </div>
	                                            </div>
	                                            
	                                            <div class="form-group">
	                                               <label class="col-md-3 control-label">Fax no.</label>
	                                                <div class="col-md-4">
	                                                    <input type="text" class="form-control" placeholder="Fax no.">
	                                                </div>
	                                            </div>
	                                            
	                                            <div class="form-group">
	                                               <label class="col-md-3 control-label">Website Address</label>
	                                                <div class="col-md-4">
	                                                    <input type="text" class="form-control" placeholder="URL of your website or home page">
	                                                </div>
	                                            </div>
	                                            
	                                            <div class="form-group">
	                                               <label class="col-md-3 control-label">Facebook</label>
	                                                <div class="col-md-4">
	                                                    <input type="text" class="form-control" placeholder="URL of your facebook homepage">
	                                                </div>
	                                            </div>
	                                            
	                                            <div class="form-group">
	                                               <label class="col-md-3 control-label">LinkedIn</label>
	                                                <div class="col-md-4">
	                                                    <input type="text" class="form-control" placeholder="URL of your LinkedIn homepage">
	                                                </div>
	                                            </div>
	                                            
	                                            <div class="form-group">
	                                               <label class="col-md-3 control-label">Twitter</label>
	                                                <div class="col-md-4">
	                                                    <input type="text" class="form-control" placeholder="URL of your Twitter homepage">
	                                                </div>
	                                            </div>
	                                            
	                                            <div class="form-group">
	                                               <label class="col-md-3 control-label">Youtube</label>
	                                                <div class="col-md-4">
	                                                    <input type="text" class="form-control" placeholder="URL of your Youtube homepage">
	                                                </div>
	                                            </div>
	                                            
	                                            <div class="form-group">
	                                               <label class="col-md-3 control-label">Instagram</label>
	                                                <div class="col-md-4">
	                                                    <input type="text" class="form-control" placeholder="URL of your Instagram homepage">
	                                                </div>
	                                            </div>
	                                            
	                                            <div class="form-group">
	                                               <label class="col-md-3 control-label">Pinterest</label>
	                                                <div class="col-md-4">
	                                                    <input type="text" class="form-control" placeholder="URL of your Pinterest homepage">
	                                                </div>
	                                            </div>
	                                            
	                                            <!-- BEGIN MY CATEGORY TEST -->
	                                            <div class="form-group">
	                                                <label class="col-md-3 control-label">TEST Category</label>
	                                                <div class="col-md-7">
	                                                    <input type="text" class="form-control" placeholder="Enter text" id="categoryNo">
	                                                </div>
	                                                <div class="col-md-2">
	                                                    <button class="btn btn-success" onclick="showCategoryList();return false;" id="boothCategoryChooser">&nbsp;&nbsp;&nbsp; Choose &nbsp;&nbsp;&nbsp;</button>
	                                                </div>
	                                            </div>
	                                            
	                                            <div class="form-group" id="boothCategoryDiv">
	                                                <label class="col-md-3 control-label"></label>
	                                                <div class="col-md-9" id="boothCategoryList">
	                                                	<select id="boothCategorySelection" onchange="boothCategorySelectionOnchange(this);" multiple>
														</select>
	                                                </div>
	                                            </div>
	                                            <!-- END MY CATEGORY TEST -->
                                             
                                            </div>                                                        
                                            
                                        </div>
                                        <div class="form-actions">
                                            <div class="row">
                                                <div class="col-md-offset-3 col-md-4">
                                                    <button type="submit" class="btn green" onclick="saveAdvertiserProfile(); return false;">Submit</button>
                                                    <button type="button" class="btn default" onclick="cancelAdvertiserApply()">Cancel</button>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                    <!-- END FORM-->
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

<script src="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.min.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/typeahead/handlebars.min.js" type="text/javascript"></script>
<script src="${webapp_name}/assets/global/plugins/typeahead/typeahead.bundle.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<!-- <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script> -->
<script src="${webapp_name}/assets/global/scripts/app.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts/components-bootstrap-tagsinput.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/bizprofile.js"></script>

<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/bizprofile.js"></script>
<!-- <script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/bizprofile-edit.js"></script> -->
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
function test(){
	var checkText=$("#industryCodeLevel1").find("option:selected").text();  //Select - Text
	var parentCode=$("#industryCodeLevel1").val();  //Select - Value
	//alert(checkValue+" : "+checkText);
	getSubIndustryCode(parentCode);
}

function industryCodeOnChange(level){
	//alert("industryCodeOnChange(level)");
	//var checkText=$("#industryCodeLevel1").find("option:selected").text();  //Select - Text
	var parentCode=$("#industryCodeLevel"+level).val();  //Select - Value
	$("#industryCode").val(parentCode);
	//alert(parentCode+" : "+parentCode);
	if (level<4) {
		$.ajax({
			type:"GET",
			url: "/acp/advertiser/industrycode/class/"+parentCode,		//TODO
			//url: "/acp/advertiser/industrycode",		 //working
			dataType:'json',
			//data: {	parentIndustryCode : parentCode },
			timeout : 10000,
			//beforeSend: function() { alert('beforeSend'); },		
			//complete: function() { alert('completed'); },
			success:function(data){	
				var listIndustryCode = data.listIndustryCode;
				var $el = $("#industryCodeLevel"+(level+1));
				$el.empty();
				//Choose sub category for your business
				$el.append($("<option></option>")
		       	   .attr("value", "").text("Choose sub category for your business"));
				listIndustryCode.forEach(function(indCode, index) {
					//alert("IndustryCode.name:"+indCode.industryName);
					$el.append($("<option></option>")
				       .attr("value", indCode.industryCode).text(indCode.industryCode + " " + indCode.industryName));
					});
				//reset the rest levels
				for (i=level+2; i <= 4; i++) { 
					$("#industryCodeLevel"+i).find('option:first').attr("value", "").text("--/--");
					$("#industryCodeLevel"+i).find('option').not(':first').remove();
				} 
			}		
		});
	}
}

function setBizTypeValue(){
	var val = 0;
    $('input.businessType:checkbox:checked').each(function(i){
      val += parseInt($(this).val());
    });
    $('#businessType').val(val);
}

function showCategoryList(){
	//alert("ok");
	//$("#boothCategoryList").show();
	//$("#boothCategoryChooser").html("&nbsp;&nbsp;&nbsp;Collpase&nbsp;&nbsp;&nbsp;");
	
	$.ajax({
		type:"GET",
		url:"/acp/advertiser/categoryChooseClick",
		dataType:"json",
		//data: { },
		timeout : 5000,
		success:function(data){	
			//alert('return successfully!'+ data.categoryList.length);
			var list = data.categoryList;
			var $el = $("#boothCategorySelection");
			//$el.empty();
//			$el.append($("<option></option>")
//	       	   .attr("value", "").text("Choose the category"));
			list.forEach(function(cat, index) {
				//alert("IndustryCode.name:"+indCode.industryName);
				$el.append($("<option></option>")
			       .attr("value", cat.industryCode).text(cat.industryCode + " : " + cat.industryName));
				});
			
			$("#boothCategoryDiv").toggle(
					function() {
				    	$("#boothCategoryChooser").text("Collpase");
					},
					function() {
					    $("#boothCategoryChooser").html("&nbsp;&nbsp;&nbsp;&nbsp;Choose&nbsp;&nbsp;&nbsp;&nbsp;");
					}
				);
		}		
	});
	
	
}

function boothCategorySelectionOnchange(sel) {
	var sv = sel.options[sel.selectedIndex].value;
	var st = sel.options[sel.selectedIndex].text;
	//alert('value:'+sv+' text:'+st);
	$('#categoryNo').val(st);
	$("#boothCategoryDiv").hide();
}

$(document).ready(function(){
	$("#boothCategoryDiv").hide();
	
	//init
//	$("#boothCategoryList").html(
//			"1,1,1,1<br/>1,1,1,1<br/>"
//	);
			
});

</script>
</body>

</html>