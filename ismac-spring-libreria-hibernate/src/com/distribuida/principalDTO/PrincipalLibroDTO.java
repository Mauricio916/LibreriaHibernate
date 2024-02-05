package com.distribuida.principalDTO;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dto.LibroService;
import com.distribuida.entities.Libros;

public class PrincipalLibroDTO {

	private static final Libros[] Libros = null;

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		LibroService libroService = context.getBean("libroServiceImpl", LibroService.class);
		
		
		//add
		libroService.add(0, "titulo1", "editorial1", 20, "edicion1", "idioma1", new Date(), "descripcion1", "tipopasta1", "isbn1", 20, "portada1", "presentacion", 22.22,1, 1);
		
		
//		findAll
		List<Libros> libros = libroService.findAll();
		for (Libros libro : libros) {
//			System.out.println(libros.toString());
			
		}
		

	}

}
