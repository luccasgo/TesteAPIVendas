package br.unifacisa.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import br.unifacisa.teste.domains.Produto;
import br.unifacisa.teste.domains.Usuario;
import br.unifacisa.teste.dtos.CadastrarProdutoDto;
import br.unifacisa.teste.dtos.UpdateProdutoDto;
import br.unifacisa.teste.repositories.ProdutoRepository;
import br.unifacisa.teste.repositories.UsuarioRepository;
import javassist.NotFoundException;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public CadastrarProdutoDto addProduto(CadastrarProdutoDto dto) throws NotFoundException {
		Usuario usuarioTemp = usuarioRepository.findById(dto.getUsuario_id()).orElseThrow(()-> new NotFoundException("esse usuario não existe"));
		if(usuarioTemp.getTipoUsuario().getId() == 31 || usuarioTemp.getTipoUsuario().getId() == 32) {
			Produto produto = new Produto();
			produto.setNome(dto.getNome());
			produto.setCodigoDeBarras(dto.getCodigoDeBarras());
			produto.getCategorias().add(dto.getCategoria());
			produtoRepository.save(produto);
		}else {
			throw new NotFoundException("Bad resquest");
		}
		return dto;
	}
	
	public Produto updateProduto(Long id, UpdateProdutoDto dto) throws NotFoundException {
		Produto produtoTemp = produtoRepository.findById(id).orElseThrow(() -> new NotFoundException("Esse produto não foi encontrado"));
		produtoTemp.setValorUnitarioVenda(dto.getValorUnitarioVenda());
		produtoTemp.setQtdEstoque(dto.getQtdEstoque());
		produtoTemp.setComercializavel(dto.isComercializavel());
		return produtoRepository.save(produtoTemp);
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
	

	public List<Produto> buscarProduto(Produto produto){
		ExampleMatcher macther = ExampleMatcher.matchingAll()
				.withMatcher("nome", match -> match.contains())
				.withIgnoreCase()
				.withIgnoreNullValues();
		return produtoRepository.findAll(Example.of(produto, macther));
	}
	
	
}
