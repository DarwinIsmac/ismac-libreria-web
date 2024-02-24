package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.DetalleFactura;

public interface DetalleFacturaDAO {
	
	public List<DetalleFactura> findAll();

	public DetalleFactura findOne (int id);
	
	public void add(DetalleFactura detallefactura);
	
	public void up(DetalleFactura detallefactura);
	
	public void del(int id);
	
	public List<DetalleFactura> findAll(String busqueda);
	

	public void add(int i, String string, String string2);
	public void up(int i, String string, String string2);
}
