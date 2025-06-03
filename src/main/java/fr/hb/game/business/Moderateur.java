package fr.hb.game.business;

import java.util.ArrayList;
import java.util.List;

public class Moderateur extends Utilisateur {
  
  private String numeroDeTelephone;
  private List<Avis> avisList = new ArrayList<>();

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

  public List<Avis> getAvisList() {
    return avisList;
  }

  public void setAvisList(List<Avis> avisList) {
    this.avisList = avisList;
  }
 
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Moderateur)) return false;
    if (!super.equals(o)) return false;

    Moderateur that = (Moderateur) o;

    return numeroDeTelephone != null ? numeroDeTelephone.equals(that.numeroDeTelephone) : that.numeroDeTelephone == null;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (numeroDeTelephone != null ? numeroDeTelephone.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Moderateur{" +
            "id=" + getId() +
            ", nom='" + getPseudo() + '\'' +
            ", email='" + getEmail() + '\'' +
            ", numeroDeTelephone='" + numeroDeTelephone + '\'' +
            '}';
  }

}
