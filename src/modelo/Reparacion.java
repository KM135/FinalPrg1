package modelo;

import java.util.ArrayList;

public class Reparacion {

	private int id;
	private String fecha;
	private String descripcion;
	private String placaAuto;
	private int kilometraje;
	private int idMecanico;
	private String nombreMecanico;

	public Reparacion(int id, String fecha, String descripcion, String placaAuto, int kilometraje, int idMecanico,
			String nombreMecanico) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.placaAuto = placaAuto;
		this.kilometraje = kilometraje;
		this.idMecanico = idMecanico;
		this.nombreMecanico = nombreMecanico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPlacaAuto() {
		return placaAuto;
	}

	public void setPlacaAuto(String placaAuto) {
		this.placaAuto = placaAuto;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public int getIdMecanico() {
		return idMecanico;
	}

	public void setIdMecanico(int idMecanico) {
		this.idMecanico = idMecanico;
	}

	public String getNombreMecanico() {
		return nombreMecanico;
	}

	public void setNombreMecanico(String nombreMecanico) {
		this.nombreMecanico = nombreMecanico;
	}

}
