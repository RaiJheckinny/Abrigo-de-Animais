package br.com.abrigodeanimais.repository;

import br.com.abrigodeanimais.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface IAnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a.nomeRecebedor, COUNT(a.id) " +
            "FROM Animal a WHERE a.dataEntrada >= :oneYearAgo " +
            "GROUP BY a.nomeRecebedor " +
            "ORDER BY COUNT(a.id) DESC")
    List<Object[]> findByRecebedor(@Param("oneYearAgo") LocalDate oneYearAgo);
}
