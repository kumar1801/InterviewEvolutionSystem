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
                        <li class="active"><a href="#main-slider"><i class="icon-home"></i></a></li>
                        <li><a href="#services">Our Experience</a></li>
                        <li><a href="branchRetrive">Branch</a></li>
                        <li><a href="#jobopening">Job Opening</a></li>
                        <s:if test="#session.username==null">
                        <li><a href="registration">Registration</a></li>
                       
                        
                        <li><a id="loginButton" href="#">Login <i class="icon-chevron-down"></i></a>
                        <div id="loginBox">                
                       <form id="loginForm" action="login" method="post">
                        <fieldset id="body">
                            <div class="error-pages"><s:actionerror/></div>
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
                            <li><a href="signout">Signout</a></li>
                        </s:else>
                        <li><a href="#contact">Contact</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header><!--/#header-->