package com.distribuida.dao;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Autor;
//import com.distribuida.entities.Categoria;

@Repository
public class AutorDAOimpl implements AutorDAO {
	
	@Autowired
	
	private SessionFactory sessionFactory;
	
	@Transactional

	public List<Autor> findAll() {
		// TODO Auto-generated method stub
		
		Session session =sessionFactory.getCurrentSession();
		return session.createQuery("SELECT au FROM Autor au", Autor.class).getResultList();
	}
//////////////////////////////////////////////////////FINDONE
	@Transactional
	public Autor findOne(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		Query query =session.createQuery("SELECT au FROM Autor au WHERE au.idAutor=:keyIdAutor");
		query.setParameter("keyIdAutor", id);
		
		return (Autor) query.getSingleResult();
	}
	//////////////////////////////////////añadir
	@Transactional
	public void add(Autor autor) {
		// TODO Auto-generated method stub
		
		Session session =sessionFactory.getCurrentSession();
		session.saveOrUpdate(autor);

	}
	@Transactional	
	public void up(Autor autor) {
		// TODO Auto-generated method stub

		Session session =sessionFactory.getCurrentSession();
		Query query =session.createQuery("UPDATE Autor SET nombre =:nombre, "
				+ " apellido =:apellido, "
				+ " pais =: pais, "
				+ " direccion =:direccion, "
				+ " telefono =:telefono, "
				+ " correo =:correo "
				+ " WHERE idAutor =:idAutor "
				);
		query.setParameter("nombre",autor.getNombre());
		query.setParameter("apellido",autor.getApellido());
		query.setParameter("pais",autor.getPais());
		query.setParameter("direccion",autor.getDireccion());
		query.setParameter("telefono",autor.getTelefono());
		query.setParameter("correo", autor.getCorreo());
		query.setParameter("idAutor", autor.getIdAutor());
		
		query.executeUpdate();
		
	}
	/////////////////////////DELETE
	
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		
		Session session =sessionFactory.getCurrentSession();
		Query query =session.createQuery("DELETE FROM Autor au WHERE au.idAutor =: idAutor");
		query.setParameter("idAutor",id);
		
		query.executeUpdate();

	}
	public List<Autor> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}
	public void add(int i, String string, String string2, String string3, String string4, String string5,
			String string6) {
		// TODO Auto-generated method stub
		
	}
	public void up(int i, String string, String string2, String string3, String string4, String string5,
			String string6) {
		// TODO Auto-generated method stub
		
	}
	
	
	/*@Transactional
	public List<Autor> findAll(String busqueda) {
		// TODO Auto-generated method stub
		
		//Session session = sessionFactory.getCurrentSession();
		Query<Autor> query = session.createQuery(" SELECT au FROM  Autor au "
				+ " WHERE au.nombre LIKE : busqueda "
				+ " OR au.apellido LIKE : busqueda "
				+ " OR au.pais LIKE : busqueda"
				+ " OR au.direccion LIKE : busqueda"
				+ " OR au.telefono LIKE : busqueda"
				+ "OR au.correo LIKE : busqueda"
				, Autor.class );
				
		query.setParameter("busqueda","%"+busqueda+"%");
		
		return query.getResultList();
	}
	*/
	

}
