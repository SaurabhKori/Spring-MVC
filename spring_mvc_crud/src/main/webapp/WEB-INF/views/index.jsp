<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Product Table</title>
  <!-- Bootstrap CSS with custom theme -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <style>
    /* Customizing table colors */
    .table th, .table td {
      border-top: 0px;
      color: #495057;
    }
    .table th {
      background-color: #007bff;
      color: #fff;
      border-bottom: 2px solid #dee2e6;
    }
    .table th, .table td, .table caption {
      border: 1px solid #dee2e6;
      padding: 8px;
    }
    .btn-primary {
      background-color: #007bff;
      border-color: #007bff;
    }
    .btn-primary:hover {
      background-color: #0056b3;
      border-color: #0056b3;
    }
    .btn-danger {
      background-color: #dc3545;
      border-color: #dc3545;
    }
    .btn-danger:hover {
      background-color: #c82333;
      border-color: #bd2130;
    }
    .btn-secondary {
      background-color: #6c757d;
      border-color: #6c757d;
    }
    .btn-secondary:hover {
      background-color: #5a6268;
      border-color: #545b62;
    }
  </style>
</head>
<body>

<div class="container">
  <h2 class="mt-5 mb-4">Welcome To Product App</h2>
  <table class="table">
    <caption>List of Products</caption>
    <thead>
      <tr>
        <th scope="col">Product Id</th>
        <th scope="col">Product Name</th>
        <th scope="col">Product Description</th>
        <th scope="col">Product Price</th>
        <th scope="col">Action</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="p" items="${product}">
        <tr>
        <td>${p.productId}</td>
        <td>${p.productName}</td>
        <td>${p.productDescription}</td>
        <td>${p.productPrice}</td>
        <td>
          <a href="delete/${p.productId}" class="btn btn-danger btn-sm"><i class="fas fa-trash-alt"></i> Delete</a>
          <a href="update/${p.productId}" class="btn btn-primary btn-sm ml-2"><i class="fas fa-edit"></i> Edit</a>
        </td>
      </tr>
    </c:forEach>
      <!-- Add more rows as needed -->
    </tbody>
  </table>
  <a href="addproduct" class="btn btn-secondary">Add Product</a>
</div>

<!-- Font Awesome -->
<script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
