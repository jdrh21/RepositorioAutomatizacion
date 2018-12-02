package com.tiquetesbaratos.certification.models;

//Clase que contiene una plantilla para los datos del cliente que se ingresan en reserva

public class ReservationModel {
	
	private String primerNombre;
	private String primerApellido;
	private String cedula;
	private String telefono;
	private String celular;
	private String correo1;
	private String correo2;
	
	public ReservationModel(String primerNombre, String primerApellido, String cedula, String telefono, String celular,
			String correo1, String correo2) {
		this.primerNombre = primerNombre;
		this.primerApellido = primerApellido;
		this.cedula = cedula;
		this.telefono = telefono;
		this.celular = celular;
		this.correo1 = correo1;
		this.correo2 = correo2;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo1() {
		return correo1;
	}

	public void setCorreo1(String correo1) {
		this.correo1 = correo1;
	}

	public String getCorreo2() {
		return correo2;
	}

	public void setCorreo2(String correo2) {
		this.correo2 = correo2;
	}
	
	

}
