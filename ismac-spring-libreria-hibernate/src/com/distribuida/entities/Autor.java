package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "autor")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_autor")
	private int idAutor;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "pais")
	private String pais;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "correo")
	private String correo;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "direccion")
	private String direccion;
	
	public Autor() {}
	
	

	public Autor(int idAutor, String nombre, String pais, String apellido, String correo, String telefono,
			String direccion) {
		
		this.idAutor = idAutor;
		this.nombre = nombre;
		this.pais = pais;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.direccion = direccion;
	}



	public int getId_autor() {
		return idAutor;
	}

	public void setId_autor(int id_autor) {
		this.idAutor = id_autor;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
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
		return "Autor [id_autor=" + idAutor + ", nombre=" + nombre + ", pais=" + pais + ", apellido=" + apellido
				+ ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}
	
	
	

}
