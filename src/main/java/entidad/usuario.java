package entidad;

public class usuario {
	
	private String Rut;
	private String Usuario;
	private String Clave;
	

		
		
	public usuario(String rut, String usuario, String clave) {

		Rut = rut;
		Usuario = usuario;
		Clave = clave;
	}


	public usuario() {
		// TODO Auto-generated constructor stub
	}


	public String getRut() {
		return Rut;
	}

	public void setRut(String rut) {
		Rut = rut;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}


	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}


	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		
	}


}
