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
<title>Adogo | Advertiser - Dashboard</title>
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
        <div class="page-header-inner">
	        <!-- LOGO -->
	        <jsp:include page="${inc_dir}/page-logo.jsp"></jsp:include>
	        <!-- RESPONSIVE MENU TOGGLER -->
	        <a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"> </a>
	        <!-- PAGE ACTIONS -->
	        <jsp:include page="${inc_dir}/page-action.jsp"></jsp:include>
	        <!-- END PAGE ACTIONS -->
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
            <h1 class="page-title"> Support | Dashboard <small>summary of statistics</small></h1>
            <div class="page-bar">
                        <ul class="page-breadcrumb">
                            <li><i class="icon-home"></i><a href="${webapp_name}/">Home</a><i class="fa fa-angle-right"></i></li>
                            <li><a href="${webapp_name}/advertiser/">Advertiser</a><i class="fa fa-angle-right"></i></li>
                            <li><span>Dashboard</span></li>
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
            
            <!-- ROW SUMMARY -->
            <div class="row">
                <div class="col-lg-12 col-xs-12 col-sm-12">
                    <div class="portlet light portlet-fit ">
                        <div class="portlet-title">
                            <div class="caption">
                            	<i class="icon-microphone font-dark hide"></i>
                                <span class="caption-subject bold font-dark uppercase"> Summary </span>
                                <span class="caption-helper"></span>
                            </div>
                            <div class="actions">
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="row">
                                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
				                    <div class="dashboard-stat2 ">
				                        <div class="display">
				                            <div class="number">
				                                <h3 class="font-green-sharp">
				                                	<span data-counter="counterup" data-value="3">0</span>
				                                    <small class="font-green-sharp"></small>
				                                </h3>
				                                <small>Number of Business</small>
				                            </div>
				                            <div class="icon">
				                            	<i class="icon-pie-chart"></i>
				                            </div>
				                        </div>
				                        <div class="progress-info">
				                                    <div class="progress">
				                                        <span style="width: 100%;" class="progress-bar progress-bar-success green-sharp">
				                                            <span class="sr-only">100% progress</span>
				                                        </span>
				                                    </div>
				                                    <div class="status">
				                                        <div class="status-title"> progress </div>
				                                        <div class="status-number"> 100% </div>
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
				                                <small>TOTAL VIEWS</small>
				                            </div>
		                                    <div class="icon">
		                                        <i class="icon-like"></i>
		                                    </div>
				                        </div>
				                        <div class="progress-info">
		                                    <div class="progress">
		                                        <span style="width: 100%;" class="progress-bar progress-bar-success red-haze">
		                                            <span class="sr-only">100% change</span>
		                                        </span>
		                                    </div>
		                                    <div class="status">
		                                        <div class="status-title"> change </div>
		                                        <div class="status-number"> 100% </div>
		                                    </div>
				                        </div>
				                    </div>
				                </div>
				                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
				                    <div class="dashboard-stat2">
				                        <div class="display">
		                                    <div class="number">
		                                        <h3 class="font-blue-sharp">
		                                            <span data-counter="counterup" data-value="567"></span>
		                                        </h3>
		                                        <small>TOTAL AD POSTS</small>
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
		                                        <small>TOTAL FOLLOWERS</small>
		                                    </div>
		                                    <div class="icon">
		                                        <i class="icon-user"></i>
		                                    </div>
				                        </div>
				                        <div class="progress-info">
		                                    <div class="progress">
		                                        <span style="width: 100%;" class="progress-bar progress-bar-success purple-soft">
		                                            <span class="sr-only">100% change</span>
		                                        </span>
		                                    </div>
		                                    <div class="status">
		                                        <div class="status-title"> change </div>
		                                        <div class="status-number"> 100% </div>
		                                    </div>
				                        </div>
				                    </div>
				                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
			<!-- END ROW SUMMARY -->
			
			<!-- ROW TODAY SUMMARY -->
            <div class="row">
            	<div class="col-lg-12 col-xs-12 col-sm-12">
                    <div class="portlet light portlet-fit ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="icon-microphone font-dark hide"></i>
                                <span class="caption-subject bold font-dark uppercase"> Today's Summary </span>
                                <span class="caption-helper"></span>
                            </div>
                            <div class="actions">
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="row">
                                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
				                    <div class="dashboard-stat2 ">
				                        <div class="display">
		                                    <div class="number">
		                                        <h3 class="font-green-sharp">
		                                            <span data-counter="counterup" data-value="51">0</span>
		                                            <small class="font-green-sharp"></small>
		                                        </h3>
		                                        <small>New Visits</small>
		                                    </div>
		                                    <div class="icon">
		                                        <i class="icon-pie-chart"></i>
		                                    </div>
				                        </div>
				                        <div class="progress-info">
				                        	<div class="progress">
		                                        <span style="width: 100%;" class="progress-bar progress-bar-success green-sharp">
		                                            <span class="sr-only">100% progress</span>
		                                        </span>
				                            </div>
		                                    <div class="status">
		                                        <div class="status-title"> progress </div>
		                                        <div class="status-number"> 100% </div>
		                                    </div>
		                                </div>
				                    </div>
				                </div>
				                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
				                    <div class="dashboard-stat2 ">
				                        <div class="display">
		                                    <div class="number">
		                                        <h3 class="font-red-haze">
		                                            <span data-counter="counterup" data-value="236">0</span>
		                                        </h3>
		                                        <small>TOTAL Visits</small>
		                                    </div>
		                                    <div class="icon">
		                                        <i class="icon-like"></i>
		                                    </div>
				                        </div>
				                        <div class="progress-info">
		                                    <div class="progress">
		                                        <span style="width: 100%;" class="progress-bar progress-bar-success red-haze">
		                                            <span class="sr-only">100% change</span>
		                                        </span>
		                                    </div>
		                                    <div class="status">
		                                        <div class="status-title"> change </div>
		                                        <div class="status-number"> 100% </div>
		                                    </div>
		                                </div>
				                    </div>
				                </div>
				                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
				                    <div class="dashboard-stat2 ">
				                        <div class="display">
		                                    <div class="number">
		                                        <h3 class="font-blue-sharp">
		                                            <span data-counter="counterup" data-value="3"></span>
		                                        </h3>
		                                        <small>NEW AD POSTS</small>
		                                    </div>
		                                    <div class="icon">
		                                        <i class="icon-basket"></i>
		                                    </div>
				                        </div>
				                        <div class="progress-info">
		                                    <div class="progress">
		                                        <span style="width: 100%;" class="progress-bar progress-bar-success blue-sharp">
		                                            <span class="sr-only">100% grow</span>
		                                        </span>
		                                    </div>
		                                    <div class="status">
		                                        <div class="status-title"> grow </div>
		                                        <div class="status-number"> 100% </div>
		                                    </div>
		                                </div>
				                    </div>
				                </div>
				                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
				                    <div class="dashboard-stat2 ">
				                        <div class="display">
		                                    <div class="number">
		                                        <h3 class="font-purple-soft">
		                                            <span data-counter="counterup" data-value="39"></span>
		                                        </h3>
		                                        <small>NEW FOLLOWERS</small>
		                                    </div>
		                                    <div class="icon">
		                                        <i class="icon-user"></i>
		                                    </div>
				                        </div>
			                            <div class="progress-info">
		                                    <div class="progress">
		                                        <span style="width: 100%;" class="progress-bar progress-bar-success purple-soft">
		                                            <span class="sr-only">100% change</span>
		                                        </span>
		                                    </div>
		                                    <div class="status">
		                                        <div class="status-title"> change </div>
		                                        <div class="status-number"> 100% </div>
		                                    </div>
			                            </div>
				                    </div>
				                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
			<!-- ROW TODAY SUMMARY -->
			
            <!-- ROW BIZ-->
            <div class="row">
            	<div class="col-lg-12 col-xs-12 col-sm-12">
                    <div class="portlet light ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="icon-bar-chart font-dark hide"></i>
                                <span class="caption-subject font-dark bold uppercase">BUSINESS STATISTICS</span>
                                <span class="caption-helper"></span>
                            </div>
                            <div class="actions">
                                <div class="btn-group btn-group-devided" data-toggle="buttons">
                                    <label class="btn btn-transparent blue-oleo btn-no-border btn-outline btn-circle btn-sm active">
                                        <input type="radio" name="options" class="toggle" id="option1">Today</label>
                                    <label class="btn btn-transparent blue-oleo btn-no-border btn-outline btn-circle btn-sm">
                                        <input type="radio" name="options" class="toggle" id="option2">Week</label>
                                    <label class="btn btn-transparent blue-oleo btn-no-border btn-outline btn-circle btn-sm">
                                        <input type="radio" name="options" class="toggle" id="option2">Month</label>
                                </div>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="table-scrollable table-scrollable-borderless">
                                <table class="table table-hover table-light">
                                    <thead>
                                    	<tr class="uppercase">
                                        	<th colspan="2"> Booth Name</th>
                                            <th> Visits </th>
                                    		<th> Followers </th>
                                        	<th> Likes </th>
                                        	<th> Score </th>
                                        </tr>
                                    </thead>
                                    <tr>
                                    	<td class="fit">
                                    		<img class="user-pic rounded" src="${webapp_name}/assets/pages/media/users/avatar4.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">Booth-FR</a></td>
                                        <td> $345 </td>
                                        <td> 45 </td>
                                        <td> 124 </td>
                                        <td><span class="bold theme-font">80%</span></td>
                                    </tr>
                                    <tr>
                                        <td class="fit">
                                            <img class="user-pic rounded" src="${webapp_name}/assets/pages/media/users/avatar5.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">Booth-EN</a></td>
                                        <td> $560 </td>
                                        <td> 12 </td>
                                        <td> 24 </td>
                                        <td><span class="bold theme-font">67%</span></td>
                                    </tr>
                                    <tr>
                                        <td class="fit">
                                        	<img class="user-pic rounded" src="${webapp_name}/assets/pages/media/users/avatar6.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">Booth-CHS</a></td>
                                        <td> $1,345 </td>
                                        <td> 450 </td>
                                        <td> 46 </td>
                                        <td><span class="bold theme-font">98%</span></td>
                                    </tr>
                                    <tr>
                                        <td class="fit">
                                            <img class="user-pic rounded" src="${webapp_name}/assets/pages/media/users/avatar7.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">Booth-CHT</a></td>
                                        <td> $645 </td>
                                        <td> 50 </td>
                                        <td> 89 </td>
                                        <td><span class="bold theme-font">58%</span></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END ROW BIZ-->
                    
            <!-- ROW BOOTH-->
            <div class="row">
                <div class="col-lg-12 col-xs-12 col-sm-12">
                    <div class="portlet light ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="icon-bar-chart font-dark hide"></i>
                                <span class="caption-subject font-dark bold uppercase">BOOTH STATISTICS</span>
                                <span class="caption-helper">BUSINESS A</span>
                            </div>
                            <div class="actions">
                                <div class="btn-group btn-group-devided" data-toggle="buttons">
                                    <label class="btn btn-transparent blue-oleo btn-no-border btn-outline btn-circle btn-sm active">
                                        <input type="radio" name="options" class="toggle" id="option1">Today</label>
                                    <label class="btn btn-transparent blue-oleo btn-no-border btn-outline btn-circle btn-sm">
                                        <input type="radio" name="options" class="toggle" id="option2">Week</label>
                                    <label class="btn btn-transparent blue-oleo btn-no-border btn-outline btn-circle btn-sm">
                                        <input type="radio" name="options" class="toggle" id="option2">Month</label>
                                </div>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="table-scrollable table-scrollable-borderless">
                                <table class="table table-hover table-light">
                                    <thead>
                                        <tr class="uppercase">
                                            <th colspan="2"> Booth Name</th>
                                            <th> Visits </th>
                                            <th> Followers </th>
                                            <th> Likes </th>
                                            <th> Score </th>
                                        </tr>
                                    </thead>
                                    <tr>
                                        <td class="fit">
                                            <img class="user-pic rounded" src="../assets/pages/media/users/avatar4.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">Booth-FR</a></td>
                                        <td> $345 </td>
                                        <td> 45 </td>
                                        <td> 124 </td>
                                        <td><span class="bold theme-font">80%</span></td>
                                    </tr>
                                    <tr>
                                        <td class="fit">
                                            <img class="user-pic rounded" src="../assets/pages/media/users/avatar5.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">Booth-EN</a></td>
                                        <td> $560 </td>
                                        <td> 12 </td>
                                        <td> 24 </td>
                                        <td><span class="bold theme-font">67%</span></td>
                                    </tr>
                                    <tr>
                                        <td class="fit">
                                            <img class="user-pic rounded" src="../assets/pages/media/users/avatar6.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">Booth-CHS</a></td>
                                        <td> $1,345 </td>
                                        <td> 450 </td>
                                        <td> 46 </td>
                                        <td><span class="bold theme-font">98%</span></td>
                                    </tr>
                                    <tr>
                                        <td class="fit">
                                            <img class="user-pic rounded" src="../assets/pages/media/users/avatar7.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">Booth-CHT</a>
                                        </td>
                                        <td> $645 </td>
                                        <td> 50 </td>
                                        <td> 89 </td>
                                        <td><span class="bold theme-font">58%</span></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END ROW BOOTH-->
                    
            <!-- ROW ADPOST-->
            <div class="row">
                <div class="col-lg-12 col-xs-12 col-sm-12">
                    <div class="portlet light ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="icon-bar-chart font-dark hide"></i>
                                <span class="caption-subject font-dark bold uppercase">AD POST STATISTICS</span>
                                <span class="caption-helper">BUSINESS A</span>
                            </div>
                            <div class="actions">
                                <div class="btn-group btn-group-devided" data-toggle="buttons">
                                    <label class="btn btn-transparent blue-oleo btn-no-border btn-outline btn-circle btn-sm active">
                                        <input type="radio" name="options" class="toggle" id="option1">Today</label>
                                    <label class="btn btn-transparent blue-oleo btn-no-border btn-outline btn-circle btn-sm">
                                        <input type="radio" name="options" class="toggle" id="option2">Week</label>
                                    <label class="btn btn-transparent blue-oleo btn-no-border btn-outline btn-circle btn-sm">
                                        <input type="radio" name="options" class="toggle" id="option2">Month</label>
                                </div>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="table-scrollable table-scrollable-borderless">
                                <table class="table table-hover table-light">
                                    <thead>
                                        <tr class="uppercase">
                                            <th colspan="2"> Ad Post Title</th>
                                            <th> Language </th>
                                            <th> Visits </th>
                                            <th> Comments </th>
                                            <th> Likes </th>
                                        </tr>
                                    </thead>
                                    <tr>
                                        <td class="fit">
                                            <img class="user-pic rounded" src="../assets/pages/media/users/avatar4.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">AdPost title</a></td>
                                        <td> FR </td>
                                        <td> 450 </td>
                                        <td> 124 </td>
                                        <td><span class="bold theme-font">50</span></td>
                                    </tr>
                                    <tr>
                                        <td class="fit">
                                            <img class="user-pic rounded" src="../assets/pages/media/users/avatar5.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">AdPost title</a></td>
                                        <td> EN </td>
                                        <td> 12 </td>
                                        <td> 24 </td>
                                        <td><span class="bold theme-font">29</span></td>
                                    </tr>
                                    <tr>
                                        <td class="fit">
                                            <img class="user-pic rounded" src="../assets/pages/media/users/avatar6.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">AdPost title</a></td>
                                        <td> CHS </td>
                                        <td> 450 </td>
                                        <td> 46 </td>
                                        <td><span class="bold theme-font">49</span></td>
                                    </tr>
                                    <tr>
                                        <td class="fit">
                                            <img class="user-pic rounded" src="../assets/pages/media/users/avatar7.jpg"> </td>
                                        <td><a href="javascript:;" class="primary-link">AdPost title</a></td>
                                        <td> CHT </td>
                                        <td> 50 </td>
                                        <td> 89 </td>
                                        <td><span class="bold theme-font">58</span></td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END ROW ADPOST-->
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
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/moment.min.js" type="text/javascript"></script>
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