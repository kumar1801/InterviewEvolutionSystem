`<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="interviewer_header.jsp"%>

<!-- Right side column. Contains the navbar and content of the page -->
 <aside class="right-side">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>Interviewer
                        <small>Control panel</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
                        <li class="active">interviewer</li>
                    </ol>
                </section>
				
                 <!-- Main content -->
                <section class="content">
                    <div class="row">
                        <section class="col-lg-12">
             					<div class="box box-primary">
                                <div class="box-header">
                                    <h3 class="box-title">Interviewer</h3>
                                </div>
                            <form action="interview">
                                <div class="box-body">
                                    <div id="step1">
                                        <div class="form-group">
                                    	<div class="row">
                                    	<div class="col-lg-4">
                                            <label>Desired ID</label>
                                            <s:select name="personid" id="lst_DesiredID" cssClass="form-control" list="%{dispint}" listKey="personid" listValue="personid"/>
                                            </div>
                                            </div>
                                      </div>
                                     <div class="form-group">
                                       <label>Interviewee Name:</label>
                                        <div class="row">
                                         <div class="col-lg-4">               
                                             <s:textfield name="fname" cssClass="form-control my-colorpicker1" placeholder="FirstName"/>
                                         </div>
                                         <div class="col-lg-4">               
                                             <s:textfield name="mname" cssClass="form-control my-colorpicker1" placeholder="SecondName"/>
                                         </div>
                                         <div class="col-lg-4">                
                                             <s:textfield name="lname" cssClass="form-control my-colorpicker1" placeholder="LastName"/>
                                         </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="row">
                                         <div class="col-lg-4">
                                         <label>CTC</label>                                         
                                         <s:textfield name="ctc" cssClass="form-control my-colorpicker1"/>
                                         </div>
                                        </div>
                                    </div>
                                        <div class="form-group">
                                        <div class="row">
                                         <div class="col-lg-4">
                                         <label>Posting</label>                                         
                                         <s:textfield name="posting" cssClass="form-control my-colorpicker1"/>
                                         </div>
                                        </div>
                                    </div>
                                        <div class="form-group">
                                        <div class="row">
                                         <div class="col-lg-4">
                                         <label>Interviewer ID</label>                                         
                                         <s:textfield name="desiredid" cssClass="form-control my-colorpicker1"/>
                                         </div>
                                        </div>
                                    </div>
                                        <div class="form-group">
                                       <label>Interviewer Name:</label>
                                        <div class="row">
                                         <div class="col-lg-4">               
                                             <s:textfield name="fname" cssClass="form-control my-colorpicker1" placeholder="FirstName"/>
                                         </div>
                                         <div class="col-lg-4">               
                                             <s:textfield name="mname" cssClass="form-control my-colorpicker1" placeholder="SecondName"/>
                                         </div>
                                         <div class="col-lg-4">                
                                             <s:textfield name="lname" cssClass="form-control my-colorpicker1" placeholder="LastName"/>
                                         </div>
                                        </div>
                                    </div>
                                        
                                        <div class="form-group">
                                    	<div class="row">
                                    	<div class="col-lg-4">
                                            <label>Round ID</label>
                                            <s:select name="roundId" id="lst_DesiredID" cssClass="form-control" list="%{disprnd}" listValue="roundId" listKey="roundId"/>
                                            </div>
                                            </div>
                                      </div>
                                        <div class="form-group">
                                        <div class="row">
                                         <div class="col-lg-4">
                                         <label>Round Name</label>                                         
                                         <s:textfield name="roundname" cssClass="form-control my-colorpicker1"/>
                                         </div>
                                        </div>
                                    </div>
                                        
                                        <div class="form-group">
                                        <div class="row">
                                         <div class="col-lg-4">
                                         <label>Passing Criteria</label>                                         
                                         <s:textfield name="passingcriteria" cssClass="form-control my-colorpicker1"/>
                                         </div>
                                        </div>
                                    </div>
                                      
                                     <div class="form-group">
                                        <div class="row">
                                         <div class="col-lg-4">
                                         <label>Obtained Marks</label>                                         
                                         <s:textfield name="obtainMark" cssClass="form-control my-colorpicker1"/>
                                         </div>
                                        </div>
                                    </div>
                                        
                                    <div class="form-group">
                                        <div class="row">
                                         <div class="col-lg-4">
                                         <label>Round Status</label>                                         
                                         <s:textfield name="roundStatus" cssClass="form-control my-colorpicker1"/>
                                         </div>
                                        </div>
                                    </div>
                                     
                                      
                                  
                                  
                            
                                   
                                   <div class="form-group">
                                    <button class="btn btn-success">Download Resume</button> <button class="btn btn-danger">Update</button>  
                                    </div>
                                   
                                   
                                   
                                  </div>
                                 </div>
                                         <s:actionmessage/>
                               </form>
                                 </div>
                          </section>
                     </div>
                   </section>
                                 
               
            </aside><!-- /.right-side -->
        </div><!-- ./wrapper -->


<%@include file="validation.jsp"%>
<%@include file="footer.jsp"%>