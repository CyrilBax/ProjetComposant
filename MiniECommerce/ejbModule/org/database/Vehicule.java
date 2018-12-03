package org.database;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Vehicule")
public abstract class Vehicule {
	
	/**
	 * 
	 */

	@Id
	@Column(name = "ID", nullable = false)
	protected int id;
	
	@Column(name = "MODELE")
	protected String modele;
	
	@Column(name = "MARQUE")
	protected String marque;
	
	@Column(name = "COULEUR")
	protected String couleur;
	
	@Column(name = "NBROUES")
	protected int nbRoues;
	
	@Column(name = "NBKM")
	protected int nbKm;
	
	@Column(name = "TYPECARBURANT")
	protected String typeCarburant;
	
	@Column(name = "TYPEVEHICULE")
	protected String typeVehicule;
	
	public int GetId()
	{
		return id;
	}
	public String GetModele()
	{
		return modele;
	}
	public String GetMarque()
	{
		return marque;
	}
	public String GetCouleur()
	{
		return couleur;
	}
	public int GetNbRoues()
	{
		return nbRoues;
	}
	public int GetNbKm()
	{
		return nbKm;
	}
	public String GetTypeCarburant()
	{
		return typeCarburant;
	}
	public String GetTypeVehicule()
	{
		return typeVehicule;
	}
	
	@Override
	public String toString()
	{
		return "org.database.Vehicule[id = " + id +"]";
	}
	
}
