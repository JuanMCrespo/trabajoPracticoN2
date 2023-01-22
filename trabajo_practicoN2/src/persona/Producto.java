package persona;

import carrito.cat_Productos;

public class Producto {
	
	protected String nombre;
	protected double precio;
	protected cat_Productos categoria;
	
		public Producto(String nombre, double precio, cat_Productos categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	
		}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public cat_Productos getCategoria() {
		return categoria;
	}
	public void setCategoria(cat_Productos categoria) {
		this.categoria = categoria;
	}
	
	

}
