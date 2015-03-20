<%-- 
    Document   : Round
    Created on : 1 Feb, 2015, 10:36:19 AM
    Author     : Jyotil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<%@include file="header.jsp"%>


<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Round
            <small>Control panel</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Round</li>
        </ol>
    </section>

    <!-- Main content -->
    <section class="content">

        <div class="row">
            <form method="post" action="xyz" id="signinform">
                <section class="col-lg-6">
                    <div class="box box-primary">
                        <div class="box-body">
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-lg-12">
                                       
                                        <s:textfield key="global.roundid" name="roundId" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                                                                  
                                        <s:textfield key="global.roundname" name="roundName" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                           
                                        <s:textfield key="global.roundpreference" name="roundPreference" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-md-12">
                                        
                                    <s:textarea key="global.rounddescription" name="roundDescription" placeholder="Enter ..." rows="3" cssClass="form-control" ></s:textarea>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-md-12">
                                                                              
                                    <s:select key="global.rcmid" name="personid" list="%{listrcm}" listKey="personid" listValue="personid" cssClass="form-control"/>
                                </div>
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
                                           
                                            <s:textfield key="global.totalmarks" name="totalMarks" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                            </div>
                                        </div>
                                    </div>
                                    
                                    <!-- Date range -->
                                    <div class="form-group">
                                       
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                        <s:textfield key="global.daterange" name="date" cssClass="form-control pull-right" id="reservation"></s:textfield>
                                        </div><!-- /.input group -->
                                    </div><!-- /.form group -->
                                    <div class="bootstrap-timepicker">
                                        <div class="form-group">
                                           
                                            <div class="input-group">
                                            <s:textfield key="global.time" name="time" cssClass="form-control timepicker"></s:textfield>
                                                <div class="input-group-addon">
                                                    <i class="fa fa-clock-o"></i>
                                                </div>
                                            </div><!-- /.input group -->
                                        </div><!-- /.form group -->
                                    </div>
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-lg-12">
                                               
                                                <s:textfield key="global.passingCriteria" name="passingCriteria" cssClass="form-control" placeholder="Enter ..."></s:textfield>
                                                
                                            
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                    <s:submit name="btnNext" cssClass="btn btn-primary col-lg-5"  style="margin-right:20px; margin-left:30px"></s:submit>
                                        <button class="btn btn-success col-lg-5">Finish</button>
                                    </div>
                                </div>
                            </div>
                        </div><!-- /.box-body -->
                </form>
            </div>
            <!-- Main content -->
            <section class="content">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="box">
                            <div class="box-header">
                                <h3 class="box-title">Data Table With Full Features</h3>                                    
                            </div><!-- /.box-header -->

                            <div class="box-body table-responsive">
                                <table id="example1" class="table table-bordered table-striped">
                                    <thead>
                                        <tr>
                                            <th>Round-ID</th>
                                            <th>Round-Name</th>
                                            <th>Round-Preference</th>
                                            <th>Total-Marks</th>
                                            <th>Passing-Criteria</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <s:iterator value="%{listround}">                 
                                        <tr> 
                                            <td><s:property value="roundId" /></td>
                                            <td><s:property value="roundName" /></td>
                                            <td><s:property value="roundPreference" /></td>
                                            <td><s:property value="totalMarks" />&percnt; </td>                                
                                            <td><s:property value="passingCriteria" /></td>
                                        </tr>                                                                                                          
                                    </s:iterator>
                                </tbody>

                            </table>

                            <a href="view.action">Update</a>

                        </div><!-- /.box-body -->


                    </div><!-- /.box -->
                </div>
            </div>

        </section><!-- /.content -->
</aside><!-- /.right-side -->
</div><!-- ./wrapper -->

<%@include file="validation.jsp" %>
<!-- jQuery 2.0.2 -->
<!--<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>-->
<!-- Bootstrap -->

<!-- DATA TABES SCRIPT -->
<script src="<%=application.getContextPath()%>/visualization/js/plugins/datatables/jquery.dataTables.js" type="text/javascript"></script>
<script src="<%=application.getContextPath()%>/visualization/js/plugins/datatables/dataTables.bootstrap.js" type="text/javascript"></script>


<!-- page script -->
<script type="text/javascript">
    $(function() {
        $("#example1").dataTable();
        $('#example2').dataTable({
            "bPaginate": true,
            "bLengthChange": false,
            "bFilter": false,
            "bSort": true,
            "bInfo": true,
            "bAutoWidth": false
        });
    });
</script>

</aside><!-- /.right-side -->
</section>
</div><!-- /.row (main row) -->
</section><!-- /.content -->
<!-- page script -->

<%@include file="footer.jsp" %>