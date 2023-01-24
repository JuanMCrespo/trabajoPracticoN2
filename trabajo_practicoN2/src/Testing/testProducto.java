package Testing;

import java.util.ArrayList;
import java.util.List;

import persona.Producto;


public class testProducto {

	public static void main(String[] args) {
		List<Producto> Listado_Prod;
		
		Listado_Prod = new ArrayList<Producto>();
		
			Producto pr1 = new Producto("Heladera",15000,null);
			Producto pr2 = new Producto("Cocina",80000,null);
			Producto pr3 = new Producto("Lavarropas",60000,null);

			Listado_Prod.add(pr1);
			Listado_Prod.add(pr2);
			Listado_Prod.add(pr3);
			
			for (Producto producto : Listado_Prod) {
				System.out.println(producto.getNombre() + "-- $" + producto.getPrecio() );
			}
			
			String sElementoaBuscar = "Heladera";
			int posicion = Listado_Prod.indexOf(sElementoaBuscar);
			
			if (posicion >= 0)
				  System.out.println("El elemento " + sElementoaBuscar + " está en la lista. En la posición " + posicion);
				else
				  System.out.println("El elemento " + sElementoaBuscar + " NO está en la lista");

			System.out.println("En el arraylist hay " + Listado_Prod.size()+ " Elementos"); // Cuenta la cantidad de elementos
			
			Listado_Prod.clear();

			System.out.println("En el arraylist hay " + Listado_Prod.size()+ " Elementos");
			
	}
	
}
