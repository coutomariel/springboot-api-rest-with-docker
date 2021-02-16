package br.com.coutomariel.springcommysql.repository;

import br.com.coutomariel.springcommysql.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoasRepository extends JpaRepository<Pessoa, Long> {
}
