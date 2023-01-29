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
import san.edu.tables.MaleFullName;
import san.edu.utils.CsvUtils;

import javax.annotation.PostConstruct;
import java.util.List;

@RequestMapping("/api/male/fullName")
@RestController
public class MaleFullNameController {

    @Qualifier("MaleFullNameService")
    @Autowired
    Services<MaleFullName> maleFullNameService;

//    @PostConstruct
//    public void postConstruct() {
//        List<MaleFullName> maleFullName = CsvUtils.mapMaleFullName();
//        maleFullNameService.saveAll(maleFullName);
//    }

    @GetMapping(path = "/getAll")
    public ResponseEntity<List<MaleFullName>> getAll() {
        return new ResponseEntity<>(maleFullNameService.getAllNames(), HttpStatus.OK);
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<MaleFullName>> findByFullName(@RequestParam(name = "fullName") String fullName) {
        return new ResponseEntity<>(maleFullNameService.filterByName("%"+fullName+"%"), HttpStatus.OK);
    }

}
