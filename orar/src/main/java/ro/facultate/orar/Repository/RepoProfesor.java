package ro.facultate.orar.Repository;

import ro.facultate.orar.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface RepoProfesor extends JpaRepository<Profesor, Integer> {

    List<Profesor> findByStatut(String statut);

    List<Profesor> findByAbreviere(String abreviere);
}