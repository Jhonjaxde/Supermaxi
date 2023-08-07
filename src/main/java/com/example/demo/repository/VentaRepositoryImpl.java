package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Venta;
import com.example.demo.repository.modelo.DTO.VentaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class VentaRepositoryImpl implements IVentaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Venta venta) {
		this.entityManager.persist(venta);
		
	}

	@Override
	public Venta seleccionar(Integer id) {
		
		return this.entityManager.find(Venta.class, id);
	}

	@Override
	public void actualizar(Venta venta) {
		this.entityManager.merge(venta);
		
	}

	@Override
	public void eliminar(Integer id) {
		Venta venta= this.seleccionar(id);
		 this.entityManager.remove(venta);;
	}

	@Override
	public void insertarVentaFinal(VentaDTO ventaDTO) {
		
		this.entityManager.persist(ventaDTO);
	}

}
