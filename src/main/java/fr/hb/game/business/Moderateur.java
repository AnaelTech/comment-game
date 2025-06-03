package fr.hb.game.business;


public class Moderateur extends Utilisateur {
  
  private String numeroDeTelephone;


  public Moderateur(String pseudo, String email, String motDePasse,String numeroDeTelephone, Avatar avatar) {
    super(pseudo, email, motDePasse, avatar);
    this.numeroDeTelephone = numeroDeTelephone;
  }

  public String getNumeroDeTelephone() {
    return numeroDeTelephone;
  }

  public void setNumeroDeTelephone(String numeroDeTelephone) {
    this.numeroDeTelephone = numeroDeTelephone;
  }

  public String toString() {
    return "Moderateur{" +
            "id=" + getId() +
            ", nom='" + getPseudo() + '\'' +
            ", email='" + getEmail() + '\'' +
            ", numeroDeTelephone='" + numeroDeTelephone + '\'' +
            '}';
  }

}
