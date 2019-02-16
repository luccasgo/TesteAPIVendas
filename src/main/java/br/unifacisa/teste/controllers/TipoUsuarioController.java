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

import br.unifacisa.teste.domains.TipoUsuario;
import br.unifacisa.teste.services.TipoUsuarioService;

@Controller
@RequestMapping("tipouser")
public class TipoUsuarioController {
	@Autowired
	private TipoUsuarioService tipoUsuarioService;
	
	@PostMapping()
	public ResponseEntity<TipoUsuario> createTipoUsuario(@RequestBody TipoUsuario tipoUsuario){
		return new ResponseEntity<TipoUsuario>(tipoUsuarioService.createTipoUsuario(tipoUsuario), HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<TipoUsuario> updateTipoUsuario(TipoUsuario tipoUsuario){
		return new ResponseEntity<TipoUsuario>(tipoUsuarioService.updateTipoUsuario(tipoUsuario), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<TipoUsuario>> readAl(){
		return new ResponseEntity<List<TipoUsuario>>(tipoUsuarioService.readAll(), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<TipoUsuario> readTipoUsuario(Long id){
		return new ResponseEntity<TipoUsuario>(tipoUsuarioService.readById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<TipoUsuario> deleteTipoUsuario(Long id){
		tipoUsuarioService.deleteTipoUsuario(id);
		return new ResponseEntity<TipoUsuario>(HttpStatus.OK);
	}
}
