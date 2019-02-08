package br.unifacisa.teste.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.unifacisa.teste.domains.Produto;
import br.unifacisa.teste.services.ProdutoService;

@Controller
@RequestMapping("produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping()
	public ResponseEntity<Produto> addProduto(@RequestBody Produto produto){
		return new ResponseEntity <Produto> (produtoService.addProduto(produto), HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<Produto> updateProduto(@RequestBody Produto produto){
		return new ResponseEntity <Produto> (produtoService.updateProduto(produto), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Produto> readProduto(@PathVariable Long id){
		return new ResponseEntity <Produto> (produtoService.readProduto(id), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Produto>> readAll(){
		return new ResponseEntity<List<Produto>>(produtoService.readAll(), HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity <Produto> deleteProduto(@PathVariable(name = "id") Long id){
		produtoService.deleteProduto(id);
		return new ResponseEntity<Produto>(HttpStatus.OK);
	}
	
	@GetMapping("nome")
	public ResponseEntity <List<Produto>> readAllByNomeOrCategoria(Produto produto){
		return new ResponseEntity <List<Produto>>(produtoService.findByNomeOrCategoria(produto), HttpStatus.OK);
		
	}
}
