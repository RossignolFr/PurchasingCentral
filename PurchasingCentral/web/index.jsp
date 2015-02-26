<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : 26 févr. 2015, 14:07:53
    Author     : Bertrand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <sql:query var="allRows" dataSource="jdbc/sample">
            SELECT name, city, state FROM customer
    </sql:query>
    <c:forEach var="ligneCourante" items="${allRows.rows}">
        <body>
            <h1>Hello World!</h1>



                <table border="1">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>City</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>${ligneCourante.name}</td>
                            <td>${ligneCourante.city}</td>
                        </tr>
                    </tbody>
                </table>

        </body>
    </c:forEach>
</html>
