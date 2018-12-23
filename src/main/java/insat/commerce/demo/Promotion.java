package insat.commerce.demo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Promotions")
public class Promotion {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private Date dateDebut;
    private Date dateFin;
    @OneToMany
    private List<Livre> listLivre;

    public Promotion(Date dateDebut, Date dateFin, List<Livre> listLivre) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.listLivre = listLivre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Livre> getListLivre() {
        return listLivre;
    }

    public void setListLivre(List<Livre> listLivre) {
        this.listLivre = listLivre;
    }
}
