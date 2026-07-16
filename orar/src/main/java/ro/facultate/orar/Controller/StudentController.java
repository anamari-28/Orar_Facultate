package ro.facultate.orar.Controller;

import ro.facultate.orar.Entity.Student;
import ro.facultate.orar.Service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private ServiceStudent serviceStudent;

    @GetMapping("/toti")
    public List<Student> getToti() {
        return serviceStudent.getToatiStudentii();
    }
}