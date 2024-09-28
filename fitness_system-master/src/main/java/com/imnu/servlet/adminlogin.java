package com.imnu.servlet;

import com.imnu.dao.userdao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class adminlogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        userdao userdao = new userdao();

        int admin = userdao.isAdmin(user, password);

        if(admin==1){
            writer.println("<script>\n" +
                    "    alert('管理员登陆成功');\n" +
                    "    window.location.href=\"/yansheng_war_exploded/jsp/manage.jsp\"\n" +
                    "</script>");
        }else{
            writer.println("<script>\n" +
                    "    alert('管理员密码错误，请重新登录');\n" +
                    "    window.location.href=\"/yansheng_war_exploded/login/adminlogin.html\"\n" +
                    "</script>");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
