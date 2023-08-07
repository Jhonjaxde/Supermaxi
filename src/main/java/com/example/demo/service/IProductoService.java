package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Producto;

public interface IProductoService {
	public void agregar(Producto producto,String codigoDeBarras);
	public List<Producto> buscarConValidacion(String codigoDeBarras);
	public Producto buscar(String cb);
}
