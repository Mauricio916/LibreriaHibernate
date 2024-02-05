package com.distribuida.dto;

import java.util.List;
import java.util.Date;


import com.distribuida.entities.Libros;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;

public interface LibroService {
	
	

public List<Libros> findAll();
	
	public Libros findOne(int id);
	
	public void add(int id_libro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
			Date fecha_publicacion, String descripcion, String tipo_pasta, String iSBN, int num_ejemplares,
			String portada, String presentacion, double precio);
	
	public void up(int id_libro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
			Date fecha_publicacion, String descripcion, String tipo_pasta, String iSBN, int num_ejemplares,
			String portada, String presentacion, double precio);
	
	public void del(int id);
	
	public List<Libros> findAll(String busqueda);

	public void add(int i, String string, String string2, int j, String string3, String string4, Date date,
			String string5, String string6, String string7, int k, String string8, String string9, double d, int l,
			int m);
}
