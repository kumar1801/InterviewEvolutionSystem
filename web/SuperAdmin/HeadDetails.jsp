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
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Head Details</li>
        </ol>
    </section>

    <!-- Main content -->
    <section class="content">
        <div class="row">
            <section class="col-lg-12">
                <div class="box box-primary">

                    <div class="box-header">
                        <h3 class="box-title">Head Details</h3>
                    </div>


                    <div class="box-body">
                        <form name="HeadForm" action="headsubmit" method="post" id="signinform" enctype="multipart/form-data">
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-lg-6">      
                                        
                                        <s:textfield key="global.headid" type="text" name="personid" cssClass="form-control my-colorpicker1"/>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                
                                <div class="row">
                                    <div class="col-lg-4">               
                                        <s:textfield key="global.headname" type="text" name="fname" cssClass="form-control" placeholder="FirstName"/>
                                    </div>
                                    <div class="col-lg-4">            
                                        <s:textfield type="text" name="mname" cssClass="form-control my-colorpicker1" placeholder="SecondName"/>
                                    </div>
                                    <div class="col-lg-4">                
                                        <s:textfield type="text" name="lname" cssClass="form-control my-colorpicker1" placeholder="LastName"/>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <label>Head Type:</label>                                         
                                        <s:textfield name="headType" cssClass="form-control my-colorpicker1"/>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <label>Head Details:</label>                                         
                                        <s:textfield name="headDetail" cssClass="form-control my-colorpicker1"/>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-envelope"></i></span>
                                                <s:textfield name="emailid" cssClass="form-control"/>
                                        </div>
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
                                            <s:textfield name="contactno" placeholder="Eg:xxx-xxx-xxxx" cssClass="form-control" data-inputmask="&quot;mask&quot;: &quot;(999) 999-9999&quot;" data-mask=""/>
                                        </div><!-- /.input group -->
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col-lg-6">

                                        <label>Head Username:</label>                                         
                                        <s:textfield type="text" cssClass="form-control" name="username"/>
                                    </div>
                                </div>
                            </div> 
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <label>Head Password:</label>                                         
                                        <s:password type="password" name="password" cssClass="form-control"/>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="row"> 
                                    <div class="col-lg-6">
                                        <label>Head Image: </label>   
                                        <div class="btn btn-success btn-file">
                                            <i class="fa fa-paperclip"></i>

                                            <input id="fileupload" type="file" name="userImage" size="30"/> Upload Image   
                                        </div>
                                    </div>

                                </div> 
                            </div>
                            <div id="dvPreview">


                            </div>

                            <div class="form-group" >
                                &nbsp; &nbsp;
                                <button type="submit" class="btn btn-success">Submit</button> <button class="btn btn-default btn-flat">Back</button>
                            </div>     

                    </div>



                </div>   
                <s:url id="localeEN" namespace="/" action="locale">
                    <s:param name="request_locale" >en</s:param>
                </s:url>
                <s:url id="localezhCN" namespace="/" action="locale">
                    <s:param name="request_locale" >zh_CN</s:param>
                </s:url>
                <s:url id="localeDE" namespace="/" action="locale">
                    <s:param name="request_locale" >de</s:param>
                </s:url>
                <s:url id="localeFR" namespace="/" action="locale">
                    <s:param name="request_locale" >fr</s:param>
                </s:url>

                <s:a href="%{localeEN}" >English</s:a>
                <s:a href="%{localezhCN}">Chinese</s:a>
                <s:a href="%{localeDE}" >German</s:a>
                <s:a href="%{localeFR}" >France</s:a>

                    </form>




            </div>


            </div><!-- /.box-body -->
            </div>

        </section>
    </div><!-- /.row (main row) -->

</section><!-- /.content -->
</aside><!-- /.right-side -->
</div><!-- ./wrapper -->

<!-- add new calendar event modal -->
<script language="javascript" type="text/javascript">
    $(function() {
        $("#fileupload").change(function() {
            $("#dvPreview").html("");
            var regex = /^([a-zA-Z0-9\s_\\.\-:])+(.jpg|.jpeg|.gif|.png|.bmp)$/;
            if (regex.test($(this).val().toLowerCase())) {
                if ($.browser && parseFloat(jQuery.browser.version) <= 9.0) {
                    $("#dvPreview").show();
                    $("#dvPreview")[0].filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = $(this).val();
                }
                else {
                    if (typeof (FileReader) !== "undefined") {
                        $("#dvPreview").show();
                        $("#dvPreview").append("<img />");
                        var reader = new FileReader();
                        reader.onload = function(e) {
                            $("#dvPreview img").attr("src", e.target.result);
                        };
                        reader.readAsDataURL($(this)[0].files[0]);
                    } else {
                        alert("This browser does not support FileReader.");
                    }
                }
            } else {
                alert("Please upload a valid image file.");
            }
        });
    });
</script>
<style type="text/css">
    #dvPreview
    {
        filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=image);
        min-height: 250px;
        min-width: 250px;
        display: none;
    }
</style>
<script src="<%=application.getContextPath()%>/visualization/js/jquery1.8.3.min.js"></script>
<%@include file="validation.jsp" %>
<%@include file="footer.jsp" %>
