package san.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import san.edu.repositories.FemaleLastNameRepository;
import san.edu.tables.FemaleLastName;

import java.util.List;

@Service
@Qualifier("FemaleLastNameService")
public class FemaleLastNameService implements Services<FemaleLastName> {

    @Autowired
    public FemaleLastNameRepository femaleLastNameRepository;

    @Override
    public List<FemaleLastName> getAllNames() {
        return (List<FemaleLastName>) femaleLastNameRepository.findAll();
    }

    @Override
    public List<FemaleLastName> filterByName(String lastName) {
        return femaleLastNameRepository.findByLastNameLike(lastName);
    }

    @Override
    public void saveAll(List<FemaleLastName> list) {
        femaleLastNameRepository.saveAll(list);
    }

}
