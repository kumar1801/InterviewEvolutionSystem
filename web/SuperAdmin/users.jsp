<!DOCTYPE html><%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="header.jsp"%>

<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>User
            <small>Control panel</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
            <li class="active">users</li>
        </ol>
    </section>

    <!-- Main content -->
    <section class="content">
        <form action="rcmsubmit" method="post" id="signinform">
            <div class="row">
                <section class="col-lg-12">
                    <div class="box box-primary">
                        <div class="box-header">
                            <h3 class="box-title">User</h3>
                        </div>
                        <div class="box-body">

                            <div id="step1">
                                <div class="form-group">
                                    <label>Name:</label>
                                    <div class="row">
                                        <div class="col-lg-4">               
                                            <s:textfield name="fname" cssClass="form-control my-colorpicker1" placeholder="FirstName"/>
                                        </div>
                                        <div class="col-lg-4">            
                                            <s:textfield cssClass="form-control my-colorpicker1" placeholder="SecondName" name="mname"/>
                                        </div>
                                        <div class="col-lg-4">                
                                            <s:textfield name="lname" cssClass="form-control my-colorpicker1" placeholder="LastName"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                                                                   
                                            <s:textfield key="global.personid" name="personid" cssClass="form-control my-colorpicker1"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                                                                   
                                            <s:textfield type="text" key="global.username" name="username" cssClass="form-control my-colorpicker1"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                                                                  
                                            <s:password key="global.password" name="password" cssClass="form-control my-colorpicker1"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            
                                           <label>Assign Role:</label>
                                                <select  class="form-control" name="RCMRole">
                                                <option value="-1"> Select Role</option> 
                                                <option>HR Manger</option>
                                                <option>Recruiter Assistant</option>
                                                <option>Interviewer<option>
                                                 
                                            </select>
                                            
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-lg-6">
                                                
                                                <label>Department:</label>
                                                <select  class="form-control" name="Department">
                                                <option value="-1"> Select Department</option> 
                                                <option>Production</option>
                                                <option>Marketing</option>
                                              
                                                 
                                            </select>
                                                
                                              </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-lg-6">
                                                                                        
                                                <s:textfield key="global.designation" name="designation" cssClass="form-control my-colorpicker1"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-envelope"></i></span>
                                                    <s:textfield name="emailid" cssClass="form-control" placeholder="Email"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                   <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-phone"></i>
                                        </div>
                                        <s:textfield name="contactno" cssClass="form-control" data-inputmask="&quot;mask&quot;: &quot;(999) 999-9999&quot;" data-mask=""/>
                                    </div><!-- /.input group -->
                                   </div>
                                    </div>
                                </div>

                                    <div class="form-group">
                                        <button type="submit" class="btn btn-success">Submit</button> <button class="btn btn-danger">Cancel</button>  
                                    </div>



                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </form>
        </section>


    </aside><!-- /.right-side -->
</div><!-- ./wrapper -->

<%@include file="validation.jsp" %>>
<%@include file="footer.jsp"%>
