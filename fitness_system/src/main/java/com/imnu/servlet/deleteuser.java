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

public class deleteuser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        userdao userdao = new userdao();
        int delete = userdao.delete(id);

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();
        List<userbean> userbeanList = userdao.selectAll();




        request.getSession().setAttribute("userbeanlist",userbeanList);




        request.getRequestDispatcher("jsp/manage.jsp").forward(request,response);


    }
}
