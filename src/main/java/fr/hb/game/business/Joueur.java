package fr.hb.game.business;

import java.time.LocalDate;

public class Joueur extends Utilisateur {
  
  private LocalDate dateNaissance;
  
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
