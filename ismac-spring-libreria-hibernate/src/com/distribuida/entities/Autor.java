package com.distribuida.entities;

public class Autor {
	
	
	private int id_autor;
	private String nombre;
	private String pais;
	private String apellido;
	private String correo;
	private int telefono;
	private String direccion;
	
	public Autor() {}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Autor [id_autor=" + id_autor + ", nombre=" + nombre + ", pais=" + pais + ", apellido=" + apellido
				+ ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}
	
	
	

}
