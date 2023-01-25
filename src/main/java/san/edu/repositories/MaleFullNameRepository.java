package san.edu.repositories;

import org.springframework.data.repository.CrudRepository;
import san.edu.tables.MaleFullName;

public interface MaleFullNameRepository extends CrudRepository<MaleFullName,String> {
}
