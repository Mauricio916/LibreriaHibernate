package com.distribuida.entities;

public class DetalleFacturas {
	
	private int idDetFac;
	private String cantidad;
	private double subtotal;
	private Factura factura;
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
