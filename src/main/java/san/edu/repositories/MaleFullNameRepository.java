package san.edu.repositories;

import org.springframework.data.repository.CrudRepository;
import san.edu.tables.MaleFullName;

import java.util.List;

public interface MaleFullNameRepository extends CrudRepository<MaleFullName,String> {
    List<MaleFullName> findByFullNameLike(String fullName);
}
