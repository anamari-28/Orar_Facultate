
package ro.facultate.orar.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {

    @GetMapping("/status")
    public String status() {
        return "OK";
    }
}