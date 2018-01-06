<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- global variables settings -->
<c:set var="webapp_name" value="/acp"/>
<!-- END global variables settings -->

<!-- page variables  -->
<c:set var="inc_dir" value="inc"/>
<!-- END page variables -->

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<title>ADOGO | ACP</title>
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
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
<link href="${webapp_name}/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<link href="${webapp_name}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
<link href="${webapp_name}/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="${webapp_name}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->

<!-- BEGIN PAGE LEVEL PLUGINS -->
<link href="${webapp_name}/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.css" rel="stylesheet" type="text/css" />
<link href="${webapp_name}/assets/global/plugins/morris/morris.css" rel="stylesheet" type="text/css" />
<link href="${webapp_name}/assets/global/plugins/fullcalendar/fullcalendar.min.css" rel="stylesheet" type="text/css" />
<link href="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/jqvmap.css" rel="stylesheet" type="text/css" />
<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN THEME GLOBAL STYLES -->
<link href="${webapp_name}/assets/global/css/components.min.css" rel="stylesheet" id="style_components" type="text/css" />
<link href="${webapp_name}/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css" />
<!-- END THEME GLOBAL STYLES -->

<!-- BEGIN THEME LAYOUT STYLES -->
<link href="${webapp_name}/assets/layouts/layout2/css/layout.min.css" rel="stylesheet" type="text/css" />
<link href="${webapp_name}/assets/layouts/layout2/css/themes/blue.min.css" rel="stylesheet" type="text/css" id="style_color" />
<link href="${webapp_name}/assets/layouts/layout2/css/custom.min.css" rel="stylesheet" type="text/css" />
<!-- END THEME LAYOUT STYLES -->
</head>

