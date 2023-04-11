package VERSIONES;

public class Personas {
	private String nombre;
	private String apellido;
	private String DNI;
	
	
	public Personas(String nombre, String apellido, String dNI) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}

}
