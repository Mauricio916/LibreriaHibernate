package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		//CRUD
		//add
		Autor autor1 = new Autor(0,"nombre1","apellido1","pais1","direccion1","correo1","telefono1");
		autorDAO.add(autor1);
		//findOne
		Autor autor = autorDAO.findOne(1);
		//System.out.println(autor.toString());
		//findAll
		List<Autor> autores = autorDAO.findAll();
		
//		for (Autor autor2 : autores) {
//			System.out.println(autor2.toString());
//			
//		}
		
		context.close();
	}

}
