<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
</head>
<body>
<form:form modelAttribute="user" action="process_data">
    <h1>User Registration</h1>

    FirstName<form:input path="firstname" />
<form:errors path="firstname"/> <br>
      LastName<form:input path="lastname" />
  <form:errors path="lastname"/> <br>

        Email<form:input path="email" />
      <form:errors path="email" /> <br>

        Password<form:input path="password" type="password" />

        <form:errors path="password" cssClass="error"></form:errors> <br>

        confirmPassword<form:input path="confirmPassword" type="password" />

        <form:errors path="confirmPassword" cssClass="error"></form:errors> <br>


        Date<form:input path="date" type="date" />
      <form:errors path="date"/> <br>
    City<form:input path="city" />
      <form:errors path="city"/> <br>


    <button type="submit">Register</button>
</form:form>
</body>
</html>