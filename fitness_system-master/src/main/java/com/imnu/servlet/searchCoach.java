package com.imnu.servlet;

import com.imnu.dao.coachdao;
import com.imnu.dao.userdao;
import com.imnu.pojo.coachbean;
import com.imnu.pojo.userbean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class searchCoach extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        List<coachbean> coachbeanList = null;

        PrintWriter writer = response.getWriter();
        coachdao coachdao = new coachdao();
        if(request.getParameter("username")==null){
            coachbeanList = coachdao.selectAllcoach();
        }else{
            String username = request.getParameter("username");
            coachbeanList = coachdao.selectSomeCoach(username);
        }



        request.getSession().setAttribute("coachbeanList",coachbeanList);




        request.getRequestDispatcher("jsp/searchCoach.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        List<coachbean> coachbeanList = null;

        PrintWriter writer = response.getWriter();
        coachdao coachdao = new coachdao();
        if(request.getParameter("username")==null){
            coachbeanList = coachdao.selectAllcoach();
        }else{
            String username = request.getParameter("username");
            coachbeanList = coachdao.selectSomeCoach(username);
        }



        request.getSession().setAttribute("coachbeanList",coachbeanList);




        request.getRequestDispatcher("jsp/searchCoach.jsp").forward(request,response);
    }
}
