package jdbc;

import java.sql.*;

public class Driver {

	public static void main(String[] args)throws SQLException {
		try{
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","myuser","mypassword");
			
			
			/*	Statement sta=con.createStatement();
			ResultSet res=sta.executeQuery("select * from studentinfo");
			ResultSetMetaData rsmd=res.getMetaData();
			
			System.out.println("Column Name: "+rsmd.getColumnName(3));
			System.out.println("Table Name: "+rsmd.getTableName(1));
			System.out.println("Column Type: "+rsmd.getColumnType(2));
			System.out.println("Column Count: "+rsmd.getColumnCount());
			
			DatabaseMetaData dbmd= con.getMetaData();
			System.out.println("Driver name : "+dbmd.getDriverName());
			System.out.println("Driver Version : "+dbmd.getDriverVersion());
			System.out.println("user name : "+dbmd.getUserName());
			
			String table[]={"TABLE"};
			ResultSet re=dbmd.getTables(null, null, null, table);
			
			while(re.next()){
				System.out.println(re.getString(4));
			}*/
		
		/*PreparedStatement ps=con.prepareStatement("update studentinfo set surname=? where id=?");
			ps.setInt(2, 20);
			ps.setString(1,"HHHHHHH");
			ps.executeUpdate();  */
			
		/*	PreparedStatement ps=con.prepareStatement("select * from studentinfo where id>? and name=?");
			ps.setInt(1,103);
			ps.setString(2,"majed");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
				*/
			
		/*	PreparedStatement ps=con.prepareStatement("select * from studentinfo where id>?");
			ps.setInt(1,100);
			ResultSet rs=ps.executeQuery();
			System.out.println("id greater than 100");
			while(rs.next()){
				System.out.println(rs.getInt(1));
			}
			*/
			
	
			
			
			
			
			 
			
	/*	PreparedStatement ps=con.prepareStatement("insert into studentinfo values(?,?,?,?)");
		ps.setInt(1, 707);
		ps.setString(2,"Ka");
		ps.setString(3, "KHOON");
		ps.setInt(4,90);
		
		ps.executeUpdate();
		*/	
		//sta.executeUpdate("delete from studentinfo where name='sara' ");
		/*	Statement sta=con.createStatement();
			sta.executeUpdate("insert into studentinfo values(2110,'hasan','dehvari',50) ");
			*/
			//sta.executeUpdate("update studentinfo set name='hamid' where id=20 ");
			
			//sta.executeUpdate("insert into studentinfo values(119,'Sara','Cheragh',30)");
			//sta.executeUpdate("delete from studentinfo where name='ehsan'");
			//sta.executeUpdate("update studentinfo set surname='Chiana' where id=100");
			
			Statement sta=con.createStatement();
			ResultSet res=sta.executeQuery("select * from studentinfo");
		while(res.next()){
			
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));
		}
			
		}catch(Exception e){System.out.println(e);}

	}

}

