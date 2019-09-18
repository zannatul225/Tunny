<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body text="INDIGO" background="image2.jpg">
        <%
            String name = request.getParameter("user");
            String pass = request.getParameter("password");
            if(name.equals("Mohit") && pass.equals("101"))
            {
                %><h3>Login Successful</h3><br>
                <h2>Welcome,</h2>
                <h3>Dr. Mohit Kamal!</h3>
                <br>
                <a href="Insertion.jsp">Click here to update patient details</a> <%
            }
            else if(name.equals("Anwar") && pass.equals("102"))
            {
                %><h3>Login Successful</h3><br>
                <h2>Welcome,</h2>
                <h3>Dr. Anwar Khan!</h3>
                <br>
                <a href="Insertion.jsp">Click here to update patient details</a> <%
            }
            else if(name.equals("Rana") && pass.equals("103"))
            {
                %><h3>Login Successful</h3><br>
                <h2>Welcome,</h2>
                <h3>Dr. Saiyad Rana!</h3>
                <br>
                <a href="Insertion.jsp">Click here to update patient details</a> <%
            }
            else if(name.equals("Hamid") && pass.equals("104"))
            {
                %><h3>Login Successful</h3><br>
                <h2>Welcome,</h2>
                <h3>Dr. Hamidul Islam!</h3>
                <br>
                <a href="Insertion.jsp">Click here to update patient details</a> <%
            }
            else if(name.equals("admin") && pass.equals("111"))
            {
                %><h3>Login Successful</h3><br>
                <h2>Welcome!</h2>
                <h3>Admin Login Completed.</h3>
                <br>
                <a href="Insertion.jsp">Click here to update patient details</a> <%
            }
            
            else{
                %><h3>Credential wrong. Please try again.</h3><br>
                <a href="formlogin.jsp">Return to the login page</a><%
                
            
            }
            %>
            
    </body>
</html>
