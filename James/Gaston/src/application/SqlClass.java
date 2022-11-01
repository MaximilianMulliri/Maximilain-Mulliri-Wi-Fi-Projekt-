package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlClass {

	String DB_URL = "jdbc:mysql://127.0.0.1:3306/employeedb";
	String USER = "root";
	String PASS = "220793Mm";

	private static SqlClass SQLC;
	
	public static SqlClass getSqlClass() {
		if(SQLC==null) {
			SQLC=new SqlClass();
			
		}
		return SQLC;
	}
	// getters & setters
		public void setDB_URL(String dB_URL) {
			DB_URL = dB_URL;
		}

		public void setUSER(String uSER) {
			USER = uSER;
		}

		public void setPASS(String pASS) {
			PASS = pASS;
		}
		
		Connection conn;

		

//		private SqlClass(String DB_URL, String USER, String PASS) {
////			this.DB_URL = DB_URL;
////			this.USER = USER;
////			this.PASS = PASS;
//			connector();
//		}
		private SqlClass() {
			connector();
		}
		public void connector() {
			try {
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

}
