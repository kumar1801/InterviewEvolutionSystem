<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="header.jsp"%>

<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1 class="text-center">Super Admin
                            <small>Control panel</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
                        <li class="active">Organization</li>
                    </ol>
                </section>
				
                 <!-- Main content -->
                <section class="content">
                    <div class="row">
                        <section class="col-lg-12">
             					<div class="box box-primary">
                                <div class="box-header">
                                    <h3 class="box-title">Super Admin</h3>
                                </div>
                                <div class="box-body">
                                    <form action="OrgBrsubmit" method="post" id="signinform" enctype="multipart/form-data">
                                    <div id="step1">
                                        <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <label>Org Name:</label>                                         
                                            <s:textfield type="text" cssClass="form-control my-colorpicker1" name="orgname"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <label>Org Details:</label>                                         
                                            <s:textarea placeholder="Enter ..." rows="3" cssClass="form-control" name="orgdetails"/>                                        </div>
                                    </div>
                                </div>
                                    
                                   
                                <div class="form-group">
                                    <div class="row"> 
                                        <div class="col-lg-6">
                                            <label>ORG LOGO: </label>   
                                            <div class="btn btn-success btn-file">
                                                <i class="fa fa-paperclip"></i>
                                               
                                                <s:file name="userImage" label="Upload Image"/>  
                                            </div>
                                        </div>
                                         
                                    </div> 
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <label>No of branch:</label>                                         
                                            <s:textfield type="text" cssClass="form-control my-colorpicker1" name="noofbranches"/>
                                        </div>
                                    </div>
                                </div>

                            </div>

                              <div id="step2" style="display:none;">
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <label>Branch ID:</label>                                         
                                            <s:textfield type="text" cssClass="form-control my-colorpicker1" name="br.branchid" required="has-error form-control:focus"/>
                                        </div>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <label>Branch type:</label>                                         
                                            <s:textfield type="text" cssClass="form-control my-colorpicker1" name="br.branchtype" required="has-error form-control:focus"/>
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
                                    <div class="row">
                                        <div class="col-lg-6">
                                             <label>Street Name:</label>
                                            <s:textfield name="street" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                            
                                        </div>
                                    </div> 
                                </div> 
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <label>city</label>
                                            <select class="form-control" name="br.city">
                                                <option value="-1"> Select City</option> 
                                                <option>Vadodara</option>
                                                <option>Ahemdabad</option>
                                                <option>Surat</option>
                                                <option>Rajkot</option>
                                                <option>Junagadh</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <label>state</label>
                                            <select class="form-control" name="br.state">
                                                <option value="-1"> Select State</option> 
                                                <option>Gujarat</option>
                                                <option>Delhi</option>
                                                <option>Maharashtra</option>
                                               
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                    
                                    <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <label>Pincode:</label>                                         
                                            <s:textfield type="text" cssClass="form-control my-colorpicker1" name="pincode"/>
                                        </div>
                                    </div>
                                </div>
                                    
                                     <div class="form-group">
                                            &nbsp; &nbsp;
                                            <button type="submit" class="btn btn-warning btn-flat">Next</button> <button class="btn btn-default btn-flat">Back</button>

                                        </div>
                                                   
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-success">Submit</button> <button class="btn btn-danger">Cancel</button>  
                                    </div>
                              </div>
                                <script>
                                function openstep2() {
                                    document.getElementById("step2").setAttribute("style", "display:block");
                                    document.getElementById("addDetail").setAttribute("style", "display:none");
                                }
                            </script>
                                    </form>
                                         <div id="addDetail" class="form-group">
                    <div class="row">
                        <div class="col-md-6" style="padding-top:30px;">
                            <label>Add Details</label>
                            <button id="open_step2" onClick="openstep2()" class="btn btn-primary">Click to add details</button>
                        </div>
                    </div>
                </div>
                                            
                            </div>
                                   
                                 </div>
                        </section>
                     </div>
                   </section>
                                 
               
            </aside><!-- /.right-side -->
        <!-- ./wrapper -->
        

<%@include file="validation.jsp" %>
<%@include file="footer.jsp"%>