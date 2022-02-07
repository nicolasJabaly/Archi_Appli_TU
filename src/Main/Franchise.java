package Main;

import java.util.ArrayList;
import java.util.List;

public class Franchise {
    private List<Restaurant> listRestaurant;

    public Franchise(Integer nombreRestaurant, Integer serveurParRestaurant){
        this.listRestaurant = new ArrayList<>();
        for (int i = 0; i < nombreRestaurant; i++) {
            this.listRestaurant.add(new Restaurant(serveurParRestaurant));
        }
    }

    public Integer getChiffreDaffaire(){
        Integer chiffreDaffaire = 0;
        for(Restaurant restaurant : this.listRestaurant) {
            restaurant.prendreUneCommande(1);
            chiffreDaffaire += restaurant.getChiffreDaffaire();
        }
        return chiffreDaffaire;
    }
}
