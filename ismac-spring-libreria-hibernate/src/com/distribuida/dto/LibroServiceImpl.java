package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libros;


@Service
public class LibroServiceImpl implements LibroService {

	
	private LibroDAO libroDAO;
	
	private AutorDAO autorDAO;
	
	private CategoriaDAO categoriaDAO;
	
	@Override
	public List<Libros> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libros findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int id_libro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
			Date fecha_publicacion, String descripcion, String tipo_pasta, String iSBN, int num_ejemplares,
			String portada, String presentacion, double precio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(int id_libro, String titulo, String editorial, int num_paginas, String edicion, String idioma,
			Date fecha_publicacion, String descripcion, String tipo_pasta, String iSBN, int num_ejemplares,
			String portada, String presentacion, double precio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Libros> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

}
