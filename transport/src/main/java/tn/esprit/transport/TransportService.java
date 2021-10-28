package tn.esprit.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportService {

    @Autowired
    private TransportRepository TransportRepository;

    // get all transports
    public List<Transport> getAll(){
        return TransportRepository.findAll();
    }
    // get one Transport
    public Transport getTransportById(int id){
        return TransportRepository.findById(id).get();
    }

    // add Transport
    public Transport addTransport(Transport t) {
        return TransportRepository.save(t) ;
    }

    // update Transport
    public Transport updateTransport(int id, Transport newTransport) {
        if (TransportRepository.findById(id).isPresent()){
            Transport oldTransport = TransportRepository.findById(id).get();
            oldTransport.setName(newTransport.getName());
            oldTransport.setAirPort(newTransport.getAirPort());
            oldTransport.setDescription(newTransport.getDescription());
            oldTransport.setHotel(newTransport.getHotel());
            oldTransport.setPrice(newTransport.getPrice());
            return TransportRepository.save(oldTransport) ;
        }else
            return null ;
    }

    // delete Transport
    public String deleteTransport(int id) {
        if (TransportRepository.findById(id).isPresent()) {
            TransportRepository.deleteById(id);
            return ("Transport supprimé avec succès") ;
        }
        else return ("Transport non existant") ;
    }


}
