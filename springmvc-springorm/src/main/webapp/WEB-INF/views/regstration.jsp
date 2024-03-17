<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
<title>Register Page</title>
</head>
<body>
	<div class="container">

		<h1 class="container text-center">Registration Form</h1>
		<form action="processform" method="post">
			<div class="mb-3">
				<label for="exampleInputName" class="form-label">User Name</label> <input
					type="text" class="form-control" id="exampleInputName"
					aria-describedby="nameHelp" name="userName">
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> <input type="email" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp"
					name="userEmail">
				<div id="emailHelp" class="form-text">We'll never share your
					email with anyone else.</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputName" class="form-label">Phone
					Number</label> <input type="tel" class="form-control" id="exampleInputName"
					aria-describedby="nameHelp" name="userPhone">
			</div>
			<div class="mb-3">
				<label for="exampleInputName" class="form-label">Date of
					Birth</label> <input type="date" class="form-control" id="exampleInputName"
					aria-describedby="nameHelp" name="dob">
			</div>
			<div class="mb-3">
				<label for="exampleInputName" class="form-label">Gender</label>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="gender"
						id="inlineRadio1" value="male"> <label
						class="form-check-label" for="inlineRadio1">Male</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="gender"
						id="inlineRadio2" value="female"> <label
						class="form-check-label" for="inlineRadio2">Female</label>
				</div>
			</div>


			<div class="mb-3">
				<label for="exampleInputName" class="form-label">Courses</label>
			</div>

			<div class="mb-3">


				<select class="form-select" multiple aria-label="multiple select example" name="courses">
  <option selected>Select Courses</option>
  <option value="Java">JAVA</option>
  <option value="Javascript">JavaScript</option>
  <option value="SQL">SQL</option>
</select>
			

			</div>
			<div class="mb-3">
				<label for="exampleInputName" class="form-label">Address</label>
				<div class="card">
					<div class="cardbody">
						<div class="form-check form-check-inline">
							<div class="mb-3">
								<label for="exampleInputName" class="form-label">Village</label>
								<input type="text" class="form-control" id="exampleInputName"
									aria-describedby="nameHelp" name="address.vill">
							</div>
						</div>
						<div class="form-check form-check-inline">
							<div class="mb-3">
								<label for="exampleInputName" class="form-label">City</label> <input
									type="text" class="form-control" id="exampleInputName"
									aria-describedby="nameHelp" name="address.city">
							</div>
						</div>
						<div class="form-check form-check-inline">
							<div class="mb-3">
								<label for="exampleInputName" class="form-label">State</label> <input
									type="text" class="form-control" id="exampleInputName"
									aria-describedby="nameHelp" name="address.state">
							</div>
						</div>
						<div class="form-check form-check-inline">
							<div class="mb-3">
								<label for="exampleInputName" class="form-label">Pin
									Code</label> <input type="number" class="form-control"
									id="exampleInputName" aria-describedby="nameHelp"
									name="address.pin">
							</div>
						</div>
					</div>
				</div>

				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label">Password</label>
					<input type="password" class="form-control"
						id="exampleInputPassword1" name="userPass">
				</div>

				<button type="submit" class="btn btn-success text-center">Submit</button>
		</form>
	</div>
</body>
</html>