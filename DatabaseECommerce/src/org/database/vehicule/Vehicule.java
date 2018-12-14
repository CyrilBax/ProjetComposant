package org.database.vehicule;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.database.stockage.Caddie;
import org.database.stockage.Historique;

//@Entity
//@Table (name = "Vehicule")
//@Entity
//@Table (name="Vehicule")
@Entity
@Table(name="Vehicule")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Vehicule {
	
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	protected int id;
	
	@Column(name="MODELE")
	protected String modele;
	
	@Column(name="MARQUE")
	protected String marque;

	@Column(name="COULEUR")
	protected String couleur;
	
	@Column(name="NBROUES")
	protected int nbRoues;
	
	@Column(name="NBKM")
	protected int nbKm;
	
	@Column(name="TYPECARBURANT")
	protected String typeCarburant;
	
	@Column(name="TYPEVEHICULE")
	protected String typeVehicule;

	@Column(name="PRIX")
	protected double prix;
	
	@Column(name="QUANTITE")
	protected int quantite;

	@ManyToOne
	protected Caddie caddie;
	
	@ManyToOne
	protected Historique historique;
	
	/**
	 * 
	 * @param modele
	 * @param marque
	 * @param couleur
	 * @param nbRoues
	 * @param nbKm
	 * @param typeCarburant
	 * @param typeVehicule
	 * @param prix
	 * @param quantite
	 */
	public Vehicule()
	{
		super();
	}
	
	public Vehicule(String modele, String marque, String couleur, int nbRoues, int nbKm, String typeCarburant, String typeVehicule, double prix, int quantite)
	{
		this.modele = modele;
		this.marque = marque;
		this.couleur = couleur;
		this.nbRoues = nbRoues;
		this.nbKm = nbKm;
		this.typeCarburant = typeCarburant;
		this.typeVehicule = typeVehicule;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	/**
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * @param modele the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the nbRoues
	 */
	public int getNbRoues() {
		return nbRoues;
	}

	/**
	 * @param nbRoues the nbRoues to set
	 */
	public void setNbRoues(int nbRoues) {
		this.nbRoues = nbRoues;
	}

	/**
	 * @return the nbKm
	 */
	public int getNbKm() {
		return nbKm;
	}

	/**
	 * @param nbKm the nbKm to set
	 */
	public void setNbKm(int nbKm) {
		this.nbKm = nbKm;
	}

	/**
	 * @return the typeCarburant
	 */
	public String getTypeCarburant() {
		return typeCarburant;
	}

	/**
	 * @param typeCarburant the typeCarburant to set
	 */
	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}

	/**
	 * @return the typeVehicule
	 */
	public String getTypeVehicule() {
		return typeVehicule;
	}

	/**
	 * @param typeVehicule the typeVehicule to set
	 */
	public void setTypeVehicule(String typeVehicule) {
		this.typeVehicule = typeVehicule;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}
	
	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
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

	@Override
	public String toString()
	{
		return "org.database.Vehicule[id = " + id +"]";
	}
	
}
