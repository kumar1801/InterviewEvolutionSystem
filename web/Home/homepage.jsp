<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>IES - Interview Evolution System</title>
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
                        <h1>Interview Evolution System</h1>
                        <s:property value="#session.username"/>
                        <p class="lead">Interview Evolution System is a process of selecting required candidates for a vacant position and selecting the candidates who fulfill the requirement of the organization</p>
                    </div>
                </div>
            </div><!--/.item-->
            <div class="item">
                <div class="container">
                    <div class="carousel-content">
                        <h1>It is Generic System</h1>
                        <p class="lead">This system can be implemented in industries like manufacturing, chemical, mechanical, electrical, any educational institute, training center, hospital systems, and government organizations</p>
                    </div>
                </div>
            </div>
            <div class="item">
                <div class="container">
                    <div class="carousel-content">
                        <h1>The Main Objective</h1>
                        <p class="lead">The main objective of "Interview Evolution System"   is to help the Manager (HR) in the process of recruiting new candidates for the company. This Interview Evolution system will primarily focus on the posting and management of job vacancies</p>
                    </div>
                </div>
            </div>
            <div class="item">
                <div class="container">
                    <div class="carousel-content">
                        <h1>The Main Focus</h1>
                        <p class="lead">This Interview Evolution system will primarily focus on the posting and management of job vacancies.</p>
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
                <h1>Our experience</h1>                
                <p class="lead">Conducting an Interview involves different phases from job-opening to recruitment for any nature of organization. Interview process should be sound-managed, transparent and speedy.</p>                
                <p>Interview Evolution System is a process of selecting required candidates for a vacant position and selecting the candidates who fulfill the requirement of the organization; hence selecting is a strategic function for human resource (HR) department. Human resource management includes several responsibilities, mainly selecting required candidates that the company needs so that this system will help the company in selecting the best required applicant that could help in achieving its goals. Recruitment is very systematic process of generating a pool of qualified applicant for organization job. Selection and recruitment is a very important process for a company.</p><br>
                <p><a data-filter=".bootstrap" href="#" class="btn btn-primary btn-btnbig active">Read more</a></p>
                <br><br>
            </div>
            
            <div class="box">                
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
            </div>
            
            
            <!--/.box-->
        </div><!--/.container-->
    </section><!--/#services-->

    
    <section id="jobopening">
        <div class="container">
            <div class="box">
                <div class="center row">
                    <h2>Job Opening</h2>
                    <p class="lead">Currently we have following <a href="viewjod"> job openings</a></p>
                     <s:iterator value="%{listjod}">
                    <div id="wrapper">
                      <div class="accordionButton">Job Reference Code:-<s:property value="jobReferenceCode" /></div>
                      <div style="display: none;" class="accordionContent">
                      <dl>
                       <dt></dt>
                       <dt>Vacancies</dt>
                       <dd><s:property value="vacancies"/></dd>
                       <dt>job-type</dt>
                       <dd><s:property value="jobType"/>s</dd>
                       <dt>CTC</dt>
                       <dd><s:property value="ctc"/>s</dd>
                       
                      </dl>
                      If you are interested then click on<a href="registration?jobcode=<s:property value="jobReferenceCode"/>">  registration  </a>
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

    <script src="<%=application.getContextPath()%>/Home/js/jquery.js"></script>
    <script src="<%=application.getContextPath()%>/Home/js/bootstrap.min.js"></script>
    <script src="<%=application.getContextPath()%>/Home/js/jquery.isotope.min.js"></script>
    <script src="<%=application.getContextPath()%>/Home/js/jquery.prettyPhoto.js"></script>
    <script src="<%=application.getContextPath()%>/Home/js/main.js"></script>
    <script src="<%=application.getContextPath()%>/Home/js/accordian.js"></script>
    <script src="<%=application.getContextPath()%>/Home/js/login.js"></script>
</body>
</html>