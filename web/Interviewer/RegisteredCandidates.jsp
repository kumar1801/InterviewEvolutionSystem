
<%@include file="interviewer_header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@taglib prefix="s" uri="/struts-tags" %>

<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Registered Candidates
            <small>Control panel</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Registered</li>
        </ol>
    </section>

    <!-- Main content -->
    <section class="content">
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
                                        <th>Person-ID</th>
                                        <th>Name</th>
                                        <th>Email-ID</th>
                                        <th>Zip-code</th>
                                        <th>UserName</th>
                                        <th>Nationality</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <s:iterator value="%{listinterviewee}">                 
                                        <tr> 
                                            <td><s:property value="personid" /></td>
                                            <td><s:property value="fname" /></td>
                                            <td><s:property value="emailid" /></td>
                                            <td><s:property value="pincode" />&percnt; </td>                                
                                            <td><s:property value="username" /></td>
                                            <td><s:property value="nationality" /></td>
                                        </tr>                                                                                                          
                                    </s:iterator>   
                                </tbody>

                            </table>



                        </div><!-- /.box-body -->


                    </div><!-- /.box -->
                </div>
            </div>

        </section><!-- /.content -->
</aside><!-- /.right-side -->
</div><!-- ./wrapper -->


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

<%@include file="footer.jsp"%>