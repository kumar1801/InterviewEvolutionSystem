<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>IES - Interview Evolution System</title>
    <link href="<%=application.getContextPath()%>/Home/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=application.getContextPath()%>/Home/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=application.getContextPath()%>/Home/css/prettyPhoto.css" rel="stylesheet">
    <link href="<%=application.getContextPath()%>/Home/css/main.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <link rel="shortcut icon" href="<%=application.getContextPath()%>/Home/images/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<%@include file="menu.jsp"%>

    <section class="panel">
            <div class="container">
                <div class="box"> 
                    <div class="headline1">
                        <h5>Job Opening</h5>
                    </div> 
                 <s:if test="#request.jobcode!=null">  
                 <s:iterator value="%{listjod}">
                     <s:if test="jobReferenceCode==#request.jobcode">
                      <header class="panel-heading"><s:property value="getText('global.jobreferenceode')"/> : <s:property value="jobReferenceCode" /></header>
                    <div class="panel-body">
                          
                <ul class="checklist">
                 <li><i class="icon-check"></i>  <s:property value="getText('global.vacancies')"/>              :    <s:property value="vacancies"/></li>
                 <li><i class="icon-check"></i>  <s:property value="getText('global.department')"/>             :    <s:property value="department"/></li>
                 <li><i class="icon-check"></i>  <s:property value="getText('global.ctc')"/>  :    <s:property value="ctc"/></li>
                 <li><i class="icon-check"></i>  <s:property value="getText('global.gender')"/>                 :    <s:property value="gender"/></li>
                 <li><i class="icon-check"></i>  <s:property value="getText('global.jobtype')"/>               :    <s:property value="jobType"/></li>
                 <li><i class="icon-check"></i>  <s:property value="getText('global.posting')"/>                :    <s:property value="posting"/></li>
                 <li><i class="icon-check"></i>  <s:property value="getText('global.requiredqualification')"/> :    <s:iterator value="%{requiedqualifications}">
                      <s:property value="id.requierdQualification"/>,
                 </s:iterator></li>
                 <li><i class="icon-check"></i> <s:property value="getText('global.requireddocument')"/>     :    <s:iterator value="%{requireddocuments}">
                      <s:property value="id.requiredDocuments"/>,
                 </s:iterator></li>
                 
                 <li><i class="icon-check"></i> <s:property value="getText('global.desiredskilled')"/>        :    <s:iterator value="%{desiredskillses}">
                      <s:property value="id.desiredSkills"/>,
                 </s:iterator></li>
                 
                 
                </ul>
                 <ul class="checklist">
                <li><i class="icon-check"></i>  <s:property value="getText('global.address')"/> : <s:property value="street"/>,&nbsp;&nbsp;<s:property value="city"/>;<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="state"/> <s:property value="country"/>,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="pincode"/></li>
                 </ul>  
                     
                 </div>
                      </s:if>
                 </s:iterator>
                </s:if>    
            </div>
            
            <!--/.box-->
        </div><!--/.container-->
        <%@include file="contactus.jsp"%>
    </section><!--/#services-->
    <%@include file="js.jsp" %>
    
