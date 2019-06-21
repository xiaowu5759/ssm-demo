package com.xiaowu.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

// 注册一个servlet
// 标记 servlet名字 {} 不匹配任何url
// localOnStartup = 2随着容器启动而启动
@WebServlet(urlPatterns = {},loadOnStartup = 2)
public class WebPathInitServlet extends HttpServlet {

    @Override
    // ctx 应用整体的上下文路径
    // 在整体应用上下文当中存储一个ctx的值，用它来引用上下文路径
    public void init(ServletConfig config) throws ServletException {
        config.getServletContext().setAttribute("ctx",config.getServletContext().getContextPath());
        super.init(config);
    }
}
