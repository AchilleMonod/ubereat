package ubereat.model;

import javax.persistence.Entity;

@Entity
public class Restaurateur extends Utilisateur{
	
private Restaurant restaurant;

public Restaurateur() {}

public Restaurateur(Restaurant restaurant) {
	super();
	this.restaurant = restaurant;
}

public Restaurant getRestaurant() {
	return restaurant;
}

public void setRestaurant(Restaurant restaurant) {
	this.restaurant = restaurant;
}

}
