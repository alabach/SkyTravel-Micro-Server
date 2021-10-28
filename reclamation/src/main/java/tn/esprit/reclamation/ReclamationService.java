package tn.esprit.reclamation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamationService {

    @Autowired
    private ReclamationRepository reclamationRepository;

    public Reclamation addReclamation(Reclamation reclamation){
        return  reclamationRepository.save(reclamation);
    }

    public List<Reclamation> getAllReclamation(){
        return reclamationRepository.findAll();
    }

    public Reclamation getReclamationById(int id){
        return reclamationRepository.findById(id).get();
    }

    public Reclamation editReclamationById(Reclamation reclamation,int id){
        if(reclamationRepository.existsById(id)){
            Reclamation existedReclamation = reclamationRepository.findById(id).get();
            existedReclamation.setAbout(reclamation.getAbout());
            existedReclamation.setContent(reclamation.getContent());
            existedReclamation.setResolved(reclamation.getIsResolved());
            return reclamationRepository.save(existedReclamation);
        }else{
            return null;
        }
    }

    public String deleteAll(){
        reclamationRepository.deleteAll();
        return "all reclamation deleted";
    }

    public String deleteById(int id){
        if(reclamationRepository.existsById(id)){
            reclamationRepository.deleteById(id);
            return "success" ;
        }else{
            return "failure";
        }
    }
}
