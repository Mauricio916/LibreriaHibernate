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
	@Transactional
	public Clientes findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Clientes.class, id);
		
	}

	@Override
	@Transactional
	public void add(Clientes cliente) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		//Clientes cliente1 = new Clientes(0,"18115151","nombre1","apellido1","direccion","telefono","fassd@sad.com");
		//Actulizar
		//Clientes cliente2 = new Clientes(1,"18115151","nombre1","apellido1","direccion","telefono","fassd@sad.com");
		session.saveOrUpdate(cliente);
	}

	@Override
	@Transactional
	public void up(Clientes cliente) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cliente);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(findOne(id));
		
	}

}
