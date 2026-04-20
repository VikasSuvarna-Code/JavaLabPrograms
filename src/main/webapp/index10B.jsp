<html>
<head>
<script>
function validateForm() {
    let r = document.forms["f1"]["rollno"].value;
    let n = document.forms["f1"]["name"].value;
    let s1 = document.forms["f1"]["s1"].value;
    let s2 = document.forms["f1"]["s2"].value;
    let s3 = document.forms["f1"]["s3"].value;
    let s4 = document.forms["f1"]["s4"].value;
    let s5 = document.forms["f1"]["s5"].value;

    if (r == "" || n == "" || s1 == "" || s2 == "" || s3 == "" || s4 == "" || s5 == "") {
        alert("All fields are required");
        return false;
    }
    return true;
}
</script>
</head>

<body>

<h2>Student Result Form</h2>

<form name="f1" action="Program10B" method="post" onsubmit="return validateForm()">

Roll No: <input type="text" name="rollno"><br><br>
Name: <input type="text" name="name"><br><br>

Sub1: <input type="text" name="s1"><br><br>
Sub2: <input type="text" name="s2"><br><br>
Sub3: <input type="text" name="s3"><br><br>
Sub4: <input type="text" name="s4"><br><br>
Sub5: <input type="text" name="s5"><br><br>

<input type="submit" value="Calculate Result">

</form>

</body>
</html>