package jezzeramartins.jezzrawebapp.model;

import jezzeramartins.jezzrawebapp.db.entities.PeopleEntity;
import lombok.Data;

@Data
public class People {

    private String name;
    private Integer age;

    public static People createFrom(PeopleEntity peopleEntity) {
        People created = new People();
        created.setName(peopleEntity.getName());
        created.setAge(peopleEntity.getAge());
        return created;
    }

}
