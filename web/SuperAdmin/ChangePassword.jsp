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
            Change Password
           
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Change Password</li>
        </ol>
    </section>
    <form name="changepwd" action="chngpassword" method="post">
        <section class="content">
           
            <div class="row">
                <section class="col-lg-6">
                    <div class="box box-primary">
                        <div class="box-body">
                            <div class="form-group">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <label>Email-ID</label>
                                        <s:textfield name="email" cssClass="form-control" placeholder="Email"></s:textfield>
                                        </div>
                                    </div>
                                </div>
                                
                                
                                
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <label>Old Password</label>
                                        <s:textfield name="password" cssClass="form-control"></s:textfield>
                                        </div>
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <label>New Password</label>
                                        <s:textfield name="newpassword" cssClass="form-control"></s:textfield>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <label>Confirm Password</label>
                                        <s:textfield  cssClass="form-control"></s:textfield>
                                        </div>
                                    </div>
                                </div>

                                
                            </div><!-- /.box-body -->
                       
                    
                                   
                                    <div class="form-group row">
                                    <s:submit type="submit" cssClass="btn btn-success col-lg-5"  style="margin-right:20px; margin-left:30px" id="btnsubmit" name="btnsubmit"></s:submit>
                                        <button class="btn btn-danger col-lg-5">Cancel</button>
                                    </div>
                                </div>
            </div>
           
        </form>
        <!--Main Content Over-->
    <%@include file="validation.jsp" %>
    <%@include file="footer.jsp" %>