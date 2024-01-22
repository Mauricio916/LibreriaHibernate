package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Libros;

public interface LibroDAO {

public List<Libros> findAll();
	
	public LibroDAO findOne(int id);
	
	public void add(Libros libro);
	
	public void up(Libros libro);
	
	public void del(int id);
	
	public List<Libros> findAll(String busqueda);
}
