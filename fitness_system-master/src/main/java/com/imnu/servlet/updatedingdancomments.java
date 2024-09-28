package com.imnu.servlet;

import com.imnu.dao.dingdandao;
import com.imnu.pojo.dingdanbean;
import com.imnu.util.getcookie;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class updatedingdancomments extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();

        String name = getcookie.getcookie("name", request);
        int id = Integer.parseInt(request.getParameter("id"));
        String comments = request.getParameter("comments");

        dingdandao dingdandao = new dingdandao();
        int updatecomments = dingdandao.updatecomments(comments, id);

        List<dingdanbean> dingdanbeans = dingdandao.selectByUsername(name);

        request.getSession().setAttribute("dingdanbeans",dingdanbeans);

        request.getRequestDispatcher("jsp/comments.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));
        String comments = request.getParameter("comments");

        writer.println(id+comments);

//        dingdandao dingdandao = new dingdandao();
//
//        int updatepaymessage = 1;//dingdandao.updatecomments()
//        if(updatepaymessage==1){
//            writer.println("<script>\n" +
//                    "    alert('支付成功');\n" +
//                    "    window.location.href=\"/yansheng_war_exploded/jsp/dingdan.jsp\"\n" +
//                    "</script>");
//        }
    }
}
