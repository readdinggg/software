package com.imnu.servlet;

import com.imnu.dao.userdao;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class coachlogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();



        String user = request.getParameter("user");
        String password = request.getParameter("password");

        userdao userdao = new userdao();

        int coach = userdao.isCoach(user, password);

        if(coach == 1){

            Cookie name = new Cookie("name",request.getParameter("user"));
            Cookie passwd = new Cookie("passwd",request.getParameter("password"));

            name.setMaxAge(60*60*24);
            passwd.setMaxAge(60*60*24);

            response.addCookie(name);
            response.addCookie(passwd);

            writer.println("<script>\n" +
                    "    alert('教练登陆成功');\n" +
                    "    window.location.href=\"/yansheng_war_exploded/coachmessage\"\n" +
                    "</script>");
        }else{
            writer.println("<script>\n" +
                    "    alert('教练登陆失败');\n" +
                    "    window.location.href=\"/yansheng_war_exploded/login/coachlogin.html\"\n" +
                    "</script>");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
