package com.distribuida.entities;


import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Component
@Entity
@Table(name = "libros")
public class Libros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_libro")
	private int idLibro;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "editorial")
	private String editorial;
	@Column(name = "num_paginas")
	private int num_paginas;
	@Column(name = "edicion")
	private String edicion;
	@Column(name = "idioma")
	private String idioma;
	@Column(name = "fecha_publicacion")
	private Date fecha_publicacion;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "tipo_pasta")
	private String tipo_pasta;
	@Column(name = "ISBN")
	private String ISBN;
	@Column(name = "num_ejemplares")
	private int num_ejemplares;
	@Column(name = "portada")
	private String portada;
	@Column(name = "presentacion")
	private String presentacion; 
	@Column(name = "precio")
	private double precio;
	
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="id_autor")
	private Autor autor;
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	
	public Libros() {}


	public int getId_libro() {
		return idLibro;
	}


	public void setId_libro(int id_libro) {
		this.idLibro = id_libro;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getNum_paginas() {
		return num_paginas;
	}


	public void setNum_paginas(int num_paginas) {
		this.num_paginas = num_paginas;
	}


	public String getEdicion() {
		return edicion;
	}


	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public Date getFecha_publicacion() {
		return fecha_publicacion;
	}


	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getTipoPasta() {
		return tipo_pasta;
	}


	public void setTipoPasta(String tipoPasta) {
		this.tipo_pasta = tipoPasta;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public int getNum_ejemplares() {
		return num_ejemplares;
	}


	public void setNum_ejemplares(int num_ejemplares) {
		this.num_ejemplares = num_ejemplares;
	}

	


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public String getPortada() {
		return portada;
	}


	public void setPortada(String portada) {
		this.portada = portada;
	}


	public String getPresentacionlibro() {
		return presentacion;
	}


	public void setPresentacionlibro(String presentacionlibro) {
		this.presentacion = presentacionlibro;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Libros [id_libro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", num_paginas="
				+ num_paginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fecha_publicacion="
				+ fecha_publicacion + ", descripcion=" + descripcion + ", tipoPasta=" + tipo_pasta + ", ISBN=" + ISBN
				+ ", num_ejemplares=" + num_ejemplares + ", autor=" + autor + ", categoria=" + categoria + ", portada="
				+ portada + ", presentacionlibro=" + presentacion + ", precio=" + precio + "]";
	}


	public Libros(int id_libro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
			Date fecha_publicacion, String descripcion, String tipo_pasta, String iSBN, int num_ejemplares,
			String portada, String presentacion, double precio, Autor autor, Categoria categoria) {
		
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.num_paginas = num_paginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fecha_publicacion = fecha_publicacion;
		this.descripcion = descripcion;
		this.tipo_pasta = tipo_pasta;
		ISBN = iSBN;
		this.num_ejemplares = num_ejemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
		this.autor = autor;
		this.categoria = categoria;
	}



	
	
	
	
}
