package ro.facultate.orar.Repository;

import ro.facultate.orar.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepoStudent extends JpaRepository<Student, Integer> {

    Optional<Student> findByNumarMatricol(Integer numarMatricol);
}