package persona;

public class Invitado {
	
	protected Persona nombre;
	protected boolean esinvitado;

	public Invitado(Persona nombre, boolean esinvitado) {
		this.nombre = nombre;
		this.esinvitado = esinvitado;
	}
	
	
	public Persona getNombre() {
		return nombre;
	}
	public void setNombre(Persona nombre) {
		this.nombre = nombre;
	}
	public boolean isEsinvitado() {
		return esinvitado;
	}
	public void setEsinvitado(boolean esinvitado) {
		this.esinvitado = esinvitado;
	}
	
	
	
}
