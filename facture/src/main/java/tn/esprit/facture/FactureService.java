package tn.esprit.facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FactureService {

    @Autowired
    private FactureRepository FactureRepository;

    // get all Factures
    public List<Facture> getAll(){
        return FactureRepository.findAll();
    }
    // get one Facture
    public Facture getFactureById(int id){
        return FactureRepository.findById(id).get();
    }

    // add Facture
    public Facture addFacture(Facture F) {
        return FactureRepository.save(F) ;
    }

    // update Facture
    public Facture updateFacture(int id, Facture newFacture) {
        if (FactureRepository.findById(id).isPresent()){
            Facture oldFacture = FactureRepository.findById(id).get();
            oldFacture.setPrice(newFacture.getPrice());
            oldFacture.setDescription(newFacture.getDescription());
            oldFacture.setDate_facture(newFacture.getDate_facture());
            oldFacture.setUser_id(newFacture.getUser_id());
            return FactureRepository.save(oldFacture) ;
        }else
            return null ;
    }

    // delete Facture
    public String deleteFacture(int id) {
        if (FactureRepository.findById(id).isPresent()) {
            FactureRepository.deleteById(id);
            return ("Facture supprimé avec succès") ;
        }
        else return ("Facture non existant") ;
    }
}
