package san.edu.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import san.edu.tables.MaleLastName;

import java.util.List;

@Repository
public interface MaleLastNameRepository extends CrudRepository<MaleLastName,String> {
    List<MaleLastName> findByLastNameLike(String lastName);
}
