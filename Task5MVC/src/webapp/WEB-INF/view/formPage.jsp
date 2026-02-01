<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
</head>
<body>
<form action="process_data">
    <h1>User Registration</h1>

    <label for="firstName">First Name</label>
    <input type="text" id="firstName" name="firstName" required><br>

    <label for="lastName">Last Name</label>
    <input type="text" id="lastName" name="lastName" required><br>

    <label for="email">Email</label>
    <input type="email" id="email" name="email" required><br>

    <label for="dob">Date of Birth</label>
    <input type="date" id="dob" name="dateOfBirth" required><br>

    <label for="city">City</label>
    <input type="text" id="city" name="city" required><br>

    <button type="submit">Register</button>
</form>
</body>
</html>