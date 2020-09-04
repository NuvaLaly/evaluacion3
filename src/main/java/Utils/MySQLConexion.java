package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexion {
	public static Connection getConexion() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:8080/ic_e2";
			String usuario = "root";
			String contraseña = "";
			
			con = DriverManager.getConnection(url,usuario,contraseña);
			
				
					
		} catch (ClassNotFoundException e) {
			System.out.println("Error --> al cargar el Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error --> al cargar BD");
			e.printStackTrace();
		}
		
		
		
		return con; 
	}
}
