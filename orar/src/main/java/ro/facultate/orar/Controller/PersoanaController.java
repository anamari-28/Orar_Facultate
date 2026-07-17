package ro.facultate.orar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.facultate.orar.Entity.Persoana;

@RestController
@RequestMapping("/persoana")
public class PersoanaController {

    @Autowired
    private ServicePersoana servicePersoana;

    @PostMapping("/adauga")
    public Persoana adaugaPersoana(@RequestBody Persoana persoana)
    {
        return servicePersoana.adaugaPersoana(persoana);
    }
}
