package carrito;

import domicilio.Domicilio;

public class Envio {
	
	protected Domicilio Domicilio_Envio;
	
	
		public Envio(Domicilio domicilio_Envio) {
			this.Domicilio_Envio = domicilio_Envio;
	}

	public Domicilio getDomicilio_Envio() {
		return Domicilio_Envio;
	}

	public void setDomicilio_Envio(Domicilio domicilio_Envio) {
		Domicilio_Envio = domicilio_Envio;
	}
	
	

}
