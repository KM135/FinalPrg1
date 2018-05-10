package modelo;

import java.util.ArrayList;

public class Vehiculo {
	private String placa;
	private ArrayList<Propietario> due�o;

	public Vehiculo(String placa) {
		super();
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public ArrayList<Propietario> getDue�o() {
		return due�o;
	}

	public void setDue�o(ArrayList<Propietario> due�o) {
		this.due�o = due�o;
	}

	

}
