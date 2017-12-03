package jdbc;
import java.sql.*;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
public class Daiver1 {

	public static void main(String args[]){

		try{
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","myuser","mypassword");
		//Statement sta=con.createStatement();
			JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet();  
			rowset.setUrl("jdbc:mysql://localhost:3306/studentdata");
			rowset.setUsername("myuser");
			rowset.setPassword("mypassword");
		
			rowset.setCommand("select * from studentinfo");
			rowset.execute();
			
			while(rowset.next()){
				
				System.out.println("Id: "+rowset.getInt(1));
				System.out.println("Name : "+rowset.getString(2));
				System.out.println("Surname: "+rowset.getString(3));
				System.out.println("Age : "+rowset.getInt(4));
			}
		
		
		
	/*	Statement sta=con.createStatement();
		ResultSet rs=sta.executeQuery("select * from studentinfo where id>100");
		while(rs.next()){
			
			System.out.println(rs.getInt(1));
		}
		*/
		
		}catch(Exception e){System.out.println(e);}
	}
}
