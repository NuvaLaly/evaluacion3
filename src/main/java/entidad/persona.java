package entidad;

public class persona {
	
	private int Rut;
	private String Nombre; 
	private String Apellido;
	private String Telefono;

	public persona(int rut, String nombre, String apellido, String telefono) {
	
		Rut = rut;
		Nombre = nombre;
		Apellido = apellido;
		Telefono = telefono;
	}

	public persona(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public persona() {
		// TODO Auto-generated constructor stub
	}

	public int getRut() {
		return Rut;
	}

	public void setRut(int rut) {
		Rut = rut;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	
	
	

}
