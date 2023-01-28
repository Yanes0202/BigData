package san.edu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import san.edu.services.FemaleLastNameService;
import san.edu.services.Services;
import san.edu.tables.BaseTable;
import san.edu.tables.FemaleLastName;
import san.edu.utils.CsvUtils;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("api/female/lastName")
public class FemaleLastNameController {

    @Qualifier("FemaleLastNameService")
    @Autowired
    Services femaleLastNameService;

//    @PostConstruct
//    public void postConstruct() {
//        List<FemaleLastName> femaleLastName = CsvUtils.mapFemaleLastName();
//        femaleLastNameService.femaleLastNameRepository.saveAll(femaleLastName);
//    }

    @GetMapping(path = "/getAll")
    public ResponseEntity<List<? extends BaseTable>> getAll() {
        return new ResponseEntity<>(femaleLastNameService.getAllNames(), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<? extends BaseTable>> findByFullName(@RequestParam(name = "lastName") String lastName) {
        return new ResponseEntity<>(femaleLastNameService.filterByName("%"+lastName+"%"), HttpStatus.OK);
    }

}
