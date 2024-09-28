package com.imnu.servlet;

import com.imnu.dao.userdao;
import com.imnu.pojo.userbean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class manage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        List<userbean> userbeanList = null;

        PrintWriter writer = response.getWriter();
        userdao userdao = new userdao();
        if(request.getParameter("username")==null){
            userbeanList = userdao.selectAll();
        }else{
            String username = request.getParameter("username");
            userbeanList = userdao.getsomeuser(username);
        }



        request.getSession().setAttribute("userbeanlist",userbeanList);




        request.getRequestDispatcher("jsp/manage.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
