package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.Producto;
@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepository iProductoRepository;
	
	@Override
	public void agregar(Producto producto, String codigoDeBarras) {
			
		/*Producto pro = this.buscar(codigoDeBarras);
		if(producto.getCodigoDeBarras().equals(pro.getCodigoDeBarras())) {
			System.out.println("Aumento un Item al stock" + (pro.getStock()+1));
		
		}else {*/
			this.iProductoRepository.insertar(producto);
			
		//}
		
	}

	@Override
	public List<Producto> buscarConValidacion(String codigoDeBarras) {
		
		return this.iProductoRepository.seleccionarValidacion(codigoDeBarras);
	}

	@Override
	public Producto buscar(String cb) {
		return this.iProductoRepository.seleccionar(cb);
		
		
	}

}
