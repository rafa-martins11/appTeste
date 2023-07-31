package jezzeramartins.jezzrawebapp.db.repositories;

import jezzeramartins.jezzrawebapp.db.entities.PeopleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleRepository extends JpaRepository<PeopleEntity, Long> {

    List<PeopleEntity> findByName(String name);
}
