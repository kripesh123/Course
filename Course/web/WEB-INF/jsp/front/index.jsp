<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Welcome</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <!-- Bootstrap 3.3.2 -->
        <link href="${pageContext.request.contextPath}/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- Font Awesome Icons -->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="${pageContext.request.contextPath}/assets/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />
        <!-- iCheck -->
        <link href="${pageContext.request.contextPath}/assets/plugins/iCheck/square/blue.css" rel="stylesheet" type="text/css" />

       
    </head>
    <div class="pull-left">
        <body class="login-page" style="background-image: url(${pageContext.request.contextPath}/assets/img/duke.jpg)">
            <div class="login-box">
                <div class="login-logo">
                    <a href=""  style="color: #9999ff"><b>Login</b></a>
                </div><!-- /.login-logo -->
                <div class="login-box-body">
                    <p class="login-box-msg">Sign in to start your session</p>
                    <form action="${pageContext.request.contextPath}/Checking" method="POST">
                        <div class="form-group has-feedback">
                            <input type="text" class="form-control" name = "username" placeholder="Username"/>
                            <span class="glyphicon glyphicon-user form-control-feedback"></span>
                        </div>
                        <div class="form-group has-feedback">
                            <input type="password" class="form-control" name = "password" placeholder="Password"/>
                            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                        </div>
                        <div class="row">
                            <div class="col-xs-8">    
                                <div class="checkbox icheck">
                                    <label>
                                        <input type="checkbox"> Remember Me
                                    </label>
                                </div>                        
                            </div><!-- /.col -->
                            <div class="col-xs-4">
                                <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
                            </div><!-- /.col -->
                        </div> 
                    </form>

                    <div class="social-auth-links text-center">
                        <p>- OR -</p>
                        <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign in using Facebook</a>
                        <a href="#" class="btn btn-block btn-social btn-google-plus btn-flat"><i class="fa fa-google-plus"></i> Sign in using Google+</a>
                    </div><!-- /.social-auth-links -->

                    <a href="#" id="forgot-password">I forgot my password</a><br>
                    <a href="#" class="text-center">Register as a new membership</a>

                </div><!-- /.login-box-body -->
            </div><!-- /.login-box -->

            <!-- jQuery 2.1.3 -->
            <script src="${pageContext.request.contextPath}/assets/plugins/jQuery/jQuery-2.1.3.min.js"></script>
            <!-- Bootstrap 3.3.2 JS -->
            <script src="${pageContext.request.contextPath}/assets/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
            <!-- iCheck -->
            <script src="${pageContext.request.contextPath}/assets/plugins/iCheck/icheck.min.js" type="text/javascript"></script>
            <script>
                $(document).on("ready", function () {
                    $(".login-box").css("display", "none").slideDown(500);
                });
            </script>

            <script>
                $(function () {
                    $('input').iCheck({
                        checkboxClass: 'icheckbox_square-blue',
                        radioClass: 'iradio_square-blue',
                        increaseArea: '20%' // optional
                    });
                });
            </script>
        </body>
    </div>
</html>
