package mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Utils.MySQLConexion;
import entidad.persona;
import entidad.usuario;



public class GestionUsuario {
	

public usuario obtenerUsuario(usuario usu){
	
	usuario usuario = null;
	
	Connection con = null; 
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	try {
	
		con = MySQLConexion.getConexion();
	
		String sql = "select*from usuario where usuario = ? and clave =  ? ";
		
		pst = con.prepareStatement(sql);
		
		pst.setString(1, usu.getUsuario());
		pst.setString(2, usu.getClave());
		
		rs = pst.executeQuery();
		
		while (rs.next()) {
			usuario = new usuario(rs.getString(1), rs.getString(2), rs.getString(3));
			
		}
		
		
		
	} catch (Exception e) {
	System.out.println("Error en obtener usuario");
	}
	
	
	return usuario;
	
}


	

}
