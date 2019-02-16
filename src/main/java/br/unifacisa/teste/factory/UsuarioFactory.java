package br.unifacisa.teste.factory;

import br.unifacisa.teste.domains.TipoUsuario;
import br.unifacisa.teste.domains.Usuario;

public class UsuarioFactory {

	public static Usuario setPoder(Usuario usuario) {
		
		TipoUsuario tipoUsuario = new TipoUsuario();
		
		if (usuario.getTipoUsuario().getId() == 30) {

			tipoUsuario.setCaixa(true);
			tipoUsuario.setGerencia(false);
			tipoUsuario.setPdv(false);
			tipoUsuario.setTipo("caixa");
			tipoUsuario.setId(30);
			usuario.setTipoUsuario(tipoUsuario);
	

		} else if (usuario.getTipoUsuario().getId() == 31) {

			tipoUsuario.setCaixa(true);
			tipoUsuario.setGerencia(true);
			tipoUsuario.setPdv(true);
			tipoUsuario.setTipo("gerencia");
			tipoUsuario.setId(31);
			usuario.setTipoUsuario(tipoUsuario);

		} else if (usuario.getTipoUsuario().getId() == 32) {

			tipoUsuario.setCaixa(false);
			tipoUsuario.setGerencia(false);
			tipoUsuario.setPdv(true);
			tipoUsuario.setTipo("estoquista");
			tipoUsuario.setId(32);
			usuario.setTipoUsuario(tipoUsuario);
		}

		return usuario;
	}
}
