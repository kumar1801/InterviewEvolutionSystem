<%-- 
    Document   : JobOpening
    Created on : 31 Jan, 2015, 11:52:45 AM
    Author     : Jyotil
--%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="header.jsp"%>
<!-- Main content -->

<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Job Opening
            <small>Control panel</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Job Opening</li>
        </ol>
    </section>
    <form name="jobopening" action="save" method="post" id="signinform" enctype="multipart/form-data">
        <section class="content">
            <div class="row">
                <div class="col-lg-12">
                    <p>
                    <div class="btn btn-success btn-file">
                        <i class="fa fa-paperclip"></i> 
                        <s:file name="userImage" label="ImportFile" /> 
                    </div>
                    
                </div>
            </div>
            <div class="row">
                <section class="col-lg-6">
                    <div class="box box-primary">
                        <div class="box-body">
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <label>Job Reference Code:</label>
                                        <s:textfield type="text" name="jobReferenceCode" cssClass="form-control" placeholder="Enter...."></s:textfield>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>Department:</label>
                                                <select class="form-control" name="department">
                                                <option value="-1"> Select Department</option> 
                                                <option>Marketing</option>
                                                <option>Production</option>
                                                <option>HR<option>
                                                 <option>Technical<option>   
                                                
                                            </select>
                                             
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <label>Gender:</label>                                         
                                            <div class="form-group">                                    
                                                &nbsp;&nbsp;&nbsp;
                                                <label>
                                                <s:radio name="gender" cssClass="flat-red" list="{'Male','Female','Both'}" value="3"></s:radio>
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>Posting:</label>
                                    <select class="form-control" name="posting">
                                                <option value="-1"> Select Posting</option> 
                                                <option>Trainee</option>
                                                <option>Developer</option>
                                                
                                            </select>
                                    
                               
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <label>Terms &amp; Condition:</label>
                                        <s:textarea  placeholder="Enter ..." rows="2" cssClass="form-control"></s:textarea>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>Job Type:</label>
                                     <select class="form-control" name="jobType">
                                                <option value="-1"> Select Jobtype</option> 
                                                <option>Developer</option>
                                                <option>Trainee</option>
                                                
                                            </select>
                                    
                               
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <label>Desired Skill:</label>
                                        <s:textfield name="desiredskilled" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <label>Vacancies:</label>
                                        <s:textfield name="vacancies" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <button class="btn btn-primary btn-block">Additional Field</button>
                                </div>
                            </div><!-- /.box-body -->
                        </div>
                    </section>
                    <section class="col-lg-6">
                        <div class="box box-warning">
                            <div class="box-body">
                                <div id="step1">
                                   <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <label>CTC:</label>
                                        <s:textfield name="ctc9+" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                        </div>
                                    </div>
                                </div> 
                                    
                                    
                                    <div class="form-group ">
                                        <div class="row">
                                            <div class="col-lg-12">
                                                <label>Country:</label>
                                                <select class="form-control" name="country">
                                                <option value="-1"> Select Country</option> 
                                                <option>India</option>
                                                <option>Poland</option>
                                                <option>USA</option>
                                                
                                            </select>
                                           
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group ">
                                        <div class="row">
                                            <div class="col-lg-12">
                                                <label>State:</label>
                                                <select class="form-control" name="state">
                                                <option value="-1"> Select State</option> 
                                                <option>Gujarat</option>
                                                <option>Maharashtra</option>
                                                <option>Delhi</option>
                                                
                                            </select>
                                               </div>
                                        </div>
                                    </div>
                                    <div class="form-group ">
                                        <div class="row">
                                            <div class="col-lg-12">
                                                <label>City:</label>
                                                <select class="form-control" name="city">
                                                <option value="-1"> Select City</option> 
                                                <option>Vadodara</option>
                                                <option>Junagadh</option>
                                                <option>Surat</option>
                                                
                                            </select>
                                              
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-lg-12">
                                                <label>Street Name:</label>
                                            <s:textfield name="street" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-lg-12">
                                                <label>Zip Code:</label>
                                            <s:textfield type="text" name="pincode" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label>Starting &amp; Ending Date:</label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                        <s:textfield name="seDate" cssClass="form-control pull-right" placeholder="Pick a Date ..." ></s:textfield>
                                        </div><!-- /.input group -->
                                    </div>
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-lg-12">
                                                <label>Required Qualification:</label>
                                            <s:textfield name="requiredQualification" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-lg-12">
                                                <label>Required Document:</label>
                                            <s:textfield name="requiredDocuments" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                    <s:submit cssClass="btn btn-success col-lg-5"  style="margin-right:20px; margin-left:30px" id="btnsubmit" name="btnsubmit"></s:submit>
                                        <button class="btn btn-danger col-lg-5">Cancel</button>
                                    </div>
                                </div>
                            </div>
                        </div><!-- /.box-body -->
                </div>
            </section>
        </form>
        <!--Main Content Over-->
    <%@include file="validation.jsp" %>
    <%@include file="footer.jsp" %>