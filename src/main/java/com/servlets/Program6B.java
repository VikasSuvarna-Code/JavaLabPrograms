package com.servlets;




import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Program6B")
public class Program6B extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visits = 0;
        String storedName = null;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {

                if ("username".equals(c.getName())) {
                    storedName = c.getValue();
                }

                if ("visits".equals(c.getName())) {
                    try {
                        visits = Integer.parseInt(c.getValue());
                    } catch (Exception e) {
                        visits = 0;
                    }
                }
            }
        }

        if (name != null && !name.isEmpty()) {
            Cookie nameCookie = new Cookie("username", name);
            nameCookie.setMaxAge(60);
            nameCookie.setPath("/");

            response.addCookie(nameCookie);
            storedName = name;
        }

        visits++;

        Cookie visitCookie = new Cookie("visits", String.valueOf(visits));
        visitCookie.setMaxAge(60);
        visitCookie.setPath("/");

        response.addCookie(visitCookie);

        if (storedName != null) {
            out.println("<h2>Welcome back " + storedName + "!</h2>");
            out.println("<h3>You have visited this page " + visits + " times</h3>");
            out.println("<p>Cookie expires in 60 seconds</p>");
        } else {
            out.println("<h2>Welcome first time user!</h2>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}