package br.com.abrigodeanimais.repository;

import br.com.abrigodeanimais.domain.Raca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRacaRepository extends JpaRepository<Raca, Integer> {
}
