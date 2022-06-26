import java.sql.*; 
public class GetTable 
{ 
public static void main(String args[]) 
{ 
try 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Moviename","root",""); 
Statement sm=con.createStatement(); 
ResultSet rs = sm.executeQuery("select * from Movies"); 
System.out.println("The Movie Details are \n"); 
while(rs.next()) 
{ 
System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+ rs.getString(3)+":"+rs.getString(4) +":" + rs.getInt(5)); 
} 
con.close(); 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
} 
}