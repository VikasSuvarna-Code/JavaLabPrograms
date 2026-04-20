<html>
<body>

<h2>Student Result</h2>

Roll No: <%= request.getAttribute("rollno") %><br>
Name: <%= request.getAttribute("name") %><br><br>

Sub1: <%= request.getAttribute("s1") %><br>
Sub2: <%= request.getAttribute("s2") %><br>
Sub3: <%= request.getAttribute("s3") %><br>
Sub4: <%= request.getAttribute("s4") %><br>
Sub5: <%= request.getAttribute("s5") %><br><br>

Total Marks: <%= request.getAttribute("total") %><br>
Average: <%= request.getAttribute("avg") %><br>
Result: <b><%= request.getAttribute("result") %></b><br><br>

<a href="index10B.jsp">Go Back to Client Side</a>

</body>
</html>