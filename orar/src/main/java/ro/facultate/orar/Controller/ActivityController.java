package ro.facultate.orar.Controller;

import ro.facultate.orar.Entity.Activity;
import ro.facultate.orar.Service.ServiceActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private ServiceActivity serviceActivity;

    @GetMapping("/group/{groupId}")
    public String getActivityByGroup(@PathVariable Integer groupId) {
        return "Ai cerut orarul grupei " + groupId;
    }
}