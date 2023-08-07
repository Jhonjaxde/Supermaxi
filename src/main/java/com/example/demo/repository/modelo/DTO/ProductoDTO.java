package com.example.demo.repository.modelo.DTO;

import jakarta.persistence.Transient;

public class ProductoDTO {
	
	private String codigoDeBarras;
	
	private Integer stock;
	public ProductoDTO() {
	
	}
	
	public ProductoDTO(String codigoDeBarras, Integer stock) {
		super();
		this.codigoDeBarras = codigoDeBarras;
		this.stock = stock;
	}
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
}
