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
