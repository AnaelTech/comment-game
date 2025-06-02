package fr.hb.game.business;


public class Utilisateur {

  private Long id;
  private String pseudo;
  private String motDePasse;
  private String email;
  private static Long counter = 0L;

  public Utilisateur(String pseudo, String motDePasse, String email) {
    this.id = ++counter;
    this.pseudo = pseudo;
    this.motDePasse = motDePasse;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public String getPseudo() {
    return pseudo;
  }

  public void setPseudo(String pseudo) {
    this.pseudo = pseudo;
  }

  public String getMotDePasse() {
    return motDePasse;
  }

  public void setMotDePasse(String motDePasse) {
    this.motDePasse = motDePasse;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String toString() {
    return "Utilisateur{" +
            "id=" + id +
            ", pseudo='" + pseudo + '\'' +
            ", motDePasse='" + motDePasse + '\'' +
            ", email='" + email + '\'' +
            '}';
  }


}
