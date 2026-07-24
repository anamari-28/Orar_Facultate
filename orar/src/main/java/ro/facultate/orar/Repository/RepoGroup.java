package ro.facultate.orar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.facultate.orar.Entity.Group;

import java.util.List;

@Repository
public interface RepoGroup extends JpaRepository<Group, Integer> {

    List<Group> findByGroupName(String groupName);
}