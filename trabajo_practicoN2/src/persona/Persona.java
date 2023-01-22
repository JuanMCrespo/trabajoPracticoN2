package persona;

import domicilio.Domicilio;

public class Persona {
	
	protected String nombre;
	protected String apellido;
	protected int dni;
	protected int telefono;
	protected String mail;
	protected Usuario usuario;
	protected Domicilio direccion;
	
	
	public Persona(String nombre, String apellido, int dni, int telefono, String mail, Usuario usuario,
			Domicilio direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.mail = mail;
		this.usuario = usuario;
		this.direccion = direccion;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Domicilio getDireccion() {
		return direccion;
	}
	public void setDireccion(Domicilio direccion) {
		this.direccion = direccion;
	}
	
	
	

}
