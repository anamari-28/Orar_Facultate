package ro.facultate.orar.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ro.facultate.orar.Entity.Orar;
import ro.facultate.orar.Entity.Student;
import ro.facultate.orar.Repository.RepoOrar;
import ro.facultate.orar.Repository.RepoStudent;

import java.util.List;

@Service
public class ServiceStudent {
    @Autowired
    private RepoStudent repoStudent;

    public List<Student> getTotiStudentii(){
        return repoStudent.findAll();
    }

    @Autowired
    private RepoOrar repoOrar;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Orar> getOrarStudentZi(Integer studentId, String ziua) {
        Student student = repoStudent.findById(studentId).orElseThrow(() -> new RuntimeException("Student inexistent"));

        Integer grupaId = student.getGrupa().getId();

        return repoOrar.findByGrupaIdAndZiua(grupaId, ziua);
    }

    public Student adaugaStudent(Student student) {
       String parolaC = passwordEncoder.encode(student.getParola());
       student.setParola(parolaC);
        return repoStudent.save(student);
    }

    //metoda pt adaugare de parole studenti
    public Student actualizeazaParola(Integer studentId, String parolaNoua) {
        Student student = repoStudent.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student inexistent"));
        student.setParola(passwordEncoder.encode(parolaNoua));
        return repoStudent.save(student);
    }
}
