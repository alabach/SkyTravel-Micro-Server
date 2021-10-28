package tn.esprit.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<hotel> getAll(){
        return hotelRepository.findAll();
    }

    public hotel getHotelById(int id){
        return hotelRepository.findById(id).get();
    }

    public hotel AddHotel(hotel h){
        return hotelRepository.save(h);
    }
    public hotel update (int id ,hotel newH){
        if(hotelRepository.findById(id).isPresent()){
            hotel hotelx = hotelRepository.findById(id).get();
            hotelx.setNomHotel(newH.getNomHotel());
            hotelx.setAdresse(newH.getAdresse());
            hotelx.setPrix(newH.getPrix());
            hotelx.setNbNuit(newH.getNbNuit());
            return hotelRepository.save(hotelx);


        }else
            return null;
    }

    public String deleteHotel (int id){
        if(hotelRepository.existsById(id)){
            hotelRepository.existsById(id);
            return "success";
        }else
            return "failed";
    }

}
