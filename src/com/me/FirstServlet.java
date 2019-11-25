package com.me;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 设置:响应内容类型
        resp.setContentType("text/html");

        // 输出文本
        PrintWriter out = resp.getWriter();
        out.write("<h1> my first servlet </h1>");

    }
}
