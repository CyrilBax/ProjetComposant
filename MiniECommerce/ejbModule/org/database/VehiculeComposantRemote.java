package org.database;

import javax.ejb.Remote;

@Remote
public interface VehiculeComposantRemote {
	
	public void ajouterVehicule(Vehicule vehicule);
	public void supprimerVehicule(Vehicule vehicule);
	public Vehicule trouverVehicule(Object id);

}