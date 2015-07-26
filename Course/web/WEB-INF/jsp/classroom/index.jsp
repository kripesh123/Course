<%-- 
    Document   : index
    Created on : Jul 25, 2015, 9:07:52 PM
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
        <h1>Hello Classroom!</h1>
         
        <c:forEach var="class" items="${classrooms}">
        <li>${class.getClassroomName()}</li>
        </c:forEach>
    </body>
</html>
