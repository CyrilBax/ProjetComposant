package org.composant.client;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.database.client.Client;

/**
 * Session Bean implementation class ClientComposant
 */
@Stateless
@LocalBean
public class ClientComposant implements ClientComposantRemote, ClientComposantLocal {
	
	@PersistenceContext(name = "DatabaseECommerce")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public ClientComposant() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Client ajouterClient(String username, String password) {
		// TODO Auto-generated method stub
		Client client = new Client(username,password);
		
		em.persist(client);
		return null;
	}

	@Override
	public Client retirerClient(Client client) {
		// TODO Auto-generated method stub
		em.remove(em.merge(client));
		return client;
	}

	@Override
	public Client trouverClient(Object id) {
		// TODO Auto-generated method stub
		return em.find(Client.class, id);
	}

}
