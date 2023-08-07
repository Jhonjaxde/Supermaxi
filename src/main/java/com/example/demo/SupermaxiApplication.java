package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.DetalleVenta;
import com.example.demo.repository.modelo.Producto;
import com.example.demo.repository.modelo.Venta;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class SupermaxiApplication  implements CommandLineRunner{
	@Autowired
	private IProductoService iProductoService;

	public static void main(String[] args) {
		SpringApplication.run(SupermaxiApplication.class, args);

		
		
	}

	@Override
	public void run(String... args) throws Exception {
		Producto prod = new Producto();
		prod.setCodigoDeBarras("111");
		prod.setNombre("doritos");
		prod.setPrecio(new BigDecimal(0.55));
		prod.setStock(50);
		prod.setCategoria("snacks");
		

		Producto prod1 = new Producto();
		prod1.setCodigoDeBarras("222");
		prod1.setNombre("Zucaritas");
		prod1.setPrecio(new BigDecimal(0.60));
		prod1.setStock(20);
		prod1.setCategoria("cereal");

		Producto prod2 = new Producto();
		prod2.setCodigoDeBarras("333");
		prod2.setNombre("manjar");
		prod2.setPrecio(new BigDecimal(1.55));
		prod2.setStock(100);
		prod2.setCategoria("lacteos");
		DetalleVenta det = new DetalleVenta();
		det.setCantidad("8");
		det.setPrecioUnitario(new BigDecimal(2));
		det.setSubtotal(new BigDecimal(23));
		List<DetalleVenta> ele = new ArrayList<>();
		ele.add(det);
		
		Venta ven = new Venta();
		ven.setCedulaCliente("7263782");
		ven.setFecha(LocalDateTime.now());
		ven.setNumero("1");
		ven.setVentaTotal(new BigDecimal(23));
		ven.setDetallesVentas(ele);
		prod.setDetalles(ele);
		
		det.setDetalleVentaFinal(ven);
		det.setProductoVenta(prod1);
		/*
		 * 
		 * this.iItemService.ingresarItem(prod, "111"); List<Item> i =
		 * this.iItemService.buscar("111"); for (Item item3 : i) {
		 * System.out.println(i); }
		 */
		this.iProductoService.agregar(prod, "111");
		
		
	}
}
