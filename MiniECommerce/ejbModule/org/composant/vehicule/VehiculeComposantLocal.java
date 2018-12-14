package org.composant.vehicule;

import javax.ejb.Local;

import org.database.vehicule.Vehicule;


@Local
public interface VehiculeComposantLocal {
	public Vehicule ajouterVehicule(String modele, String marque, String couleur, int nbKm, String typeCarburant, String typeVehicule, double prix, int quantite);
	public Vehicule supprimerVehicule(String modele, String marque, String couleur, int nbKm, String typeCarburant, String typeVehicule, double prix, int quantite);
	public Vehicule trouverVehicule(Object id);
}
