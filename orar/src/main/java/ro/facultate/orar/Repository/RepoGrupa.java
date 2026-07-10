package ro.facultate.orar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.facultate.orar.Entity.Grupa;

import java.util.Optional;
import java.util.List;

@Repository
public interface RepoGrupa extends JpaRepository<Grupa, Integer>{

    Optional<Grupa> findBynumeGrupa (String nume);
}
