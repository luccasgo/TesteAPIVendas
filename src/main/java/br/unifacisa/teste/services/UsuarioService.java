package br.unifacisa.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.teste.domains.Usuario;
import br.unifacisa.teste.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario addUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Usuario updateUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Usuario readUsuario(Long id) {
		return usuarioRepository.findById(id).get();
	}

	public List<Usuario> readAll() {
		return usuarioRepository.findAll();
	}

	public void deleteUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}
}
