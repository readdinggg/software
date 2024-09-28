package com.imnu.servlet;

import com.imnu.dao.userdao;
import com.imnu.pojo.userbean;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String user = request.getParameter("user");
        String password = request.getParameter("password");

        userbean u1 = new userbean();

        u1.setName(user);
        u1.setPassword(password);

        PrintWriter writer = response.getWriter();

        userdao userdao = new userdao();
        int i = userdao.IsLive(user, password);
        if(i==1){
            //request.setAttribute("user",user);//共享数据
            //request.getRequestDispatcher("/gallery.html");//.forward(req,resp);//重定向

            Cookie name = new Cookie("name",request.getParameter("user"));
            Cookie passwd = new Cookie("passwd",request.getParameter("password"));

            // 为两个 Cookie 设置过期日期为 24 小时后
            name.setMaxAge(60*60*24);
            passwd.setMaxAge(60*60*24);

            // 在响应头中添加两个 Cookie
            response.addCookie(name);
            response.addCookie(passwd);



            //response.sendRedirect("/yansheng_war_exploded/gallery.html");
            writer.println("<script>\n" +
                    "    alert('登陆成功');\n" +
                    "    window.location.href=\"/yansheng_war_exploded/gallery.html\"\n" +
                    "</script>");
        }else if(i==0){
            writer.println("<script>\n" +
                    "    alert('登陆失败');\n" +
                    "    window.location.href=\"/yansheng_war_exploded/login/login.html\"\n" +
                    "</script>");
            //response.sendRedirect("/yansheng_war_exploded/login/login.html");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
