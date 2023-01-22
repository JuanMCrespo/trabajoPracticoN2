package Testing;

import java.util.ArrayList;
import java.util.List;

import persona.Producto;


public class testProducto {

	public static void main(String[] args) {
		List<Producto> Prod = new ArrayList<Producto>();
		
			Producto pr1 = new Producto("Heladera",15000,null);
			Prod.add(pr1);
			
			Producto pr2 = new Producto("Cocina",80000,null);
			Prod.add(pr2);
			
			Producto pr3 = new Producto("Lavarropas",60000,null);
			Prod.add(pr3);
			
			for (Producto producto : Prod) {
				System.out.println(producto.getNombre() + "-- $" + producto.getPrecio() );
			}
			
			String sElementoaBuscar = "Heladera";
			int posicion = Prod.indexOf(sElementoaBuscar);
			
			if (posicion >= 0)
				  System.out.println("El elemento " + sElementoaBuscar + " está en la lista. En la posición " + posicion);
				else
				  System.out.println("El elemento " + sElementoaBuscar + " NO está en la lista");
			
		
    // public static void main(String[] args) {
	//		List<Ciclista> clientes = new ArrayList<Ciclista>();
	//
	//		Ciclista c1 = new Ciclista("Matias");
	//		clientes.add(c1);
	//		
	//		Ciclista c2 = new Ciclista("Jose");
	//		clientes.add(c2);
	//      
	//      Ciclista c3 = new Ciclista("Juan");
	//		clientes.add(c3);
	//		
	//		for (Ciclista ciclista : clientes) {
	//			System.out.println(ciclista.getNombre());
	//		}
		
		
		
	}
	
}
