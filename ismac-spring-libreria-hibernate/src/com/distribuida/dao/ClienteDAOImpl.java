package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Clientes;



@Repository
public class ClienteDAOImpl implements ClienteDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Clientes> findAll() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Clientes", Clientes.class).getResultList();
		

	}

	@Override
	public Clientes findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Clientes cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Clientes cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

}
