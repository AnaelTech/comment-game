package  fr.hb.game.business;

import java.time.LocalDateTime;

public class Avis {
  
  private Long id;
  private String contenu;
  private float note;
  private LocalDateTime dateDeCreation;
  private static Long counteur = 0L;

  public Avis(Long id) {
    this.id = ++counteur;
  }

  public Avis(String contenu, float note) {
    this.id = ++counteur;
    this.contenu = contenu;
    this.note = note;
    this.dateDeCreation = LocalDateTime.now();
  }
  
  public Long getId() {
    return id;
  }


  public String getContenu() {
    return contenu;
  }

  public void setContenu(String contenu) {
    this.contenu = contenu;
  }

  public float getNote() {
    return note;
  }

  public void setNote(float note) {
    this.note = note;
  }

  public LocalDateTime getDateDeCreation() {
    return dateDeCreation;
  }

  public void setDateDeCreation(LocalDateTime dateDeCreation) {
    this.dateDeCreation = dateDeCreation;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Avis avis = (Avis) obj;
    return id != null ? id.equals(avis.id) : avis.id == null;
  }


  @Override
  public String toString() {
    return "Avis{" +
           "id=" + id +
           ", contenu='" + contenu + '\'' +
           ", note=" + note +
           ", dateDeCreation=" + dateDeCreation +
           '}';
  }



}
