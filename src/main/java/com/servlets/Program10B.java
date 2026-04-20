package com.servlets;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Program10B")
public class Program10B extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rollno = request.getParameter("rollno");
        String name = request.getParameter("name");

        int s1 = Integer.parseInt(request.getParameter("s1"));
        int s2 = Integer.parseInt(request.getParameter("s2"));
        int s3 = Integer.parseInt(request.getParameter("s3"));
        int s4 = Integer.parseInt(request.getParameter("s4"));
        int s5 = Integer.parseInt(request.getParameter("s5"));

        // Server-side validation
        if (rollno == null || name == null) {
            response.getWriter().println("Invalid Input");
            return;
        }

        int total = s1 + s2 + s3 + s4 + s5;
        float avg = total / 5.0f;

        // PASS condition: all subjects > 40
        String result = (s1 > 40 && s2 > 40 && s3 > 40 && s4 > 40 && s5 > 40)
                ? "PASS"
                : "FAIL";

        request.setAttribute("rollno", rollno);
        request.setAttribute("name", name);
        request.setAttribute("s1", s1);
        request.setAttribute("s2", s2);
        request.setAttribute("s3", s3);
        request.setAttribute("s4", s4);
        request.setAttribute("s5", s5);
        request.setAttribute("total", total);
        request.setAttribute("avg", avg);
        request.setAttribute("result", result);

        RequestDispatcher rd = request.getRequestDispatcher("result10B.jsp");
        rd.forward(request, response);
    }
}