package com.example.demo.repository;

import com.example.demo.repository.modelo.Venta;
import com.example.demo.repository.modelo.DTO.VentaDTO;

public interface IVentaRepository {
	public void insertar(Venta venta);
	public Venta seleccionar(Integer id);
	public void actualizar(Venta venta);
	public void eliminar(Integer id);
	public void insertarVentaFinal(VentaDTO ventaDTO);
}
