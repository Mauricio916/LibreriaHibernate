package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Clientes;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		List<Clientes> clientes = clienteDAO.findAll();
		
//		System.out.println(clientes.toString());
		
		for (Clientes clientes2 : clientes) {
			System.out.println(clientes2.toString());
		}
		
		context.close();

	}

}