<body class="page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid">
	<!-- HEADER -->
    <div class="page-header navbar navbar-fixed-top">
        <!-- HEADER INNER -->
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
		<!-- BEGIN SIDEBAR -->
		<jsp:include page="${inc_dir}/page-sidebar.jsp"></jsp:include>
		<!-- END SIDEBAR -->
            
		<!-- BEGIN CONTENT -->
        <div class="page-content-wrapper">
        <!-- BEGIN CONTENT BODY -->
        <div class="page-content">
            <!-- BEGIN PAGE HEADER-->
            <h1 class="page-title"> Adogo Control Panel 2.0
            	<small>statistics, charts, recent events and reports</small>
            </h1>
            <div class="page-bar">
                <ul class="page-breadcrumb">
                    <li>
                        <i class="icon-home"></i>
                        <a href="#">Home</a>
                        <i class="fa fa-angle-right"></i>
                    </li>
                    <li>
                        <span>Dashboard</span>
                    </li>
                </ul>
                <div class="page-toolbar">
                    <div class="btn-group pull-right">
                    	<button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" 
                    			data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">
								Quick Links <i class="fa fa-angle-down"></i>
                       	</button>
                    	<ul class="dropdown-menu pull-right" role="menu">
                           <li>
                               <a href="${webapp_name}/advertiser/">
                                   <i class="icon-bell"></i> Advertiser Dashboard</a>
                           </li>
                       </ul>
                    </div>
                </div>
            </div>
            <!-- END PAGE HEADER-->
                    
            <div class="row">
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <div class="dashboard-stat2 ">
                        <div class="display">
                            <div class="number">
                                <h3 class="font-green-sharp">
                                    <span data-counter="counterup" data-value="7800">0</span>
                                    <small class="font-green-sharp">$</small>
                                </h3>
                                <small>TOTAL PROFIT</small>
                            </div>
                            <div class="icon">
                                <i class="icon-pie-chart"></i>
                            </div>
                        </div>
                        <div class="progress-info">
                            <div class="progress">
                                <span style="width: 76%;" class="progress-bar progress-bar-success green-sharp">
                                    <span class="sr-only">76% progress</span>
                                </span>
                            </div>
                            <div class="status">
                                <div class="status-title"> progress </div>
                                <div class="status-number"> 76% </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <div class="dashboard-stat2 ">
                        <div class="display">
                            <div class="number">
                                <h3 class="font-red-haze">
                                    <span data-counter="counterup" data-value="1349">0</span>
                                </h3>
                                <small>NEW FEEDBACKS</small>
                            </div>
                            <div class="icon">
                                <i class="icon-like"></i>
                            </div>
                        </div>
                        <div class="progress-info">
                            <div class="progress">
                                <span style="width: 85%;" class="progress-bar progress-bar-success red-haze">
                                    <span class="sr-only">85% change</span>
                                </span>
                            </div>
                            <div class="status">
                                <div class="status-title"> change </div>
                                <div class="status-number"> 85% </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <div class="dashboard-stat2 ">
                        <div class="display">
                            <div class="number">
                                <h3 class="font-blue-sharp">
                                    <span data-counter="counterup" data-value="567"></span>
                                </h3>
                                <small>NEW ORDERS</small>
                            </div>
                            <div class="icon">
                                <i class="icon-basket"></i>
                            </div>
                        </div>
                        <div class="progress-info">
                            <div class="progress">
                                <span style="width: 45%;" class="progress-bar progress-bar-success blue-sharp">
                                    <span class="sr-only">45% grow</span>
                                </span>
                            </div>
                            <div class="status">
                                <div class="status-title"> grow </div>
                                <div class="status-number"> 45% </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <div class="dashboard-stat2 ">
                        <div class="display">
                            <div class="number">
                                <h3 class="font-purple-soft">
                                    <span data-counter="counterup" data-value="276"></span>
                                </h3>
                                <small>NEW USERS</small>
                            </div>
                            <div class="icon">
                                <i class="icon-user"></i>
                            </div>
                        </div>
                        <div class="progress-info">
                            <div class="progress">
                                <span style="width: 57%;" class="progress-bar progress-bar-success purple-soft">
                                    <span class="sr-only">56% change</span>
                                </span>
                            </div>
                            <div class="status">
                                <div class="status-title"> change </div>
                                <div class="status-number"> 57% </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="row">
                <div class="col-lg-6 col-xs-12 col-sm-12">
                	<!-- 
                	<c:if test="${flag_NotAdvertiser}" >
	                	<div class="alert alert-info">
		                	${sessionScope.advertiserRoleMsg}
		                </div>
	                </c:if> -->
                	<p>user ID: ${sessionScope.userId} , advertiser ID: ${sessionScope.advertiserId}</p>
                </div>
            </div>
                    
            <div class="row">
                <div class="col-lg-12 col-xs-12 col-sm-12">
                    <div class="portlet light portlet-fit ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="icon-microphone font-dark hide"></i>
                                <span class="caption-subject bold font-dark uppercase"> Choose a business role</span>
                                <span class="caption-helper">default option...</span>
                            </div>
                            <div class="actions">
                                <div class="btn-group btn-group-devided" data-toggle="buttons">
                                    <label class="btn blue btn-outline btn-circle btn-sm active">
                                        <input type="radio" name="options" class="toggle" id="option1">Actions</label>
                                    <label class="btn  blue btn-outline btn-circle btn-sm">
                                        <input type="radio" name="options" class="toggle" id="option2">Tools</label>
                                </div>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="mt-widget-4">
                                        <div class="mt-img-container">
                                            <img src="${webapp_name}/assets/pages/img/background/34.jpg" /> </div>
                                        <div class="mt-container bg-purple-opacity">
                                            <div class="mt-head-title"> Advertiser </div>
                                            <div class="mt-body-icons">
                                                <a href="#">
                                                    <i class=" icon-pencil"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-map"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-trash"></i>
                                                </a>
                                            </div>
                                            <div class="mt-footer-button">
                                                <a href="/acp/advertiser/apply" class="btn btn-circle btn-danger btn-sm">Apply</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="mt-widget-4">
                                        <div class="mt-img-container">
                                            <img src="${webapp_name}/assets/pages/img/background/46.jpg" /> </div>
                                        <div class="mt-container bg-green-opacity">
                                            <div class="mt-head-title"> Distributer </div>
                                            <div class="mt-body-icons">
                                                <a href="#">
                                                    <i class=" icon-social-twitter"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-bubbles"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-bell"></i>
                                                </a>
                                            </div>
                                            <div class="mt-footer-button">
                                                <a href="#" class="btn btn-circle blue-ebonyclay btn-sm">Apply</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="mt-widget-4">
                                        <div class="mt-img-container">
                                            <img src="${webapp_name}/assets/pages/img/background/37.jpg" /> </div>
                                        <div class="mt-container bg-dark-opacity">
                                            <div class="mt-head-title"> Visitor </div>
                                            <div class="mt-body-icons">
                                                <a href="#">
                                                    <i class=" icon-bubbles"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-map"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-cup"></i>
                                                </a>
                                            </div>
                                            <div class="mt-footer-button">
                                                <a href="#" class="btn btn-circle btn-success btn-sm">Apply</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="portlet light portlet-fit ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="icon-microphone font-dark hide"></i>
                                <span class="caption-subject bold font-dark uppercase"> Enter a business role</span>
                                <span class="caption-helper">default option...</span>
                            </div>
                            <div class="actions">
                                <div class="btn-group btn-group-devided" data-toggle="buttons">
                                    <label class="btn blue btn-outline btn-circle btn-sm active">
                                        <input type="radio" name="options" class="toggle" id="option1">Actions</label>
                                    <label class="btn  blue btn-outline btn-circle btn-sm">
                                        <input type="radio" name="options" class="toggle" id="option2">Tools</label>
                                </div>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="mt-widget-4">
                                        <div class="mt-img-container">
                                            <img src="${webapp_name}/assets/pages/img/background/34.jpg" /> </div>
                                        <div class="mt-container bg-purple-opacity">
                                            <div class="mt-head-title"> Advertiser </div>
                                            <div class="mt-body-icons">
                                                <a href="#">
                                                    <i class=" icon-pencil"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-map"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-trash"></i>
                                                </a>
                                            </div>
                                            <div class="mt-footer-button">
                                                <a href="${webapp_name}/advertiser/" class="btn btn-circle btn-danger btn-sm">Enter</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="mt-widget-4">
                                        <div class="mt-img-container">
                                            <img src="${webapp_name}/assets/pages/img/background/46.jpg" /> </div>
                                        <div class="mt-container bg-green-opacity">
                                            <div class="mt-head-title"> Distributer </div>
                                            <div class="mt-body-icons">
                                                <a href="#">
                                                    <i class=" icon-social-twitter"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-bubbles"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-bell"></i>
                                                </a>
                                            </div>
                                            <div class="mt-footer-button">
                                                <a href="#" class="btn btn-circle blue-ebonyclay btn-sm">Enter</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="mt-widget-4">
                                        <div class="mt-img-container">
                                            <img src="${webapp_name}/assets/pages/img/background/37.jpg" /> </div>
                                        <div class="mt-container bg-dark-opacity">
                                            <div class="mt-head-title"> Visitor </div>
                                            <div class="mt-body-icons">
                                                <a href="#">
                                                    <i class=" icon-bubbles"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-map"></i>
                                                </a>
                                                <a href="#">
                                                    <i class=" icon-cup"></i>
                                                </a>
                                            </div>
                                            <div class="mt-footer-button">
                                                <a href="#" class="btn btn-circle btn-success btn-sm">Enter</a>
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
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/moment.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/morris/morris.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/morris/raphael-min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/counterup/jquery.waypoints.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/counterup/jquery.counterup.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/amcharts/amcharts/amcharts.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/amcharts/amcharts/serial.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/amcharts/amcharts/pie.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/amcharts/amcharts/radar.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/amcharts/amcharts/themes/light.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/amcharts/amcharts/themes/patterns.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/amcharts/amcharts/themes/chalk.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/amcharts/ammap/ammap.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/amcharts/ammap/maps/js/worldLow.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/amcharts/amstockcharts/amstock.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/fullcalendar/fullcalendar.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/horizontal-timeline/horizontal-timeline.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/flot/jquery.flot.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/flot/jquery.flot.resize.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/flot/jquery.flot.categories.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery-easypiechart/jquery.easypiechart.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery.sparkline.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/jquery.vmap.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.russia.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.world.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.europe.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.germany.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.usa.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/data/jquery.vmap.sampledata.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/app.min.js"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts/dashboard.min.js"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/global/scripts/quick-sidebar.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/global/scripts/quick-nav.min.js"></script>
<!-- END THEME LAYOUT SCRIPTS -->
<script>
</script>
</body>
</html>