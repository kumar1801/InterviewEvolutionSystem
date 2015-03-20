<%-- 
    Document   : Branch
    Created on : 21 Feb, 2015, 7:35:42 AM
    Author     : Jyotil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>IES - <s:property value="getText('global.ies')"/></title>
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
                        <h5>Branch</h5>
                    </div> 
                  
                 <s:iterator value="%{branchdetail}">
                    
                      <header class="panel-heading">Branch-ID : <s:property value="branchid"/></header>
                    <div class="panel-body">
                          
                <ul class="checklist">
                 <li><i class="icon-check"></i>  Branch-Type              :    <s:property value="branchtype"/></li>
                 <li><i class="icon-check"></i>  Street             :    <s:property value="street"/></li>
                 <li><i class="icon-check"></i>  Organization Name  :    <s:property value="orgname"/></li>
                 <li><i class="icon-check"></i>  City                 :    <s:property value="city"/></li>
                 <li><i class="icon-check"></i>  Zip code               :    <s:property value="pincode"/></li>
                 <li><i class="icon-check"></i>  State               :    <s:property value="state"/></li>
                 <li><i class="icon-check"></i>  Required Qualification :    <s:iterator value="%{requiedqualifications}">
                      <s:property value="id.requierdQualification"/>,
                 </s:iterator></li>
                 
                 
                
                 
                </ul>
                
                     
                 </div>
                     
                 </s:iterator>
                  
            </div>
            
            <!--/.box-->
        </div><!--/.container-->
        <%@include file="contactus.jsp"%>
    </section><!--/#services-->

                </div><!--/.box-->
            </div><!--/.container-->
    </section><!--/#portfolio-->
    <!--/#about-us-->

   
    <!-- jQuery 2.0.2 -->
      <%@include file="js.jsp" %>
</body>
</html>
