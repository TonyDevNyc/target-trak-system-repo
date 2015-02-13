<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Welcome to Target-Trak</title>
		<link rel="stylesheet" type="text/css" href="/target-trak-web/css/registration.css" />
	</head>
	<body>
		<div class="container">
			<div class="registration">
				<h1>Target-Trak Registration</h1>
				<form method="POST" action="<c:url value='/sys/register.htm' />">
					<p class="remember_me">
						<label>First Name: 
							<input type="text" name="firstName" value="" placeholder="First Name">
						</label>
						<p class="remember_me">
						<label>Last Name: 
							<input type="text" name="lastName" value="" placeholder="Last Name">
						</label>
					</p>
					<p class="remember_me">
						<label>Email: 
							<input type="text" name="email" placeholder="Email">
						</label>
					</p>
					<p class="remember_me">
						<label>Mobile: 
							<input type="text" name="mobileNumber" placeholder="###-###-####">
						</label>
					</p>
					<p class="remember_me">
						<label>Username: 
							<input type="text" name="username" placeholder="Username">
						</label>
					</p>
					<p class="remember_me">
						<label>Password: 
							<input type="password" name="password" placeholder="Password">
						</label>
					</p>
					<p class="remember_me">
						<label>Repeat Password: 
							<input type="password" name="repeatedPassword" placeholder="Repeat Password">
						</label>
					</p>
					</p>
					
					<p class="submit">
						<input type="submit" name="registerBtn" value="Register">
					</p>
				</form>
			</div>
		</div>
	</body>
</html>