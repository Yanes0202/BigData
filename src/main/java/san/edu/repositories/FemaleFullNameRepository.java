package san.edu.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import san.edu.tables.FemaleFullName;

import java.util.List;

@Repository
public interface FemaleFullNameRepository extends CrudRepository<FemaleFullName, String> {
    List<FemaleFullName> findByFullNameLike( String fullName);
}
