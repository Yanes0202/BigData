package san.edu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import san.edu.repositories.FemaleFullNameRepository;
import san.edu.repositories.FemaleLastNameRepository;
import san.edu.repositories.MaleFullNameRepository;
import san.edu.repositories.MaleLastNameRepository;
import san.edu.tables.FemaleFullName;

import java.util.List;

@Service
public class Services {
    @Autowired
    FemaleFullNameRepository femaleFullNameRepository;
    @Autowired
    FemaleLastNameRepository femaleLastNameRepository;
    @Autowired
    MaleFullNameRepository maleFullNameRepository;
    @Autowired
    MaleLastNameRepository maleLastNameRepository;

    public List<FemaleFullName> getAllFemaleFullNames() {
        return (List<FemaleFullName>) femaleFullNameRepository.findAll();
    }

    public List<FemaleFullName> findFemaleFullNamesByFullName(String fullName) {
        return femaleFullNameRepository.findByFullNameLike(fullName);
    }


}
