package fr.hb.game.service;

import java.util.List;

import fr.hb.game.business.Editeur;

public interface EditeurService {

  Editeur ajouterEditeur(String nom, String logo);

  Editeur recupererEditeurParId(Long id);

  List<Editeur> recupererTousLesEditeurs();


}
