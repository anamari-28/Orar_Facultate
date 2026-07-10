package ro.facultate.orar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.facultate.orar.Entity.Grupa;
import ro.facultate.orar.Entity.Orar;
import ro.facultate.orar.Entity.Profesor;

import java.time.LocalTime;
import java.util.Optional;
import java.util.List;

@Repository
public interface RepoOrar extends JpaRepository<Orar, Integer> {
    Optional<Orar> findByoraInceput (LocalTime ora);
    Optional<Orar> findByziua(String ziua);
    Optional<Orar> findBysaptamana(String saptamana);
    Optional<Orar> findByprofesor(Profesor prof);
    Optional<Orar> findBygrupa(Grupa grupa);

}
