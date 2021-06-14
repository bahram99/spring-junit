<%--
  Created by IntelliJ IDEA.
  User: Developer
  Date: 4/14/2021
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"/>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</head>

<body>
<div class="container">
    <div style="margin-top: 10rem; margin-left: 10rem">
        <form action="/user/register" method="post">
            <div class="form-group">
                <label for="i1">Name</label>
                <input name="name" type="text" class="form-control" style="width: 18rem" id="i1" placeholder="Enter name">
            </div>
            <div class="form-group">
                <label for="i2">UserName</label>
                <input name="username" type="text" class="form-control" style="width: 18rem" id="i2" placeholder="Enter username">
            </div>
            <div class="form-group">
                <label for="i3">Password</label>
                <input name="pass" type="password" class="form-control" style="width: 18rem" id="i3" >
            </div>
         <%--   <div class="form-group">
                <label for="i4">serial number</label>
                <input name="serialnumber" type="text" class="form-control" style="width: 18rem" id="i4" >
            </div>--%>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>

<div class="container">
    <div style="margin-top: 10rem; margin-left: 10rem">
        <form action="/user/book" method="post">
            <div class="form-group">
                <label for="i5">Book Name</label>
                <input name="bname" type="text" class="form-control" style="width: 18rem" id="i5" placeholder="book name">
            </div>
            <div class="form-group">
                <label for="i6">Serial Number</label>
                <input name="serialnumber" type="text" class="form-control" style="width: 18rem" id="i6" placeholder="serial number">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>
</body>
</html>
