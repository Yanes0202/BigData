package san.edu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import san.edu.services.Services;
import san.edu.tables.FemaleFullName;
import san.edu.utils.CsvUtils;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("api/female/fullName")
public class FemaleFullNameController {

    @Autowired
    Services services;

//    @PostConstruct
//    public void postConstruct() {
//        List<FemaleFullName> femaleFullName = CsvUtils.mapFemaleFullName();
//        services.femaleFullNameRepository.saveAll(femaleFullName);
//    }

    @GetMapping(path = "/getAll")
    public ResponseEntity<List<FemaleFullName>> getAll() {
        return new ResponseEntity<>(services.getAllFemaleFullNames(), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<FemaleFullName>> findByFullName(@RequestParam(name = "fullName") String fullName) {
        return new ResponseEntity<>(services.findFemaleFullNamesByFullName("%"+fullName+"%"), HttpStatus.OK);
    }

}
