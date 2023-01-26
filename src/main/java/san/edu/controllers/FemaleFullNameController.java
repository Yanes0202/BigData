package san.edu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import san.edu.repositories.FemaleFullNameRepository;
import san.edu.tables.FemaleFullName;
import san.edu.utils.CsvUtils;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("api/female/fullName")
public class FemaleFullNameController {

    @Autowired
    private FemaleFullNameRepository repository;


    @PostConstruct
    public void postConstruct() {
        List<FemaleFullName> femaleFullName = CsvUtils.mapFemaleFullName();
        repository.saveAll(femaleFullName);
    }

    @GetMapping(path ="/getAll")
    public ResponseEntity<List<FemaleFullName>> getAll(){
        List<FemaleFullName> list = (List<FemaleFullName>) repository.findAll();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }


}
