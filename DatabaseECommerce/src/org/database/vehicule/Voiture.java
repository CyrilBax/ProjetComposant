package org.database.vehicule;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="Voiture")
public class Voiture extends Vehicule {

	public Voiture()
	{
		
	}
	public Voiture(String modele, String marque, String couleur, int nbKm, String typeCarburant, String typeVehicule, double prix, int quantite) 
	{
		super(modele, marque, couleur, 4, nbKm, typeCarburant, typeVehicule, prix, quantite);
	}

}