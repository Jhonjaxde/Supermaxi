package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
	@GeneratedValue(generator = "seq_venta", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_venta", sequenceName = "seq_venta", allocationSize = 1)
	@Id
	@Column(name = "ven_id")
	private Integer id;
	@Column(name = "ven_numero")
	private String numero;
	@Column(name = "ven_fecha")
	private LocalDateTime fecha;
	@Column(name = "ven_cedulaCliente")
	private String cedulaCliente;
	@Column(name = "ven_ventaTotal")
	private BigDecimal ventaTotal;
	
	
	@OneToMany(mappedBy = "venta", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<DetalleVenta> detallesVentas;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public String getCedulaCliente() {
		return cedulaCliente;
	}


	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}


	public BigDecimal getVentaTotal() {
		return ventaTotal;
	}


	public void setVentaTotal(BigDecimal ventaTotal) {
		this.ventaTotal = ventaTotal;
	}


	public List<DetalleVenta> getDetallesVentas() {
		return detallesVentas;
	}


	public void setDetallesVentas(List<DetalleVenta> detallesVentas) {
		this.detallesVentas = detallesVentas;
	}


	@Override
	public String toString() {
		return "Venta [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", cedulaCliente=" + cedulaCliente
				+ ", ventaTotal=" + ventaTotal + ", detallesVentas=" + detallesVentas + "]";
	}
	

}
