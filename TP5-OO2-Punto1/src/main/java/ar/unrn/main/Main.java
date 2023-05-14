package ar.unrn.main;

import ar.unrn.domain.model.AdapterMotor;
import ar.unrn.domain.model.ElectricoMotor;
import ar.unrn.domain.model.Motor;

public class Main {

	public static void main(String[] args) {

//		Motor motor = new ComunMotor();

//		Motor motor = new EconomicoMotor();

		Motor motor = new AdapterMotor(new ElectricoMotor());

		motor.arrancar();
		motor.acelerar();
		motor.apagar();
	}
}
