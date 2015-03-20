<!DOCTYPE html>

<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>IES - <s:property value="getText('global.ies')"/></title>
        <link href="<%=application.getContextPath()%>/Home/css/bootstrap.min.css" rel="stylesheet">
        <link href="<%=application.getContextPath()%>/Home/css/font-awesome.min.css" rel="stylesheet">
        <link href="<%=application.getContextPath()%>/Home/css/prettyPhoto.css" rel="stylesheet">
        <link href="<%=application.getContextPath()%>/Home/css/main.css" rel="stylesheet">
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->
        <link rel="shortcut icon" href="<%=application.getContextPath()%>/Home/images/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="<%=application.getContextPath()%>/Home/images/ico/apple-touch-icon-57-precomposed.png">
    </head><!--/head-->

    <%@include file="menu.jsp"%>
    <section id="main-slider" class="carousel">
        <div class="carousel-inner">
            <div class="item active">
                <div class="container">
                    <div class="carousel-content">
                        <h1><s:property value="getText('global.ies')"/></h1>
                        <s:property value="#session.username"/>
                        <p class="lead"><s:property value="getText('global.iestheory')"/></p>
                    </div>
                </div>
            </div><!--/.item-->
            <div class="item">
                <div class="container">
                    <div class="carousel-content">
                        <h1><s:property value="getText('global.generic')"/></h1>
                        <p class="lead"><s:property value="getText('global.generictheory')"/></p>
                    </div>
                </div>
            </div>
            <div class="item">
                <div class="container">
                    <div class="carousel-content">
                        <h1><s:property value="getText('global.mainobjective')"/></h1>
                        <p class="lead"><s:property value="getText('global.mainobjectivetheory')"/></p>
                    </div>
                </div>
            </div>
            <div class="item">
                <div class="container">
                    <div class="carousel-content">
                        <h1><s:property value="getText('global.mainfocus')"/></h1>
                        <p class="lead"><s:property value="getText('global.mainfocustheory')"/></p>
                    </div>
                </div>
            </div><!--/.item-->
        </div><!--/.carousel-inner-->
        <a class="prev" href="#main-slider" data-slide="prev"><i class="icon-angle-left"></i></a>
        <a class="next" href="#main-slider" data-slide="next"><i class="icon-angle-right"></i></a>
    </section><!--/#main-slider-->

    <section id="services">
        <div class="container">
            <div class="box center">                
                <h1><s:property value="getText('global.orgexperience')"/></h1>                
                <p class="lead"><s:property value="getText('global.conducting')"/></p>                
                <p><s:property value="getText('global.bigtheory')"/></p><br>
                <p><a data-filter=".bootstrap" href="#" class="btn btn-primary btn-btnbig active">Read more</a></p>
                <br><br>
            </div>

           <!-- <div class="box">                
                <h1>Services of IES</h1>                
                <ul class="checklist">
                    <li><i class="icon-check"></i> But also the leap into electronic typesetting, remainin</li>
                    <li><i class="icon-check"></i> But also the leap into electronic typesetting, remainin</li>
                    <li><i class="icon-check"></i> But also the leap into electronic typesetting, remainin</li>
                    <li><i class="icon-check"></i> But also the leap into electronic typesetting, remainin</li>
                    <li><i class="icon-check"></i> But also the leap into electronic typesetting, remainin</li>
                    <li><i class="icon-check"></i> But also the leap into electronic typesetting, remainin</li>
                    <li><i class="icon-check"></i> But also the leap into electronic typesetting, remainin</li>
                    <li><i class="icon-check"></i> But also the leap into electronic typesetting, remainin</li>
                </ul>
            </div>-->


            <!--/.box-->
        </div><!--/.container-->
    </section><!--/#services-->


    <section id="jobopening">
        <div class="container">
            <div class="box">
                <div class="center row">
                    <h2><s:property value="getText('global.jobopening')"/></h2>
                    <p class="lead"><s:property value="getText('global.cuurentlywehave')"/> <a href="viewjod"> <s:property value="getText('global.jobopening')"/></a></p>
                    <s:iterator value="%{listjod}">
                        <div id="wrapper">
                            <div class="accordionButton"><s:property value="getText('global.jobreferenceode')"/>:-<s:property value="jobReferenceCode" /></div>
                            <div style="display: none;" class="accordionContent">
                                <dl>
                                    <dt></dt>
                                    <dt><s:property value="getText('global.vacancies')"/></dt>
                                    <dd><s:property value="vacancies"/></dd>
                                    <dt><s:property value="getText('global.jobtype')"/></dt>
                                    <dd><s:property value="jobType"/></dd>
                                    <dt>CTC</dt>
                                    <dd><s:property value="ctc"/></dd>
                                </dl>
                                 <s:property value="getText('global.furtherdetails')"/><a href="Jobopening?jobcode=<s:property value="jobReferenceCode"/>"> <s:property value="getText('global.clickon')"/>   </a><br/>
                                <s:property value="getText('global.ifurintrested')"/><a href="registration?jobcode=<s:property value="jobReferenceCode"/>">  registration  </a>
                            </div>  


                        </div>
                    </s:iterator>

                </div><!--/.center-->   
                <div class="big-gap"></div>
                

                <div class="google-maps">
                    <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d7098.94326104394!2d78.0430654485247!3d27.172909818538997!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2s!4v1385710909804" width="600" height="180" frameborder="0" style="border:0"></iframe>
                </div>


            </div> 
        </div>
    </section><!--/#pricing-->

    <%@include file="contactus.jsp" %>

    <%@include file="js.jsp" %>
</body>
</html>
