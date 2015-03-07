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
                                            <label>Schedule Number :</label>
                                            <s:textfield name="scheduleNo" cssClass="form-control my-colorpicker1"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <label>Round ID :</label>
                                            <s:select name="roundId" list="%{disprnd}" cssClass="form-control" listValue="roundName" listKey="roundId"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <label>Job Type :</label>

                                            <s:select name="type" list="{'101','102'}" cssClass="form-control"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label>Date range :</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-calendar"></i>
                                        </div>
                                        <input type="text" class="form-control pull-right" id="reservation"/>
                                    </div><!-- /.input group -->
                                </div><!-- /.form group -->
                                <div class="bootstrap-timepicker">
                                    <div class="form-group">
                                        <label>Time :</label>
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
                                        <div class="col-lg-12">
                                            <label>Interview Assesment Report :</label>
                                            <textarea name="interviewAssesmentReport" class="form-control" rows="3" placeholder="Enter ..."></textarea>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <label>Street :</label>                                         
                                            <s:textfield name="street" cssClass="form-control my-colorpicker1"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <label>City :</label>

                                            <s:select name="city" list="{'Baroda','Surat'}" cssClass="form-control"/>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <label>State :</label>

                                            <s:select name="state" list="{'Gujarat','UP'}" cssClass="form-control"/>
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

</aside><!-- /.right-side -->
</div><!-- ./wrapper -->


<%@include file="validation.jsp"%>
<%@include file="footer.jsp"%>