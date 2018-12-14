package org.database.stockage;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.database.client.Client;
import org.database.vehicule.Vehicule;

/**
 * 
 * @author julie
 *Classe très similaire à caddie qui se chargera de garder les véhicules commandés de manière persistante.
 */

@Entity
@Table(name="Historique")
public class Historique {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;

	@OneToOne
	protected Client client;
	
	@OneToMany(mappedBy="historique")
	protected List<Vehicule> vehicules;

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the vehicules
	 */
	public List<Vehicule> getVehicules() {
		return vehicules;
	}

	/**
	 * @param vehicules the vehicules to set
	 */
	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
}
