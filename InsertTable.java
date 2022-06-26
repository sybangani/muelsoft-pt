import java.sql.*; 
import java.util.*; 
public class InsertTable 
{ 
public static void main(String args[]) { 
try { 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Moviename","root",""); 
Statement sm=con.createStatement(); 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the Movie details"); 
int mname = sc.next(); 
String mactor= sc.next(); 
String mactress= sc.next(); 
String mdirector = sc.next(); 
int myear = sc.nextInt(); 
String qry = "INSERT INTO Movies(Name,Actor,Actress,Director,Year) VALUES ("+mname+",'"+mactor+"','"+mactress+"','"+mdirector+"',"+myear+")"; 
sm.executeUpdate(qry); 
con.close(); 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
System.out.println("Row Inserted"); 
} 
}