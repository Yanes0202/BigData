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
import san.edu.tables.MaleLastName;
import san.edu.utils.CsvUtils;

import javax.annotation.PostConstruct;
import java.util.List;

@RequestMapping("/api/male/lastName")
@RestController
public class MaleLastNameController {

    @Qualifier("MaleLastNameService")
    @Autowired
    Services<MaleLastName> maleLastNameService;

//    @PostConstruct
//    public void postConstruct() {
//        List<MaleLastName> maleLastName = CsvUtils.mapMaleLastName();
//        maleLastNameService.saveAll(maleLastName);
//    }

    @GetMapping(path = "/getAll")
    public ResponseEntity<List<MaleLastName>> getAll() {
        return new ResponseEntity<>(maleLastNameService.getAllNames(), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<MaleLastName>> findByFullName(@RequestParam(name = "lastName") String lastName) {
        return new ResponseEntity<>(maleLastNameService.filterByName("%"+lastName+"%"), HttpStatus.OK);
    }

}
