package fr.hb.game.utils;

import java.util.Comparator;

import fr.hb.game.business.Editeur;

public class ComparateurDEditeursSurLogo implements Comparator<Editeur> {


  @Override
  public int compare(Editeur editeur1, Editeur editeur2) {
   return editeur1.getLogo().compareTo(editeur2.getLogo());
  }

}
