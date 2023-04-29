package ar.unrn.domain.model;

import ar.unrn.domain.portsin.Motor;

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
