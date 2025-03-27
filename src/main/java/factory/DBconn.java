package factory;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
public class DBconn {
	static Connection con;
	private DBconn() {}
	
	// factory method that create and return Connection as singleton object
	public static Connection getConn() {
		try {
			if(con==null) {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sbb6_todo", "root", "");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}


