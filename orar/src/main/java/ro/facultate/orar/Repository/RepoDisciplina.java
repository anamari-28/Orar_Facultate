package ro.facultate.orar.Repository;

import ro.facultate.orar.Entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface RepoDisciplina extends JpaRepository<Disciplina, Integer> {

    Optional<Disciplina> findByNume(String nume);

    List<Disciplina> findByAbreviere(String cod);
}