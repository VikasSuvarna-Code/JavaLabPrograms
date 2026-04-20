<%
String name = request.getParameter("name");

session.setAttribute("user", name);
session.setMaxInactiveInterval(10);
%>

<h2>Hello <%= name %>!</h2>

<a href="check9C.jsp">Click here to check session</a>