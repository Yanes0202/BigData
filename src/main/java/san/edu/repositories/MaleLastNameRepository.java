package san.edu.repositories;

import org.springframework.data.repository.CrudRepository;
import san.edu.tables.MaleLastName;

public interface MaleLastNameRepository extends CrudRepository<MaleLastName,String> {
}
