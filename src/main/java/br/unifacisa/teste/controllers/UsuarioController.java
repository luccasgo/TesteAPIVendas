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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.unifacisa.teste.domains.Usuario;
import br.unifacisa.teste.services.UsuarioService;

@Controller
@RequestMapping("usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
		return new ResponseEntity<Usuario>(usuarioService.addUsuario(usuario), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Usuario> updateUsuario(Usuario usuario) {
		return new ResponseEntity<Usuario>(usuarioService.updateUsuario(usuario), HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<Usuario> readUsuario(Long id) {
		return new ResponseEntity<Usuario>(usuarioService.readUsuario(id), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Usuario>> readAll() {
		return new ResponseEntity<List<Usuario>>(usuarioService.readAll(), HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<Usuario> deleteUsuario(Long id) {
		usuarioService.deleteUsuario(id);
		return new ResponseEntity<Usuario>(HttpStatus.OK);
	}
}
