package br.unifacisa.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.teste.domains.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
