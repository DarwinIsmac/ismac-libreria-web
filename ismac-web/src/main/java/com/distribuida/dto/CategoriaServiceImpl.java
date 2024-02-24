package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.distribuida.dto.CategoriaService;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	
	@Autowired
	
	private CategoriaDAO categoriaDAO;

	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return categoriaDAO.findAll();
	}

	public Categoria findOne(int id) {
		// TODO Auto-generated method stub
		return categoriaDAO.findOne(id);
	}
	
	
	public void add(int idCategoria, String categoria, String descripcion) {
		// TODO Auto-generated method stub
		
		Categoria categoria1=new Categoria(idCategoria, categoria, descripcion);
		//categoriaDAO.add(categoria1);
		
	

	}
	public void up(int idCategoria, String categoria, String descripcion) {
		// TODO Auto-generated method stub
		Categoria categoria1=new Categoria(idCategoria, categoria, descripcion);
		//categoriaDAO.up(categoria1);
		
	}
	
	public void del(int id) {
		// TODO Auto-generated method stub
		
		//categoriaDAO.del(id);

	}
	public List<Categoria> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return categoriaDAO.findAll(busqueda);
	}

}
