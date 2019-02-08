package br.unifacisa.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.teste.domains.Categoria;
import br.unifacisa.teste.repositories.CategoriaRepository;
@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria addCategoria (Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	public Categoria updateCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	public Categoria readCategoria(Long id) {
		return categoriaRepository.findById(id).get();
	}

	public List<Categoria> readAll() {
		return categoriaRepository.findAll();
	}

	public void deleteCategoria(Long id) {
		categoriaRepository.deleteById(id);
	}
}
