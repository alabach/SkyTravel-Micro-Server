package tn.esprit.hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/hotel")
public class RestControllerHotel {
    @Autowired
    private HotelService hotelService ;

    @PostMapping
    @ResponseStatus
    public ResponseEntity<hotel> addHotel(@RequestBody hotel hot){
        return new ResponseEntity<>(hotelService.AddHotel(hot), HttpStatus.CREATED);
    }

    @GetMapping
    @ResponseStatus
    public ResponseEntity<List<hotel>> getAllHotel(){
        return  new ResponseEntity<>(hotelService.getAll(),HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<hotel> getHotelById (@PathVariable int id){
        return new ResponseEntity<>(hotelService.getHotelById(id),HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<hotel> editHotelById(@RequestBody hotel hot,@PathVariable int id){
        return new ResponseEntity<>(hotelService.update(id,hot),HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus
    public ResponseEntity<String> deleteHotel(@PathVariable int id){
        return new ResponseEntity<>(hotelService.deleteHotel(id),HttpStatus.OK);
    }
}
