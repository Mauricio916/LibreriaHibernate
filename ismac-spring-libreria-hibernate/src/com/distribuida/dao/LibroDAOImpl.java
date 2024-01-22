package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Libros;

@Repository
public class LibroDAOImpl implements LibroDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	@Transactional
	public List<Libros> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List <Libros> libros = session.createQuery("SELECT au FROM Libros au", Libros.class).getResultList();
		return session.createQuery("from Libro", Libros.class).getResultList();
	}

	@Override
	@Transactional
	public Libros findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Libros> query = session.createQuery("SELECT au FROM Libros au WHERE idLibro =: keyIdLibro", Libros.class);
		query.setParameter("keyIdLibro", id);
		return session.get(Libros.class, id);
	}

	@Override
	@Transactional
	public void add(Libros libro) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(libro);
	}

	@Override
	@Transactional
	public void up(Libros libro) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(libro);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

	
	@Override
	@Transactional
	public List<Libros> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Libros> query = session.createQuery(" select li "
				+ " from Libro li "
				+ " where titulo like : keyBusqueda "
				+ " or editorial like : keyBusqueda "
				+ " or numPaginas like : keyBusqueda "
				+ " or edicion like : keyBusqueda "
				+ " or idioma like : keyBusqueda "
				+ " or fechaPublicacion like : keyBusqueda "
				+ " or descripcion like : keyBusqueda "
				+ " or tipoPasta like : keyBusqueda "
				+ " or ISBN like : keyBusqueda "
				+ " or numEjemplares like : keyBusqueda "
				+ " or portada like : keyBusqueda "
				+ " or presentacion like : keyBusqueda "				
				+ " or precio like : keyBusqueda ", Libros.class);
		query.setParameter("keyBusqueda", "%"+busqueda+"%");				
		return query.getResultList();
		
	}

}



