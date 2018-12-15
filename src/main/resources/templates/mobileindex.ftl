<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<!--[if IE 8 ]> <html class="ie8" lang="en"> <![endif]-->
<!--[if IE 9 ]> <html class="ie9" lang="en"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en"> <!--<![endif]-->
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>GG Gamimg</title>
    <link href="/css/mobile/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->

    <!-- Custom styles for this template -->
    <link href="/css/mobile/css/style.css" rel="stylesheet">

    <script src="/js/mobile/jquery-1.10.2.min.js"></script>
    <script src="/js/mobile/bootstrap.min.js"></script>

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]>
    <script src="js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="js/html5shiv.min.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript" src="/js/plugins/jquery-validation/jquery.validate.js"></script>
    <script type="text/javascript" src="/js/plugins/jquery-validation/localization/messages_zh.js"></script>
    <script type="text/javascript" src="/js/plugins/jquery.form.js"></script>
    <script type="text/javascript" src="/js/jquery.bootstrap.min.js"></script>
</head>
//
<script type="text/javascript">
    $(function () {
                $("#loginForm").validate({
                    highlight: function (element, errorClass) {
                        $(element).closest("div.form-group").addClass("has-error");
                    },

                    unhighlight: function (element, errorClass) {
                        $(element).closest("div.form-group").removeClass("has-error");
                    },
                    submitHandler: function (form) {
                        //异步提交
                        $("#loginForm").ajaxSubmit({
                            type: 'post',
                            dataType: 'json',
                            success: function (data) {
                                console.log(data);
                                if (data.success) {
                                    /* console.log("2");
                                     $.messager.confirm("温馨提示","确认登录吗?", function () {*/
                                    window.location.href = "/mobile/index";
                                    /* })*/
                                } else {
                                    alert(data.msg)
                                    //$.messager.popup(data.msg);
                                }
                            }
                        })
                    }

                });
            }
    );

</script>

<body class="bj">
<!-- Fixed navbar -->
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-2">
                <a class="logo" href="#">
                    <img alt="Brand" class="img-responsive center-block logoindex" alt="Responsive image" src="/img/mobile/logo.png">
                </a>
            </div>
            <!--登录前-->
            <div class="col-xs-10">
                <#if account??>
                    <ul class="nav navbar-nav navbar-right mobile-bar">
            <li class="moneyNum"><img src="/img/mobile/ico_s.png" alt=""> ${balance}</li>
                    <li class="titleId"> ID : ${account.accountno}</li>

                <#else >
                <ul class="nav navbar-nav navbar-right mobile-bar">
                    <li><a href="#eduzhuanhuan" data-toggle="modal">登入</a></li>
                </ul>
                </#if>
            </div>
            <!--登录后-->
            <!--  <div class="col-xs-10">
            <ul class="nav navbar-nav navbar-right mobile-bar">
            <li class="moneyNum">  <img src="/img/mobile/ico_s.png" alt=""> 15,825 </li>				<li class="titleId"> ID : test625 </li>

            </ul>
            </div>-->
            <!--登录后结束-->
        </div>
    </div>

</nav>
<!-- Fixed navbar end -->

<div class="container pagein">


    <div class="row showgame2">
        <div class="col-md-4 col-xs-12 picshow">
            <a
                    <#if image.gameid??>
                    href="/playGame?gameid=${image.gameid}"
                    <#else >
                    href="#"
                    </#if>
                    class="thumbnail gameimg">
                <#if image.logoZh??>
                   <#-- <img src="http://mt.gg626.com/picture/${image.logoZh}">-->
                    <img src="/img/mobile/img_fishing.png">
                <#else >
                    <img src="/img/mobile/img_fishing.png">
                </#if>
            </a>

        </div>
<#list game.list as vo>
        <div class="col-md-4 col-xs-6 picshow">
            <a
                     <#if vo.gameid??>
                    href="/playGame?gameid=${vo.gameid}"
                     <#else >
                    href="#"
                     </#if>

                    class="thumbnail gameimg">
            <img
                        <#if vo.logoZh??>
                             src='http://mt.gg626.com/picture/${vo.logoZh}'>
                        <#else >
                        src="" >
                        </#if>
            </a>
        </div>
</#list>
    <#-- <div class="col-md-4 col-xs-6 picshow">
         <a href="#" class="thumbnail gameimg">
             <img src="/img/mobile/img_lucky.png">
         </a>

     </div>

     <div class="col-md-4 col-xs-6 picshow">
         <a href="#" class="thumbnail gameimg">
             <img src="/img/mobile/img_long.png">
         </a>
     </div>

     <div class="col-md-4 col-xs-6 picshow">
         <a href="#" class="thumbnail gameimg">
             <img src="/img/mobile/img_fruit.png">
         </a>


     </div>

     <div class="col-md-4 col-xs-6 picshow">
         <a href="#" class="thumbnail gameimg">
             <img src="/img/mobile/img_deal.png">
         </a>

     </div>

     <div class="col-md-4 col-xs-6 picshow">
         <a href="#" class="thumbnail gameimg">
             <img src="/img/mobile/img_goldshark.png">
         </a>

     </div>
-->

    </div>
</div> <!-- /container -->
<!--nav bottom-->

<!--登录 -->
<div class="modal fade" id="eduzhuanhuan" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">会员登入</h4>
            </div>
            <div class="modal-body">
                <form id="loginForm" action="/userLogin" method="post">
                    <table width="100%" cellspacing="0" cellpadding="0" border="0" class="table">
                        <tbody>
                        <tr>
                            <td align="right">用户名&nbsp;&nbsp;</td>
                            <td>
                                <span>&nbsp;&nbsp;</span><input type="text" name="username" class="input_login" required >&nbsp;&nbsp;
                            </td>
                        </tr>
                        <tr>
                            <td align="right">密&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;</td>
                            <td>
                                <span>&nbsp;&nbsp;</span><input type="password" name="password" class="input_login" required >&nbsp;&nbsp;
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" id="SubmitForm" value="登&nbsp;&nbsp;入" class="btn btn-login" name="Submit">
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭窗口</button>
            </div>
        </div>
    </div>
</div>


</body>
</html>

