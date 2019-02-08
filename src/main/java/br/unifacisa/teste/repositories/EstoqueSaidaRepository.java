package br.unifacisa.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.teste.domains.EstoqueSaida;

@Repository
public interface EstoqueSaidaRepository extends JpaRepository<EstoqueSaida, Long>{

}
