<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Form</title>
</head>
<body>

    <h2>User Form</h2>

    <form:form action="hello" modelAttribute="user" >

        Name:
        <form:input path="name" />
        <br><br>

        Password:
        <form:password path="password" />
        <br><br>

        Country:
        <form:select path="country">
            <form:option value="Brazil" label="Brazil" />
            <form:option value="Egypt" label="Egypt" />
            <form:option value="USA" label="USA" />
            <form:option value="Germany" label="Germany" />
        </form:select>
        <br><br>

        Preferred Programming Language: <br>
        <form:radiobutton path="favoriteLanguage" value="Java" /> Java <br>
        <form:radiobutton path="favoriteLanguage" value="C#" /> C# <br>
        <form:radiobutton path="favoriteLanguage" value="PHP" /> PHP <br>
        <form:radiobutton path="favoriteLanguage" value="Ruby" /> Ruby <br>
        <br>

        Preferred Operating System: <br>
        <form:checkbox path="operatingSystems" value="Linux" /> Linux <br>
        <form:checkbox path="operatingSystems" value="Mac OS" /> Mac OS <br>
        <form:checkbox path="operatingSystems" value="MS Windows" /> MS Windows <br>
        <br>

        <input type="submit" value="Submit" />

    </form:form>

</body>
</html>