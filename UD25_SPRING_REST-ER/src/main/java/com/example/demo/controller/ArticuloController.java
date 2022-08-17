package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Articulo;
import com.example.demo.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;

	@GetMapping("/articulos")
	public List<Articulo> listarArticulos() {
		return articuloServiceImpl.listarArticulos();
	}

	@PostMapping("/articulos")
	public Articulo salvarArticulo(@RequestBody Articulo articulo) {

		return articuloServiceImpl.guardarArticulo(articulo);
	}

	@GetMapping("/articulos/{id}")
	public Articulo articuloXID(@PathVariable(name = "id") Long id) {

		Articulo articulo_xid = new Articulo();

		articulo_xid = articuloServiceImpl.articuloXID(id);

		System.out.println("Articulo XID: " + articulo_xid);

		return articulo_xid;
	}

	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulo(@PathVariable(name = "id") Long id, @RequestBody Articulo articulo) {

		Articulo articulo_seleccionado = new Articulo();
		Articulo articulo_actualizado = new Articulo();

		articulo_seleccionado = articuloServiceImpl.articuloXID(id);

		articulo_seleccionado.setTitle(articulo.getTitle());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());

		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);

		System.out.println("El articulo actualizado es: " + articulo_actualizado);

		return articulo_actualizado;
	}

	@DeleteMapping("/articulos/{id}")
	public String eliminarArticulo(@PathVariable(name = "id") Long id) {
		try {
			articuloServiceImpl.eliminarArticulo(id);
			return "Articulo borrat";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
