package com.example.demo2;

import com.sun.xml.internal.ws.encoding.ContentType;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/M")
public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init(config)");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-Type","application/json");
        response.getWriter().write("{\"text\":\"<h2>se cargo informacion de: </h2>\"}");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }
}
