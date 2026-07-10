package ro.facultate.orar.Repository;

import ro.facultate.orar.Entity.Persoana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface RepoPersoana extends JpaRepository<Persoana, Integer> {

    List<Persoana> findByName(String nume);

    List<Persoana> findBySurname(String prenume);

    Optional<Persoana> findByCNP(String cnp);

    List<Persoana> findByDad(String initialaTata);
}