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
<title>Adogo | Booth - Index</title>
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
            <h1 class="page-title"> Advertiser | Booth <small>home</small></h1>
            <div class="page-bar">
                <ul class="page-breadcrumb">
                    <li><i class="icon-home"></i><a href="${webapp_name}/">Home</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/advertiser/">Advertiser</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/advertiser/booth/">Booth</a><i class="fa fa-angle-right"></i></li>
                    <li><span>Booth Home</span></li>
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

            <!-- ROW 1 -->        
            <div class="row">
                <div class="col-md-12">
                    <div class="portlet light portlet-fit ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class=" icon-layers font-green"></i>
                                <span class="caption-subject font-green bold uppercase">Quick steps - Publish a booth</span>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="mt-element-step">
                                <div class="row step-thin">
                                	<!--  
                                    <div class="mt-step-desc">
                                        <div class="font-dark bold uppercase">Publish a booth</div>
                                        <div class="caption-desc font-grey-cascade"></div>
                                    </div> -->
                                    <div class="col-md-4 bg-grey mt-step-col done">
                                        <div class="mt-step-number bg-white font-grey">1</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Choose Business</div>
                                        <div class="mt-step-content font-grey-cascade">Choose a business</div>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col">
                                        <div class="mt-step-number bg-white font-grey">2</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Create Booth</div>
                                        <div class="mt-step-content font-grey-cascade">Input booth details</div>
                                    </div>
                                    <div class="col-md-4 bg-grey mt-step-col">
                                        <div class="mt-step-number bg-white font-grey">3</div>
                                        <div class="mt-step-title uppercase font-grey-cascade">Publish Booth</div>
                                        <div class="mt-step-content font-grey-cascade">Activate and publish</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
     		<!-- END ROW 1 -->
     		
            <!-- ROW 2 -->
            <c:forEach items="${listVOBizProfileBooth}" var="voBizProfileBooth">
            <div class="row">
                <div class="col-lg-12 col-xs-12 col-sm-12">
                    <div class="portlet light portlet-fit ">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="icon-microphone font-dark hide"></i>
                                <span class="caption-subject bold font-dark uppercase"> ${voBizProfileBooth.bizProfile.bizName}</span>
                                <span class="caption-helper"> </span>
                            </div>
                            <div class="actions">
                                <a href="${webapp_name}/advertiser/booth/create.html?bizId=${voBizProfileBooth.bizProfile.bizId}" class="btn btn-circle btn-info">
                                	<span> Create a booth </span>
                             	</a>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="row">
                    			<span class="col-md-3 bold"> Adogo Business ID: </span>
                    			<span class="col-md-6">${voBizProfileBooth.bizProfile.bizId}</span>
                   			</div>
                   			<div class="row">
                    			<span class="col-md-3 bold"> Business Name: </span>
                    			<span class="col-md-6">${voBizProfileBooth.bizProfile.bizName}</span>
                   			</div>
                   			<div class="row">
                    			<span class="col-md-3 bold"> Industry Code: </span>
                    			<span class="col-md-6">${voBizProfileBooth.bizProfile.industryCode} : ${voBizProfileBooth.bizProfile.industryName}</span>
                   			</div>
                   			<div class="row">
                    			<span class="col-md-3 bold"> Business Profile Status: </span>
                    			<c:choose>
									<c:when test = "${voBizProfileBooth.bizProfile.bizStatus == 1}">
										<span class="caption-helper col-md-6"><a class="btn btn-xs yellow">CREATED</a></span>
									</c:when>
							    	<c:when test = "${voBizProfileBooth.bizProfile.bizStatus == 2}">
							        	<span class="caption-helper col-md-6"><a class="btn btn-xs green-jungle">PUBLISHED</a></span>
							    	</c:when>
							    	<c:when test = "${voBizProfileBooth.bizProfile.bizStatus == 3}">
							            <span class="caption-helper col-md-6"><a class="btn btn-xs grey">DISABLED</a></span>
							    	</c:when>
							     	<c:when test = "${voBizProfileBooth.bizProfile.bizStatus == 4}">
							            <span class="caption-helper col-md-6"><a class="btn btn-xs red">TRASHED</a></span>
							    	</c:when>
							    	<c:when test = "${voBizProfileBooth.bizProfile.bizStatus == 5}">
							            <span class="caption-helper col-md-6"><a class="btn btn-xs purple">SUSPENDED</a></span>
							    	</c:when>
							   		<c:when test = "${voBizProfileBooth.bizProfile.bizStatus == 6}">
							        	<span class="caption-helper col-md-6"><a class="btn btn-xs red">BANNED</a></span>
							    	</c:when>
							    	<c:otherwise>
							            <span class="caption-helper col-md-6"><a class="btn btn-xs grey">UNKNOWN</a></span>
							     	</c:otherwise>
							    </c:choose>
                   			</div>
                        </div>
                    	
                    	<!-- TEST -->
                    	<div class="portlet-body">
                            <div class="row">
                               	<c:if test="${voBizProfileBooth.listBooth.size()==0}">
                               		<div class="alert alert-info">
                                        <strong>INFO:</strong> Not any booth yet, please create booths for the business
                                    </div>
                               	</c:if>
                                <c:forEach items="${voBizProfileBooth.listBooth}" var="booth">
                                <hr/>
                                <div class="row">
	                             	<div class="col-md-3" style="text-align:center">
	                                    <img src="${webapp_name}/assets/athensoft/booth-logo/01.jpg" alt="" style="width: 80%;">
	                                </div>
	                                <div class="col-md-6">
	                                	<span class="bold">${booth.boothName}</span>
	                                	<p>
	                                	<span class="badge badge-info"> Booth ID: ${booth.boothId}</span>
	                                	<span class="badge badge-danger">${langMapObj.getLangName(booth.langNo)}</span>
	                                	</p>
	                                	<p>${booth.bizDesc}</p>
	                                </div>
	                                <div class="col-md-3"  style="text-align:right">
	                                	<a href="/acp/advertiser/booth/edit.html?boothId=${booth.boothId}" class="btn yellow"> Edit </a>
	                                    <a href="javascript:;" class="btn default"> Preview </a>
	                                </div>
                                </div>
                                <div><p></p></div>
                                </c:forEach>
                                
                            </div>
                        </div>
                    	<!-- END TEST -->
                    </div>
                </div>
            </div>
            </c:forEach>
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