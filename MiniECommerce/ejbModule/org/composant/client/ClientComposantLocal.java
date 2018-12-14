package org.composant.client;

import javax.ejb.Local;

import org.database.client.Client;

@Local
public interface ClientComposantLocal {
	
	public Client ajouterClient(String username, String password);
	public Client retirerClient(Client client);
	public Client trouverClient(Object id);

}
