<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/2 0002
  Time: 上午 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
     request.setCharacterEncoding("utf-8");
    String userName = request.getParameter("userName");
    String loginPwd = request.getParameter("loginPwd");

    System.out.println("用户名：" + userName + ",登录密码：" + loginPwd);
    if(userName.equals("admin") && loginPwd.equals("123456")){ //登录成功。
        //跳转到查询所有信息的页面
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("doQuery.jsp"); //获取页面转发的对象
        requestDispatcher.forward(request,response);
    } else {
        //返回登录页面
        //response.sendRedirect("../login.jsp"); //重新回到login.jsp页面中去
        String scheme = request.getScheme(); //得到协议
        String serverName = request.getServerName();//得到服务器ip地址
        int port = request.getServerPort(); //获取服务器端口号
        //String servletPath = request.getServletPath(); //获取当前被访问的servlet
        String contextPath = request.getContextPath();//获取当前的项目名

        String url = scheme + "://" + serverName + ":" + port + contextPath + "/login.jsp";
        System.out.println(url);

        response.sendRedirect(url); //重新回到login.jsp页面中去
    }
%>