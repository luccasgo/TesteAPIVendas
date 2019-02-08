package br.unifacisa.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.teste.domains.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
