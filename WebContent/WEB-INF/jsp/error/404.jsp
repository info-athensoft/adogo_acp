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
<title>Adogo | Business Profile - Disable</title>
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
        
	<!-- CONTAINER -->
	<div class="page-container">
    	<!-- SIDEBAR -->
    	<jsp:include page="${inc_dir}/page-sidebar.jsp"></jsp:include>
                
    	<!-- CONTENT -->
    	<div class="page-content-wrapper">
        <!-- CONTENT BODY -->
        <div class="page-content">
        	<!-- PAGE HEADER-->
        	<h1 class="page-title"> ADOGO | 404 ERROR<small> page not found </small>
                    </h1>
        	<div class="page-bar">
	            <ul class="page-breadcrumb">
	                <li><i class="icon-home"></i><a href="${webapp_name}/">Home</a></li>
	            </ul>
                <div class="page-toolbar">
                    <div class="btn-group pull-right">
                        <button type="button" class="btn btn-fit-height grey-salt dropdown-toggle" 
                        		data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">
								Quick Links <i class="fa fa-angle-down"></i>
                        </button>
                        <ul class="dropdown-menu pull-right" role="menu">
                        	<li><a href="${webapp_name}/advertiser/"><i class="icon-bag"></i> Advertiser Dashboard</a></li>
                		</ul>
                    </div>
                </div>
            </div>
        	<!-- END PAGE HEADER-->
            
            <!-- ROW DATA -->
            
            <!-- END ROW DATA -->
            
        	<!-- ROW 1 -->
		    <div class="row">
                <div class="col-md-12">
                    <div class="portlet light">
                        <div class="portlet-title">
                            <div class="caption">
                                Page not found <span class="caption-helper"> 404 error </span>
                            </div>
                            <div class="actions">
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>
		    <!-- END ROW 1 -->
                    
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
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/moment.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/morris/morris.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/morris/raphael-min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/counterup/jquery.waypoints.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/counterup/jquery.counterup.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/flot/jquery.flot.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/flot/jquery.flot.resize.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/flot/jquery.flot.categories.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/app.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts/dashboard.min.js"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js"></script>
<!-- END THEME LAYOUT SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<!-- END PAGE LEVEL SCRIPTS -->
<script>
</script>
</body>
</html>