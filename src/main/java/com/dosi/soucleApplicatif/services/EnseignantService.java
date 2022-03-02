package com.dosi.soucleApplicatif.services;

import java.util.List;

import com.dosi.soucleApplicatif.entities.Enseignant;


public interface EnseignantService 
{
	public Enseignant ajouterEnseignant(Enseignant enseignant);
	
	public List<Enseignant> chercherEnseignants();
	
	public Enseignant chercherParNoEnseignant(Integer id);
	
	public Enseignant chercherParNom(String nom);
	
	public Enseignant chercherParEmailUbo(String emailUbo);
	
	public Enseignant chercherParEmailPerso(String emailPerso);
	
	public boolean supprimerEnseignantParId(Integer id);
}
