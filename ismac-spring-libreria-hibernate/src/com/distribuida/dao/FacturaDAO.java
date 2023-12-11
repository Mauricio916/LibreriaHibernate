package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Clientes;
import com.distribuida.entities.Factura;

public interface FacturaDAO {

public List<Factura> findAll();
	
	public Factura findOne(int id);
	
	public void add(Factura Factura);
	
	public void up(Clientes cliente);
	
	public void del(int id);
	
}
