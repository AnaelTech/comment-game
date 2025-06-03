package fr.hb.game;

import fr.hb.game.service.EditeurService;
import fr.hb.game.service.impl.EditeurServiceImpl;

public class App 
{     
  
   private static EditeurService editeurService = new EditeurServiceImpl(); 

    public static void main( String[] args )
    {
        ajouterEditeurs();          
    }
    
      private static void ajouterEditeurs() {
        editeurService.ajouterEditeur("Activision", "activision.com");
        editeurService.ajouterEditeur("Amazon Games","amazongames.com");
        editeurService.ajouterEditeur("Ankama", "ankama.com");
        editeurService.ajouterEditeur("Bandai Namco", "bandai.co.jp");
        editeurService.ajouterEditeur("Bethesda", "bethesda.net");
        editeurService.ajouterEditeur("BioWare", "bioware.com");
        editeurService.ajouterEditeur("Blizzard", "blizzard.com");
        editeurService.ajouterEditeur("Capcom", "capcom.com");
        editeurService.ajouterEditeur("CCP", "ccpgames.com");
        editeurService.ajouterEditeur("CD Projekt Red", "cdprojekt.com");
        editeurService.ajouterEditeur("Davilex", "davilex.nl");
        editeurService.ajouterEditeur("Digital Extreme", "digitalextremes.com");
        editeurService.ajouterEditeur("Electronic Arts", "ea.com");
        editeurService.ajouterEditeur("Epic Games", "epicgames.com");
        editeurService.ajouterEditeur("FromSoftware", "fromsoftware.jp");
        editeurService.ajouterEditeur("Hazelight Studios", "hazelight.se");
        editeurService.ajouterEditeur("idSoftware", "idsoftware.com");
        editeurService.ajouterEditeur("Microsoft", "microsoft.com");
        editeurService.ajouterEditeur("Mobius Digital", "mobiusdigitalgames.com");
        editeurService.ajouterEditeur("MonolithSoftware", "monolithsoft.co.jp");
        editeurService.ajouterEditeur("Naughty Dog", "naughtydog.com");
        editeurService.ajouterEditeur("Nintendo", "nintendo.com");
        editeurService.ajouterEditeur("Riot Games", "riotgames.com");
        editeurService.ajouterEditeur("Rockstar", "rockstar.com");
        editeurService.ajouterEditeur("Sega", "sega.com");
        editeurService.ajouterEditeur("Square Enix", "squareenix.com");
        editeurService.ajouterEditeur("Tencent", "tencentgames.com");
        editeurService.ajouterEditeur("Ubisoft", "ubisoft.com");
        editeurService.ajouterEditeur("Ultra Software", null);
        editeurService.ajouterEditeur("Valve", "valvesoftware.com");
        editeurService.ajouterEditeur("Wildcard", "wildcardmobile.com");   
      }

}
