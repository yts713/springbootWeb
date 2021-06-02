<%--
  Created by IntelliJ IDEA.
  User: MrDong
  Date: 2021/6/1
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
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
</head>
<body>
<div id = "login">
    <form id = "forml" name = "forml" method = "get" action="index.html">
        <dl>
            <dt>一蓑烟雨</dt>
            <dd><input type="" name="userName" class="input-size" placeholder="请输入账号" autofocus="autofocus"/></dd>
            <dd><input type = "password" name = "password" class=" input-size" placeholder="请输入密码"/></dd>
            <dd></dd>
            <dd><input type="submit" value="登录" class="btn-submit"/></dd>
        </dl>
    </form>
</div>
</body>
</html>
