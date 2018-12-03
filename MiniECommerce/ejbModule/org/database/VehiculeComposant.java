package org.database;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class VehiculeComposant
 * 
 * Permet d'ajouter le v�hicule, de le r�cup�rer
 */
@Stateless
@LocalBean
public class VehiculeComposant extends Vehicule implements VehiculeComposantRemote, VehiculeComposantLocal {
	@PersistenceContext
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public VehiculeComposant() 
    {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void ajouterVehicule(Vehicule vehicule) {
		// TODO Auto-generated method stub
		em.persist(vehicule);
	}

	@Override
	public void supprimerVehicule(Vehicule vehicule) {
		// TODO Auto-generated method stub
		em.remove(em.merge(vehicule));
	}
    
	@Override
    public Vehicule trouverVehicule(Object id)
    {
    	return em.find(org.database.Vehicule.class, id);
    }

}