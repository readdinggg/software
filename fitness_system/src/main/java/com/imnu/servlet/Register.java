package com.imnu.servlet;

import com.imnu.dao.coachdao;
import com.imnu.dao.userdao;
import com.imnu.pojo.userbean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        int add = 0;

        PrintWriter writer = response.getWriter();

        userdao user = new userdao();
        userbean u1 = new userbean();

        u1.setName(request.getParameter("user"));
        u1.setPassword(request.getParameter("password"));
        u1.setPhone(request.getParameter("phone"));
        u1.setAddress(request.getParameter("address"));
        u1.setSex(request.getParameter("sex"));
        u1.setRealname(request.getParameter("realname"));
        u1.setScore(request.getParameter("score"));
        u1.setPlan(request.getParameter("plan"));
        u1.setIs_coach(request.getParameter("is_coach"));

        if(request.getParameter("is_coach").equals("Y")){
            coachdao coachdao = new coachdao();
            coachdao.insertCoach(request.getParameter("user"));
        }

        if(user.Is_exist(request.getParameter("user")) == 0){
            add = user.add(u1);
        }

        if(add == 1){
            writer.println("<script>\n" +
                    "    alert('注册成功，请重新登录');\n" +
                    "    window.location.href=\"/yansheng_war_exploded/index.html\"\n" +
                    "</script>");
        }else{
            writer.println("<script>\n" +
                    "    alert('注册失败，用户名重复');\n" +
                    "    window.location.href=\"/yansheng_war_exploded/Register/Register.html\"\n" +
                    "</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
