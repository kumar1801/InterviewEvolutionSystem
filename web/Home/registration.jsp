<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="dynamicscript.jsp"%>
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

  <%@include file="menu.jsp"%>
        <section class="panel" id="registration">
            <div class="container">
                <div class="box"> 
                    <div class="headline1">
                        <h5><s:property value="getText('global.registrationform')"/></h5>
                    </div>
                    <header class="panel-heading">Fill Details  </header>
                    <div class="panel-body">
                        <form class="form-horizontal adminex-form" name="registration" action="registrationsubmit" method="post" id="registrationform">
                            <div class="form-group">
                                <label class="col-lg-2 col-sm-2 control-label"><s:property value="getText('global.jobreferenceode')"/></label>
                                <div class="col-lg-10">
                                    <s:if test="jobcode!=null">
                                        <s:select name="JRC" list="%{listjod}" listKey="jobReferenceCode" listValue="jobReferenceCode" cssClass="form-control" value="#request.jobcode" disabled="true"/>  
                                    </s:if>
                                    <s:else>
                                     <s:select name="JRC" list="%{listjod}" listKey="jobReferenceCode" listValue="jobReferenceCode" cssClass="form-control"/>
                                    </s:else>
                                </div>
                            </div>
                            <div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label"><s:property value="getText('global.desiredid')"/></label>
                                    <div class="col-lg-10">
                                        <s:textfield type="text" name="personid" cssClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label"><s:property value="getText('global.user-name')"/></label>
                                    <div class="col-sm-10">
                                        <s:textfield type="text" name="username" cssClass="form-control"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label"><s:property value="getText('global.password')"/></label>
                                    <div class="col-sm-10">
                                        <s:password type="password" placeholder="" cssClass="form-control" name="password" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label"><s:property value="getText('global.confirmpassword')"/></label>
                                    <div class="col-md-10">
                                        <s:password type="password" name="confirmpassword" placeholder="" cssClass="form-control" />
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
                                        <div class="col-sm-2"><input type="button" id="b1" align="center" class="btn btn-warning" value="+"/></div>
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
                                        <span class="help-block"></span><s:property value="getText('global.selectdate')"/> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-lg-2 col-sm-2 control-label"><s:property value="getText('global.gender')"/></label>
                                    <div class="col-lg-10">
                                        <input type="radio" value="1" id="radio-01" name="gender" checked="" />&nbsp;&nbsp; Male &nbsp;&nbsp;

                                        <input type="radio" value="1" id="radio-02" name="gender"/>&nbsp;&nbsp; Female &nbsp;&nbsp;
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-2 col-sm-2 control-label"><s:property value="getText('global.nationality')"/></label>
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
                                        <s:textfield type="text" placeholder="Enter.." cssClass="form-control" name="pincode"/>
                                    </div>
                                </div>
                                <label class="col-sm-2 control-label col-lg-2"><s:property value="getText('global.langknown')"/></label>
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
                                    <label class="col-sm-2 col-sm-2 control-label"><s:property value="getText('global.hobbies')"/></label>
                                    <div class="col-sm-10">
                                        <s:textfield type="text" cssClass="form-control" name="hobbies"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputSuccess" class="col-sm-2 col-sm-2 control-label"><s:property value="getText('global.marritalstatus')"/></label>
                                    <div class="col-lg-12"  style="margin-left: 160px; position: absolute">
                                        <label class="checkbox-inline">
                                            <input type="radio" value="english" id="inlineCheckbox1" name="marritalstatus">&nbsp;&nbsp;Single
                                             </label>
                                        <label class="checkbox-inline">
                                            <input type="radio" value="gujarati" id="inlineCheckbox2" name="marritalstatus">&nbsp;&nbsp;Married
                                              </label>

                                    </div>
                                </div>


                                <div class="form-group">
                                    <label for="inputSuccess" class="col-sm-2 control-label col-lg-2"><s:property value="getText('global.acedemicdetails')"/></label>
                                </div>

                               <table id="AcdemicDetails" class="table  table-hover general-table">
                                    <thead>
                                        <tr>
                                           
                                            <th>Degree-Type</th>
                                            <th><s:property value="getText('global.institutionname')"/></th>
                                            <th><s:property value="getText('global.yearofpassing')"/></th>
                                            <th>% <s:property value="getText('global.obtained')"/></th>

                                        </tr>
                                    </thead>
                                    <tbody>

                                        <TD><INPUT type="text" name="degreetype" class="form-control"/></TD>
                                        <TD><INPUT type="text" name="institutionname" class="form-control" /></TD>
                                        <TD><INPUT type="text" name="yearofpassing" class="form-control" /></TD>
                                        <TD><INPUT type="text" name="percentageobtained" class="form-control" /></TD>

                                    </tbody>    
                                </table>
                                         <div class="form-group">
                                        <div class="col-sm-2"><input type="button" onclick="addRow1('AcdemicDetails')" align="center" class="btn btn-primary" value="Add Row"/>
                                </div></div>

                                <!--experience start><-->
                                <div class="form-group">
                                    <label for="inputSuccess" class="col-sm-2 control-label col-lg-2"><s:property value="getText('global.we')"/></label>
                                </div>

                               <table id="WorkExperienceTable" class="table  table-hover general-table">
                                    <thead>
                                        <tr>
                                            <th>Organization Name</th>
                                            <th><s:property value="getText('global.responsibility')"/></th>
                                            <th><s:property value="getText('global.designation')"/></th>
                                            <th><s:property value="getText('global.durationyears')"/></th>
                                            <th><s:property value="getText('global.salarydrawn')"/></th>	
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <TD><INPUT type="text" name="orgname" class="form-control"/></TD>
                                        <TD><INPUT type="text" name="responsibility" class="form-control" /></TD>
                                        <TD><INPUT type="text" name="designation" class="form-control" /></TD>
                                        <TD><INPUT type="text" name="duration" class="form-control" /></TD>
                                        <TD><INPUT type="text" name="salaryDrawn" class="form-control" /></TD>
                                        
                                    </tbody>
                                </table>
                                 <div class="form-group">
                                 <div class="col-sm-2"><input type="button" onclick="addRow('WorkExperienceTable')" align="center" class="btn btn-primary" value="Add Row"/>
                                 </div></div>
                                <p>
                                   
                                    <s:submit type="submit" data-filter=".bootstrap" value="SUBMIT" cssClass="btn btn-primary btn-btnbig active"/></p>


                                <!--experience end><-->



                        </form>

                    </div>
                </div>

            </div>
        </section>

