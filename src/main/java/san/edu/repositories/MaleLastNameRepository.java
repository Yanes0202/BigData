package san.edu.repositories;

import org.springframework.data.repository.CrudRepository;
import san.edu.tables.MaleLastName;

import java.util.List;

public interface MaleLastNameRepository extends CrudRepository<MaleLastName,String> {
    List<MaleLastName> findByLastNameLike(String lastName);
}
