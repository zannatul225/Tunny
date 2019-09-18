<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <title>Jsp Sample</title>

</head>
<body bgcolor=AZURE>
    <form action="formlogin.jsp">
    <h3>Want to update patient's information?</h3>
    <h3>To Update Information click login</h3>
    <input type='submit' value='Login'>   
    <%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false","root","root");
            Statement stmt = (Statement) con.createStatement();
 
            String sql;
            sql= "DROP database project";
            stmt.executeUpdate(sql);
            sql= "Create Database project";
            stmt.executeUpdate(sql);
            sql= "use project";
            stmt.executeUpdate(sql);
           
            //doctor's details
            
            sql = "CREATE TABLE DOCTOR "
                    + "(Name VARCHAR(255), "
                    + " Degree VARCHAR(255), "
                    + " University VARCHAR(255), "
                    + " Experience VARCHAR(255), "
                    + " Timing VARCHAR(255)) ";
 
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Name','Degree','University','Experience','Timing')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Mohit Kamal','FPP','DMC','Five years','1pm to 4pm')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Anwar khan','ABC','CMH','Eight years','4pm to 7pm')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Saiyad Rana','HJK','DMC','Two years','1pm to 4pm')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Hamidul Islam','FPP','DMC','One year','2pm to 6pm')";
            stmt.executeUpdate(sql);
            
            

            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from doctor");
            %>
            <center><h2>Doctor's Detail Information: </h2></center>
            <table border=6 align=center style="text-align: center">
            <%while(rs.next())
            {
                %>
            <tr>
                <td><h3><%out.print(rs.getString(1));%></h3></td>
                <td><h3><%out.print(rs.getString(2));%></h3></td>
                <td><h3><%out.print(rs.getString(3));%></h3></td>
                <td><h3><%out.print(rs.getString(4));%></h3></td>
                <td><h3><%out.print(rs.getString(5));%></h3></td>
                
            </tr>
            <%
        }%>
        </table><br>
    <%
        
            //patient's details
            
            sql = "CREATE TABLE PATIENT "
                    + "(SerialNo VARCHAR(255), "
                    + " Name VARCHAR(255), "
                    + " Age VARCHAR(255), "
                    + " Address VARCHAR(255), "
                    + " Test_Report VARCHAR(255), "
                    + " Disease VARCHAR(255),"
                    + " Medicine VARCHAR(255))";
                   
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES ('Serial No.','Name of Patient','Age','Address','Test result','Disease','Medicine')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (1,'Zara','20','Dhanmondi','Positive','Tuberculosis','Napa')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (2,'Tonni','21','Uttora','Positive','Diabetes','Setra')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (3,'Raisa','20','Azimpur','Negative','Asthma','Janina')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (4,'Trina','22','Azimpur','Positive','Cancer','Baal')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (5,'Adrita','20','GreenRoad','Negative','Infection','Matha')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (6,'Sadia',19,'Agargaon','Positive','Allergy','HPR')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (7,'Teetly',23,'Gulshan','Positive','High pressure','Finix')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (8,'Samia',25,'Mirpur','Positive','Low pressure','Revotril')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (9,'Nila',24,'Mohakhali','Positive','Alcer','Pase')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (10,'Elma',30,'Central Road','Negative','Dengue','Napa')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (11,'Asif',19,'Elephant Road','Positive','High Fever','HPR')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (12,'Farial',22,'HatirPool','Negative','alcer','Finix')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (13,'Fahim',26,'Mirpur','Positive','Dengue','Revotril')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (14,'Tania',18,'Bhooter Goli','Positive','Infection','Pase')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PATIENT "
                    + "VALUES (15,'Samir',31,'Central Road','Negative','Jondis','Napa')";
            stmt.executeUpdate(sql);
            
            
            
            rs=st.executeQuery("select * from patient");
            %>
            <center><h2>Patient's Detail Information: </h2></center>
            <table border=6 align=center style="text-align: center">
            <%while(rs.next())
            {
                %>
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
        }
    catch(SQLException e){
        out.print(e.getMessage());%><br><%
    }
    %>
    
    
    
    </form>
</body>
</html>