<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>IES - Interview Evolution System</title>
    <link href="<%=application.getContextPath()%>/Home/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=application.getContextPath()%>/Home/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=application.getContextPath()%>/Home/css/prettyPhoto.css" rel="stylesheet">
    <link href="<%=application.getContextPath()%>/Home/css/main.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <!--<link rel="shortcut icon" href="<%=application.getContextPath()%>/Home/images/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-57-precomposed.png">-->
</head><!--/head-->



    <section class="panel">
            <div class="container">
                <div class="box"> 
                    <div class="headline1">
                        <h5>Something went wrong</h5>
                    </div> 
                    <p>Exception Name: <s:property value="exception" /> </p>  
                    <p>Exception Details: <s:property value="exceptionStack" /></p>  
                
            </div>
            
            <!--/.box-->
        </div><!--/.container-->
        
    </section><!--/#services-->
    <%@include file="js.jsp" %>
    