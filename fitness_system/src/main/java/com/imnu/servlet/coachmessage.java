package com.imnu.servlet;

import com.imnu.dao.coachdao;
import com.imnu.pojo.coachbean;
import com.imnu.util.getcookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class coachmessage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String name = getcookie.getcookie("name", request);


        coachdao coachdao = new coachdao();
        List<coachbean> selectallcoach = coachdao.selectallcoach(name);

        request.getSession().setAttribute("selectallcoach",selectallcoach);

        request.getRequestDispatcher("jsp/coachmessage.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String name = getcookie.getcookie("name", request);


        coachdao coachdao = new coachdao();
        List<coachbean> selectallcoach = coachdao.selectallcoach(name);



        request.getSession().setAttribute("selectallcoach",selectallcoach);

        request.getRequestDispatcher("jsp/coachmessage.jsp").forward(request,response);
    }
}
