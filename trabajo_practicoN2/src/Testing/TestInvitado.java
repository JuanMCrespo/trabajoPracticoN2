package Testing;

import persona.Invitado;
 

public class TestInvitado {

	public static void main(String[] args) {

		Invitado in1 = new Invitado(null,false);
		
			System.out.println("El nombre es " + in1.getNombre());
			System.out.println("El invitado es " + in1.isEsinvitado());
	}

}
