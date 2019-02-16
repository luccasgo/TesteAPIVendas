package br.unifacisa.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.teste.domains.TipoDeUnidade;
import br.unifacisa.teste.repositories.TipoDeUnidadeRepository;

@Service
public class TipoDeUnidadeService {
	@Autowired
	private TipoDeUnidadeRepository tipoUnidadeRepository;
	
	public TipoDeUnidade addTipoUnidade(TipoDeUnidade tipoUnidade) {
		return tipoUnidadeRepository.save(tipoUnidade);
	}
	
	public TipoDeUnidade updateTipoUnidade(TipoDeUnidade tipoUnidade) {
		return tipoUnidadeRepository.save(tipoUnidade);
	}
	
	public TipoDeUnidade readTipoUnidade(Long id) {
		return tipoUnidadeRepository.findById(id).get();
	}
	
	public List<TipoDeUnidade> readAll(){
		return tipoUnidadeRepository.findAll();
	}
	
	public void deleteById(Long id) {
		tipoUnidadeRepository.deleteById(id);
	}
}
