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

public class messageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userdao userdao = new userdao();
        List<userbean> userbeanList = userdao.selectAll();

        request.setAttribute("userbeanlist",userbeanList);
        System.out.println(userbeanList+"全部用户");
        PrintWriter writer = response.getWriter();
        writer.println("GG");

        request.getRequestDispatcher("jsp/test.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        userdao userdao = new userdao();
        List<userbean> userbeanList = userdao.selectAll();

        for (userbean u:userbeanList){
            System.out.println(u);
        }


        request.getSession().setAttribute("userbeanlist",userbeanList);




        request.getRequestDispatcher("jsp/test.jsp").forward(request,response);
    }
}
