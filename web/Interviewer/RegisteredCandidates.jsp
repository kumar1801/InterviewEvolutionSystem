
<%@include file="interviewer_header.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
    <link href="<%=application.getContextPath()%>/visualization/css/images/demo_page.css" rel="stylesheet" type="text/css" />
          
        <link href="<%=application.getContextPath()%>/visualization/css/images/jquery-ui-1.10.4.custom.min.css" rel="stylesheet" type="text/css">
                             
        <script src="<%=application.getContextPath()%>/visualization/js/jquery-1.10.2.js"></script>
        <script src="<%=application.getContextPath()%>/visualization/js/jquery-ui-1.10.4.custom.min.js"></script>
        
        <script src="<%=application.getContextPath()%>/visualization/js/jquery.jeditable.js"></script>
        <script src="<%=application.getContextPath()%>/visualization/js/jquery.validate.js"></script>
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Registered Candidates
            <small>Control panel</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="<%=application.getContextPath()%>/Interviewer/RegisteredCandidates.jsp"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Registered</li>
        </ol>
    </section>
 

       
       
    
    <!-- Main content -->
    <section class="content">
        <!-- Main content -->
        <section class="content">
             <div id="dialog-confirm" title="Are you sure?"></div>
            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">Registered</h3>                                    
                        </div><!-- /.box-header -->

                        <div class="box-body table-responsive">
                            <table id="example1" class="table table-bordered table-striped">
                                <thead>
                                    <tr>
                                        <th>Person-ID</th>
                                        <th>Name</th>
                                         <th>UserName</th>
                                        <th>Email-ID</th>
                                        <th>Job Reference Code</th>
                                       
                                    </tr>
                                </thead>
                                <tbody>
                                    <s:iterator value="%{listinterviewee}">                 
                                        <tr> 
                                            <td>
                                  <input type="checkbox" name="listSelectedData"  id="listSelectedData"
                                   value="<s:property value="personid" />" style="width:30px;" />
                                   <s:property value="personid" />
                                </td>
                                            <td><s:property value="fname+' '+lname" /></td>
                                             <td><s:property value="username" /></td>
                                            <td><s:property value="emailid" /></td>
                                            <td><s:property value="JRC" /></td>
                                            
                                        </tr>                                                                                                          
                                    </s:iterator>   
                                </tbody>

                            </table>

                             <input class="btn btn-group-xs" type="button" id="buttondelete"  onclick="deleteSelectedData()" value="Delete"/>

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

<script type="text/javascript">
     function deleteSelectedData() {
                
                var checkboxx = document.getElementsByName('listSelectedData');
                
                var listSelectedData = "";
                for (var i = 0; i < checkboxx.length; i++) {
                    if (checkboxx[i].checked) {    
                        
                        listSelectedData = listSelectedData + checkboxx[i].value + ":";
                    }
                }
                $("#dialog-confirm").dialog({
                    resizable: false,
                    height: 140,
                    dialogClass: "mycolor",
                    modal: true,
                    show: {
                        effect: "blind",
                        duration: 1000
                    },
                    hide: {
                        effect: "explode",
                        duration: 1000
                    },
                    buttons:
                            {
                                "Delete data": function() {
                                    $( this ).dialog( "close" );   
                                    location.href = "deleteMultipleRecords?listSelectedData=" + listSelectedData;
                                },
                                Cancel: function() {
                                    $(this).dialog("close");
                                }
                            }
                });
                $("#dialog-confirm").dialog("open");
            }
                       
        </script>
        


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
