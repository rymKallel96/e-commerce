package insat.commerce.demo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Commandes")
public class Commande {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Client client;
    @OneToMany
    private List <Livre> listLivre;
    @OneToMany
    private List <Promotion> listPromo;

    public Commande(Client client, List<Livre> listLivre, List<Promotion> listPromo) {
        this.client = client;
        this.listLivre = listLivre;
        this.listPromo = listPromo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Livre> getListLivre() {
        return listLivre;
    }

    public void setListLivre(List<Livre> listLivre) {
        this.listLivre = listLivre;
    }

    public List<Promotion> getListPromo() {
        return listPromo;
    }

    public void setListPromo(List<Promotion> listPromo) {
        this.listPromo = listPromo;
    }
}
