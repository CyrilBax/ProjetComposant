package org.composant.vehicule;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.database.vehicule.Moto;
import org.database.vehicule.Vehicule;
import org.database.vehicule.Voiture;


/**
 * Session Bean implementation class VehiculeComposant
 * 
 * Permet d'ajouter le véhicule, de le récupérer
 */
@Stateless
@LocalBean
public class VehiculeComposant implements VehiculeComposantRemote, VehiculeComposantLocal {
	
	@PersistenceContext(name = "DatabaseECommerce")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
	
    public VehiculeComposant() 
    {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Vehicule ajouterVehicule(String modele, String marque, String couleur, int nbKm, String typeCarburant, String typeVehicule, double prix, int quantite) {
		// TODO Auto-generated method stub
		Vehicule vehicule = null;
		if(typeVehicule.equals("Voiture"))
		{
			vehicule = new Voiture(modele,marque,couleur,nbKm,typeCarburant,typeVehicule,prix,quantite);
		}
		else if(typeVehicule.equals("Moto"))
		{
			vehicule = new Moto(modele,marque,couleur,nbKm,typeCarburant,typeVehicule,prix,quantite);
		}
		if(vehicule != null)
			em.persist(vehicule);
		return null;
	}

	@Override
	public Vehicule supprimerVehicule(String modele, String marque, String couleur, int nbKm, String typeCarburant, String typeVehicule, double prix, int quantite) {
		// TODO Auto-generated method stub
		Vehicule vehicule = null;
		if(typeVehicule.equals("Voiture"))
		{
			vehicule = new Voiture(modele,marque,couleur,nbKm,typeCarburant,typeVehicule,prix,quantite);
		}
		else if(typeVehicule.equals("Moto"))
		{
			vehicule = new Moto(modele,marque,couleur,nbKm,typeCarburant,typeVehicule,prix,quantite);
		}
		em.remove(em.merge(vehicule));
		return vehicule;
	}
    
	@Override
    public Vehicule trouverVehicule(Object id)
    {
    	return em.find(Vehicule.class, id);
    }

}
