package insat.commerce.demo;

import javax.persistence.*;


@Entity
@Table(name = "livres")
public class Livre {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private float prix;
    private String titre;
    private String autheur;
    private String description;

    public Livre(float prix, String titre, String autheur, String description) {
        this.prix = prix;
        this.titre = titre;
        this.autheur = autheur;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAutheur() {
        return autheur;
    }

    public void setAutheur(String autheur) {
        this.autheur = autheur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
