package ro.facultate.orar.Repository;

import ro.facultate.orar.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface RepoRoom extends JpaRepository<Room, Integer> {

    Optional<Room> findByName(String name);

    List<Room> findByBuilding(String building);

    List<Room> findByFloor(Integer floor);
}