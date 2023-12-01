package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Clientes;

public interface ClienteDAO {
	
	public List<Clientes> findAll();
	
	public Clientes findOne(int id);
	
	public void add(Clientes cliente);
	
	public void up(Clientes cliente);
	
	public void del(int id);

	
	

}
