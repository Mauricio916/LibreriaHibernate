package com.distribuida.principal;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Clientes;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");

		FacturaDAO facturaDAO= context.getBean("facturaDAOImpl", FacturaDAO.class);		
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		//CRUD
		
		//add
		Clientes cliente = clienteDAO.findOne(1);
		Factura factura = new Factura(0, "FAC-0062",new Date(),123.3,14.30,140.56, cliente);
		
		//facturaDAO.add(factura);
		
		//up 
		
//		Clientes cliente1 = clienteDAO.findOne(2);
//		Factura factura1 = new Factura(86, "FAC-0062",new Date(),1.3,1.30,40.56, cliente1);
//	
//		facturaDAO.up(factura1);
		
		Clientes cliente1 = clienteDAO.findOne(1);
		Factura factura1 = new Factura(9, "FAC-0036",new Date(),1666.30000,1.306666,40.56, cliente1);
	
		facturaDAO.up(factura1);
		
		
		//del
		
		facturaDAO.del(16);
		
		
		//findAll
		List<Factura> facturas = facturaDAO.findAll();
		
		//Impresion
		for (Factura item : facturas ) {
			System.out.println(item.toString());
			
		}
		
		//findOne
		//Factura factura = facturaDAO.findOne(2);
		//System.out.println(factura.toString());
		
		context.close();
	}

}
