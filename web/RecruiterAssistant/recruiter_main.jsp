<!DOCTYPE html><%@taglib prefix="s" uri="/struts-tags" %>
<%@include file="recruiter_header.jsp"%>

<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Recruiter Assistant
            <small>Main-panel</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="RecruiterAssistant/recruiter_main.jsp"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Dashboard</li>
        </ol>
    </section>


</aside><!-- /.right-side -->
</div><!-- ./wrapper -->

<!-- add new calendar event modal -->
<div class="modal fade" id="compose-modal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title"><i class="fa fa-envelope-o"></i> Upload logo</h4>
            </div>
            <form action="#" method="post">
                <div class="modal-body">
                    <div class="form-group">
                        upload your logo from here..
                    </div>
                    <div class="form-group">                                
                        <div class="btn btn-success btn-file">
                            <i class="fa fa-paperclip"></i>Attach Logo
                            <input type="file" name="attachment"/>
                        </div>
                    </div>
                     <div class="form-group"> 
                            <div class="row">
                                    <div class="col-lg-6">
                                                                               
                                         <input type="text" id="uploader" css="form-control" placeholder="no file selected"/>
                                    </div>
                                </div>
                         </div>
                </div>
                <div class="modal-footer clearfix">

                    <button type="button" class="btn btn-danger" data-dismiss="modal"><i class="fa fa-times"></i> Discard</button>
                </div>
            </form>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>


<%@include file="footer.jsp"%>
