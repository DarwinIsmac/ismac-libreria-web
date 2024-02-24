package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;

@Repository
public class CategoriaDAOimpl implements CategoriaDAO {
	
	@Autowired
	
	private SessionFactory sessionFactory;

	@Transactional
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();	
		
		return session.createQuery("SELECT au FROM Categoria au", Categoria.class).getResultList();
	}
	////////////////////////////////////////////////////////////////
	@Transactional
	public Categoria findOne(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		Query query =session.createQuery("SELECT au FROM Categoria au WHERE au.idCategoria=:keyIdCategoria");
		query.setParameter("keyIdCategoria", id);
		
		return (Categoria) query.getSingleResult();
	}
	
	@Transactional
	public void add(Categoria categoria) {
		// TODO Auto-generated method stub
		
		Session session =sessionFactory.getCurrentSession();
		session.saveOrUpdate(categoria);

	}
	
	@Transactional
	public void up(Categoria categoria) {
		// TODO Auto-generated method stub
		
		Session session =sessionFactory.getCurrentSession();
		Query query =session.createQuery("UPDATE Categoria SET categoria =:categoria"
		+ " descripcion =:descripcion"		
		+ " WHERE idCategoria =:idCategoria ");
		query.setParameter("categoria",categoria.getCategoria());
		query.setParameter("descripcion",categoria.getDescripcion());
		query.setParameter("idCategoria",categoria.getIdCategoria());
		
		query.executeUpdate();
	}
@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
	
	Session session =sessionFactory.getCurrentSession();
	Query query =session.createQuery("DELETE FROM Categoria au WHERE au.idCategoria =: idCategoria");
	query.setParameter("idCategoria",id);
	
	query.executeUpdate();

	}
	
	@Transactional
	public List<Categoria> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		Query<Categoria> query = session.createQuery("SELECT au FROM  Categoria au "
				+ " WHERE au.categoria LIKE : busqueda"
				+ " OR au.descripcion LIKE : busqueda"
				, Categoria.class);
		
		query.setParameter("busqueda","%"+busqueda+"%");
		return query.getResultList();
	}
	public void add(int idCategoria, String categoria, String descripcion) {
		// TODO Auto-generated method stub
		
	}
	public void up(int idCategoria, String categoria, String descripcion) {
		// TODO Auto-generated method stub
		
	}

}
