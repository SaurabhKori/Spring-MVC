<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Add Product Form</title>
  <!-- Bootstrap CSS with custom theme -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <style>
    /* Customizing form colors */
    .form-control {
      background-color: #f8f9fa;
      border-color: #ced4da;
      color: #495057;
    }
    .btn-primary {
      background-color: #007bff;
      border-color: #007bff;
    }
    .btn-primary:hover {
      background-color: #0056b3;
      border-color: #0056b3;
    }
  </style>
</head>
<body>

<div class="container">
  <h2 class="mt-5 mb-4">Udate  Product Detail</h2>
  <form action="${pageContext.request.contextPath }/handletohome" method="post">
    <div class="form-group">
      <label for="productName">Product Name:</label>
      <input type="text" class="form-control" id="productName" placeholder="Enter product name" name="productName" value="${product.productName }" required>
    </div>
    <div class="form-group">
      <label for="productDescription">Product Description:</label>
      <textarea class="form-control" id="productDescription" rows="3" placeholder="Enter product description" name="productDescription" >${product.productDescription }</textarea>
    </div>
    <div class="form-group">
      <label for="productPrice">Product Price:</label>
      <input type="number" class="form-control" id="productPrice" placeholder="Enter product price" name="productPrice" value="${product.productPrice }" required>
    </div>
    <button type="submit" class="btn btn-primary mr-2">Update</button>
    <a href="${pageContext.request.contextPath }/" class="btn btn-secondary">Back</a>
  </form>
</div>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
