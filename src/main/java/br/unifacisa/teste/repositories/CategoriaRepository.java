package br.unifacisa.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.teste.domains.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
