package fr.hb.game.business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jeu {

  private Long id;
  private String nom;
  private LocalDate dateSortie;
  private String description;
  private boolean possedeImage;
  private static Long counter = 0L;
  private List<Avis> avisList = new ArrayList<>();

  public Jeu(){
    this.id = ++counter;
  }

  public Jeu(String nom, LocalDate dateSortie, String description, boolean possedeImage) {
    this();
    this.nom = nom;
    this.dateSortie = dateSortie;
    this.description = description;
    this.possedeImage = possedeImage;
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

  public LocalDate getDateSortie() {
    return dateSortie;
  }

  public void setDateSortie(LocalDate dateSortie) {
    this.dateSortie = dateSortie;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPossedeImage() {
    return possedeImage;
  }

  public void setPossedeImage(boolean possedeImage) {
    this.possedeImage = possedeImage;
  }
  
  public List<Avis> getAvisList() {
    return avisList;
  }

  public void setAvisList(List<Avis> avisList) {
    this.avisList = avisList;
  }

  public String toString() {
    return "Jeu{" +
            "id=" + id +
            ", nom='" + nom + '\'' +
            ", dateSortie=" + dateSortie +
            ", description='" + description + '\'' +
            ", possedeImage=" + possedeImage +
            ", avisList=" + avisList +
            '}';
  }

}
