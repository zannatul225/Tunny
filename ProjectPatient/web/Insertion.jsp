<%-- 
    Document   : Insertion
    Created on : May 6, 2019, 12:18:09 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body text="MAROON" background="hospital-beds.jpg">
        <form action="Insertion2.jsp">
        <h1>Enter Serial No.: </h1>
        <input type="text" name="srl" >
        <h1>Update Test Result: </h1>
        <input type="text" name="test" >
        <h1>Update Disease: </h1>
        <input type="text" name="dis" >
        <h1>Update Medicine: </h1>
        <input type="text" name="med" >
        <input type="submit" value="Update">
    
            
        </form>         
    </body>
</html>
