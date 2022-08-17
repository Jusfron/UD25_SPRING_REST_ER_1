package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricanteDAO;
import com.example.demo.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService{
	
	@Autowired
	IFabricanteDAO iFabricanteDAO;

	@Override
	public List<Fabricante> listarFabricantes() {
		// TODO Auto-generated method stub
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(Long id) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long id) {
		// TODO Auto-generated method stub
		iFabricanteDAO.deleteById(id);
	}

}
