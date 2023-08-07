package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Producto producto) {
		this.entityManager.persist(producto);
		
	}

	@Override
	public Producto seleccionar(String cb) {
		TypedQuery<Producto> myQuery =this.entityManager.createQuery("SELECT e FROM Producto e WHERE e.codigoDeBarras =:datocodigoDeBarras", Producto.class) ;
				//this.entityManager.createQuery("SELECT e FROM Producto e WHERE e.stock =:datostock ");
		myQuery.setParameter("datocodigoDeBarras", cb);
		return myQuery.getSingleResult();
		
	}

	@Override
	public void actualizar(Producto Producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> seleccionarValidacion(String codigoDeBarras) {
		TypedQuery<Producto> myQuery = this.entityManager.createNamedQuery("validacion", Producto.class);
		myQuery.setParameter("datoBarra", codigoDeBarras);
		return myQuery.getResultList();
	}

}
