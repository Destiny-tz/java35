<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/2 0002
  Time: 上午 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <style>
         body {
             text-align: center;
             width: 500px;
             margin: 0 auto;
             line-height:50px;
         }
    </style>
    <%  %>
    <% System.out.println("进入LOGIN.JSP页面，欢迎来到这里");%>
</head>
<body>
        <div class="main">
        <form action="service/doLogin.jsp" method="post">
            <div>
                <label for="userName">用户名</label>
                <input type="text" name="userName" placeholder="请输入的你的用户名" id="userName"/>
            </div>
            <div>
                <label for="loginPwd">密码</label>
                <input type="password" name="loginPwd" placeholder="请输入你的密码" id="loginPwd"/>
            </div>
            <div>
                <button>登录</button>
                <button>注册</button>
            </div>

        </form>

        </div>
</body>
</html>
