package com.distribuida.dto;

import java.util.List;

import org.springframework.stereotype.Service;

import com.distribuida.entities.Clientes;


@Service
public class ClienteSeviceImpl implements ClienteService {

	@Override
	public List<Clientes> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clientes findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono,
			String correo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono,
			String correo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

	public ClienteSeviceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

}
