package com.distribuida.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="factura_detalle")
public class DetalleFactura {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_factura_detalle")
	private int idDetalleFactura;
	@Column(name="cantidad")
	private int cantidad;
	@Column(name="subtotal")
	private Double subTotal;
		
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="id_factura")
	private Factura factura;
	
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="id_libro")
	private Libro libro;
	
	public DetalleFactura (){}
	
	
	
		public DetalleFactura(int idDetalleFactura, int cantidad, Double subTotal ) {
		this.idDetalleFactura = idDetalleFactura;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	
	}







	public int getIdaDetalleFactura() {
		return idDetalleFactura;
	}

	public void setIdaDetalleFactura(int idaDetalleFactura) {
		this.idDetalleFactura = idaDetalleFactura;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String toString() {
		return "DetalleFactura [idaDetalleFactura=" + idDetalleFactura + ", cantidad=" + cantidad + ", subTotal="
				+ subTotal + " ]";
	}



	public void add(int i, int j, double d, int k, int l) {
		// TODO Auto-generated method stub
		
	}



	public List<DetalleFactura> findAll() {
		// TODO Auto-generated method stub
		return null;
	}




		



	
		
	}
	
	
	


