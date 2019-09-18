package project.patient;
 
import java.sql.*;
import java.util.Scanner;
public class ProjectPatient  {
 
 
    public static void main(String[] args) {
 
 
 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
            Statement stmt = (Statement) con.createStatement();
 
            String sql;
            sql= "DROP database project";
            stmt.executeUpdate(sql);
            sql= "Create Database project";
            stmt.executeUpdate(sql);
            sql= "use project";
            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE DOCTOR "
                    + "(Name VARCHAR(255), "
                    + " Degree VARCHAR(255), "
                    + " University VARCHAR(255), "
                    + " Experience VARCHAR(255), "
                    + " Timing VARCHAR(255)) ";
 
            stmt.executeUpdate(sql);
 
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Mohit Kamal','FPP','DMC','Five years','1pm to 4pm')";
            stmt.executeUpdate(sql);
           sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Anwar khan','ABC','AFMC','Eight years','4pm to 7pm')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Saiyad Rana','HJK','MMC','Two years','1pm to 4pm')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO DOCTOR "
                    + "VALUES ('Hamidul Islam','FPP','DMC','One year','2pm to 6pm')";
            stmt.executeUpdate(sql);
 
            sql = "CREATE TABLE PATIENT "
                    + "(Name VARCHAR(255), "
                    + " Age INTEGER, "
                    + " Address VARCHAR(255), "
                    + " Test_Report VARCHAR(255), "
                    + " Disease VARCHAR(255),"
                    + " Medicine VARCHAR(255),"
                    + "PRIMARY KEY (Name))";
 
            stmt.executeUpdate(sql);
 
 
            String Name, Age, Address, Test_Report, Disease, Medicine;
            Scanner scanner = new Scanner(System.in);
            //loop //thread
            System.out.print("Enter patient's name: ");
            Name = scanner.nextLine();
            System.out.print("Enter patient's age: ");
            Age = scanner.nextLine();            
            System.out.print("Enter patient's address: ");
            Address = scanner.nextLine();
            System.out.print("Enter patient's test_report: ");
            Test_Report = scanner.nextLine();
            System.out.print("Enter patient's disease: ");
            Disease = scanner.nextLine();
            System.out.print("Enter patient's medicine: ");
            Medicine = scanner.nextLine();
            sql = "INSERT INTO PATIENT VALUES("+"'"+Name+"',"+Age+","+"'"+Address+"',"+"'"+Test_Report+"',"+"'"+Disease+"',"+"'"+Medicine+"'"+")";
            stmt.executeUpdate(sql);
 
            //doctor
            System.out.print("Enter patient's name: ");
            String name= scanner.nextLine();
 
            sql = "SELECT * FROM patient where name = '"+name+"'";
 
            ResultSet rs= stmt.executeQuery(sql);
            while(rs.next())
            {
            System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
            }
 
 
 
            
 
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
 
    }
 
}