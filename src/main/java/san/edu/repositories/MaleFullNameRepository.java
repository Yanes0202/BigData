package san.edu.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import san.edu.tables.MaleFullName;

import java.util.List;

@Repository
public interface MaleFullNameRepository extends CrudRepository<MaleFullName,String> {
    List<MaleFullName> findByFullNameLike(String fullName);
}
