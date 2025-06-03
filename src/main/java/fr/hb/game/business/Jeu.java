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
  private Editeur editeur;
  private List<Plateform> plateforms = new ArrayList<>();

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
  
  public Editeur getEditeur() {
    return editeur;
  }

  public void setEditeur(Editeur editeur) {
    this.editeur = editeur;
  }
  
  public List<Plateform> getPlateforms() {
    return plateforms;
  }

  public void setPlateforms(List<Plateform> plateforms) {
    this.plateforms = plateforms;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nom == null) ? 0 : nom.hashCode());
    result = prime * result + ((dateSortie == null) ? 0 : dateSortie.hashCode());
    return result;
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Jeu jeu = (Jeu) obj;
    if (nom != null ? !nom.equals(jeu.nom) : jeu.nom != null) return false;
    return dateSortie != null ? dateSortie.equals(jeu.dateSortie) : jeu.dateSortie == null;
  }


  @Override
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
