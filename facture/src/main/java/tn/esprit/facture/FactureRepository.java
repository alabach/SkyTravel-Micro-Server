package tn.esprit.facture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FactureRepository extends JpaRepository<Facture, Integer>{
}
