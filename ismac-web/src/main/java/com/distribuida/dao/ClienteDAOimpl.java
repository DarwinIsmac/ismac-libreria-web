package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Cliente;

@Repository
public class ClienteDAOimpl implements ClienteDAO{
	
	@Autowired
	
	private SessionFactory sessionFactory;
	
	
	@Transactional
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Cliente", Cliente.class).getResultList();
	}
	
	@Transactional

	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
				
		return session.get(Cliente.class, id);
	}

	@Transactional
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cliente);
		
		
	}
	@Transactional
	public void up(Cliente cliente) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cliente);
	}
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
		
	}
	
	

}
 