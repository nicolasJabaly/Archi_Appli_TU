package Tests;

import Main.Serveur;
import org.junit.Test;

class ServeurTest {
    @Test
    public void serveurInitOK() {
        Serveur serveur = new Serveur();
        assert serveur.getChiffreDAffaire() == 0;
    }

    @Test
    public void prendreCommandeOk() {
        Serveur serveur = new Serveur();
        serveur.prendreCommande(50);
        assert serveur.getChiffreDAffaire() == 50;
    }

    @Test
    public void prendreDeuxCommandeOk() {
        Serveur serveur = new Serveur();
        serveur.prendreCommande(50);
        assert serveur.getChiffreDAffaire() == 50;
        serveur.prendreCommande(50);
        assert serveur.getChiffreDAffaire() == 100;
    }
}
