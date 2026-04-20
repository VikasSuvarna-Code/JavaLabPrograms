package com.servlets;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Program10A")
public class Program10A extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String designation = request.getParameter("designation");

        // Server-side validation
        if (username == null || email == null || designation == null ||
            username.isEmpty() || email.isEmpty() || designation.isEmpty()) {

            response.getWriter().println("<h2>Server Validation Failed: All fields required</h2>");
            return;
        }

        request.setAttribute("username", username);
        request.setAttribute("email", email);
        request.setAttribute("designation", designation);

        RequestDispatcher rd = request.getRequestDispatcher("result10A.jsp");
        rd.forward(request, response);
    }
}