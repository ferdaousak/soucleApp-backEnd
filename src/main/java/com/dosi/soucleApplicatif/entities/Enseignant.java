package com.dosi.soucleApplicatif.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * @author ferdaous
 *
 */
@Entity
public class Enseignant 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int noEnseignant;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String codePostal;
	
	private String emailPerso;
	
	private String emailUbo;
	
	private String mobile;
	
	private String pays ;
	
	private String ville;
	
	private String sexe;
	
	private String telephone;
	
	private String type;
	
	

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param codePostal
	 * @param emailPerso
	 * @param emailUbo
	 * @param mobile
	 * @param pays
	 * @param ville
	 * @param sexe
	 * @param telephone
	 * @param type
	 */
	public Enseignant(String nom, String prenom, String adresse, String codePostal, String emailPerso, String emailUbo,
			String mobile, String pays, String ville, String sexe, String telephone, String type) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.emailPerso = emailPerso;
		this.emailUbo = emailUbo;
		this.mobile = mobile;
		this.pays = pays;
		this.ville = ville;
		this.sexe = sexe;
		this.telephone = telephone;
		this.type = type;
	}


	
	/**
	 * 
	 */
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the noEnseignant
	 */
	public int getNoEnseignant() {
		return noEnseignant;
	}


	/**
	 * @param noEnseignant the noEnseignant to set
	 */
	public void setNoEnseignant(int noEnseignant) {
		this.noEnseignant = noEnseignant;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}


	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}


	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	/**
	 * @return the emailPerso
	 */
	public String getEmailPerso() {
		return emailPerso;
	}


	/**
	 * @param emailPerso the emailPerso to set
	 */
	public void setEmailPerso(String emailPerso) {
		this.emailPerso = emailPerso;
	}


	/**
	 * @return the emailUbo
	 */
	public String getEmailUbo() {
		return emailUbo;
	}


	/**
	 * @param emailUbo the emailUbo to set
	 */
	public void setEmailUbo(String emailUbo) {
		this.emailUbo = emailUbo;
	}


	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}


	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}


	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}


	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}


	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}


	/**
	 * @return the sexe
	 */
	public String getSexe() {
		return sexe;
	}


	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}


	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

		
	
	
	
}
	
 
