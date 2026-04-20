<html>
<head>
<script>
function validateForm() {
    let u = document.forms["f1"]["username"].value;
    let e = document.forms["f1"]["email"].value;
    let d = document.forms["f1"]["designation"].value;

    if (u == "" || e == "" || d == "") {
        alert("All fields are required");
        return false;
    }
    return true;
}
</script>
</head>

<body>

<h2>User Registration</h2>

<form name="f1" action="Program10A" method="post" onsubmit="return validateForm()">

    Username: <input type="text" name="username"><br><br>
    Email: <input type="text" name="email"><br><br>
    Designation: <input type="text" name="designation"><br><br>

    <input type="submit" value="Submit">

</form>

</body>
</html>