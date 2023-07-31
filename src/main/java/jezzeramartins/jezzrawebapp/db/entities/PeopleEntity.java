package jezzeramartins.jezzrawebapp.db.entities;

import jezzeramartins.jezzrawebapp.model.People;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "people")
@Data
public class PeopleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private Integer age;

    public static PeopleEntity createFrom(People people) {
        PeopleEntity peopleEntity = new PeopleEntity();
        peopleEntity.setName(people.getName());
        peopleEntity.setAge(people.getAge());

        return peopleEntity;
    }
}
