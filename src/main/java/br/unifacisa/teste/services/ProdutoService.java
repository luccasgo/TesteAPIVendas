package br.unifacisa.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import br.unifacisa.teste.domains.Produto;
import br.unifacisa.teste.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto addProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public Produto updateProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public Produto readProduto(Long id) {
		return produtoRepository.findById(id).get();
	}
	
	public List<Produto> readAll() {
		return produtoRepository.findAll();
	}
	
	public void deleteProduto(Long id) {
		produtoRepository.deleteById(id);
	}
	
	public List<Produto> findByNomeOrCategoria(Produto produto) {
		ExampleMatcher matcher = ExampleMatcher.matchingAll()
				.withMatcher("nome", match -> match.contains())
				.withMatcher("categorias", match -> match.contains())
				.withIgnoreCase()
				.withIgnoreNullValues();
		return produtoRepository.findAll(Example.of(produto,matcher));
	}
	
	
}
