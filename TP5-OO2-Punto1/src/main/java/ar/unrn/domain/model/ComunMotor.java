package ar.unrn.domain.model;

public class ComunMotor implements Motor {

	public ComunMotor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void arrancar() {
		System.out.println("ComunMotor arranco");
	}

	public void acelerar() {
		System.out.println("ComunMotor acelero");
	}

	public void apagar() {
		System.out.println("ComunMotor apago");
	}
}
