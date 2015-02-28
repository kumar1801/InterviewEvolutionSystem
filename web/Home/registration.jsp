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
        <link rel="shortcut icon" href="<%=application.getContextPath()%>/Home/images/ico/favicon.png">
        <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/Home/css/datepicker-custom.css" />

        <!--Add another Text Field for contact-->
        <script src="<%=application.getContextPath()%>/Home/js/jquery.js"></script>
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
                        <a class="navbar-brand" href="homepage.jsp"></a>
                    </div>
                    <div class="collapse navbar-collapse">
                        <ul class="nav navbar-nav">
                            <li></li>
                            <li class="active"><a href="homepage.jsp"><i class="icon-home"></i></a></li>
                            <li><a href="home">Our Experience</a></li>
                            <li><a href="branchRetrive">Branch</a></li>
                            <li><a href="home">Job Opening</a></li>
                            <li><a href="#registration">Registration</a></li>
                            <li><a href="#contact">Contact</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </header><!--/#header-->
        <section class="panel" id="registration">
            <div class="container">
                <div class="box"> 
                    <div class="headline1">
                        <h5>Registration Form</h5>
                        <s:property value="#session.username"/>
                    </div>
                    <header class="panel-heading">Fill Details  </header>
                    <div class="panel-body">
                        <form class="form-horizontal adminex-form" name="registration" action="registrationsubmit.action" method="post" id="registrationform">
                            <div class="form-group">
                                <label class="col-lg-2 col-sm-2 control-label">Job Reference Code</label>
                                <div class="col-lg-10">

                                    <s:select name="jrc" list="%{listjod}" listKey="jobReferenceCode" listValue="jobReferenceCode" cssClass="form-control"/>
                                </div>
                            </div>
                            <div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Desired-Id</label>
                                    <div class="col-lg-10">
                                        <s:textfield type="text" name="personid" cssClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">User-Name</label>
                                    <div class="col-sm-10">
                                        <s:textfield name="username" cssClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Password</label>
                                    <div class="col-sm-10">
                                        <s:password type="password" placeholder="" cssClass="form-control" name="password" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Confirm-Password</label>
                                    <div class="col-sm-10">
                                        <s:password name="confirmpassword" placeholder="" cssClass="form-control" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Name</label>
                                    <div class="col-lg-10">
                                        <div class="row">
                                            <div class="col-lg-4">
                                                <s:textfield type="text" placeholder="First name" cssClass="form-control" name="fname"  />
                                            </div>
                                            <div class="col-lg-3">
                                                <s:textfield type="text" placeholder="Middle name" cssClass="form-control" name="mname" />
                                            </div>
                                            <div class="col-lg-3">
                                                <s:textfield type="text" placeholder="Last name" cssClass="form-control" name="lname" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">E-mail ID</label>
                                    <div class="col-sm-10">
                                        <s:textfield type="email" cssClass="form-control" placeholder="xyz@pqr.com" name="emailid"/>
                                    </div>
                                </div>
                                <div id="contact_div">
                                    <div class="form-group">
                                        <label class="col-sm-2 col-sm-2 control-label">Contact-No</label>
                                        <div class="col-sm-8">
                                            <s:textfield type="text" placeholder="eg: 800 085 8511" cssClass="form-control" name="contactno" />
                                        </div>
                                        <div class="col-sm-2"><input type="button" id="b1" align="center" class="btn btn-primary" value="+"/></div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-lg-2 col-sm-2 control-label">Date of Birth</label>
                                    <div class="col-md-4 col-xs-11">
                                        <div data-date-viewmode="years" data-date-format="dd-mm-yyyy" data-date="12-02-2014"  class="input-append date dpYears">
                                            <input type="text" readonly value="12-02-2014" size="16" class="form-control" name="dob">
                                            <span class="input-group-btn add-on">
                                                <button class="btn btn-primary" type="button"><i class="icon-calendar"></i></button>
                                            </span> </div>
                                        <span class="help-block">Select date</span> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-lg-2 col-sm-2 control-label">Gender</label>
                                    <div class="col-lg-10">
                                        Male &nbsp;&nbsp;<input type="radio" value="1" id="radio-01" name="gender" checked="" />

                                        &nbsp;&nbsp; Female &nbsp;&nbsp;<input type="radio" value="1" id="radio-02" name="gender"/>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Nationality</label>
                                    <div class="col-lg-4">
                                        <s:textfield type="text" placeholder="eg: Indian" cssClass="form-control" name="nationality" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Street</label>
                                    <div class="col-lg-4">
                                        <s:textfield type="text" cssClass="form-control" name="street" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-lg-2 col-sm-2 control-label">City</label>
                                    <div class="col-lg-10">
                                        <select class="form-control m-bot15" name="city">
                                            <option></option>
                                            <option>Vadodara</option>
                                            <option>Junagadh</option>
                                            <option>Surat</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-lg-2 col-sm-2 control-label">State</label>
                                    <div class="col-lg-10">
                                        <select class="form-control m-bot15" name="state">
                                            <option>Gujarat</option>
                                            <option>Rajshthan</option>
                                            <option>Madhyapradesh</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-lg-2 col-sm-2 control-label">Country</label>
                                    <div class="col-lg-10">
                                        <select class="form-control m-bot15" name="country">
                                            <option>India</option>
                                            <option>US</option>
                                            <option>UK</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Pin-Code</label>
                                    <div class="col-sm-3">
                                        <s:textfield placeholder="Enter.." cssClass="form-control" name="pincode"/>
                                    </div>
                                </div>
                                <label class="col-sm-2 control-label col-lg-2">Language Known</label>
                                <div class="form-group">
                                    <div class="col-lg-12" style="margin-left: 180px;margin-top: 7px; position: absolute">

                                        <input type="checkbox" value="english" id="inlineCheckbox1" name="langknown">
                                        English 

                                        <input type="checkbox" value="gujarati" id="inlineCheckbox2" name="langknown">
                                        Gujarati 

                                        <input type="checkbox" value="hindi" id="inlineCheckbox3" name="langknown">
                                        Hindi

                                        <input type="checkbox" value="other" id="inlineCheckbox3" name="langknown">
                                        Other 
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label">Hobbies</label>
                                    <div class="col-sm-10">
                                        <s:textfield type="text" cssClass="form-control" name="hobbies"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputSuccess" class="col-sm-2 col-sm-2 control-label">Marrital Status</label>
                                    <div class="col-lg-12"  style="margin-left: 180px; position: absolute">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" value="english" id="inlineCheckbox1" name="marritalstatus">
                                            Single </label>
                                        <label class="checkbox-inline">
                                            <input type="checkbox" value="gujarati" id="inlineCheckbox2" name="marritalstatus">
                                            Marries </label>

                                    </div>
                                </div>


                                <div class="form-group">
                                    <label for="inputSuccess" class="col-sm-2 control-label col-lg-2">Acdemic Details</label>
                                </div>

                                <table class="table  table-hover general-table">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>Degree-Type</th>
                                            <th>Institution-Name</th>
                                            <th>Year of Passing</th>
                                            <th>% Obtained</th>

                                        </tr>
                                    </thead>
                                    <tbody>

                                        <tr>
                                            <td>
                                                <a href="#">
                                                    1
                                                </a>
                                            </td>
                                            <td class="hidden-phone">BE</td>
                                            <td>VIER </td>
                                            <td>march-2015</td>
                                            <td>50% Complete (success)</td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="#">
                                                    2
                                                </a>
                                            </td>
                                            <td class="hidden-phone">BE</td>
                                            <td>VIER </td>
                                            <td>march-2015</td>
                                            <td>55% Complete (success)</td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="#">
                                                    3
                                                </a>
                                            </td>
                                            <td class="hidden-phone">BE</td>
                                            <td>VIER </td>
                                            <td>march-2015</td>
                                            <td>70% Complete (success)</td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="#">
                                                    4
                                                </a>
                                            </td>
                                            <td class="hidden-phone">BE</td>
                                            <td>VIER </td>
                                            <td>march-2015</td>
                                            <td>55% Complete (success)</td>
                                        </tr>

                                    </tbody>
                                </table>


                                <!--experience start><-->
                                <div class="form-group">
                                    <label for="inputSuccess" class="col-sm-2 control-label col-lg-2">Work Experience</label>
                                </div>

                                <table class="table  table-hover general-table">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>Organization Name</th>
                                            <th>Responsibility</th>
                                            <th>Designation</th>
                                            <th>Duration in years</th>
                                            <th>Salary drawn]</th>	
                                        </tr>
                                    </thead>
                                    <tbody>

                                        <tr>
                                            <td>
                                                <a href="#">
                                                    1
                                                </a>
                                            </td>
                                            <td class="hidden-phone">BE</td>
                                            <td>VIER </td>
                                            <td>march-2015</td>
                                            <td>50% Complete (success)</td>
                                            <td>50% Complete (success)</td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="#">
                                                    2
                                                </a>
                                            </td>
                                            <td class="hidden-phone">BE</td>
                                            <td>VIER </td>
                                            <td>march-2015</td>
                                            <td>55% Complete (success)</td>
                                            <td>50% Complete (success)</td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="#">
                                                    3
                                                </a>
                                            </td>
                                            <td class="hidden-phone">BE</td>
                                            <td>VIER </td>
                                            <td>march-2015</td>
                                            <td>70% Complete (success)</td>
                                            <td>50% Complete (success)</td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <a href="#">
                                                    4
                                                </a>
                                            </td>
                                            <td class="hidden-phone">BE</td>
                                            <td>VIER </td>
                                            <td>march-2015</td>
                                            <td>55% Complete (success)</td>
                                            <td>50% Complete (success)</td>
                                        </tr>

                                    </tbody>
                                </table>
                                <p>

                                    <s:submit type="submit" data-filter=".bootstrap" value="SUBMIT" cssClass="btn btn-primary btn-btnbig active"/></p>


                                <!--experience end><-->



                        </form>

                    </div>
                </div>

            </div>
        </section>

