package com.imnu.servlet;

import com.imnu.dao.coachdao;
import com.imnu.dao.dingdandao;
import com.imnu.pojo.coachbean;
import com.imnu.pojo.dingdanbean;
import com.imnu.util.getcookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class searchdingdan extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String name = getcookie.getcookie("name", request);


        dingdandao dingdandao = new dingdandao();

        List<dingdanbean> dingdanbeans = dingdandao.selectByUsername(name);

        request.getSession().setAttribute("dingdanbeans",dingdanbeans);

        request.getRequestDispatcher("jsp/dingdan.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
