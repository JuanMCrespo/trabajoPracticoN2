package listaRegalos;

import java.util.Date;

import domicilio.Domicilio;
import persona.Producto;

public class listaRegalo {
	
	protected Producto regalo;
	protected Date fechafin;
	protected Domicilio envio;
	protected String nombre;
	
	
	public listaRegalo(Producto regalo, Date fechafin, Domicilio envio, String nombre) {
		this.regalo = regalo;
		this.fechafin = fechafin;
		this.envio = envio;
		this.nombre = nombre;
	}
	public Producto getRegalo() {
		return regalo;
	}
	public void setRegalo(Producto regalo) {
		this.regalo = regalo;
	}
	public Date getFechafin() {
		return fechafin;
	}
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	public Domicilio getEnvio() {
		return envio;
	}
	public void setEnvio(Domicilio envio) {
		this.envio = envio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
