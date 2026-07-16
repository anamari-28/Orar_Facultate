
package ro.facultate.orar.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import ro.facultate.orar.Service.ServiceOrar;
import ro.facultate.orar.Entity.Orar;
import java.util.List;

@RestController
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private ServiceOrar serviceOrar;
    @GetMapping("/status")
    public String status() {
        return "OK";
    }

    @GetMapping("/orar/grupa/{grupaId}")
    public String orarGrupa(@PathVariable Integer grupaId) {
        return "Ai cerut orarul grupei " + grupaId;
    }
}