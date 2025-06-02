package fr.hb.game.business;


public class Editeur {

    private Long id;

    private String nom;
    
    private static Long counter = 0L;
   
  public Editeur(String nom) {
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
}
