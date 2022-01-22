package Connectionn;

import java.sql.Connection;
import java.sql.DriverManager;



public class DataBase {
	
	private static Connection myConn;

	public DataBase() {
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/parking?useSSL=false&serverTimezone=UTC", "root", "");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static Connection getCon() {
		if (myConn == null) {
			new DataBase();
		}
		return myConn;
	}

}


