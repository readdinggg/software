package com.imnu.servlet;

import com.imnu.dao.dingdandao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class paydingdan extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));

        dingdandao dingdandao = new dingdandao();

        int updatepaymessage = dingdandao.updatepaymessage(id);
        if(updatepaymessage==1){
            writer.println("<script>\n" +
                    "    alert('支付成功');\n" +
                    "    window.location.href=\"/yansheng_war_exploded/jsp/dingdan.jsp\"\n" +
                    "</script>");
        }

    }
}
