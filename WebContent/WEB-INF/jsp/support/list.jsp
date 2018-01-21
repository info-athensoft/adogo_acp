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
<title>Adogo | Support - List</title>
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
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/font-awesome/css/font-awesome.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"/>
<!-- END GLOBAL MANDATORY STYLES -->

<!-- BEGIN PAGE LEVEL PLUGINS -->
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/morris/morris.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/fullcalendar/fullcalendar.min.css"/>
<link rel="stylesheet" type="text/css" href="${webapp_name}/assets/global/plugins/jqvmap/jqvmap/jqvmap.css"/>
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
    <!-- HEADER -->
    <div class="clearfix"> </div>
    
    <!-- CONTAINER -->
    <div class="page-container">
        <!-- SIDEBAR -->
        <jsp:include page="${inc_dir}/page-sidebar.jsp"></jsp:include>
        <!-- END SIDEBAR -->
        
        <!-- CONTENT -->
        <div class="page-content-wrapper">
        <!-- CONTENT BODY -->
        <div class="page-content">
            <!-- PAGE HEADER-->
            <h1 class="page-title"> Support</h1>
            <div class="page-bar">
                <ul class="page-breadcrumb">
                    <li><i class="icon-home"></i><a href="${webapp_name}/">Home</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/support/">Support</a><i class="fa fa-angle-right"></i></li>
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
			
			<!-- ROW DATA -->
			<div class="row">
                <div class="col-lg-6 col-xs-12 col-sm-12">
                	<p>User ID: ${sessionScope.userId}</p>
                	<p>Support Size: ${listSupport.size()}</p>
                </div>
            </div>
			<!-- END ROW DATA -->

            <c:if test="${listSupport.size()==0}">
           		<div class="alert alert-info">
                    <strong>INFO:</strong> Not any support available
                </div>
           	</c:if>
            <c:forEach items="${listSupport}" var="sup">
            <div class="row">
                <div class="col-lg-12 col-xs-12 col-sm-12">
                    <div class="portlet light portlet-fit ">
                    
                    	<div class="portlet-body">
                            <div class="row">
                               	
                                <div class="row">
	                             	<div class="col-md-3" >
	                                    <span class="bold">${sup.globalId}</span>
	                                </div>
	                                <div class="col-md-6">
	                                	
	                                	
	                                	<span class="badge badge-info"> Topic ID: ${sup.topicId}</span>
	                                	<!-- <span class="badge badge-danger">${langMapObj.getLangName(booth.langNo)}</span> -->
	                                	<br>
	                                	<span class="bold">${sup.topicTitle}</span>
	                                	<br>
	                                	<span>${sup.topicContent}</span>
	                                </div>
	                                <div class="col-md-3"  style="text-align:right">
	                                	<a href="${webapp_name}/support/edit.html?supportId=${sup.globalId}" class="btn yellow"> Edit </a>
	                                    <a href="javascript:;" class="btn default"> Preview </a>
	                                </div>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            </c:forEach>
                    
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
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
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