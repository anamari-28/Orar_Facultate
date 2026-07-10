package ro.facultate.orar.Repository;

import ro.facultate.orar.Entity.Persoana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface RepoPersoana extends JpaRepository<Persoana, Integer> {

    List<Persoana> findByNume(String nume);

    List<Persoana> findByPrenume(String prenume);

    Optional<Persoana> findByCnp(String cnp);

    List<Persoana> findByInitialaTata(String initialaTata);
}