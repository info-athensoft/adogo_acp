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
<meta charset="utf-8" />
<title>Adogo | Business Profile - Create</title>
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
            <h1 class="page-title"> Advertiser | Business <small>create a business profile</small></h1>
            <div class="page-bar">
                 <ul class="page-breadcrumb">
					<li><i class="icon-home"></i><a href="${webapp_name}/">Home</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/advertiser/">Advertiser</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/advertiser/biz/">Business</a><i class="fa fa-angle-right"></i></li>
                    <li><span>Register a Business</span></li>
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
                                        <div class="font-dark bold uppercase">Register a business</div>
                                        <div class="caption-desc font-grey-cascade"></div>
                                        <br/>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col">
                                        <div class="mt-step-number bg-white font-grey">1</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Start</div>
                                        <div class="mt-step-content font-grey-cascade">Start registering</div>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col done">
                                        <div class="mt-step-number bg-white font-grey">2</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Create</div>
                                        <div class="mt-step-content font-grey-cascade">Create business profile</div>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col">
                                        <div class="mt-step-number bg-white font-grey">3</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Complete</div>
                                        <div class="mt-step-content font-grey-cascade">Complete additional information</div>
                                    </div>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            
            <!-- BEGIN ROW 2 -->
            <div class="row">
            	<div class="col-md-8">
            		<!-- BEGIN SECTION 1 -->
            		<div class="portlet light">
	                    <div class="portlet-title">
	                         <div class="caption">
	                             <i class="icon-equalizer font-red-sunglo"></i>
	                             <span class="caption-subject font-red-sunglo bold uppercase">Business Profile</span>
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
	                        <!-- BEGIN FORM-->
	                        <form action="#" class="form-horizontal">
	                        	<div class="form-body">
		                            <div class="form-group">
		                               <label class="col-md-3 control-label">Business Name</label>
		                               <div class="col-md-9">
		                                   <input type="text" class="form-control" placeholder="" id="bizName">
		                                   <span class="help-block"> Your legal company name or real business name</span>
		                               </div>
		                            </div>
	                                
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">Business No.</label>
	                                    <div class="col-md-9">
	                                        <input type="text" class="form-control" placeholder="" id="bizNo">
	                                        <span class="help-block"> Your business no. issued by government</span>
	                                    </div>
	                                </div>
	                                
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">Business Owner</label>
	                                    <div class="col-md-9">
	                                        <input type="text" class="form-control" placeholder="Business owner" id="bizOwner">
	                                        <span class="help-block"> Business owner</span>
	                                    </div>
	                                </div>
	                                
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">Legal Form</label>
	                                    <div class="col-md-9">
	                                        <select class="form-control" id="legalFormNo">
	                                        	<option value="">Choose a legal form</option>
	                                        	<option value="1">Solo business - Not registered</option>
	                                        	<option value="2">Solo business - Registered</option>
	                                        	<option value="3">Partnership</option>
	                                        	<option value="4">Corporation, LLC</option>
	                                        </select>
	                                        <span class="help-block"> The legal form of your business</span>
	                                    </div>
	                                </div>
	                                
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">Industry Code</label>
	                                    <div class="col-md-9">
	                                        <select class="form-control" id="industryCodeLevel1" onchange="getSubIndustryCode1();">
	                                        	<option value="">Choose a category for your business</option>
	                                        	<c:forEach items="${NAICS_level_1}" var="item">
	                                        		<option value="${item.industryCode}">${item.industryName}</option>
	                                        	</c:forEach>
	                                        </select>
	                                        <p></p>
	                                        <select class="form-control" id="industryCodeLevel2" onchange="getSubIndustryCode2();">
	                                        	<option value="">--/--</option>
	                                        </select>
	                                        <p></p>
	                                        <select class="form-control" id="industryCodeLevel3" onchange="getSubIndustryCode3();">
	                                        	<option value="">--/--</option>
	                                        </select>
	                                        <p></p>
	                                        <select class="form-control" id="industryCodeLevel4">
	                                        	<option value="">--/--</option>
	                                        </select>
	                                        <span class="help-block"> Select the industry code for your business </span>
	                                        <p></p>
	                                        <input type="text" class="form-control" placeholder="industryCode" id="industryCode">
	                                    </div>
	                                </div>
	                                
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">Business Type</label>
	                                    <div class="col-md-9">
	                                        <div class="mt-checkbox-list mt-checkbox-inline">
			                                   <label class="mt-checkbox mt-checkbox-outline"> Product
			                                       <input type="checkbox" value="1" name="businessType" id="bizTypeProduct"/>
			                                       <span></span>
			                                   </label>
			                                   <label class="mt-checkbox mt-checkbox-outline"> e-Product
			                                       <input type="checkbox" value="2" name="businessType" id="bizTypeEProduct"/>
			                                       <span></span>
			                                   </label>
			                                   <label class="mt-checkbox mt-checkbox-outline"> Service
			                                       <input type="checkbox" value="4" name="businessType" id="bizTypeService"/>
			                                       <span></span>
			                                   </label>
			                                   <input type="text" class="form-control" placeholder="Business Type" id="bizType">
			                               </div>
	                                    </div>
	                                </div>
	                                
	                                <div class="form-group">
	                                    <label class="col-md-3 control-label">Business Description</label>
	                                    <div class="col-md-9">
	                                        <input type="text" class="form-control" placeholder="Brief description of your business" id="bizDesc">
	                                        <span class="help-block"> Your business description</span>
	                                    </div>
	                                </div>
	                                
	                            </div>
	                            
	                        </form>
	                        <!-- END FORM-->
	                    </div>
                 	</div>
            		<!-- END SECTION 1 -->
            	
            		<!-- BEGIN SECTION 2 -->
            		<div class="portlet light">
            			<div class="portlet-title">
	                         <div class="caption">
	                             <i class="icon-equalizer font-red-sunglo"></i>
	                             <span class="caption-subject font-red-sunglo bold uppercase">Contact Info.</span>
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
	                        <!-- BEGIN FORM-->
	                        <form action="#" class="form-horizontal">
	                        	<div class="form-body">
		                            
	                                
	                    			<div class="form-group">
	                                    <label class="col-md-3 control-label">Head Office Address</label>
	                                    <div class="col-md-9">
	                                    	<div class="row">
	                                    		<div class="col-md-3">
	                                    			<input type="text" class="form-control" placeholder="Street no." id="streetNo">
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
	                                    			<input type="text" class="form-control" placeholder="Street name" id="streetName">
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
	                                    			<input type="text" class="form-control" placeholder="Port no." id="portNo">
	                                    		</div>
	                                    	</div>
	                                    	<p></p>
	                                    	<div class="row">
	                                    		<div class="col-md-4">
	                                    			<input type="text" class="form-control" placeholder="City" id="cityName">
	                                    		</div>
	                                    		<div class="col-md-4">
	                                    			<input type="text" class="form-control" placeholder="Province" id="provName">
	                                    		</div>
	                                    		<div class="col-md-4">
	                                    			<input type="text" class="form-control" placeholder="Postal code" id="postalCode">
	                                    		</div>
	                                    	</div>
	                                    </div>
	                                 </div>
	                                 
	                          		<div class="form-group">
	                                    <label class="col-md-3 control-label">Phone no.</label>
	                                    <div class="col-md-9">
	                                    	<input type="text" class="form-control" placeholder="Phone no." id="bizPhone">
	                                    </div>
	                                 </div>
	                                 
	                         		<div class="form-group">
	                                    <label class="col-md-3 control-label">Fax no.</label>
	                                    <div class="col-md-9">
	                                    	<input type="text" class="form-control" placeholder="Fax no." id="bizFax">
	                                    </div>
	                                 </div>
	                                 
	                                 <div class="form-group">
	                                    <label class="col-md-3 control-label">Email</label>
	                                    <div class="col-md-9">
	                                    	<input type="text" class="form-control" placeholder="email" id="bizEmail">
	                                    </div>
	                                 </div>
	                                 
	                             	<div class="form-group">
	                                    <label class="col-md-3 control-label">Website Address</label>
	                                    <div class="col-md-9">
	                                    	<input type="text" class="form-control" placeholder="URL of your website or home page" id="bizWebsite">
	                                    </div>
	                                 </div>
	                            </div>
	                            <div class="form-actions">
	                                <div class="row">
	                                    <div class="col-md-offset-3 col-md-7">
	                                        <a class="btn green" onclick="saveBusinessProfile(event);">Create Business Now</a>
	                                        <a class="btn default" onclick="cancelBusinessRegistration(event);">Cancel</a>
	                                    </div>
	                                </div>
	                            </div>
	                        </form>
	                        <!-- END FORM-->
	                    </div>
                 	
	                    
            		</div>
            		<!-- END SECTION 2 -->
            	</div>
            </div>
            <!-- END ROW 2 -->
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

