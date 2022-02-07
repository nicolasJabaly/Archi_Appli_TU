package Tests;

import Main.Restaurant;
import org.junit.Test;

public class RestaurantTest {
    @Test
    public void prendreUneCommandeOkCas0(){
        Restaurant restaurant = new Restaurant(0);
        assert restaurant.getChiffreDaffaire() == 0;
    }

    @Test
    public void prendreUneCommandeOkCas1(){
        Restaurant restaurant = new Restaurant(1);
        restaurant.prendreUneCommande(1);
        assert restaurant.getChiffreDaffaire() == 1;
    }

    @Test
    public void prendreUneCommandeOkCas2(){
        Restaurant restaurant = new Restaurant(2);
        restaurant.prendreUneCommande(1);
        assert restaurant.getChiffreDaffaire() == 2;
    }

    @Test
    public void prendreUneCommandeOkCas100(){
        Restaurant restaurant = new Restaurant(100);
        restaurant.prendreUneCommande(1);
        assert restaurant.getChiffreDaffaire() == 100;
    }
}
