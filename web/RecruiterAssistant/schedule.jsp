<!DOCTYPE html><%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="recruiter_header.jsp"%>

<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>RecruiterAssistant
                        <small>Control panel</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
                        <li class="active">RecruiterAssistant</li>
                    </ol>
                </section>
				
                 <!-- Main content -->
                <section class="content">
                    <div class="row">
                        <section class="col-lg-12">
             					<div class="box box-primary">
                                <div class="box-header">
                                    <h3 class="box-title">RecruiterAssistant</h3>
                                </div>
                               <form action="schedule">
                                                    
                                <div class="box-body">
                                    <div id="step1">
                                        <div class="form-group">
                                    	<div class="row">
                                    	<div class="col-lg-4">
                                            <label>Job Reference Code</label>
                                             <s:select name="jrc" list="%{listjod}" listKey="jobReferenceCode" listValue="jobReferenceCode" cssClass="form-control"/>
                                            
                                           
                                            </div>
                                            </div>
                                      </div>
                                        
                                        <div class="form-group">
                                    	<div class="row">
                                    	<div class="col-lg-4">
                                            <label>Round ID</label>
                                           <s:select name="roundId"  cssClass="form-control" list="%{listround}" listValue="roundId" listKey="roundId"/>
                                             
                                            </div>
                                            </div>
                                      </div>
                                        <div class="form-group">
                                    	<div class="row">
                                    	<div class="col-lg-4">
                                            <label>Interviewee Name</label>
                                            
                                             <s:select name="name" cssClass="form-control" list="%{listinterviewee}" listValue="%{fname+' '+ mname+' '+ lname}" listKey="%{fname  +  mname + lname}"/>
                                             
                                            </div>
                                            </div>
                                      </div>
                                        
                                     
                                    <div class="form-group">
                                        <div class="row">
                                         <div class="col-lg-4">
                                         <label>Schedule No</label>                                         
                                         <s:textfield name="scheduleno" cssClass="form-control my-colorpicker1"/>
                                         </div>
                                        </div>
                                    </div>
                                        
                                         <div class="form-group">
                                    	<div class="row">
                                    	<div class="col-lg-4">
                                            <label>Job Type</label>
                                           <select class="form-control" name="jobtype">
                                                <option value="-1"> Select Jobtype</option> 
                                                <option>Parttime</option>
                                                <option>Fulltime</option>
                                            </select>
                                            
                                            </div>
                                            </div>
                                      </div>
                                        
                                        <div class="form-group">
                                        <label>Date range:</label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                            <input type="text" class="form-control pull-right" id="reservation"/>
                                        </div><!-- /.input group -->
                                    </div><!-- /.form group -->
                                    <div class="bootstrap-timepicker">
                                        <div class="form-group">
                                            <label>Time:</label>
                                            <div class="input-group">                                            
                                                <input type="text" class="form-control timepicker"/>
                                                <div class="input-group-addon">
                                                    <i class="fa fa-clock-o"></i>
                                                </div>
                                            </div><!-- /.input group -->
                                        </div><!-- /.form group -->
                                    </div>

                                        <div class="form-group">
                                        <div class="row">
                                         <div class="col-lg-4">
                                         <label>Interview Assesment Report</label>                                         
                                         <s:textfield name="InterviewAssesmentReport" cssClass="form-control my-colorpicker1" placeholder="Enter ..."/>
                                         </div>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <div class="row">
                                         <div class="col-lg-4">
                                         <label>Street</label>                                         
                                         <s:textfield name="street" cssClass="form-control my-colorpicker1" placeholder="Enter ..."/>
                                         </div>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                    	<div class="row">
                                    	<div class="col-lg-4">
                                            <label>City</label>
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
                                    	<div class="col-lg-4">
                                            <label>State</label>
                                            <select class="form-control" name="state">
                                                <option value="-1"> Select State</option> 
                                                <option>Gujarat</option>
                                                <option>Maharashtra</option>
                                                <option>Delhi</option>
                                                
                                            </select>
                                            </div>
                                            </div>
                                      </div>
                                    
                                    <div class="form-group">
                                        <label>
                                            <s:checkboxlist name="notification" list="{'SMS','E-MAIL'}" cssClass="flat-red "/>
                                         
                                        </label>
                                        
                                        
                                    </div>
                                    
                                   
                                   <div class="form-group">
                                    <button class="btn btn-success">Generate</button> <button class="btn btn-danger">Cancel</button>  
                                    </div>
                                   
                                  </div>
                                 </div>
                               </form>
                                 </div>
                          </section>
                     </div>
                   </section>
                                 
               
            </aside><!-- /.right-side -->
        </div><!-- ./wrapper -->


<%@include file="validation.jsp"%>
<%@include file="footer.jsp"%>