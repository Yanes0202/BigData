package san.edu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import san.edu.services.FemaleFullNameService;
import san.edu.services.Services;
import san.edu.tables.BaseTable;
import java.util.List;

@RestController
@RequestMapping("api/female/fullName")
public class FemaleFullNameController {

    @Qualifier("FemaleFullNameService")
    @Autowired
    Services femaleFullNameService;

//    @PostConstruct
//    public void postConstruct() {
//        List<FemaleFullName> femaleFullName = CsvUtils.mapFemaleFullName();
//        femaleLastNameService.femaleFullNameRepository.saveAll(femaleFullName);
//    }

    @GetMapping(path = "/getAll")
    public ResponseEntity<List<? extends BaseTable>> getAll() {
        return new ResponseEntity<>(femaleFullNameService.getAllNames(), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<? extends BaseTable>> findByFullName(@RequestParam(name = "fullName") String fullName) {
        return new ResponseEntity<>(femaleFullNameService.filterByName("%"+fullName+"%"), HttpStatus.OK);
    }

}
