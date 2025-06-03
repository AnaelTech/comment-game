package fr.hb.game.business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Joueur extends Utilisateur {
  
  private LocalDate dateNaissance;
  private List<Avis> avisList = new ArrayList<>();

  public Joueur(String pseudo, String motDePasse, String email, LocalDate dateNaissance, Avatar avatar) {
    super(pseudo, motDePasse, email, avatar);
    this.dateNaissance = dateNaissance;
  }

  public LocalDate getDateNaissance(){
    return dateNaissance;
  }
  
  public void setDateNaissance(LocalDate dateNaissance) {
    this.dateNaissance = dateNaissance;
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
    if (!(o instanceof Joueur)) return false;
    if (!super.equals(o)) return false;

    Joueur joueur = (Joueur) o;

    return dateNaissance != null ? dateNaissance.equals(joueur.dateNaissance) : joueur.dateNaissance == null;

  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (dateNaissance != null ? dateNaissance.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Joueur{" +
            "id=" + getId() +
            ", pseudo='" + getPseudo() + '\'' +
            ", motDePasse='" + getMotDePasse() + '\'' +
            ", email='" + getEmail() + '\'' +
            ", dateNaissance=" + dateNaissance +
            '}';
  }
}
