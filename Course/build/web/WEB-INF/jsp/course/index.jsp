<%-- 
    Document   : index
    Created on : Jul 25, 2015, 9:46:48 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Course!</h1>
        <c:forEach var="course" items="${courses}">
        <li>${course.getCourseName()}</li> 
        <li>${course.getCourseDescription()}</li>
        <li>${course.getCourseFee()}</li>

    </c:forEach>
</body>
</html>