<s:property value="#map.username"/>





        <!--/#about-us-->

        <section id="contact">
            <div class="container">
                <div class="box last" style="margin-top:-20px;">
                    <div class="row">
                        <!--/.col-sm-6-->
                        <div class="col-sm-6">
                            <h1>Our Address</h1>
                            <div class="row">
                                <div class="col-md-6">
                                    <address>
                                        <strong>Twitter, Inc.</strong><br>
                                        795 Folsom Ave, Suite 600<br>
                                        San Francisco, CA 94107<br>
                                        <abbr title="Phone">P:</abbr> (123) 456-7890
                                    </address>
                                </div>
                                <div class="col-md-6">
                                    <address>
                                        <strong>Twitter, Inc.</strong><br>
                                        795 Folsom Ave, Suite 600<br>
                                        San Francisco, CA 94107<br>
                                        <abbr title="Phone">P:</abbr> (123) 456-7890
                                    </address>
                                </div>
                            </div>
                        </div>

                        <div class="col-sm-6">
                            <h1>Connect with us</h1>
                            <div class="row">
                                <div class="col-md-6">
                                    <ul class="social">
                                        <li><a href="#"><i class="icon-facebook icon-social"></i> Facebook</a></li>
                                        <li><a href="#"><i class="icon-google-plus icon-social"></i> Google Plus</a></li>
                                        <li><a href="#"><i class="icon-pinterest icon-social"></i> Pinterest</a></li>
                                    </ul>
                                </div>
                                <div class="col-md-6">
                                    <ul class="social">
                                        <li><a href="#"><i class="icon-linkedin icon-social"></i> Linkedin</a></li>
                                        <li><a href="#"><i class="icon-twitter icon-social"></i> Twitter</a></li>
                                        <li><a href="#"><i class="icon-youtube icon-social"></i> Youtube</a></li>
                                    </ul>
                                </div>
                            </div>
                       	</div>
                        <!--/.col-sm-6-->
                    </div><!--/.row-->
                </div><!--/.box-->
            </div><!--/.container-->
        </section><!--/#contact-->


        <!-- validation-->
        <link rel="stylesheet" href="<%=application.getContextPath()%>/visualization/validation/css/bootstrap.min.css">
        <link rel="stylesheet" href="<%=application.getContextPath()%>/visualization/validation/css/formValidation.min.css">
        <script src="<%=application.getContextPath()%>/visualization/validation/js/jquery.min.js"></script>
        <script src="<%=application.getContextPath()%>/visualization/validation/js/formValidation.min.js"></script>
        <script src="<%=application.getContextPath()%>/visualization/validation/js/framework/bootstrap.min.js"></script>
        <!--end validation-->

