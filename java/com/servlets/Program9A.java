package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Program9A")
public class Program9A extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);

        // Set 1 minute expiry
        session.setMaxInactiveInterval(60);

        Integer visitCount = (Integer) session.getAttribute("count");

        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }

        session.setAttribute("count", visitCount);

        out.println("<h2>Session Tracking Info</h2>");
        out.println("Session ID: " + session.getId() + "<br>");
        out.println("Creation Time: " + session.getCreationTime() + "<br>");
        out.println("Last Access Time: " + session.getLastAccessedTime() + "<br>");
        out.println("Visit Count: " + visitCount + "<br>");
    }
}