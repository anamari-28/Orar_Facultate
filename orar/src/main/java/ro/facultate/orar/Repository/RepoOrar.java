package ro.facultate.orar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ro.facultate.orar.Entity.Grupa;
import ro.facultate.orar.Entity.Orar;
import ro.facultate.orar.Entity.Profesor;
import ro.facultate.orar.Entity.TipDisciplina;

import java.time.LocalTime;
import java.util.Optional;
import java.util.List;

@Repository
public interface RepoOrar extends JpaRepository<Orar, Integer> {


    List<Orar> findByoraInceput (LocalTime ora);
    List<Orar> findByziua(String ziua);
    List<Orar> findBysaptamana(String saptamana);
    List<Orar> findByprofesor(Profesor prof);

    List<Orar> findBygrupa(Grupa grupa);
    List<Orar> findBydisciplinaId_AndTipDisciplina(Integer disciplinaId, TipDisciplina tipdisciplina);

}
