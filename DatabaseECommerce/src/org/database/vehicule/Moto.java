package org.database.vehicule;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="Moto")
public class Moto extends Vehicule{
	
	public Moto()
	{
		
	}
	public Moto(String modele, String marque, String couleur, int nbKm, String typeCarburant, String typeVehicule, double prix,int quantite)
	{
		super(modele, marque, couleur,2,nbKm,typeCarburant,typeVehicule, prix,quantite);
	}
}
