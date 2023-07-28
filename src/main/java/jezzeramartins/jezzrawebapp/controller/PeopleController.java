package jezzeramartins.jezzrawebapp.controller;

import jezzeramartins.jezzrawebapp.model.People;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @GetMapping
    public ResponseEntity<People> getPeople() {
        People people = new People();
        people.setAge(11);
        people.setName("Jarbas Askinofredo");

        return ResponseEntity.ok(people);
    }
    
}
