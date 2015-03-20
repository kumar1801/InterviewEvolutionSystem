<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page errorPage="404.jsp" %>

<body data-spy="scroll" data-target="#navbar" data-offset="0">
    <header id="header" role="banner">
        <div class="container">
            <div id="navbar" class="navbar navbar-default">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="home"></a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="home"><i class="icon-home"></i></a></li>
                        <li><a href="#services"><s:property value="getText('global.orgexperience')"/></a></li>
                        <li><a href="branchRetrive"><s:property value="getText('global.branch')"/></a></li>
                        <li><a href="#jobopening"><s:property value="getText('global.jobopening')"/></a></li>
                        <s:if test="#session.username==null">
                        <li><a href="registration"><s:property value="getText('global.registration')"/></a></li>
                       
                        
                        <li><a id="loginButton" href="#"><s:property value="getText('global.login')"/> <i class="icon-chevron-down"></i></a>
                        <div id="loginBox">                
                       <form id="loginForm" action="login" method="post">
                           <s:actionerror/>
                        <fieldset id="body">
                            
                            <fieldset>
                                <input placeholder="Desired-ID" type="text" name="username" id="desiredid" />
                            </fieldset>
                            <fieldset>
                                <input placeholder="Password" type="password" name="password" id="password" />
                            </fieldset>
                            <input type="submit" id="login" value="Sign in here" />
                            <label><input type="checkbox" id="checkbox"/>Remember me</label>
                        </fieldset>
                        <span><a href="#">Forgot your password?</a></span>
                        </form>
                            
                     </div>
                        </li>
                        </s:if><s:else>
                            <li><a href="signout"><s:property value="getText('global.signout')"/></a></li>
                        </s:else>
                        <li><a href="#contact"><s:property value="getText('global.contact')"/></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header><!--/#header-->