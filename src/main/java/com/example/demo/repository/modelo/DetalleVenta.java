package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleVenta")
public class DetalleVenta {
	@GeneratedValue(generator = "seq_detalleventa", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_detalleventa", sequenceName = "seq_detalleventa", allocationSize = 1)
	@Id
	@Column(name = "dtve_id")
	private Integer id;
	@Column(name = "dtve_cantidad")
	private String cantidad;
	@Column(name = "dtve_precioUnitario")
	private BigDecimal precioUnitario;
	@Column(name = "dtve_subtotal")
	private BigDecimal subtotal;
	@ManyToOne()
	@JoinColumn(name = "dtave_id_producto")
	private Producto producto;
	
	@ManyToOne()
	@JoinColumn(name = "dtave_id_detalleVenta")
	private Venta venta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Producto getProductoVenta() {
		return producto;
	}

	public void setProductoVenta(Producto productoVenta) {
		this.producto = productoVenta;
	}

	public Venta getDetalleVentaFinal() {
		return venta;
	}

	public void setDetalleVentaFinal(Venta VentaFinal) {
		this.venta = VentaFinal;
	}

	@Override
	public String toString() {
		return "DetalleVenta [id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", subtotal=" + subtotal + ", productoVenta=" + producto + ", VentaFinal="
				+ venta + "]";
	}
	
	
}
