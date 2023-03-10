package san.edu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import san.edu.services.Services;
import san.edu.tables.FemaleLastName;
import san.edu.utils.CsvUtils;

import javax.annotation.PostConstruct;
import java.util.List;

@RequestMapping("/api/female/lastName")
@RestController
public class FemaleLastNameController {

    @Qualifier("FemaleLastNameService")
    @Autowired
    Services<FemaleLastName> femaleLastNameService;

//    @PostConstruct
//    public void postConstruct() {
//        List<FemaleLastName> femaleLastName = CsvUtils.mapFemaleLastName();
//        femaleLastNameService.saveAll(femaleLastName);
//    }

    @GetMapping(path = "/getAll")
    public ResponseEntity<List<FemaleLastName>> getAll() {
        return new ResponseEntity<>(femaleLastNameService.getAllNames(), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<FemaleLastName>> findByFullName(@RequestParam(name = "lastName") String lastName) {
        return new ResponseEntity<>(femaleLastNameService.filterByName("%"+lastName+"%"), HttpStatus.OK);
    }

}
