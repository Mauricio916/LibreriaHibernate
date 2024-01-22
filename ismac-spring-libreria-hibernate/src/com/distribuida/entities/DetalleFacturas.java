package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "detalle_factura")
public class DetalleFacturas {
	
	@Column(name = "idDetFac")
	private int idDetFac;
	@Column(name = "cantidad")
	private String cantidad;
	@Column(name = "subtotal")
	private double subtotal;
	
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="id_factura")
	private Factura factura;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="id_libro")
	private Libros libro;
	
	public DetalleFacturas() {}

	public int getIdDetFac() {
		return idDetFac;
	}

	public void setIdDetFac(int idDetFac) {
		this.idDetFac = idDetFac;
		
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


	

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libros getLibro() {
		return libro;
	}

	public void setLibro(Libros libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "DetalleFacturas [idDetFac=" + idDetFac + ", cantidad=" + cantidad + ", subtotal=" + subtotal
				+ ", factura=" + factura + ", libro=" + libro + "]";
	}


	
	

	
	
	

}
