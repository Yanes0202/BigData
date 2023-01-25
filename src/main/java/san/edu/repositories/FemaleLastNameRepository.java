package san.edu.repositories;

import org.springframework.data.repository.CrudRepository;
import san.edu.tables.FemaleLastName;

public interface FemaleLastNameRepository extends CrudRepository<FemaleLastName,String> {
}
