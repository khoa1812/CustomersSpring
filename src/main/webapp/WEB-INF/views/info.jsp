
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Information</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">
<fieldset class="border p-3 rounded">
    <legend class="float-none w-auto p-2">Customer Information</legend>

    <table class="table">
        <tr>
            <td>ID</td>
            <td>${customer.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${customer.name}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${customer.email}</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>${customer.address}</td>
        </tr>
    </table>
</fieldset>

<button type="button" class="btn btn-primary mt-3" onclick="location.href='/customers'">Back to list</button>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>
