package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;


@Service
public class AutorServiceImpl implements AutorService {

	
	@Autowired
	private AutorDAO autorDAO;
	
	@Override
	public List<Autor> findAll() {
		// TODO Auto-generated method stub
		return autorDAO.finAll();
	}

	@Override
	public Autor findOne(int id) {
		// TODO Auto-generated method stub
		return autorDAO.findOne(id);
	}

	@Override
	public void add(cedula, nombre, apellido, direccion, telefono, correo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Autor autor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Autor> finAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

}
