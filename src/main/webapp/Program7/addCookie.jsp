<%
String name = request.getParameter("name");
String domain = request.getParameter("domain");
int age = Integer.parseInt(request.getParameter("age"));

Cookie c1 = new Cookie("name", name);
Cookie c2 = new Cookie("domain", domain);

c1.setMaxAge(age);
c2.setMaxAge(age);

response.addCookie(c1);
response.addCookie(c2);
%>

<html>
<body>

<h2>Cookie Added Successfully</h2>

<p>Name: <%= name %></p>
<p>Domain: <%= domain %></p>
<p>Max Age: <%= age %> seconds</p>

<br>
<a href="showCookies.jsp">Go to Active Cookie List</a>

</body>
</html>