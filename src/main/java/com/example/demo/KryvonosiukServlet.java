package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "KryvonosiukServlet", value = "/KryvonosiukServlet")
public class KryvonosiukServlet extends HttpServlet {
    public void init() {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("vitaliyaHTML.html");
    }

    @Override
    public void destroy() {

    }
}
