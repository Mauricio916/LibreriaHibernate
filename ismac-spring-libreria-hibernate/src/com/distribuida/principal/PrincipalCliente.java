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
		
		//CRUD
		
		
		//add
		//Clientes cliente1 = new Clientes(0,"18115151","nombre1","apellido1","direccion","telefono","fassd@sad.com");
		//clienteDAO.add(cliente1);
		
		Clientes cliente2 = new Clientes(39,"181151525251","nombre17","apellido15","direccion","telefono","fassd@sad.com");
		//clienteDAO.add(cliente2);
		
		//del
		clienteDAO.del(39);
		
		//System.out.println(cliente.toString());
		
		//findAll
				List<Clientes> clientes = clienteDAO.findAll();
				
		
		for (Clientes clientes2 : clientes) {
			System.out.println(clientes2.toString());
		}
				
				//findOne
				//Clientes cliente = clienteDAO.findOne(1);
//				System.out.println(clientes.toString());
				
		
		context.close();

	}

}
