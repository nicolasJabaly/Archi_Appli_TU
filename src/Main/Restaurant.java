package Main;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Serveur> listServeur;

    public Restaurant(Integer nombreServeur) {
        this.listServeur = new ArrayList();
        for(int i = 0; i < nombreServeur; i++){
            this.listServeur.add(new Serveur());
        }
    }

    public void prendreUneCommande(Integer montant) {
        for(Serveur serveur : this.listServeur){
            serveur.prendreCommande(montant);
        }
    }

    public Integer getChiffreDaffaire() {
        Integer chiffreDaffaire = 0;
        for(Serveur serveur : this.listServeur){
            chiffreDaffaire+= serveur.getChiffreDAffaire();
        }
        return chiffreDaffaire;
    }
}
