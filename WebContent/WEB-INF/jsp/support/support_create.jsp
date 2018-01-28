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
<title>Adogo | Support - Create</title>
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
	<!-- HEADER -->
	<div class="page-header navbar navbar-fixed-top">
    	<!-- BEGIN HEADER INNER -->
	    <div class="page-header-inner ">
	        <!-- LOGO -->
	        <jsp:include page="${inc_dir}/page-logo.jsp"></jsp:include>
	        <!-- RESPONSIVE MENU TOGGLER -->
	        <a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"> </a>
	        <!-- PAGE ACTIONS -->
	        <jsp:include page="${inc_dir}/page-action.jsp"></jsp:include>
	        <!-- BEGIN PAGE TOP -->
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
            <h1 class="page-title"> Support - Create</small></h1>
            <div class="page-bar">
                <ul class="page-breadcrumb">
					<li><i class="icon-home"></i><a href="${webapp_name}/">Home</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/support/">Support</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="#">Create Support</a><i class="fa fa-angle-right"></i></li>
                    
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
            
            <!-- ROW STEP -->
            <!-- 
            <div class="row">
                <div class="col-md-12">
                    <div class="portlet light portlet-fit ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class=" icon-layers font-green"></i>
                                <span class="caption-subject font-green bold uppercase">Quick steps - Register a business</span>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="mt-element-step">
                                <div class="row step-thin">
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
                                        <div class="mt-step-content font-grey-cascade">Complete business profile</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
             -->
            <!-- END ROW STEP -->
            
            <div class="row">
                <div class="col-md-12">
                    <div class="portlet light">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="fa fa-shopping-cart"></i>Create Support 
                            </div>
                            <div class="actions">
                                <a class="btn btn-circle btn-info" onclick="saveCreateSupport(); return false;">
                                    <span> Save and Create </span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <!-- ROW 2 -->
            <div class="row">
            	<div class="col-md-8">
            		<!-- SECTION 1 -->
            		<div class="portlet light">
	                    <div class="portlet-title">
	                         <div class="caption">
	                             <i class="icon-equalizer font-red-sunglo"></i>
	                             <span class="caption-subject font-red-sunglo bold uppercase">Support</span>
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
	                        <!-- FORM-->
	                        <div class="form-horizontal">
	                        	<div class="form-body">
	                                
	                                <div class="form-group">
                                        <label class="col-md-3 control-label">Choose a language</label>
                                        <div class="col-md-9">
	                                        <select id="support-lang" class="form-control">
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
                                            <input type="text" id="support-topic-title" class="form-control" placeholder="Enter text">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">Topic Content</label>
                                        <div class="col-md-9">
                                            <textarea id="support-topic-content" class="form-control" rows="2"></textarea>
                                        </div>
                                    </div>
                                    
	                            </div>
	                            
	                            <div class="form-actions">
	                                <div class="row">
	                                    <div class="col-md-offset-3 col-md-7">
	                                        <a class="btn green" onclick="saveCreateSupport(); return false;">Save and Create</a>
	                                        <a class="btn default" onclick="cancelCreateBusinessProfile(); return false;">Cancel</a>
	                                    </div>
	                                </div>
	                            </div>
	                            
	                        </div>
	                        <!-- END FORM-->
	                    </div>
                 	</div>
            		<!-- END SECTION 1 -->
            	
            		<!-- BEGIN SECTION 2 -->
            		<!-- 
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
            		</div>
            		 -->
            		<!-- END SECTION 2 -->
            	</div>
            </div>
            <!-- END ROW 2 -->
        </div>
        <!-- END CONTENT BODY -->
    	</div>
    	<!-- END CONTENT -->
           
	</div>
	<!-- END CONTAINER -->
       
	<!-- FOOTER -->
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
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js"></script>
<!-- END THEME LAYOUT SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<!-- commented by Athens on 2017-11-30 -->
<!-- <script type="text/javascript" src="${webapp_name}/assets/pages/scripts/components-bootstrap-tagsinput.min.js"></script> -->
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/support/support.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/support/support-create.js"></script>
<!-- END PAGE LEVEL SCRIPTS -->
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