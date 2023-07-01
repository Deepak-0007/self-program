package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class jdbc1 {
public static void main(String[] args) {
	try {
		//register driver step1
		Class.forName("com.mysql.cj.jdbc.Driver");
		//get connection step no 2
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/c4119","root","root");
	    //create statement step3
		Statement stmt=conn.createStatement();
	    //execute query fetch data from database step4
		ResultSet rs=stmt.executeQuery("select*from 4119Student");
		//iteration
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getInt(3));
		}
		//close database connection step no 5
		conn.close();
		}catch(Exception e) {
			System.out.println(e);
	}
}
}
