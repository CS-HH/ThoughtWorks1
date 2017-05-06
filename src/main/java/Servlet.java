package main.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Tom on 2017/5/6.
 */
@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        System.out.println(name);
        response.setContentType("html/text");
        response.setCharacterEncoding("utf-8");
        PrintWriter ps = response.getWriter();
        ps.print("haha");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
