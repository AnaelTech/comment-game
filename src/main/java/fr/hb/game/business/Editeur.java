package fr.hb.game.business;

import java.util.ArrayList;
import java.util.List;

public class Editeur {

    private Long id;

    private String nom;

    private String logo;
    
    private static Long counter = 0L;

    private List<Jeu> jeux = new ArrayList<>();
  
  public Editeur() {
    id = ++counter;
  }

  public Editeur(String nom, String logo) {
    this();
    this.nom = nom;
  }

  public Long getId() {
    return id;
  }

  public void setNom(String nom){
    this.nom = nom;
  }

  public String getNom(){
    return nom;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public String getLogo() {
    return logo;
  }
  
  public List<Jeu> getJeux() {
    return jeux;
  }

  public void setJeux(List<Jeu> jeux) {
    this.jeux = jeux;
  }

  public String toString() {
    return "Editeur{" +
            "id=" + id +
            ", nom='" + nom + '\'' +
            ", logo='" + logo + '\'' +
            '}';
  }
}
