package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Autor;
import com.distribuida.entities.DetalleFactura;

public interface DetalleFacturaService {
	public List<DetalleFactura> findAll();
	public void add(DetalleFactura detallefactura);
	public void up(DetalleFactura detallefactura);
	public void del(int id);
	public DetalleFactura findOne (int id);
	
	public void add(int idDetalleFactura, int cantidad, Double subTotal, int idFactura, int idLibro);
	
	public void up(int idDetalleFactura, int cantidad, Double subTotal, int idFactura, int idLibro);
	
	

	

	

}
