package ro.facultate.orar.Controller;

import ro.facultate.orar.Entity.Orar;
import ro.facultate.orar.Service.ServiceOrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orar")
public class OrarController {

    @Autowired
    private ServiceOrar serviceOrar;

    @GetMapping("/grupa/{grupaId}")
    public String getOrarGrupa(@PathVariable Integer grupaId) {
        return "Ai cerut orarul grupei " + grupaId;
    }
}