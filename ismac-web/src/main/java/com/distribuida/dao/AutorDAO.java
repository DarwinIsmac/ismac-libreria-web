package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Autor;

public interface AutorDAO {
	
	public List<Autor> findAll();
	public Autor findOne(int id);
	public void add(Autor autor);
	public void up(Autor autor);
	public void del(int id);
	
	public List<Autor> findAll(String busqueda);
	
	public void add(int i, String string, String string2, String string3, String string4, String string5,
			String string6);
	public void up(int i, String string, String string2, String string3, String string4, String string5,
			String string6);
	

}
