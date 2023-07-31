package jezzeramartins.jezzrawebapp.controller;

import jezzeramartins.jezzrawebapp.db.entities.PeopleEntity;
import jezzeramartins.jezzrawebapp.db.repositories.PeopleRepository;
import jezzeramartins.jezzrawebapp.model.People;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class PeopleController {

    private final PeopleRepository peopleRepository;

    @GetMapping
    public ResponseEntity<People> getPeople(@RequestParam("name") String name) {
        People people = new People();
        people.setAge(11);
        people.setName("Jarbas Askinofredo");

        List<PeopleEntity> byName = peopleRepository.findByName(name);

        if (byName.isEmpty()) {
            return ResponseEntity.ok(people);
        } else {
            return ResponseEntity.ok(People.createFrom(byName.get(0)));
        }


    }

    @PostMapping
    public ResponseEntity<People> create(@RequestBody People newPeople) {

        peopleRepository.save(PeopleEntity.createFrom(newPeople));

        return ResponseEntity.ok(newPeople);
    }

}
