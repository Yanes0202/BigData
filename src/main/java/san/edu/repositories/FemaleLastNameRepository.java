package san.edu.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import san.edu.tables.FemaleLastName;

import java.util.List;

@Repository
public interface FemaleLastNameRepository extends CrudRepository<FemaleLastName,String> {
    List<FemaleLastName> findByLastNameLike(String lastName);
}
