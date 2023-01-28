package san.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import san.edu.repositories.FemaleFullNameRepository;
import san.edu.tables.FemaleFullName;

import java.util.List;

@Qualifier("FemaleFullNameService")
@Service
public class FemaleFullNameService implements Services {

    @Autowired
    public FemaleFullNameRepository femaleFullNameRepository;

    @Override
    public List<FemaleFullName> getAllNames() {
        return (List<FemaleFullName>) femaleFullNameRepository.findAll();
    }

    @Override
    public List<FemaleFullName> filterByName(String fullName) {
        return femaleFullNameRepository.findByFullNameLike(fullName);
    }

}
