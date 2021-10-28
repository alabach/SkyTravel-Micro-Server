package tn.esprit.hotel;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String NomHotel;
    private int NbNuit;
    private int Prix;
    private String Adresse;

    public hotel () {

    }

    public hotel(int id, String nomHotel, int nbNuit, int prix, String adresse) {
        this.id = id;
        this.NomHotel = nomHotel;
        this.NbNuit = nbNuit;
        this.Prix = prix;
        this.Adresse = adresse;
    }

    public int getId() {
        return id;
    }



    public String getNomHotel() {
        return NomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.NomHotel = nomHotel;
    }

    public int getNbNuit() {
        return NbNuit;
    }

    public void setNbNuit(int nbNuit) {
        this.NbNuit = nbNuit;
    }

    public int getPrix() {
        return Prix;
    }

    public void setPrix(int prix) {
        this.Prix = prix;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        this.Adresse = adresse;
    }
}
