<%-- 
    Document   : Insertion2
    Created on : May 6, 2019, 12:27:57 PM
    Author     : Dell
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor=DARKGRAY>
        <%
            String serial = request.getParameter("srl");
            String testRes = request.getParameter("test");
            String disease = request.getParameter("dis");
            String medcn = request.getParameter("med");

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false", "root", "root");
                Statement stmt = (Statement) con.createStatement();

                String sql;
                sql = "use Project";
                stmt.executeUpdate(sql);
                stmt.executeUpdate("UPDATE PATIENT SET Test_Report= '" + testRes + "', Disease= '"+disease+"', Medicine= '"+medcn+"'" + " WHERE SerialNo = '" + serial + "'");
                
               
                ResultSet rs;
                rs=stmt.executeQuery("select * from patient WHERE SERIALNO = '"+serial+"'");
       
                %><center><h1>Updated Patient's Data</h1></center>
                <table border=6 align=center style="text-align: center">
            

            <%while(rs.next())
            {
            %>
            <tr>
                <td><h3>Serial No.</h3></td>
                <td><h3>Name of Patient</h3></td>
                <td><h3>Age</h3></td>
                <td><h3>Address</h3></td>
                <td><h3>Test result</h3></td>
                <td><h3>Disease</h3></td>
                <td><h3>Medicine</h3></td>
            </tr>
            <tr>
                <td><h3><%out.print(rs.getString(1));%></h3></td>
                <td><h3><%out.print(rs.getString(2));%></h3></td>
                <td><h3><%out.print(rs.getString(3));%></h3></td>
                <td><h3><%out.print(rs.getString(4));%></h3></td>
                <td><h3><%out.print(rs.getString(5));%></h3></td>
                <td><h3><%out.print(rs.getString(6));%></h3></td>
                <td><h3><%out.print(rs.getString(7));%></h3></td>
            </tr>
            <%
        }%>
        </table><br>


        <%

            } catch (SQLException e) {
                out.print(e.getMessage());%><br><%
            }
        %>


    </body>
</html>
