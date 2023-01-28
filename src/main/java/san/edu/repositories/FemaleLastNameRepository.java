package san.edu.repositories;

import org.springframework.data.repository.CrudRepository;
import san.edu.tables.FemaleLastName;

import java.util.List;

public interface FemaleLastNameRepository extends CrudRepository<FemaleLastName,String> {
    List<FemaleLastName> findByLastNameLike(String lastName);
}
