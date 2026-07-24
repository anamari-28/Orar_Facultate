package ro.facultate.orar.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.facultate.orar.Entity.Activity;
import ro.facultate.orar.Entity.Student;
import ro.facultate.orar.Repository.RepoActivity;
import ro.facultate.orar.Repository.RepoStudent;

import java.util.List;

@Service
public class ServiceStudent {

    @Autowired
    private RepoStudent repoStudent;

    @Autowired
    private RepoActivity repoActivity;

    public List<Student> getAllStudents() {
        return repoStudent.findAll();
    }

    public List<Activity> getActivityStudentDay(Integer studentId, String day) {
        Student student = repoStudent.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student inexistent"));

        Integer groupId = student.getGroup().getId();

        return repoActivity.findByGroup_IdAndDay(groupId, day);
    }

    public Student addStudent(Student student) {
        return repoStudent.save(student);
    }
}