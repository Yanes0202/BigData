package san.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import san.edu.repositories.MaleLastNameRepository;
import san.edu.tables.MaleLastName;

import java.util.List;

@Qualifier("MaleLastNameService")
@Service
public class MaleLastNameService implements Services {

    @Autowired
    public MaleLastNameRepository maleLastNameRepository;

    @Override
    public List<MaleLastName> getAllNames() {
        return (List<MaleLastName>) maleLastNameRepository.findAll();
    }

    @Override
    public List<MaleLastName> filterByName(String lastName) {
        return maleLastNameRepository.findByLastNameLike(lastName);
    }

}
