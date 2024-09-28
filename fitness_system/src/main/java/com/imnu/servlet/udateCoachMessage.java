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
import java.io.PrintWriter;

public class udateCoachMessage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();
        String name = getcookie.getcookie("name", request);

        String sex = request.getParameter("sex");
        int age = Integer.parseInt(request.getParameter("age"));
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");
        String worktime = request.getParameter("worktime");
        String remark = request.getParameter("remark");
        int lesson = Integer.parseInt(request.getParameter("lessontime"));
        int price = Integer.parseInt(request.getParameter("price"));

        coachbean coachbean = new coachbean();
        coachbean.setname(name);
        coachbean.setSex(sex);
        coachbean.setAge(age);
        coachbean.setHeight(height);
        coachbean.setWeight(weight);
        coachbean.setWorktime(worktime);
        coachbean.setRemark(remark);
        coachbean.setLessontime(lesson);
        coachbean.setPrice(price);

        coachdao coachdao = new coachdao();
        int i = coachdao.updateCoach(coachbean);

        writer.println("<script>\n" +
                "    alert('修改成功');\n" +
                "    window.location.href=\"/yansheng_war_exploded/jsp/coachmessage.jsp\"\n" +
                "</script>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
