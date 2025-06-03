package fr.hb.game.business;

// Hérite de Object 
public abstract class Utilisateur {

  private Long id;
  private String pseudo;
  private String motDePasse;
  private String email;
  private Avatar avatar;
  private static Long counter = 0L;
  
  public Utilisateur() {
    this.id = ++counter;
  }

  public Utilisateur(String pseudo, String motDePasse, String email, Avatar avatar) {
    this();
    this.pseudo = pseudo;
    this.motDePasse = motDePasse;
    this.email = email;
    this.avatar = avatar;
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
  
  public Avatar getAvatar() {
    return avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Utilisateur)) return false;

    Utilisateur that = (Utilisateur) o;

    if (!id.equals(that.id)) return false;
    if (!pseudo.equals(that.pseudo)) return false;
    if (!motDePasse.equals(that.motDePasse)) return false;
    return email.equals(that.email);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + pseudo.hashCode();
    result = 31 * result + motDePasse.hashCode();
    result = 31 * result + email.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Utilisateur{" +
            "id=" + id +
            ", pseudo='" + pseudo + '\'' +
            ", motDePasse='" + motDePasse + '\'' +
            ", email='" + email + '\'' +
            '}';
  }


}
