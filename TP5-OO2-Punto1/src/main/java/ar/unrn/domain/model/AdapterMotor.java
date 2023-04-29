package ar.unrn.domain.model;

import ar.unrn.domain.portsin.Motor;

public class AdapterMotor implements Motor {

	private ElectricoMotor motorElectrico;

	public AdapterMotor(ElectricoMotor motorElectrico) {
		super();
		this.motorElectrico = motorElectrico;
	}

	public void arrancar() {
		motorElectrico.conectarYActivar();
	}

	public void acelerar() {
		motorElectrico.moverMasRapido();
	}

	public void apagar() {
		motorElectrico.detenerYDesconectar();
	}
}
