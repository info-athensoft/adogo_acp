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
<title>Adogo | Business Profile - View</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8"/>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<meta name="description" content=""/>
<meta name="author" content="Informatique Athensoft"/>
      
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
            <h1 class="page-title"> Advertiser | Business <small> view profile</small></h1>
            <div class="page-bar">
                <ul class="page-breadcrumb">
					<li><i class="icon-home"></i><a href="${webapp_name}/">Home</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/advertiser/">Advertiser</a><i class="fa fa-angle-right"></i></li>
                    <li><a href="${webapp_name}/advertiser/biz/">Business</a><i class="fa fa-angle-right"></i></li>
                    <li><span>View Business Profiles</span></li>
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
            
            <!-- BEGIN ROW 1 -->
            <div class="row">
                <div class="col-md-12">
                    <div class="portlet light">
                        <div class="portlet-title">
                            <div class="caption">
                                View my business profile <span class="caption-helper">in detail</span>
                            </div>
                            <div class="actions">
                                <a href="${webapp_name}/advertiser/biz/" class="btn btn-circle btn-info">
                                    <span> Goto Business Home </span>
                                </a>
                                <a href="${webapp_name}/advertiser/biz/manage.html" class="btn btn-circle btn-default">
                                    <span> Goto Manage Business Status </span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END ROW 1 -->
            
            <!-- ROW 2 -->
            <div class="row">
            	<!-- BEGIN SECTION 1 -->
            	<div class="col-md-12">
            		<div class="portlet light ">
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
                        	<div class="row">
                        		<div class="col-md-12">
                        			<h4 class="form-section">General Information</h4>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Adogo Business ID: </span>
	                        			<span class="col-md-6">${bizProfile.bizId}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Adogo Advertiser ID: </span>
	                        			<span class="col-md-6">${bizProfile.advertiserId}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Business Name: </span>
	                        			<span class="col-md-6">${bizProfile.bizName}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Business Owner: </span>
	                        			<span class="col-md-6">${bizProfile.bizOwner}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Industry Code: </span>
	                        			<span class="col-md-6">${bizProfile.industryCode} : ${bizProfile.industryName}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Created Date: </span>
	                        			<span class="col-md-6">${bizProfile.createDate}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Last Modified Date: </span>
	                        			<span class="col-md-6">${bizProfile.modifyDate}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Description: </span>
	                        			<span class="col-md-6">${bizProfile.bizDesc}</span>
                        			</div>
                        		</div>
                        		<div class="col-md-12">
                        			<h4 class="form-section">Contact Information</h4>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Phone Number: </span>
	                        			<span class="col-md-6">${bizProfile.bizPhone}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Fax Number: </span>
	                        			<span class="col-md-6">${bizProfile.bizFax}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Email: </span>
	                        			<span class="col-md-6">${bizProfile.bizEmail}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Website: </span>
	                        			<span class="col-md-6">${bizProfile.bizWebsite}</span>
                        			</div>
                        		</div>
                        		<div class="col-md-12">
                        			<h4 class="form-section">Head Office Address</h4>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Address: </span>
	                        			<span class="col-md-6">${hqAddress.streetNo} <span id="streetTypeName"></span> ${hqAddress.streetName} <span id="portTypeName"></span> #${hqAddress.portNo}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> City/Town: </span>
	                        			<span class="col-md-6">${hqAddress.cityName}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Province/State: </span>
	                        			<span class="col-md-6">${hqAddress.provName}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Postal Code/Zip Code: </span>
	                        			<span class="col-md-6">${hqAddress.postalCode}</span>
                        			</div>
                        			<div class="row">
	                        			<span class="col-md-3 bold"> Country: </span>
	                        			<span class="col-md-6">${hqAddress.countryName}</span>
                        			</div>
                        		</div>
                        		<div class="col-md-12">
                        			<h4 class="form-section">Online Presence</h4>
                        			<c:forEach items="${onlinePresenceList}" var="onlinePresence">
                        			<div class="row">
	                        			<span class="col-md-3 bold"> ${onlinePresence.presenceName}: </span>
	                        			<span class="col-md-6">${onlinePresence.presenceURL}</span>
                        			</div>
                        			</c:forEach>
                        		</div>
                        	</div>
                        </div>
                 	</div>
            	</div>
            	<!-- BEGIN SECTION 1 -->
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
<!-- <script type="text/javascript" src="${webapp_name}/assets/global/plugins/bootstrap-tagsinput/bootstrap-tagsinput.min.js"></script>  -->
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/handlebars.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/global/plugins/typeahead/typeahead.bundle.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<!-- <script src="${webapp_name}/assets/global/scripts/app.min.js" type="text/javascript"></script> -->
<script type="text/javascript" src="${webapp_name}/assets/global/scripts/app.js"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<!-- <script type="text/javascript" src="${webapp_name}/assets/pages/scripts/components-bootstrap-tagsinput.min.js"></script> -->
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME LAYOUT SCRIPTS -->
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/layout.min.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/layouts/layout2/scripts/demo.min.js"></script>
<!-- END THEME LAYOUT SCRIPTS -->

<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/bizprofile.js"></script>
<script type="text/javascript" src="${webapp_name}/assets/pages/scripts-local/advertiser/bizprofile-view.js"></script>
<script>
function getStreetTypeName(streetType){
	var streetTypeName = "";
	if(streetType==11) {streetTypeName="Street";}
	if(streetType==21) {streetTypeName="Rue";}
	if(streetType==22) {streetTypeName="Avenue";}
	if(streetType==23) {streetTypeName="Boulvard";}
	return streetTypeName;
}

function getPortTypeName(portType){
	var portTypeName = "";
	if(portType=='1') {portTypeName="Port";}
	if(portType=='2') {portTypeName="Suite";}
	if(portType=='3') {portTypeName="Apt";}
	if(portType=='4') {portTypeName="App";}
	return portTypeName;
}

$(document).ready(function() {
	var a = getStreetTypeName("${hqAddress.streetType}");
	$("#streetTypeName").text(a);
	
	var b = getPortTypeName("${hqAddress.portType}");
	$("#portTypeName").text(b);
});
</script>
</body>
</html>