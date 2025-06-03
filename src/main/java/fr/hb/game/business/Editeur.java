package fr.hb.game.business;

import java.util.ArrayList;
import java.util.List;

public class Editeur implements Comparable<Editeur> {

    private Long id;

    private String nom;

    private String logo;
    
    private static Long counter = 0L;

    private List<Jeu> jeux = new ArrayList<>();
  
  public Editeur() {
    id = ++counter;
  }

  public Editeur(String nom, String logo) {
    this();
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

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public String getLogo() {
    return logo;
  }
  
  public List<Jeu> getJeux() {
    return jeux;
  }

  public void setJeux(List<Jeu> jeux) {
    this.jeux = jeux;
  }
  
  

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nom == null) ? 0 : nom.hashCode());
    result = prime * result + ((logo == null) ? 0 : logo.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Editeur other = (Editeur) obj;
    if (nom == null) {
      if (other.nom != null)
        return false;
    } else if (!nom.equals(other.nom))
      return false;
    if (logo == null) {
      if (other.logo != null)
        return false;
    } else if (!logo.equals(other.logo))
      return false;
    return true;
  }
  
  /**
   * On montre a java comment comparer deux objets editeur : 
   * L'objet this et l'objet autreEditeur
   *@param object arg0
   *On decide de comparer les noms des editeurs
   *@return
  */

  @Override
  public int compareTo(Editeur autreEditeur) {
      return this.nom.compareTo(autreEditeur.nom);
  }

  @Override
  public String toString() {
    return "Editeur{" +
            "id=" + id +
            ", nom='" + nom + '\'' +
            ", logo='" + logo + '\'' +
            '}';
  }

}
