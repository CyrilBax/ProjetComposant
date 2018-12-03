package org.database;

import javax.ejb.Local;

@Local
public interface VehiculeComposantLocal {
	public void ajouterVehicule(Vehicule vehicule);
	public void supprimerVehicule(Vehicule vehicule);
	public Vehicule trouverVehicule(Object id);
}