<!-- commented by Athens on 2017-11-30 -->
<!-- <script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.min.js"></script>  -->
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/handlebars.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/typeahead.bundle.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<!-- <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script> -->
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/app.js"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<!-- commented by Athens on 2017-11-30 -->
<!-- <script type="text/javascript" src="${webapp_name}/assets/pages/scripts/components-bootstrap-tagsinput.min.js"></script> -->
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/bizprofile.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/bizprofile-create.js"></script>
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

function getSubIndustryCode1(){
	//selectObject=$("#industryCodeLevel1")
	var checkText=$("#industryCodeLevel1").find("option:selected").text();  //Select - Text
	var parentCode=$("#industryCodeLevel1").val();  //Select - Value
	var nextLevelIndex = 2;
	getSubIndustryCode(parentCode,nextLevelIndex);
}


function getSubIndustryCode2(){
	var parentCode=$("#industryCodeLevel2").val();  //Select - Value
	var checkText=$("#industryCodeLevel2").find("option:selected").text();  //Select - Text
	var nextLevelIndex = 3;
	getSubIndustryCode(parentCode,nextLevelIndex);
	
	//var parentCode=$("#industryCodeLevel2").val();  //Select - Value
	//alert(checkValue+" : "+checkText);
}

function getSubIndustryCode3(){
	var parentCode=$("#industryCodeLevel3").val();  //Select - Value
	var checkText=$("#industryCodeLevel3").find("option:selected").text();  //Select - Text
	var nextLevelIndex = 4;
	getSubIndustryCode(parentCode,nextLevelIndex);
	
	//alert(checkValue+" : "+checkText);
}

</script>
</body>
</html>