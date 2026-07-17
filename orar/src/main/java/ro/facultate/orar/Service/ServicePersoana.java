package ro.facultate.orar.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.facultate.orar.Entity.Orar;
import ro.facultate.orar.Entity.Persoana;
import ro.facultate.orar.Entity.Student;
import ro.facultate.orar.Repository.RepoOrar;
import ro.facultate.orar.Repository.RepoPersoana;
import ro.facultate.orar.Repository.RepoStudent;

import java.util.List;

@Service
public class ServicePersoana {
    @Autowired
    private RepoPersoana repoPersoana;

    public Persoana adaugaPersoana(Persoana persoana) {

        return repoPersoana.save(persoana);
    }
}
