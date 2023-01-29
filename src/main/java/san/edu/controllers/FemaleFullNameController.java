package san.edu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import san.edu.services.Services;
import san.edu.tables.FemaleFullName;
import san.edu.utils.CsvUtils;

import javax.annotation.PostConstruct;
import java.util.List;

@RequestMapping("/api/female/fullName")
@RestController
public class FemaleFullNameController {

    @Qualifier("FemaleFullNameService")
    @Autowired
    Services<FemaleFullName> femaleFullNameService;


    @GetMapping(path = "/get")
    public ResponseEntity<String> get(){
        return new ResponseEntity<>("Hello",HttpStatus.OK);
    }

//    @PostConstruct
//    public void postConstruct() {
//        List<FemaleFullName> femaleFullName = CsvUtils.mapFemaleFullName();
//        femaleFullNameService.saveAll(femaleFullName);
//    }

    @GetMapping(path = "/getAll")
    public ResponseEntity<List<FemaleFullName>> getAll() {
        return new ResponseEntity<>(femaleFullNameService.getAllNames(), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<FemaleFullName>> findByFullName(@RequestParam(name = "fullName") String fullName) {
        return new ResponseEntity<>(femaleFullNameService.filterByName("%"+fullName+"%"), HttpStatus.OK);
    }

}
