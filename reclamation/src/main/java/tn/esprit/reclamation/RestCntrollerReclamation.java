package tn.esprit.reclamation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/reclamations")
public class RestCntrollerReclamation {

    @Autowired
    private ReclamationService reclamationService;

    @PostMapping
    @ResponseStatus
    public ResponseEntity<Reclamation> addReclamation(@RequestBody Reclamation reclamation){
        return new ResponseEntity<>(reclamationService.addReclamation(reclamation),HttpStatus.CREATED) ;
    }

    @GetMapping
    @ResponseStatus
    public ResponseEntity<List<Reclamation>> getAllReclamation(){
        return new ResponseEntity<>(reclamationService.getAllReclamation(),HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<Reclamation> getReclamationById(@PathVariable int id){
        return new ResponseEntity<>(reclamationService.getReclamationById(id),HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<Reclamation> editReclamationById(@RequestBody Reclamation reclamation,@PathVariable int id){
        return new ResponseEntity<>(reclamationService.editReclamationById(reclamation,id),HttpStatus.OK);
    }

    @DeleteMapping
    @ResponseStatus
    public  ResponseEntity<String> deleteAllReclamation(){
        return new ResponseEntity<>(reclamationService.deleteAll(),HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<String> deleteReclamationById(@PathVariable int id){
        return new ResponseEntity<>(reclamationService.deleteById(id),HttpStatus.OK);
    }
}
