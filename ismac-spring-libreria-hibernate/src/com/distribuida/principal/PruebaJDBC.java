package com.distribuida.principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	   String jdbcURL="jdbc:mysql://localhost:3306/bdlibreria";
	   String user = "root";
	   String clave = "root";
	   
	   try {
		   System.out.println("Estableciendo conexión....!!!");
		   
		   Connection connection = DriverManager.getConnection(jdbcURL,user,clave);
		   System.out.println("Conexión establecida");
	   } catch (Exception e) {
		   e.printStackTrace();
		   
		   
	   }
		
	}

}
