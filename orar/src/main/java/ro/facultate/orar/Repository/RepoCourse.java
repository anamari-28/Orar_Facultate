package ro.facultate.orar.Repository;

import ro.facultate.orar.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface RepoCourse extends JpaRepository<Course, Integer> {

    Optional<Course> findByName(String name);

    List<Course> findByAbbreviation(String code);
}