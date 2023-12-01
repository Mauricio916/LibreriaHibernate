package com.distribuida.entities;

public class Categoria {
	
	private int id_categoria;
	private String categoria;
	private String descripcion;
	
	
	public Categoria() {}
	
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", categoria=" + categoria + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	

}
