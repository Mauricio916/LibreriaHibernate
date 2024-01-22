package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Clientes;

public interface ClienteService {

	public List<Clientes> findAll();
	
	public Clientes findOne(int id);
	
	public void add(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono, String correo);
	
	public void up(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono, String correo);
	
	public void del(int id);
	
}
