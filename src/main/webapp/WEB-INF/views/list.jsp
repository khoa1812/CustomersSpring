

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customers List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .table {
            margin-top: 20px;
        }
    </style>
</head>
<body class="container">
<h1 class="my-4">Customers List</h1>
<div>There are ${requestScope.customers.size()} customer(s) in list.</div>

<table class="table table-hover table-bordered">
    <thead class="table-dark">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="c" items="${requestScope.customers}">
        <tr>
            <td><c:out value="${c.id}"/></td>
            <td><a href="/customers/info?id=${c.id}">${c.name}</a></td>
            <td><c:out value="${c.email}"/></td>
            <td><c:out value="${c.address}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>

