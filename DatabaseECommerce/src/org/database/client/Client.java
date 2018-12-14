package org.database.client;
import org.database.stockage.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * 
 * @author julie
 *Classe représentant le compte d'un client.
 */

@Entity
@Table (name="Client")
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	protected int id;
	
	@Column(name="USERNAME")
	protected String username;
	
	@Column(name="PASSWORD")
	protected String password;
	
	@OneToOne(mappedBy="client")
	protected Caddie caddie;
	
	@OneToOne(mappedBy="client")
	protected Historique historique;

	
	public Client()
	{
		
	}
	
	public Client(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the caddie
	 */
	public Caddie getCaddie() {
		return caddie;
	}

	/**
	 * @param caddie the caddie to set
	 */
	public void setCaddie(Caddie caddie) {
		this.caddie = caddie;
	}

	/**
	 * @return the historique
	 */
	public Historique getHistorique() {
		return historique;
	}

	/**
	 * @param historique the historique to set
	 */
	public void setHistorique(Historique historique) {
		this.historique = historique;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
}
