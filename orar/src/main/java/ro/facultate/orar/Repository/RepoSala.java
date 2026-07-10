package ro.facultate.orar.Repository;

import ro.facultate.orar.Entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface RepoSala extends JpaRepository<Sala, Integer> {

    Optional<Sala> findByNume(String nume);

    List<Sala> findByCladire(String cladire);

    List<Sala> findByEtaj(Integer etaj);
}