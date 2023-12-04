package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.entities.Autor;

public class AutorDAOImpl implements AutorDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public List<Autor> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		//SELECT * FROM autor as au; SQL
		//SELECT au FROM Autor au;  HQL
		List <Autor> autores = session.createQuery("SELECT au FROM Autor au", Autor.class).getResultList();
		return autores;
	}

	@Override
	public Autor findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Autor autor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void up(Autor autor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
