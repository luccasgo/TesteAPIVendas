package br.unifacisa.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.teste.domains.EstoqueSaida;
import br.unifacisa.teste.repositories.EstoqueSaidaRepository;

@Service
public class EstoqueSaidaService {
	@Autowired
	private EstoqueSaidaRepository estoqueSaidaRepository;

	public EstoqueSaida addEstoqueSaida(EstoqueSaida estoqueSaida) {
		return estoqueSaidaRepository.save(estoqueSaida);
	}

	public EstoqueSaida updateEstoqueSaida(EstoqueSaida estoqueSaida) {
		return estoqueSaidaRepository.save(estoqueSaida);
	}

	public EstoqueSaida readEstoqueSaida(Long id) {
		return estoqueSaidaRepository.findById(id).get();
	}

	public List<EstoqueSaida> readAll() {
		return estoqueSaidaRepository.findAll();
	}

	public void deleteEstoqueSaida(Long id) {
		estoqueSaidaRepository.deleteById(id);
	}

}
