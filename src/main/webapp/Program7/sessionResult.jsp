<%
String name = request.getParameter("name");

// Create session
session.setAttribute("user", name);

// Set session expiry to 1 minute (60 seconds)
session.setMaxInactiveInterval(60);
%>

<html>
<body>

<h2>Hello <%= name %>!</h2>
<p>Session will expire in 1 minute.</p>

</body>
</html>