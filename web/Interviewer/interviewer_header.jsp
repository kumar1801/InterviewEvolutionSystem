<html>
    <head>
        <meta charset="UTF-8">
        <title>IES-Interviewer</title>
         <link rel="shortcut icon" href="<%=application.getContextPath()%>/Home/images/ico/favicon.png">
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- bootstrap 3.0.2 -->
                <link href="<%=application.getContextPath()%>/visualization/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- font Awesome -->
        <link href="<%=application.getContextPath()%>/visualization/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Ionicons -->
         <!-- validation-->
        <link rel="stylesheet" href="<%=application.getContextPath()%>/visualization/validation/css/bootstrap.min.css">
        <link rel="stylesheet" href="<%=application.getContextPath()%>/visualization/validation/css/formValidation.min.css">
        <script src="<%=application.getContextPath()%>/visualization/validation/js/jquery.min.js"></script>
        <script src="<%=application.getContextPath()%>/visualization/validation/js/formValidation.min.js"></script>
        <script src="<%=application.getContextPath()%>/visualization/validation/js/framework/bootstrap.min.js"></script>
        <!-- end validation-->
        <link href="<%=application.getContextPath()%>/visualization/css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <!-- Morris chart -->
        <link href="<%=application.getContextPath()%>/visualization/css/morris/morris.css" rel="stylesheet" type="text/css" />
        <!-- jvectormap -->
        <link href="<%=application.getContextPath()%>/visualization/css/jvectormap/jquery-jvectormap-1.2.2.css" rel="stylesheet" type="text/css" />
        <!-- fullCalendar -->
        <link href="<%=application.getContextPath()%>/visualization/css/fullcalendar/fullcalendar.css" rel="stylesheet" type="text/css" />
        <!-- Daterange picker -->
        <link href="<%=application.getContextPath()%>/visualization/css/daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css" />
        <!-- Time picker -->
        <link href="<%=application.getContextPath()%>/visualization/css/timepicker/bootstrap-timepicker.min.css" rel="stylesheet"/>
        <!-- bootstrap wysihtml5 - text editor -->
        <link href="<%=application.getContextPath()%>/visualization/css/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css" rel="stylesheet" type="text/css" />
        <!-- iCheck -->
        <link href="<%=application.getContextPath()%>/visualization/css/iCheck/all.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="<%=application.getContextPath()%>/visualization/css/AdminLTE.css" rel="stylesheet" type="text/css" />
        <!--DataTsblr-->
        
        <!-- DATA TABLES -->
        <link href="<%=application.getContextPath()%>/visualization/css/datatables/dataTables.bootstrap.css" rel="stylesheet" type="text/css" />
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->

    </head>
    <body class="skin-blue">
        <!-- header logo: style can be found in header.less -->
        <header class="header">
            <a href="index.html" class="logo">
                <!-- Add the class icon to your logo image or logo icon to add the margining -->
                <img src="<%=application.getContextPath()%>/visualization/img/logo.png">
            </a>
            <!-- Header Navbar: style can be found in header.less -->
            <nav class="navbar navbar-static-top" role="navigation">
                <!-- Sidebar toggle button-->
                <a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas" role="button">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>
                <div class="navbar-right">
                    <ul class="nav navbar-nav">
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="glyphicon glyphicon-user"></i>
                                <span>Niyati Shah <i class="caret"></i></span>
                            </a>
                            <ul class="dropdown-menu">
                                <!-- User image -->
                                <li class="user-header bg-light-blue">
                                    <img src="<%=application.getContextPath()%>/visualization/img/avatar2.png" class="img-circle" alt="User Image" />
                                    <p>
                                        Niyati Shah - Java Developer
                                        <small>Member since Nov. 2014</small>
                                    </p>
                                </li>
                                <!-- Menu Footer-->
                                <li class="user-footer">
                                    <div class="pull-left">
                                        <a href="<%=application.getContextPath()%>/Interviewer/ChangePassword.jsp" class="btn btn-default btn-flat">Change Password</a>
                                    </div>
                                    <div class="pull-right">
                                        <a href="signout" class="btn btn-default btn-flat">Sign out</a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        <div class="wrapper row-offcanvas row-offcanvas-left">
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="left-side sidebar-offcanvas">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">
                    <!-- Sidebar user panel -->
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img src="<%=application.getContextPath()%>/visualization/img/avatar2.png" class="img-circle" alt="User Image" />
                        </div>
                        <div class="pull-left info">
                            <p>Hello, Niyati</p>

                            <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                        </div>
                    </div>
                    <!-- search form -->
                    <form action="#" method="get" class="sidebar-form">
                        <div class="input-group">
                            <input type="text" name="q" class="form-control" placeholder="Search..."/>
                            <span class="input-group-btn">
                                <button type='submit' name='seach' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
                            </span>
                        </div>
                    </form>
                    <!-- /.search form -->
                    <!-- sidebar menu: : style can be found in sidebar.less -->
                    <ul class="sidebar-menu">

                        <li class="active">
                            <a href="<%=application.getContextPath()%>/Interviewer/interviewer_main.jsp">
                                <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                            </a>
                        </li>


                        
                        <li>
                            <a href="resultshow.action">
                                <i class="fa fa-users"></i> <span>Interview</span>
                            </a>
                        </li>
                        <li class="treeview">
                            <a href="#">
                                <i class="fa fa-eye"></i>
                                <span>View</span>
                                <i class="fa fa-angle-left pull-right"></i>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="RegisteredCandidatesRetrive"><i class="fa fa-users"></i> Registered Candidates</a>						</li>
                                <li><a href="ShortlistedCandidatesRetrive"><i class="fa fa-user"></i> Shortlisted Candidates</a></li>
                                
                               
                            </ul>
                        </li>
                        

                        
                    </ul>
                </section>
                <!-- /.sidebar -->
            </aside>
