package fr.hb.game.business;


public class Editeur {

    private Long id;

    private String nom;

    private String logo;
    
    private static Long counter = 0L;
   
  public Editeur(String nom, String logo) {
    id = ++counter;
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
  
  public String toString() {
    return "Editeur{" +
            "id=" + id +
            ", nom='" + nom + '\'' +
            ", logo='" + logo + '\'' +
            '}';
  }
}
