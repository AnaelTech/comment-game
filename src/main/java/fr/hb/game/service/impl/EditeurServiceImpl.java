package fr.hb.game.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.hb.game.business.Editeur;
import fr.hb.game.service.EditeurService;

public class EditeurServiceImpl implements EditeurService {
  
  private static List<Editeur> editeurs = new ArrayList<>();

  
/**
  * Méthode qui ajoute un éditeur en utilisant le nom
  * et le logo donné en paramètre
  * 
  * @param nom
  * @param logo
  * @return l'éditeur ajouté
  */
  @Override
  public Editeur ajouterEditeur(String nom, String logo) {
    
    if (nom == null || nom.isEmpty()) {
      throw new IllegalArgumentException("Le nom de l'éditeur ne peut pas être vide.");
    } else if (logo == null || logo.isEmpty()) {
      throw new IllegalArgumentException("Le logo de l'éditeur ne peut pas être vide.");
    }
    Editeur editeur = new Editeur(nom, logo);
    editeurs.add(editeur);
    return editeur;
  }
  
  /**
  * Méthode qui récupère un éditeur par son id
  * 
  * @param id
  * @return un éditeur s'il a été trouvé, sinon null
  */
  @Override
  public Editeur recupererEditeurParId(Long id) {
   
    if (id == null) {
      throw new IllegalArgumentException("L'ID de l'éditeur ne peut pas être nul.");
    }
    for (Editeur editeur : editeurs) {
      if (editeur.getId().equals(id)) {
        return editeur;
      }
    }
    return null;
  }
  

  /**
  * Méthode qui renvoie tous les éditeurs
  * 
  * @return la liste exhaustive des éditeurs
  */
  @Override
  public List<Editeur> recupererTousLesEditeurs() {
    return editeurs;
  }

}

