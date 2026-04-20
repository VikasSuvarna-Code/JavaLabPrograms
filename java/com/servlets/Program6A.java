package com.servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Program6A")
public class Program6A extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String numStr = request.getParameter("num");

        if (numStr == null || numStr.isEmpty()) {
            out.println("<h2>Please enter a number</h2>");
            return;
        }

        int num = Integer.parseInt(numStr);
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        out.println("<h2>Factorial Result: " + fact + "</h2>");
    }
}