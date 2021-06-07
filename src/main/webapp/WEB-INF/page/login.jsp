<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body{
        font-family: "微软雅黑";
        font-size: 12px;
        background-color: lightblue;
        /*background:url('img/IMG_2387.png');*/ /*背景图片 */

    }
    #login{
        position: relative;
        width: 300px;
        /*边框样式*/
        border: solid 3px #FFFFFF;
        border-radius: 10px;
        /*边界*/
        margin: 200px auto 0px;
        background-color: rgba(255,255,255,0.5);	 /*半透明效果*/
    }
    #login dl dt{
        font-size: 14px;
        font-weight: bold;
        text-align: center;
        line-height: 50px;
    }
    #login dl dd{
        margin: 5px 0px;
        text-align: center;

    }
    .input-size{
        width: 200px;
        height: 26px;
        padding-left: 5px;/*左部填充*/
        line-height: 26px;
    }
    .btn-submit{
        width: 200px;
        height: 35px;
        line-height: 28px;
        margin-top: 10px;
        background-color:#199099 ;
        border: 0px;
        color: #FFFFFF;
        cursor: pointer;
    }
    .btn-submit:hover{
        opacity: 0.6;
    }
</style>

<head>
    <title>Title</title>
    <link rel="shortcut icon" href="#"/>
    <script type="text/javascript" src="/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#loginButton").click(function(){
                var username = $("#username").val();
                var password = $("#password").val();
                var real_path = getRootPath();
                if($.trim(username)==""){
                    alert("账户不能为空");
                }
                if($.trim(password)==""){
                    alert("密码不能为空");
                }
                alert(real_path);
                $.ajax({
                    url:real_path+"/loginAct",
                    type:"post",
                    data:{username:username,password:password},
                    success:function(data){

                    },
                    error:function () {
                        alert("网络错误");
                    }
                })
            })
        });
        function getRootPath() {
            // 1、获取当前全路径，如： http://localhost:8080/springmvc/page/frame/test.html
            var curWwwPath = window.location.href;
            // 获取当前相对路径： /springmvc/page/frame/test.html
            var pathName = window.location.pathname;    // 获取主机地址,如： http://localhost:8080
            var local = curWwwPath.substring(0,curWwwPath.indexOf(pathName));
            // 获取带"/"的项目名，如：/springmvc
            var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
            var rootPath = local + projectName;
            return rootPath;
        }
    </script>
</head>
<body>
<div id = "login">
    <form id = "forml" name = "forml">
        <dl>
            <dt>一蓑烟雨</dt>
            <dd><input id="username" type="text" name="userName" class="input-size" placeholder="请输入账号" autofocus="autofocus"/></dd>
            <dd><input id="password" type ="password" name = "password" class=" input-size" placeholder="请输入密码"/></dd>
            <dd></dd>
            <dd><input id="loginButton" type="button" value="登录" class="btn-submit"/></dd>
        </dl>
    </form>
</div>
</body>
</html>
