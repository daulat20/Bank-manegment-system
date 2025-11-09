package Bank;

import java.sql.*;

public class DbConnection {
	public Connection conn;
    public Statement stat;
	public DbConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/banksystem","root","Daulat@@6920"); 
			stat = conn.createStatement();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
