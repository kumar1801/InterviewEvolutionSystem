<!DOCTYPE html><%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="recruiter_header.jsp"%>

<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>Recruiter Assistant
            <small>Control panel</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i>Home</a></li>
            <li class="active">Recruiter Assistant</li>
        </ol>
    </section>
    <form action="scheduleSet" method="post" id="frm_schedule">
        <!-- Main content -->
        <section class="content">
            <div class="row">
                <section class="col-lg-12">
                    <div class="box box-primary">
                        <div class="box-header">
                            <h3 class="box-title">Set the SCHEDULE</h3>
                        </div>
                        <div class="box-body">
                            <div id="step1">

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            
                                            <s:textfield key="global.schedulenumber" name="scheduleNo" cssClass="form-control my-colorpicker1"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            
                                            <s:select key="global.roundid" name="roundId" list="%{disprnd}" cssClass="form-control" listValue="roundName" listKey="roundId"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                          
                                            <s:select key="global.jobtype" name="type" list="{'Fulltime','Parttime'}" cssClass="form-control"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    
                                    <div class="input-group">
                                        
                                        <div class="input-group-addon">
                                            <s:property value="getText('global.daterange')"/>
                                            <i class="fa fa-calendar"></i>
                                        </div>
                                         <s:textfield name="date" cssClass="form-control pull-right" id="reservation"></s:textfield>
                                    </div><!-- /.input group -->
                                </div><!-- /.form group -->
                                <div class="bootstrap-timepicker">
                                    <div class="form-group">
                                       <s:property value="getText('global.time')"/>
                                        <div class="input-group">                                            
                                          <s:textfield name="time" cssClass="form-control timepicker"></s:textfield>
                                            <div class="input-group-addon">
                                                <i class="fa fa-clock-o"></i>
                                            </div>
                                        </div><!-- /.input group -->
                                    </div><!-- /.form group -->
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                          
                                        <s:textarea key="global.interviewassesmentreport" name="interviewAssesmentReport" class="form-control" rows="3" placeholder="Enter ..."></s:textarea>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                                                                    
                                        <s:textfield key="global.streetname" name="street" cssClass="form-control my-colorpicker1"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
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

                                <div class="form-group">
                                    <label>
                                        <s:checkboxlist name="notification" list="{'SMS','E-MAIL'}" cssClass="flat-red"/>:
                                    </label>
                                </div>
                                <div class="form-group">
                                    <button class="btn btn-success">Generate</button> <button class="btn btn-danger">Cancel</button>  
                                </div>

                            </div>
                        </div>
                    </div>
                </section>
            </div>
        </section>
    </form>
                                    <form action="generater">
                                        <s:submit type="submit" label="generate report"/>
                                    </form>
</aside><!-- /.right-side -->
</div><!-- ./wrapper -->


<%@include file="validation.jsp"%>
<%@include file="footer.jsp"%>