<s:property value="#map.username"/>





<%@include file="contactus.jsp"%>



        <!-- validation-->
        <link rel="stylesheet" href="<%=application.getContextPath()%>/visualization/validation/css/bootstrap.min.css">
        <link rel="stylesheet" href="<%=application.getContextPath()%>/visualization/validation/css/formValidation.min.css">
        <script src="<%=application.getContextPath()%>/visualization/validation/js/jquery.min.js"></script>
        <script src="<%=application.getContextPath()%>/visualization/validation/js/formValidation.min.js"></script>
        <script src="<%=application.getContextPath()%>/visualization/validation/js/framework/bootstrap.min.js"></script>
        <!--end validation-->

        <!--<script src="<%=application.getContextPath()%>/Home/js/jquery.js"></script>-->
        <script src="<%=application.getContextPath()%>/Home/js/bootstrap.min.js"></script>
        <script src="<%=application.getContextPath()%>/Home/js/jquery.isotope.min.js"></script>
        <script src="<%=application.getContextPath()%>/Home/js/jquery.prettyPhoto.js"></script>
       
        

            <script src="<%=application.getContextPath()%>/Home/js/main.js"></script>
            <script src="<%=application.getContextPath()%>/Home/js/accordian.js"></script>
        <!--pickers plugins-->
        <script src="<%=application.getContextPath()%>/Home/js/bootstrap-datepicker.js"></script>

        <!--pickers initialization-->
        <script src="<%=application.getContextPath()%>/Home/js/pickers-init.js"></script>
        <script src="<%=application.getContextPath()%>/Home/js/login.js"></script>

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
