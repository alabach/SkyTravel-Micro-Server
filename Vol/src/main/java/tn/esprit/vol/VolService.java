package tn.esprit.vol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolService {
    @Autowired
    private VolRepository volRepository;
     //get all vols
    public List<Vol> getAll(){
        return volRepository.findAll();
    }
    // get vol by id
    public Vol getVolById(int id){
        return volRepository.findById(id).get();
    }
    // add vol
    public Vol addVol (Vol v){
        return volRepository.save(v);
    }
    // update vol
    public Vol updateVol(int id, Vol newVol){
        if (volRepository.findById(id).isPresent()){
            Vol volEX = volRepository.findById(id).get();
            volEX.setName(newVol.getName());
            volEX.setState(newVol.getState());
            volEX.setType(newVol.getType());
            volEX.setDestinationEnd(newVol.getDestinationEnd());
            volEX.setDestinationStart(newVol.getDestinationStart());
            return volRepository.save(volEX);
        }else
            return null;
    }
    // delete vol
    public String deleteVol (int id){
        if(volRepository.existsById(id)){
            volRepository.deleteById(id);
            return "success";
        }else
            return "failed";
    }
}
