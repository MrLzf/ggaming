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

<script type="text/javascript">
    $(function () {
                if (/AppleWebKit.*Mobile/i.test(navigator.userAgent) || (/MIDP|SymbianOS|NOKIA|SAMSUNG|LG|NEC|TCL|Alcatel|BIRD|DBTEL|Dopod|PHILIPS|HAIER|LENOVO|MOT-|Nokia|SonyEricsson|SIE-|Amoi|ZTE/.test(navigator.userAgent))) {
                    try {
                        if (/Android|webOS|iPhone|iPod|BlackBerry/i.test(navigator.userAgent)) {
                            window.location.href = '/mobile/index';
                        } else if (/iPad/i.test(navigator.userAgent)) {
                            window.location.href = '/mobile/index';
                        } else {
                            window.location.href = '/pc/index';
                        }
                    } catch (e) {
                    }
                }else {
                            window.location.href = '/pc/index';
                }
            }
    );

</script>
<body>

</body>
</html>

