package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table(name="articulos")//en caso que la tabla sea diferente
public class Articulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String title;
	@Column(name = "precio")
	private int precio;
	
	@ManyToOne
    @JoinColumn(name="fabricante")
	private Fabricante fabricante;

	public Articulo() {
		super();
	}

	public Articulo(Long id, String title, int precio, Fabricante fabricante) {
		super();
		this.id = id;
		this.title = title;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	

}
