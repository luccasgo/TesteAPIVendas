package br.unifacisa.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.teste.domains.TipoUsuario;
import br.unifacisa.teste.repositories.TipoUsuarioRepository;

@Service
public class TipoUsuarioService {
	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;
	
	public TipoUsuario createTipoUsuario(TipoUsuario tipoUsuario) {
		return tipoUsuarioRepository.save(tipoUsuario);
	}
	
	public TipoUsuario updateTipoUsuario(TipoUsuario tipoUsuario) {
		return tipoUsuarioRepository.save(tipoUsuario);
	}
	
	public List <TipoUsuario> readAll() {
		return tipoUsuarioRepository.findAll();
	}
	
	public TipoUsuario readById(Long id) {
		return tipoUsuarioRepository.findById(id).get();
	}
	
	public void deleteTipoUsuario(Long id) {
		tipoUsuarioRepository.deleteById(id);
	}
}
