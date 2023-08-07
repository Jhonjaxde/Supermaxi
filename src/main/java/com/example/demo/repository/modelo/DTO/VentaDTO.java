package com.example.demo.repository.modelo.DTO;

import java.util.List;



public class VentaDTO {
	
	private List<ProductoDTO>  productosVenta;
	private String cedulaCliente;
	private String numero;
	
	public VentaDTO() {
		
	}
	
	public VentaDTO(List<ProductoDTO> productosVenta, String cedula, String numeroVenta) {
		super();
		this.productosVenta = productosVenta;
		this.cedulaCliente = cedula;
		this.numero = numeroVenta;
	}

	public List<ProductoDTO> getProductosVenta() {
		return productosVenta;
	}

	public void setProductosVenta(List<ProductoDTO> productosVenta) {
		this.productosVenta = productosVenta;
	}

	public String getCedula() {
		return cedulaCliente;
	}

	public void setCedula(String cedula) {
		this.cedulaCliente = cedula;
	}

	public String getNumeroVenta() {
		return numero;
	}

	public void setNumeroVenta(String numeroVenta) {
		this.numero = numeroVenta;
	}
	
	

}
