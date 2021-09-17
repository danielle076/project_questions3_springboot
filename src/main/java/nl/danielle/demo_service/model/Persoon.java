package nl.danielle.demo_service.model;

import javax.persistence.*;

@Entity
@Table(name = "personen")
public class Persoon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nr")
    public long id;

    @Column(name = "first_name", length = 80)
    public String voornaam;

    @Column(name = "last_name", length = 80)
    public String achternaam;

    @Column(name = "city", length = 120)
    public String woonplaats;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }
}