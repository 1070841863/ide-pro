package com.seve.servlet;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "Hello1Servlet")
public class Hello1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        response.getWriter().println("<h1>Hello Servlet!1adadadad1</h1>");
        response.getWriter().println(new Date().toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        doPost(request,response);
    }
}
