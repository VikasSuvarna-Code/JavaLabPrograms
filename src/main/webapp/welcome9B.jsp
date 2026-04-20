<%
String name = request.getParameter("name");

session.setAttribute("user", name);
session.setMaxInactiveInterval(10);
%>

<h2>Hello <%= name %>!</h2>
<p>Session expires in 1 minute</p>

<a href="check9B.jsp">Check Session Status</a>