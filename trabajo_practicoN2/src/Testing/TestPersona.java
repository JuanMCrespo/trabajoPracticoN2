package Testing;

import domicilio.Domicilio;
import persona.Persona;
import persona.Usuario;

public class TestPersona {

public static void main(String[] args) {


	
Persona p1 = new Persona ("Juan","Crespo",1234,1212,"aca va un mail",null,null);


 System.out.println("Nombre: " + p1.getNombre());
 System.out.println("Apellido: " + p1.getApellido());
 System.out.println("Dni: " + p1.getDni());
 System.out.println("Telefono: " + p1.getTelefono());
 System.out.println("Mail: " + p1.getMail());
 System.out.println("Usuario: " + p1.getUsuario());
 System.out.println("Direccion: " + p1.getDireccion());
	}

}

