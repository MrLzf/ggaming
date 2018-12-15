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
    <title>Document</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/game.css">
<link href="/css/jquery.mCustomScrollbar.css" rel="stylesheet" type="text/css"/>
<script src="/js/jquery.js"></script>
<script src="/js/jquery-ui-1.10.4.min.js"></script>
<#--<link rel="stylesheet" href="/js/bootstrap-3.3.2-dist/css/bootstrap.css" type="text/css" />-->
<script src="/js/jquery.mousewheel-3.0.6.js"></script>
<script src="/js/jquery.mCustomScrollbar.min.js"></script>
<script type="text/javascript" src="/js/bootstrap-3.3.2-dist/js/bootstrap.js"></script>
<script type="text/javascript" src="/js/plugins/jquery-validation/jquery.validate.js"></script>
<script type="text/javascript" src="/js/plugins/jquery-validation/localization/messages_zh.js"></script>
<script type="text/javascript" src="/js/plugins/jquery.form.js"></script>
<script type="text/javascript" src="/js/jquery.bootstrap.min.js"></script>
<style>
    ._mCS_1 .mCSB_scrollTools .mCSB_dragger .mCSB_dragger_bar {
        background: #cef7fd;
        width: 10px;
    }

    ._mCS_1 .mCSB_scrollTools .mCSB_draggerRail {
        background: #202643;
        width: 10px;
    }
</style>
<script type="text/javascript">
    $(function () {
                //
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
                                    window.location.href = "/pc/index";
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

<body>
<img id="div_first" src='/img/bg01.jpg'/>
<div class="theGameTitle">
    <div class="Gamebox">
        <div class="gameLogo"></div>



<#if account??>
        <div class="titleId"> ID : ${account.accountno} </div>
            <div class="moneyNum"><img src="/img/ico_s.png" alt=""> ${balance}</div>
<#else >
        <form id="loginForm" class="form-horizontal el-login-form" action="/userLogin" method="post">
            <div class="login_box">
                <input name="username" class="user_input" type="text" placeholder="用户名" required />
                <input name="password" class="user_input" type="password" placeholder="密码" required />
                <input type="submit" value="LOGIN" class="login_input">
            </div>

        </form>
</#if>

        <div class="home"><img src="/img/ico_h.png" alt=""></div>
    </div>
</div>
<div class="theGameMain">
    <div class="Gamebox">
        <div class="fishGame">
            <a
                <#if image.gameid??>
                    href="/playGame?gameid=${image.gameid}">
                <#else >
                    href="#">
                </#if>
                <#if image.logoZh??>
                    <img src="http://mt.gg626.com/picture/${image.logoZh}">
                <#else >
                    <img src="http://mt.gg626.com/picture/">
                </#if>

            </a></div>
        <div class="GameList">
        <#list game.list as vo>
            <div class="list">
                <div class="ghover"
                     style="
                     <#if vo.logoZh??>
                             background:url('http://mt.gg626.com/picture/${vo.logoZh}')
                     </#if>
                             left center no-repeat; background-size: 100%;"><span><a
                        <#if vo.gameid??>
                    href="/playGame?gameid=${vo.gameid}">
                        <#else >
                    href="#">
                        </#if>

                    开始游戏</a></span>
                </div>
            </div>
        </#list>
        </div>
        <script type='text/javascript'>
            (function ($) {
                $(window).load(function () {
                    $(".GameList").mCustomScrollbar({
                        scrollButtons: {
                            enable: false,//是否添加 滚动条两端按钮支持 值:true,false
                            scrollType: "continuous",//滚动按钮滚动类型 值:”continuous”(当你点击滚动控制按钮时断断续续滚动) “pixels”(根据每次点击的像素数来滚动)
                            scrollSpeed: 50,//设置点击滚动按钮时候的滚动速度(默认 20)
                            scrollAmount: 60//设置点击滚动按钮时候每次滚动的数值 像素单位 默认 40像素
                        },
                        horizontalScroll: false,//是否创建一个水平滚动条 默认是垂直滚动条
                        set_width: false,//：设置你内容的宽度 值可以是像素或者百分比
                        set_height: false,//：设置你内容的高度 值可以是像素或者百分比
                        mouseWheel: true,//鼠标滚动的支持 值为:true.false
                        //mouseWheelPixels:10,//：鼠标滚动中滚动的像素数目(step) 值为以像素为单位的数值
                        callbacks: {
                            onScrollStart: function () {//使用自定义的回调函数在滚动时间开始的时候执行

                            },
                            onScroll: function () {//自定义回调函数在滚动中执行

                            },
                            onTotalScroll: function () {//当滚动到底部的时候调用这个自定义回调函数

                            },
                            onTotalScrollBack: function () {//当滚动到顶部的时候调用这个自定义回调函数

                            },
                            onTotalScrollOffset: 10,//设置到达顶部或者底部的偏移量 像素单位

                            whileScrolling: function () {//当用户正在滚动的时候执行这个自定义回调函数

                            },
                            whileScrollingInterval: 10,//设置调用 whileScrolling 回调函数的时间间隔 毫秒单位
                        }
                    });
                });
            })(jQuery);
        </script>


    </div>
</div>
</div>
</body>
</html>
<#--<script src="/js/jquery-1.12.4.min.js"></script>-->
<script>
    var imgs = ["/bg01.jpg", "/bg02.jpg", "/bg03.jpg"];

    function time() {
        var i = Math.floor(Math.random() * (3 + 0) + 0);
        document.getElementById("div_first").src = "/img/" + imgs[i];
    }

    setInterval("time()", 3000);


    autodivheight();

    function autodivheight() {
        var winHeight = 0;
        if (window.innerHeight)
            winHeight = window.innerHeight;
        else if ((document.body) && (document.body.clientHeight))
            winHeight = document.body.clientHeight;
        if (document.documentElement && document.documentElement.clientHeight)
            winHeight = document.documentElement.clientHeight;
        document.getElementById("div_first").style.height = winHeight + "px";

    }

    window.onresize = autodivheight;

</script>