<!--<script src="<%=application.getContextPath()%>/Home/js/jquery.js"></script>--%>
        <script src="<%=application.getContextPath()%>/Home/js/bootstrap.min.js"></script>
        <script src="<%=application.getContextPath()%>/Home/js/jquery.isotope.min.js"></script>
        <script src="<%=application.getContextPath()%>/Home/js/jquery.prettyPhoto.js"></script>
        <script src="<%=application.getContextPath()%>/Home/js/main.js"></script>
        <script src="<%=application.getContextPath()%>/Home/js/accordian.js"></script>
        


        <!--pickers plugins-->
        <script src="<%=application.getContextPath()%>/Home/js/bootstrap-datepicker.js"></script>

        <!--pickers initialization-->
        <script src="<%=application.getContextPath()%>/Home/js/pickers-init.js"></script>


        <!--common scripts for all pages-->
        <script src="<%=application.getContextPath()%>/Home/js/scripts.js"></script>
        <%@include file="validation.jsp" %>
  <script language="javascript">
            $(document).ready(function() {
                $("#b1").click(function(e) { //on add input button click
                    $("#contact_div").append('\
                        <div class="form-group">\n\
                            <label class="col-sm-2 col-sm-2 control-label">Contact-No</label>\n\
                            <div class="col-sm-8">\n\
                                <input type="text" placeholder="eg: 800 085 8511" class="form-control" name="contactno" />\n\
                            </div>\n\
                        </div>'); //add input box
                });
            });
        </script>

    </body>
</html>