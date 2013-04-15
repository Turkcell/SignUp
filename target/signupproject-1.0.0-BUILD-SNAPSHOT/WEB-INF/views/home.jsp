<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Sign-up</title>
</head>
<body>
<form method="post">
		<fieldset>
			<legend>New User - Sign Up</legend>
			<table cellspacing="0">
				<tr>
					<th><label for="note">Name:</label></th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th><label for="note">Surname:</label></th>
					<td><input type="text" name="surname"></td>
				</tr>
				<tr>
					<th><label for="note">E-mail:</label></th>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<th><label for="note">Password:</label></th>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<th><label for="note">Username:</label></th>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>
