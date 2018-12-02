package com.tiquetesbaratos.certification.models;

//Clase que contiene una plantilla para los datos de tarjeta de credito

public class CreditCardModel {
	
	private String nombre;
	private String apellido;
	private String nroTarjeta;
	private String digSeguridad;
	private String cedula;
	private String direccion;
	private String ciudad;
	private String correo;
	private String telefono;
	
	public CreditCardModel(String nombre, String apellido, String nroTarjeta, String digSeguridad, String cedula,
			String direccion, String ciudad, String correo, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroTarjeta = nroTarjeta;
		this.digSeguridad = digSeguridad;
		this.cedula = cedula;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.correo = correo;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNroTarjeta() {
		return nroTarjeta;
	}

	public void setNroTarjeta(String nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}

	public String getDigSeguridad() {
		return digSeguridad;
	}

	public void setDigSeguridad(String digSeguridad) {
		this.digSeguridad = digSeguridad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
