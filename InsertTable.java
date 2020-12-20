import java.sql.*;
import java.util.*;
public class InsertTable
{
public static void main(String args[]) {
try {
Class.forName("com.mysql.jdbc.Driver");
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vamshi","root","");
 Statement st=con.createStatement();
// String qry = "INSERT INTO student(id,name,contact,address,avg) VALUES
//(101,'Ramesh','123456789','Hyderabad',80)";
//st.executeUpdate(qry);
Scanner sc = new Scanner(System.in);
System.out.println("Eneter the student details");
int sid = sc.nextInt();
String sname= sc.next();
String scontact= sc.next();
String saddr = sc.next();
int savg=sc.nextInt();
String qry = "INSERT INTO student(id,name,contact,address,avg) VALUES ("+sid+",'"+sname+"','"+scontact+"','"+saddr+"',"+savg+")";
st.executeUpdate(qry);
con.close();
}
catch(Exception e)
{
 System.out.println(e);
}
System.out.println("Row Inserted");
}
}