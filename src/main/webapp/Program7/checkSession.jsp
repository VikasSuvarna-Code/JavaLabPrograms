<%
String name = (String) session.getAttribute("user");

if (name == null) {
%>
    <h2>Session Expired</h2>
<%
} else {
%>
    <h2>Welcome back <%= name %></h2>
<%
}
%>