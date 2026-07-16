package ro.facultate.orar.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.facultate.orar.Entity.Student;
import ro.facultate.orar.Repository.RepoStudent;

import java.util.List;

@Service
public class ServiceStudent {
    @Autowired
    private RepoStudent repoStudent;

    public List<Student> getTotiStudentii(){
        return repoStudent.findAll();
    }
}
