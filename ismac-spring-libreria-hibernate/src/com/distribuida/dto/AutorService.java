package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Autor;

public interface AutorService {
	
	
	public List<Autor> findAll();
	
	public Autor findOne(int id);
	
	public void add(int idAutor, String nombre, String pais, String apellido, String correo, String telefono,
			String direccion);
	
	public void up(int idAutor, String nombre, String pais, String apellido, String correo, String telefono,
			String direccion);
	
	public void del(int id);
	
	public List<Autor> finAll(String busqueda);

	void add();	

}
