package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Program8B")
public class Program8B extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String domain = request.getParameter("domain");
        int age = Integer.parseInt(request.getParameter("age"));

        Cookie nameCookie = new Cookie("Name", name);
        Cookie domainCookie = new Cookie("Domain", domain);

        nameCookie.setMaxAge(age);
        domainCookie.setMaxAge(age);

        response.addCookie(nameCookie);
        response.addCookie(domainCookie);

        out.println("<h2>Cookie Added Successfully</h2>");

        out.println("<h3>Set Values:</h3>");
        out.println("Name: " + name + "<br>");
        out.println("Domain: " + domain + "<br>");
        out.println("Max Age: " + age + " seconds<br>");

        out.println("<h3>Active Cookies:</h3>");

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println(c.getName() + " = " + c.getValue() + "<br>");
            }
        } else {
            out.println("No cookies available");
        }

        out.println("<br><b>Cookie expiry demonstrated using Max Age</b>");
    }
}