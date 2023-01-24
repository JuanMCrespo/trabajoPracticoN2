package carrito;

import persona.Producto;

public class Carrito {
	
	protected Producto producto_Elegido;	
	protected String Mensaje_de_Envio;
	protected double pago;
	protected String aviso;
	
		
	public Carrito(Producto producto_Elegido, String mensaje_de_Envio, double pago, String aviso) {
		this.producto_Elegido = producto_Elegido;
		this.Mensaje_de_Envio = mensaje_de_Envio;
		this.pago = pago;
		this.aviso = aviso;
	}
	
	
	public Producto getProducto_Elegido() {
		return producto_Elegido;
	}
	public void setProducto_Elegido(Producto producto_Elegido) {
		this.producto_Elegido = producto_Elegido;
	}
	public String getMensaje_de_Envio() {
		return Mensaje_de_Envio;
	}
	public void setMensaje_de_Envio(String mensaje_de_Envio) {
		Mensaje_de_Envio = mensaje_de_Envio;
	}
	public double getPago() {
		return pago;
	}
	public void setPago(double pago) {
		this.pago = pago;
	}
	public String getAviso() {
		return aviso;
	}
	public void setAviso(String aviso) {
		this.aviso = aviso;
	}
	
}
