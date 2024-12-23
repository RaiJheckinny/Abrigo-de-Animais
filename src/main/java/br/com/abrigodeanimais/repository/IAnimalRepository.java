package br.com.abrigodeanimais.repository;

import br.com.abrigodeanimais.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimalRepository extends JpaRepository<Animal, Integer> {
}
