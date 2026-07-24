package ro.facultate.orar.Repository;

import ro.facultate.orar.Entity.Professor;
import ro.facultate.orar.Entity.ProfessorStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoProfessor extends JpaRepository<Professor, Integer> {

    List<Professor> findByStatus(ProfessorStatus status);

    List<Professor> findByAbbreviation(String abbreviation);
}