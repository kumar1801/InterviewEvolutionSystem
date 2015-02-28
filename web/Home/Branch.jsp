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
        <link href="<%=application.getContextPath()%>/Home/css/main.css" rel="stylesheet">
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

    <body data-spy="scroll" data-target="#navbar" data-offset="0">
        <header id="header" role="banner">
            <div class="container">
                <div id="navbar" class="navbar navbar-default">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="Home/homepage.jsp"></a>
                    </div>
                    <div class="collapse navbar-collapse">
                        <ul class="nav navbar-nav">
                            <li class="active"><a href="#main-slider"><i class="icon-home"></i></a></li>
                            <li><a href="home">Our Experience</a></li>
                            <li><a href="branchRetrive">Branch</a></li>
                            <li><a href="home">Job Opening</a></li>
                            <li><a href="registration">Registration</a></li>

                            <li><a id="loginButton" href="#">Login <i class="icon-chevron-down"></i></a>
                                <div id="loginBox">                
                                    <form id="loginForm" action="login" method="post">
                                        <fieldset id="body">
                                            <fieldset>
                                                <input placeholder="Desired-ID" type="text" name="username" id="desiredid" />
                                            </fieldset>
                                            <fieldset>
                                                <input placeholder="Password" type="password" name="password" id="password" />
                                            </fieldset>

                                            <input type="submit" id="login" value="Sign in here" />
                                            <label><input type="checkbox" id="checkbox"/>Remember me</label>
                                        </fieldset>
                                        <span><a href="#">Forgot your password?</a></span>
                                    </form>
                                </div>
                            </li>
                            <li><a href="#contact">Contact</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </header><!--/#header-->


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
                                            branchtype:<s:property value="branchtype"></s:property><br/>
                                            pincode<s:property value="pincode"></s:property>
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

    <section id="contact">
        <div class="container">
            <div class="box last">
                <div class="row">
                    <!--/.col-sm-6-->
                    <div class="col-sm-6">
                        <h1>Our Address</h1>
                        <div class="row">
                            <div class="col-md-6">
                                <address>
                                    <strong>Junagadh,Gujarat,India</strong><br>
                                    F-302 Surbhi Appartment<br/>
                                    Behind dipanjali society<br/>
                                    <abbr title="Phone">P:</abbr> 9409430960
                                </address>
                            </div>
                            <div class="col-md-6">
                                <address>
                                    <strong>Vadodara,Gujarat,India</strong><br>
                                    A-8 Vrajdham Soc;<br>
                                    Ajwa Road<br>
                                    <abbr title="Phone">P:</abbr> 8000858511
                                </address>
                            </div>
                        </div>
                    </div>
                        
                        <div class="col-sm-6">
                        <h1>Connect with us</h1>
                        <div class="row">
                            <div class="col-md-6">
                                <ul class="social">
                                    <li><a href="<%=application.getContextPath()%>/www.facebook.com"><i class="icon-facebook icon-social"></i> Facebook</a></li>
                                    <li><a href="<%=application.getContextPath()%>/www.google.com"><i class="icon-google-plus icon-social"></i> Google Plus</a></li>
                                    <li><a href="<%=application.getContextPath()%>/www.pinterest.com"><i class="icon-pinterest icon-social"></i> Pinterest</a></li>
                                </ul>
                            </div>
                            <div class="col-md-6">
                                <ul class="social">
                                    <li><a href="<%=application.getContextPath()%>/www.linkedin.com"><i class="icon-linkedin icon-social"></i> Linkedin</a></li>
                                    <li><a href="<%=application.getContextPath()%>/www.twitter.com"><i class="icon-twitter icon-social"></i> Twitter</a></li>
                                    <li><a href="<%=application.getContextPath()%>/www.youtube.com"><i class="icon-youtube icon-social"></i> Youtube</a></li>
                                </ul>
                            </div>
                        </div>
                       	</div>
                        
                    <!--/.col-sm-6-->
                </div><!--/.row-->
            </div><!--/.box-->
        </div><!--/.container-->
    </section><!--/#contact-->

        <!-- jQuery 2.0.2 -->
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
        <!-- Bootstrap -->
        <script src="<%=application.getContextPath()%>/visualization/js/bootstrap.min.js" type="text/javascript"></script>
        <!-- AdminLTE App -->
        <script src="<%=application.getContextPath()%>/visualization/js/AdminLTE/app.js" type="text/javascript"></script>
        <script src="<%=application.getContextPath()%>/Home/js/login.js"></script>
    </body>
</html>
