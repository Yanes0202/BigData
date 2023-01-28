package san.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import san.edu.repositories.MaleFullNameRepository;
import san.edu.tables.MaleFullName;

import java.util.List;

@Qualifier("MaleFullNameService")
@Service
public class MaleFullNameService implements Services {

    @Autowired
    public MaleFullNameRepository maleFullNameRepository;

    @Override
    public List<MaleFullName> getAllNames() {
        return (List<MaleFullName>) maleFullNameRepository.findAll();
    }

    @Override
    public List<MaleFullName> filterByName(String fullName) {
        return maleFullNameRepository.findByFullNameLike(fullName);
    }

}
