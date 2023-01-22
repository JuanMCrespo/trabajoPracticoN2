package persona;

import listaRegalos.listaRegalo;

public class Pareja  {
	
	protected Persona prometido1;
	protected Persona prometido2;
	protected listaRegalo lista;
	public Persona getPrometido1() {
		return prometido1;
	}
	public void setPrometido1(Persona prometido1) {
		this.prometido1 = prometido1;
	}
	public Persona getPrometido2() {
		return prometido2;
	}
	public void setPrometido2(Persona prometido2) {
		this.prometido2 = prometido2;
	}
	public listaRegalo getLista() {
		return lista;
	}
	public void setLista(listaRegalo lista) {
		this.lista = lista;
	}
	
	
	
}
