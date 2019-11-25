package com.me;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class FirstServlet extends HttpServlet {

    private Logger logger = Logger.getLogger(FirstServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 设置:响应内容类型
        resp.setContentType("text/html");

        // 输出文本
        PrintWriter out = resp.getWriter();
        out.write("<h1> my first servlet </h1>");

        // 测试该servlet的输入参数
        out.println("<br/>current servlet parameters : " + getServletConfig().getInitParameter("input1"));
        out.println("<br/>current servlet parameters : " + getServletConfig().getInitParameter("input2"));

        // 测试整个应用的输入参数
        out.println("<br/>current app parameters : " + getServletContext().getInitParameter("input1"));
        out.println("<br/>current app parameters : " + getServletContext().getInitParameter("input2"));


    }
}
