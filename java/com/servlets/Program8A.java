package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Program8A")
public class Program8A extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        int count = 1;

        Cookie[] cookies = request.getCookies();

        // Find existing cookie WITHOUT parsing integer directly
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals(name)) {
                    String value = c.getValue();

                    // manual conversion logic (no Integer.parseInt usage)
                    int temp = 0;
                    for (int i = 0; i < value.length(); i++) {
                        temp = temp * 10 + (value.charAt(i) - '0');
                    }
                    count = temp + 1;
                    break;
                }
            }
        }

        Cookie userCookie = new Cookie(name, String.valueOf(count));
        userCookie.setMaxAge(60); // 1 minute expiry
        response.addCookie(userCookie);

        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + count + " times</h3>");

        out.println("<h3>Cookie List:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println(c.getName() + " = " + c.getValue() + "<br>");
            }
        } else {
            out.println("No cookies found");
        }

        out.println("<br><b>Cookie expires in 1 minute</b>");
    }
}