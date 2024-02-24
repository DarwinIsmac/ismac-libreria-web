package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Factura;

@Repository
public class FacturaDAOImpl implements FacturaDAO {
	
	@Autowired
	
	private SessionFactory sessionFactory;
	
	//@Override
	@Transactional

	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		
		Session session= sessionFactory.getCurrentSession();
		
		return session.createQuery("FROM Factura", Factura.class).getResultList();
	}

	@Transactional
	public Factura findOne(int id)  {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.get(Factura.class, id);
	}

	@Transactional
	public void add(Factura factura) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		session .saveOrUpdate(factura);
	}

	@Transactional
	public void up(Factura factura) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		session .saveOrUpdate(factura);

	}

	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		session .delete(findOne(id));
		

	}
	@Transactional
	public List<Factura> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

}
