package modelo;

import java.util.ArrayList;

public class Propietario {
	private int cedula;
	private String nombre;
	private String direccion;
	private String telefono;
	
	private ArrayList <Vehiculo>carros;

	public Propietario(int cedula, String nombre, String direccion, String telefono) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		carros = new ArrayList <Vehiculo>();
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public ArrayList<Vehiculo> getCarros() {
		return carros;
	}

	public void setCarros(ArrayList<Vehiculo> carros) {
		this.carros = carros;
	}

	
}