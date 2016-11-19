package kist.com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection con = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		if (con == null) {
			// step1: Register driver class
			Class.forName("com.mysql.jdbc.Driver");

			// step2: create a connection object
			// dbname = kist, db username = root, db password = rai@123
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "rai@123");
		}
		return con;
	}

}
