package persona;

public class Usuario {
	
	protected boolean registrado;
	protected String nomusuario;
	protected String contraseña;
	protected double saldo;
	
	
	
	public Usuario(String nomusuario, String contraseña, double saldo) {
		super();
		this.registrado = false;
		this.nomusuario = nomusuario;
		this.contraseña = contraseña;
		this.saldo = saldo;
	}
	
	public boolean isRegistrado() {
		return registrado;
	}
	public void setRegistrado(boolean registrado) {
		this.registrado = registrado;
	}
	public String getNomusuario() {
		return nomusuario;
	}
	public void setNomusuario(String nomusuario) {
		this.nomusuario = nomusuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
