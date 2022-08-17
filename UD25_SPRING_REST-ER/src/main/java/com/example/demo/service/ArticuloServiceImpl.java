package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
		@Autowired
	IArticuloDAO iArticuloDAO;

	@Override
	public List<Articulo> listarArticulos() {
		// TODO Auto-generated method stub
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(Long id) {
		// TODO Auto-generated method stub
		return iArticuloDAO.findById(id).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {
		// TODO Auto-generated method stub
		iArticuloDAO.deleteById(id);
	}

}
