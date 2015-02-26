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
    <sql:setDataSource var="source" 
                       url="jdbc:derby://localhost:1527/sample" 
                       user="app" 
                       password="app"
                       driver="org.apache.derby.jdbc.ClientDriver"></sql:setDataSource> 
    <sql:query var="allRows" dataSource="${source}">
            SELECT name, city, state FROM customer
    </sql:query>
    
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
                        <c:forEach var="ligneCourante" items="${allRows.rows}">
                        <tr>
                            <td>${ligneCourante.name}</td>
                            <td>${ligneCourante.city}</td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>

        </body>
    
</html>
