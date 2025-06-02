package fr.hb.game.business;



public class Avatar {

  private Long id;
  private String nom;
  private static Long counter = 0L;
  private Utilisateur utilisateur;
  
  public Avatar() {
    this.id = ++counter;
  }

  public Avatar(String nom) {
    this();
    this.nom = nom;
  }

  public Long getId() {
    return id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }
  
  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

  public String toString() {
    return "Avatar{" +
            "id=" + id +
            ", nom='" + nom + '\'' +
            '}';
  }
  
}
