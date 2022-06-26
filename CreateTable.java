import java.sql.*; 
public class CreateTable 
{ 
public static void main(String args[]) 
{ p;
try 
{ 
//com.mysql.cj.jdbc.Driver 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviename","root",""); 
Statement sm=con.createStatement(); 
sm.executeUpdate("create table Movies ( Name varchar(25), Actor varchar(20), Actress varchar(25), Director varchar(20), Year int(20))"); 
System.out.println("Table Created"); 
con.close(); 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
} 
}