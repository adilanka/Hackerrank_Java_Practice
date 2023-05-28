import java.sql.*;
import java.util.Scanner;

public class Exp7 {

	public static void main(String[] args) 
	{
		Scanner in = null;
		Scanner in1 = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Aditya1234");
			Statement s = con.createStatement();
			String query = "create database if not exists java_experiment;";
			s.execute(query);
			s.execute("use java_experiment;");
			String query1 = "create table if not exists VIT_University(school_id int unique, school_name varchar(20), dean int);";
			s.execute(query1);
			query = "insert into vit_university values(1001,'SCSE',10458)";
			s.execute(query);
			query = "insert into vit_university values(1002,'SMEC',10087)";
			s.execute(query);
			query = "insert into vit_university values(1003,'SEEE',10172)";
			s.execute(query);
			query = "insert into vit_university values(1004,'SASL',10047)";
			s.execute(query);
			query = "insert into vit_university values(1005,'SARC',10804)";
			s.execute(query);
			String query2 = "create table if not exists programmes(programme_id int, programme_name varchar(40), school_id int, programme_chair int, foreign key(school_id) references vit_university(school_id));";
			s.execute(query2);
			query = "insert into programmes values(100245,'B.Tech AI and ML',1001,10089)";
			s.execute(query);
			query = "insert into programmes values(100703,'B.Tech Gaming Tech',1001,10612)";
			s.execute(query);
			query = "insert into programmes values(100413,'B.Tech Cyber Security',1001,10730)";
			s.execute(query);
			query = "insert into programmes values(100867,'B.Tech Aerospace',1002,10604)";
			s.execute(query);
			query = "insert into programmes values(100491,'Ph.D Science',1004,10024)";
			s.execute(query);
			query = "insert into programmes values(100544,'B.Tech Mechanical',1002,10204)";
			s.execute(query);
			query = "insert into programmes values(100694,'B.Tech ECE',1003,10781)";
			s.execute(query);
			query = "insert into programmes values(100768,'B.Tech Data Science',1001,10321)";
			s.execute(query);
			String query3 = "create table if not exists faculty(faculty_id int, faculty_name varchar(40), mobile varchar(10),email_id varchar(40));";
			s.execute(query3);
			query = "insert into faculty values(10458,'Aditya',8794561470,'adi@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10087,'Sree Valli',4567818473,'sree@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10172,'Bhaskar',9879463120,'bhas@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10047,'Karthik',7418259630,'kar@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10804,'Lavanya',7539518462,'lavi@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10089,'Kshitij',879841023,'sky@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10612,'Mokshanad',158763978,'mok@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10730,'Jay',4178954628,'jay@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10604,'Om',3215874940,'om@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10024,'Sarthak',6794161470,'sar@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10204,'Subham',4708466850,'shu@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10781,'Lokesh',5469782014,'lok@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10321,'Anika',8456147089,'ani@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10808,'Varshit',6147087408,'var@vitbhopal.ac.in');";
			s.execute(query);
			query = "insert into faculty values(10411,'Ayman',8761487788,'aym@vitbhopal.ac.in');";
			s.execute(query);
			
			String queryI = "select * from vit_university;";
			ResultSet rs = s.executeQuery(queryI);
			while(rs.next())
			{
				System.out.println("School Id: "+rs.getInt("school_id")+
						" School Name: "+rs.getString("school_name")+
						" Dean Id: "+rs.getInt("dean"));
			}
			
			System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			
			String queryII = "select * from programmes;";
			rs = s.executeQuery(queryII);
			while(rs.next())
			{
				System.out.println("Programme ID: "+rs.getInt("programme_id")+
						" Programme Name: "+rs.getString("programme_name")+
						" School ID: "+rs.getInt("school_id")+
						" Programme Chair: "+rs.getString("programme_chair"));
			}
			
			System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			
			in = new Scanner(System.in);
			System.out.println("Enter the Programme Name: ");
			String pn = in.nextLine();
			String queryIII = "select * from faculty where faculty_id = (select programme_chair from programmes where programme_name ='"+pn+"');";
			ResultSet rs1 = s.executeQuery(queryIII);
			while(rs1.next())
			{
				System.out.println("Faculty Name: "+rs1.getString("faculty_name"));
			}
			
			System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			
			in1 = new Scanner(System.in);
			System.out.println("Enter the School ID: ");
			String si = in1.nextLine();
			String queryIV = "select email_id from faculty where faculty_id = (select dean from vit_university where school_id ="+si+");";
			rs = s.executeQuery(queryIV);
			while(rs.next())
			{
				System.out.println("Email Id: "+rs.getString("email_id"));
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			in.close();
			in1.close();
		}
	}
	

}
