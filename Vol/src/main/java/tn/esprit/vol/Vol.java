package tn.esprit.vol;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Vol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private Boolean state;
    private String type;
    private String destinationStart;
    private String destinationEnd;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getState() {
        return state;
    }
    public void setState(Boolean state) {
        this.state = state;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDestinationStart() {
        return destinationStart;
    }
    public void setDestinationStart(String destinationStart) {
        this.destinationStart = destinationStart;
    }
    public String getDestinationEnd() {
        return destinationEnd;
    }
    public void setDestinationEnd(String destinationEnd) {
        this.destinationEnd = destinationEnd;
    }
    public Vol() {
        super();
    }
    public Vol(int id, String name, Boolean state, String type, String destinationStart, String destinationEnd) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.type = type;
        this.destinationStart = destinationStart;
        this.destinationEnd = destinationEnd;
    }
}
