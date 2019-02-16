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

import br.unifacisa.teste.domains.TipoDeUnidade;
import br.unifacisa.teste.services.TipoDeUnidadeService;

@Controller
@RequestMapping("unidade")
public class TipoDeUnidadeController {
	@Autowired
	private TipoDeUnidadeService tipoUnidadeService;
	
	@PostMapping()
	public ResponseEntity<TipoDeUnidade> addTipoDeUnidade(TipoDeUnidade tipoUnidade){
		return new ResponseEntity<TipoDeUnidade>(tipoUnidadeService.addTipoUnidade(tipoUnidade), HttpStatus.CREATED);
	}
	@PutMapping()
	public ResponseEntity<TipoDeUnidade> updateTipoDeUnidade(@RequestBody TipoDeUnidade tipoUnidade){
		return new ResponseEntity<TipoDeUnidade>(tipoUnidadeService.updateTipoUnidade(tipoUnidade),HttpStatus.OK);
	}
	@GetMapping("{id}")
	public ResponseEntity<TipoDeUnidade> readTipoUnidade(Long id){
		return new ResponseEntity<TipoDeUnidade>(tipoUnidadeService.readTipoUnidade(id), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity <List<TipoDeUnidade>> readAll(){
		return new ResponseEntity<List<TipoDeUnidade>>(tipoUnidadeService.readAll(),HttpStatus.OK);
		}
	@DeleteMapping("{id}")
	public ResponseEntity<TipoDeUnidade> deleteTipoUnidade(Long id){
		tipoUnidadeService.deleteById(id);
		return new ResponseEntity<TipoDeUnidade>(HttpStatus.OK);
	}
	
	
}
