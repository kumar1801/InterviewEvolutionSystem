<%-- 
    Document   : Branch
    Created on : 21 Feb, 2015, 7:35:42 AM
    Author     : Jyotil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Job Opening</title>
        <link href="<%=application.getContextPath()%>/visualization/css/bootstrap.min.css" rel="stylesheet">
        <link href="<%=application.getContextPath()%>/visualization/css/font-awesome.min.css" rel="stylesheet">
        <link href="<%=application.getContextPath()%>/Home/css/prettyPhoto.css" rel="stylesheet">
        <link href="<%=application.getContextPath()%>/Home/css/main.css" rel="stylesheet">
        <link href="<%=application.getContextPath()%>/Home/css/font-awesome.min.css" rel="stylesheet">
        <link href="<%=application.getContextPath()%>/visualization/css/AdminLTE.css" rel="stylesheet" type="text/css" />
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


    <section id="Branch">
        <div class="container wrapper row-offcanvas row-offcanvas-left">
            <div class="box">
                <div class="center gap">
                    <h2>Branch</h2>
                    <p class="lead">Organization have Different branch</p>

                    <%-- Accordation Start --%>
                    <section class="content">
                        <div class="row">
                            <s:iterator value="%{branchdetail}">
                                <div class="col-md-12">
                                    <!-- Primary box -->
                                    <div class="box box-solid box-primary">
                                        <div class="box-header">
                                            <h3 class="box-title" style="color: white"><s:property value="branchid"></s:property></h3>
                                                <div class="box-tools pull-right">
                                                    <button class="btn btn-primary btn-sm" data-widget="collapse"><i class="fa fa-minus"></i></button>
                                                    <button class="btn btn-primary btn-sm" data-widget="remove"><i class="fa fa-times"></i></button>
                                                </div>
                                            </div>
                                            <label title="Branch-ID"></label>
                                            <div class="box-body">
                                                <table width='85%' style="font-size: large; margin-top: -28px; margin-bottom: -50px;">
                                                    <tr>
                                                        <td>Branch Type:&nbsp;&nbsp;<s:property value="branchtype"></s:property></td>
                                                        <td>Street:&nbsp;&nbsp;<s:property value="street"></s:property></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Organization Name:&nbsp;&nbsp;<s:property value="orgname"></s:property></td>
                                                        <td>City:&nbsp;&nbsp;<s:property value="city"></s:property></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Zip-code:&nbsp;&nbsp;<s:property value="pincode"></s:property></td>
                                                        <td>State:&nbsp;&nbsp;<s:property value="state"></s:property></td>
                                                    </tr>
                                                </table>
                                            </div><!-- /.box-body -->
                                        </div><!-- /.box -->
                                    </div><!-- /.col -->
                            </s:iterator>
                        </div>
                    </section>
                    <%-- Accordation End --%>

                </div><!--/.box-->
            </div><!--/.container-->
    </section><!--/#portfolio-->
    <!--/#about-us-->

    <%@include file="contactus.jsp" %>
    <!-- jQuery 2.0.2 -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="<%=application.getContextPath()%>/visualization/js/bootstrap.min.js" type="text/javascript"></script>
    <!-- AdminLTE App -->
    <script src="<%=application.getContextPath()%>/visualization/js/AdminLTE/app.js" type="text/javascript"></script>
    <script src="<%=application.getContextPath()%>/Home/js/login.js"></script>
</body>
</html>
