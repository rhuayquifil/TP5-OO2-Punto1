package ar.unrn.domain.model;

public class EconomicoMotor implements Motor {

	public EconomicoMotor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void arrancar() {
		System.out.println("EconomicoMotor arranco");
	}

	public void acelerar() {
		System.out.println("EconomicoMotor acelero");
	}

	public void apagar() {
		System.out.println("EconomicoMotor apago");
	}
}
