package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.IVentaRepository;
import com.example.demo.repository.modelo.Producto;
import com.example.demo.repository.modelo.Venta;
import com.example.demo.repository.modelo.DTO.ProductoDTO;
import com.example.demo.repository.modelo.DTO.VentaDTO;
@Service
public class VentaServiceImpl implements IVentaService{
	@Autowired
	private IVentaRepository iVentaRepository;

	@Autowired
	private IProductoRepository iProductoRepository;
	@Override
	public void ingresarVentaFinal(VentaDTO ventaDTO) {

		this.iVentaRepository.insertarVentaFinal(ventaDTO);
		
	}

}
