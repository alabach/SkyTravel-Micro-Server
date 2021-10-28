package tn.esprit.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/transports")
public class TransportRestApi {

    @Autowired
    private TransportService transportService ;

    // get all
    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<List<Transport>> getAllTransports () {
        return new ResponseEntity<>(transportService.getAll(), HttpStatus.OK) ;
    }

    //get by Id
    @GetMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<Transport> getTransportById(@PathVariable int id){
        return new ResponseEntity<>(transportService.getTransportById(id),HttpStatus.OK);
    }

    // add Transport
    @PostMapping
    @ResponseStatus
    public ResponseEntity<Transport> addTransport(@RequestBody Transport t) {
        return new ResponseEntity<>(transportService.addTransport(t),HttpStatus.CREATED) ;
    }

    // update Transport
    @PutMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<Transport> updateTransport(@PathVariable int id, @RequestBody Transport t) {
        return new ResponseEntity<>(transportService.updateTransport(id,t), HttpStatus.OK) ;
    }

    // delete Transport
    @DeleteMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<String> deleteTransport(@PathVariable int id){
        return new ResponseEntity<>(transportService.deleteTransport(id),HttpStatus.OK);
    }

}
