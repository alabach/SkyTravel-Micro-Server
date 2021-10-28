package tn.esprit.vol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/vols")
public class VolRestApi {
    @Autowired
    private VolService volService;

    //get all
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Vol>> getAllVol(){
        return new ResponseEntity<>(volService.getAll(),HttpStatus.OK);
    }
    //get by Id
    @GetMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<Vol> getVolById(@PathVariable int id){
        return new ResponseEntity<>(volService.getVolById(id),HttpStatus.OK);
    }
    //add vol
    @PostMapping
    @ResponseStatus
    public ResponseEntity<Vol> addVol(@RequestBody  Vol v){
        return new ResponseEntity<>(volService.addVol(v),HttpStatus.CREATED);
    }
    //update vol
    @PutMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<Vol> updateVol(@PathVariable int id, @RequestBody Vol v){
        return new ResponseEntity<>(volService.updateVol(id,v),HttpStatus.OK);
    }
    //delete vol
    @DeleteMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<String> deleteVol(@PathVariable int id){
        return new ResponseEntity<>(volService.deleteVol(id),HttpStatus.OK);
    }
}
