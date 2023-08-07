package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Producto;

public interface IProductoRepository {
	public void insertar(Producto producto);
	public Producto seleccionar(String cb);
	public void actualizar(Producto Producto);
	public void eliminar(Integer id);
	public List<Producto> seleccionarValidacion(String codigoDeBarras);
}
