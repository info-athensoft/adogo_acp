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
<title>Adogo | Business Profile - Edit</title>
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
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput-typeahead.css"/>
<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN THEME GLOBAL STYLES -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/css/components.min.css" id="style_components"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/css/plugins.min.css"/>
<!-- END THEME GLOBAL STYLES -->

<!-- BEGIN THEME LAYOUT STYLES -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/layout.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/themes/blue.min.css" id="style_color"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/layouts/layout2/css/custom.min.css"/>
<!-- END THEME LAYOUT STYLES -->
</head>

<body class="page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid">
	<!-- BEGIN HEADER -->
    <div class="page-header navbar navbar-fixed-top">
    	<!-- BEGIN HEADER INNER -->
        <div class="page-header-inner ">
        	<!-- LOGO -->
            <jsp:include page="${inc_dir}/page-logo.jsp"></jsp:include>
            <!-- RESPONSIVE MENU TOGGLER -->
            <a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"> </a>
            <!-- PAGE ACTIONS -->
            <jsp:include page="${inc_dir}/page-action.jsp"></jsp:include>
            <!-- PAGE TOP -->
            <jsp:include page="${inc_dir}/page-top.jsp"></jsp:include>
        </div>
        <!-- END HEADER INNER -->
    </div>
    <!-- END HEADER -->
    <div class="clearfix"> </div>
    
    <!-- CONTAINER -->
    <div class="page-container">
    	<!-- SIDEBAR -->
        <jsp:include page="${inc_dir}/page-sidebar.jsp"></jsp:include>
        
        <!-- CONTENT -->
        <div class="page-content-wrapper">
        <!-- CONTENT BODY -->
        <div class="page-content">
        	<!-- PAGE HEADER-->
            <h1 class="page-title"> Advertiser | Business <small>edit my business profile</small></h1>
            <div class="page-bar">
                <ul class="page-breadcrumb">
					<li><i class="icon-home"></i><a href="${webapp_name}/">Home</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/advertiser/">Advertiser</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/advertiser/biz/">Business</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/advertiser/biz/manage.html">Manage Business Status</a><i class="fa fa-angle-right"></i></li>
                    <li><span>Edit a Business Profile</span></li>
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

			<!-- ROW 1 -->
            <div class="row">
            	<div class="col-md-12">
                	<div class="portlet light">
                        <div class="portlet-title">
                            <div class="caption">
                                Edit Business Profile 
                                <span class="caption-helper">keeping accurate and up-to-date</span>
                            </div>
                            <div class="actions">
                                <a class="btn btn-circle btn-info" onclick="saveBusinessProfile(); return false;">
                                    <span> Save Profile </span>
                                </a>
                                <a class="btn btn-circle btn-default" onclick="cancelSaveBusinessProfile(); return false;">
                                    <span> Cancel </span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END ROW 1 -->
            
            <!-- ROW 2 -->
            <div class="row">
                <div class="col-md-8">
                    <div class="portlet light">
	                    <div class="portlet-title">
	                        <div class="caption">
	                        	<i class="icon-equalizer font-red-sunglo"></i>
	                            <span class="caption-subject font-red-sunglo bold uppercase">General Information</span>
	                            <span class="caption-helper"> </span>
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
                            <div class="form-horizontal">
                                <div class="form-body">
                                    <input type="hidden" id="bizId" value="${businessProfile.bizId}"/>
                                        	
                                    <div class="form-group">
                                                <label class="col-md-3 control-label">Business ID</label>
                                                <div class="col-md-9">
                                                    <input type="text" id="bizId" class="form-control" value="${businessProfile.bizId}" placeholder="Enter text">
                                                    <span class="help-block"> Business ID at Adogo</span>
                                                </div>
                                            </div>
                                        	
                                    <div class="form-group">
                                                <label class="col-md-3 control-label">Business Name</label>
                                                <div class="col-md-9">
                                                    <input type="text" id="bizName" class="form-control" value="${businessProfile.bizName}" placeholder="Enter text">
                                                    <span class="help-block"> Your legal company name or real business name</span>
                                                </div>
                                            </div>
                                            
                                    <div class="form-group">
                                                <label class="col-md-3 control-label">Business No.</label>
                                                <div class="col-md-9">
                                                    <input type="text" id="bizNo" class="form-control" value="${businessProfile.bizNo}" placeholder="Enter text">
                                                    <span class="help-block"> Your business no. issued by government</span>
                                                </div>
                                            </div>
                                            
                                    <div class="form-group">
                                                <label class="col-md-3 control-label">Business Owner</label>
                                                <div class="col-md-9">
                                                    <input type="text" id="bizOwner" class="form-control" value="${businessProfile.bizOwner}" placeholder="Business owner">
                                                    <span class="help-block"> Business owner</span>
                                                </div>
                                            </div>
                                            
                                    <div class="form-group">
                                                <label class="col-md-3 control-label">Legal Form</label>
                                                <div class="col-md-9">
                                                    <select id="legalFormNo" class="form-control">
                                                    <!-- 	<option value="">Choose a legal form</option>
                                                    	<option value="">Solo business - Not registered</option>
                                                    	<option value="">Solo business - Registered</option>
                                                    	<option value="">Partnership</option>
                                                    	<option value="">Corporation, LLC</option>  -->
                                                    	<c:forEach var="category" items="${listOfBizCategories}">
															<option value="${category.getKey()}" <c:if test="${category.getKey()==businessProfile.legalFormNo}">selected="selected"</c:if>>${category.getValue()}</option>
														</c:forEach>
                                                    </select>
                                                    <span class="help-block"> The legal form of your business</span>
                                                </div>
                                            </div>
                                            
                                    <div class="form-group">
                                                <label class="col-md-3 control-label">Industry Code</label>
                                                <div class="col-md-9">
                                                    <select class="form-control" id="industryCodeLevel1" onchange="industryCodeOnChange(1);">
                                                    	<option value="">Choose a category for your business</option>
                                                    	<c:forEach items="${NAICS_level_1}" var="item">
                                                    		<option value="${item.industryCode}" <c:if test="${industryCodeObj.isSubIndustrySelected(businessProfile.industryCode,item.industryCode,1)}">selected="selected"</c:if>>${item.industryCode} : ${item.industryName}</option>
                                                    	</c:forEach>
                                                    </select>
                                                    <p></p>
                                                    <select class="form-control" id="industryCodeLevel2" onchange="industryCodeOnChange(2);">
                                                    	<option value="">Choose sub category for your business</option>
                                                    	<c:forEach items="${NAICS_level_2}" var="item">
                                                    		<option value="${item.industryCode}" <c:if test="${industryCodeObj.isSubIndustrySelected(businessProfile.industryCode,item.industryCode,2)}">selected="selected"</c:if>>${item.industryCode} : ${item.industryName}</option>
                                                    	</c:forEach>
                                                    </select>
                                                    <p></p>
                                                    <select class="form-control" id="industryCodeLevel3" onchange="industryCodeOnChange(3);">
                                                    	<option value="">Choose sub category for your business</option>
                                                    	<c:forEach items="${NAICS_level_3}" var="item">
                                                    		<option value="${item.industryCode}" <c:if test="${industryCodeObj.isSubIndustrySelected(businessProfile.industryCode,item.industryCode,3)}">selected="selected"</c:if>>${item.industryCode} : ${item.industryName}</option>
                                                    	</c:forEach>
                                                    </select>
                                                    <p></p>
                                                    <select class="form-control" id="industryCodeLevel4" onchange="industryCodeOnChange(4);">
                                                    	<option value="">Choose sub category for your business</option>
                                                    	<c:forEach items="${NAICS_level_4}" var="item">
                                                    		<option value="${item.industryCode}" <c:if test="${item.industryCode==businessProfile.industryCode}">selected="selected"</c:if>>${item.industryCode} : ${item.industryName}</option>
                                                    	</c:forEach>
                                                    </select>
                                                    <!-- <span class="help-block"> Select the industry code for your business </span>  -->
			                                        <input type="hidden" class="form-control" value="${businessProfile.industryCode}" placeholder="industryCode" id="industryCode" />
                                                </div>
                                            </div>
                                            
                                    <div class="form-group">
                                            	<input type="hidden" id="bizType" value="${businessProfile.bizType}"/>
                                                <label class="col-md-3 control-label">Business Type</label>
                                                <div class="col-md-9">
                                                	<c:set var="bizTypeValue" value="${businessProfile.bizType}" />
                                                    <div class="mt-checkbox-list mt-checkbox-inline">
			                                            <label class="mt-checkbox mt-checkbox-outline"> Product
			                                                <input type="checkbox" value="1" name="businessType[]" id="bizTypeProduct" <c:if test="${bizType_product}">checked</c:if> />
			                                                <span></span>
			                                            </label>
			                                            <label class="mt-checkbox mt-checkbox-outline"> e-Product
			                                                <input type="checkbox" value="2" name="businessType[]" id="bizTypeEProduct" <c:if test="${bizType_eproduct}">checked</c:if> />
			                                                <span></span>
			                                            </label>
			                                            <label class="mt-checkbox mt-checkbox-outline"> Service
			                                                <input type="checkbox" value="4" name="businessType[]" id="bizTypeService" <c:if test="${bizType_service}">checked</c:if> />
			                                                <span></span>
			                                            </label>
			                                        </div>
                                                </div>
                                            </div>
                                            
                                    <div class="form-group">
                                                <label class="col-md-3 control-label">Business Description</label>
                                                <div class="col-md-9">
                                                    <input type="text" id="bizDesc" class="form-control" value="${businessProfile.bizDesc}" placeholder="Brief description of your business">
                                                    <span class="help-block"> Your business description </span>
                                                </div>
                                            </div>
                                           
                                </div>                                                        
                            	<div class="form-actions">
                                    <div class="row">
                                        <div class="col-md-offset-3 col-md-4">
                                            <a class="btn green" onclick="saveBusinessProfile(); return false;">Save</a>
                                            <a class="btn default" onclick="cancelSaveBusinessProfile(); return false">Cancel</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                        	
                    <div class="portlet light">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="icon-equalizer font-red-sunglo"></i>
                                <span class="caption-subject font-red-sunglo bold uppercase">Contact Information</span>
                                <span class="caption-helper"></span>
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
                            <div class="form-horizontal">
                                <div class="form-body">
	                               	<div class="form-group">
	                                    <label class="col-md-3 control-label">Head Office Address</label>
	                                    <div class="col-md-9">
                                        	<div class="row">
                                        		<div class="col-md-3">
                                        			<input type="text" class="form-control" placeholder="Street no." id="streetNo" value="${hqAddress.streetNo}">
                                        		</div>
                                        		<div class="col-md-4">
                                        			<select class="form-control" id="streetType">
                                              			<option value="21">Rue</option>
                                              			<option value="22">Avenue/Av.</option>
                                              			<option value="23">Boulevard/Blvd.</option>
                                              			<option value="11">St.</option>
                                            		</select>
                                        		</div>
                                        		<div class="col-md-5">
                                        			<input type="text" class="form-control" placeholder="Street name" id="streetName" value="${hqAddress.streetName}">
                                        		</div>
                                        	</div>
                                        	<p></p>
                                        	<div class="row">
                                        		<div class="col-md-3">
                               						<select class="form-control" id="portType">
                                       					<option value="1">Port</option>
                                       					<option value="2">Suite</option>
                                       					<option value="3">Apt</option>
                                       					<option value="4">App</option>
                                   					</select>
                               					</div>
                                        		<div class="col-md-3">
                                        			<input type="text" class="form-control" placeholder="Port no." id="portNo" value="${hqAddress.portNo}">
                                        		</div>
                                        	</div>
                                        	<p></p>
                                        	<div class="row">
                                        		<div class="col-md-4">
                                        			<input type="text" class="form-control" placeholder="City" id="cityName"  value="${hqAddress.cityName}">
                                        		</div>
                                        		<div class="col-md-4">
                                        			<input type="text" class="form-control" placeholder="Province" id="provName"  value="${hqAddress.provName}">
                                        		</div>
                                        		<div class="col-md-4">
                                        			<input type="text" class="form-control" placeholder="Postal code" id="postalCode" value="${hqAddress.postalCode}">
                                        		</div>
                                        	</div>
                                         </div>
	                                </div>
	                                            
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">Phone no.</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" placeholder="Phone no." id="bizPhone" value="${businessProfile.bizPhone}">
                                        </div>
	                                </div>
	                                            
	                                <div class="form-group">
                                    	<label class="col-md-3 control-label">Fax no.</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" placeholder="Fax no." id="bizFax" value="${businessProfile.bizFax}">
                                        </div>
                                    </div>
	                                            
	                                <div class="form-group">
				                        <label class="col-md-3 control-label">Email</label>
	                                    <div class="col-md-9">
	                                    	<input type="text" class="form-control" placeholder="email" id="bizEmail" value="${businessProfile.bizEmail}">
	                                    </div>
				                    </div>
	                                            
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">Website</label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" placeholder="URL of your website or home page" id="bizWebsite" value="${businessProfile.bizWebsite}">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-actions">
                                    <div class="row">
                                        <div class="col-md-offset-3 col-md-4">
                                            <a class="btn green" onclick="saveBusinessProfile(); return false;">Save</a>
                                            <a class="btn default" onclick="cancelSaveBusinessProfile(); return false;">Cancel</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                        	
                    <div class="portlet light">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="icon-equalizer font-red-sunglo"></i>
                                <span class="caption-subject font-red-sunglo bold uppercase">Online Presence</span>
                                <span class="caption-helper"></span>
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
                            <div class="form-horizontal">
                             	<div class="form-body">
                                	<div class="form-group">
                                      	<label class="col-md-3 control-label">Facebook</label>
                                    	<div class="col-md-9">
                                        	<input type="hidden" id="presenceNo1" value="1"/>
                                        	<input type="text" class="form-control" placeholder="URL of your facebook homepage" id="presenceURL1" value="${presenceURL1}">
                                    	</div>
                                 	</div>
                                      
                                    <div class="form-group">
                                    	<label class="col-md-3 control-label">LinkedIn</label>
                                    	<div class="col-md-9">
                                          	<input type="hidden" id="presenceNo2" value="2"/>
                                        	<input type="text" class="form-control" placeholder="URL of your LinkedIn homepage" id="presenceURL2" value="${presenceURL2}">
                                        </div>
                                    </div>
                                      
                                    <div class="form-group">
                                    	<label class="col-md-3 control-label">Twitter</label>
                                    	<div class="col-md-9">
                                    		<input type="hidden" id="presenceNo3" value="3"/>
                                    		<input type="text" class="form-control" placeholder="URL of your Twitter homepage" id="presenceURL3" value="${presenceURL3}">
                                    	</div>
                                    </div>
                                      
                                    <div class="form-group">
                                    	<label class="col-md-3 control-label">Youtube</label>
                                    	<div class="col-md-9">
                                    		<input type="hidden" id="presenceNo4" value="4"/>
                                    		<input type="text" class="form-control" placeholder="URL of your Youtube homepage" id="presenceURL4" value="${presenceURL4}">
                                    	</div>
                                    </div>
                                      
                                    <div class="form-group">
                                    	<label class="col-md-3 control-label">Instagram</label>
                                    	<div class="col-md-9">
                                    		<input type="hidden" id="presenceNo5" value="5"/>
                                    		<input type="text" class="form-control" placeholder="URL of your Instagram homepage" id="presenceURL5" value="${presenceURL5}">
                                    	</div>
                                    </div>
                                      
                                    <div class="form-group">
                                    	<label class="col-md-3 control-label">Pinterest</label>
                                    	<div class="col-md-9">
                                    		<input type="hidden" id="presenceNo6" value="6"/>
                                    		<input type="text" class="form-control" placeholder="URL of your Pinterest homepage" id="presenceURL6" value="${presenceURL6}">
                                    	</div>
                                    </div>
                                </div> 
                             	<div class="form-actions">
                                     <div class="row">
                                         <div class="col-md-offset-3 col-md-4">
                                             <a class="btn green" onclick="saveBusinessProfile(); return false;">Save</a>
                                             <a class="btn default" onclick="cancelSaveBusinessProfile(); return false">Cancel</a>
                                         </div>
                                     </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        	<!-- END ROW 2 -->
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
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/datatable.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/datatables/datatables.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/fancybox/source/jquery.fancybox.pack.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/handlebars.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/typeahead.bundle.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<!-- <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script> -->
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/app.js"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js"></script>
<!-- END THEME LAYOUT SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/bizprofile-edit.js"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
</script>
</body>
</html>