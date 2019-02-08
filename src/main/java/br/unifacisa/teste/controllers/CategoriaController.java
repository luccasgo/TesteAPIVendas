package br.unifacisa.teste.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.unifacisa.teste.domains.Categoria;
import br.unifacisa.teste.services.CategoriaService;
@Controller
@RequestMapping ("Categoria")
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;

	@PostMapping()
	public ResponseEntity<Categoria> addCategoria(Categoria categoria) {
		return new ResponseEntity<Categoria>(categoriaService.addCategoria(categoria), HttpStatus.CREATED);
	}

	@PutMapping()
	public ResponseEntity<Categoria> updateCategoria(Categoria categoria) {
		return new ResponseEntity<Categoria>(categoriaService.updateCategoria(categoria), HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<Categoria> readCategoria(Long id) {
		return new ResponseEntity<Categoria>(categoriaService.readCategoria(id), HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<Categoria>> readAll() {
		return new ResponseEntity<List<Categoria>>(categoriaService.readAll(), HttpStatus.OK);
	}

	@DeleteMapping()
	public ResponseEntity<Categoria> deleteCategoria(Long id) {
		categoriaService.deleteCategoria(id);
		return new ResponseEntity<Categoria>(HttpStatus.OK);
	}
}
