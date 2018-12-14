package org.composant.client;

import javax.ejb.Remote;

import org.database.client.Client;

@Remote
public interface ClientComposantRemote {
	public Client ajouterClient(String username, String password);
	public Client retirerClient(Client client);
	public Client trouverClient(Object id);
}
