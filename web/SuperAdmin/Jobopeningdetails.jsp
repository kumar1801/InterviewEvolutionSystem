
<%@include file="header.jsp"%>
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
            Job Opening Details
            <small>Control panel</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="<%=application.getContextPath()%>/SuperAdmin/Jobopeningdetails.jsp"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">JobOpenings</li>
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
                            <h3 class="box-title">Data Table With Full Features</h3>                                    
                        </div><!-- /.box-header -->

                        <div class="box-body table-responsive">
                            <table id="example1" class="table table-bordered table-striped">
                                <thead>
                                    <tr>
                                        <th>Job Reference Code</th>
                                        <th>Posting</th>
                                        <th>Department</th>
                                         <th>Vacancies</th>
                                        <th>Job Type</th>
                                        <th>Required Qualification</th>
                                        <th>Gender</th>
                                        <th>Cost per Company(CTC)</th>
                                        <th>Required Skills</th>
                                       
                                    </tr>
                                </thead>
                                <tbody>
                                    <s:iterator value="%{listjod}">                 
                                        <tr> 
                                            <td>
                                  <input type="checkbox" name="listSelectedData"  id="listSelectedData"
                                   value="<s:property value="jobReferenceCode" />" style="width:30px;" />
                                   <s:property value="jobReferenceCode" />
                                </td>
                                            <td><s:property value="posting" /></td>
                                             <td><s:property value="department" /></td>
                                            <td><s:property value="vacancies" /></td>
                                            <td><s:property value="jobType" /></td>
                                            <td><s:iterator value="%{requiedqualifications}">
                                             <s:property value="id.requierdQualification"/>,
                                                </s:iterator> </td>
                                            <td><s:property value="gender" /></td>
                                            <td><s:property value="ctc" /></td>
                                            <s:iterator value="%{desiredskillses}">
                                                <td> <s:property value="id.desiredSkills"/>,
                                                </s:iterator></td>
                 
                                            
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
                                    location.href = "jobopening?listSelectedData=" + listSelectedData;
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