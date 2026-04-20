<%
Cookie[] cookies = request.getCookies();
%>

<html>
<body>

<h2>Active Cookies List</h2>

<%
if (cookies != null) {
    for (Cookie c : cookies) {
%>
        <p><%= c.getName() %> : <%= c.getValue() %></p>
<%
    }
} else {
%>
    <p>No cookies found</p>
<%
}
%>

</body>
</html>