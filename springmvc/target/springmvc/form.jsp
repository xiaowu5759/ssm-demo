<%--
  Created by IntelliJ IDEA.
  User: XiaoWu
  Date: 2019/3/30
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 请求路径如何写
永远写 /
/代表什么？
此时的上下文处于容器当中，servlet容器，tomcat
/项目名称/url--%>
<%--无论如何部署，都不需要更换名字--%>
post
<form action="${ctx}/web/m2" method="post">
    <%--post的请求 过不去--%>
    <%--浏览器默认的请求方法就是get--%>
    <input type="submit" >
</form>

delete
<form action="${ctx}/web/m4" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" >
</form>
</body>
</html>
