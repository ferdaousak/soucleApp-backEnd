package com.dosi.soucleApplicatif.services;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dosi.soucleApplicatif.entities.Enseignant;
import com.dosi.soucleApplicatif.repositories.EnseignantRepository;


@Service
public class EnseignantServiceImp implements EnseignantService{

	
	@Autowired
	EnseignantRepository enseignantRepository;

	private static Logger logger = LogManager.getLogger(EnseignantServiceImp.class);
	/**
	 * @param enseignant
	 * @return enseignant ajouter
	 */
	@Override
	public Enseignant ajouterEnseignant(Enseignant enseignant) {
	
		return enseignantRepository.save(enseignant);
	}

	/**
	 * @param
	 * @return liste des enseignant
	 */
	@Override
	public List<Enseignant> chercherEnseignants() {
		
		return enseignantRepository.findAll();
	}
	
	/**
	 * @param id
	 * @return enseigant
	 */
	@Override
	public Enseignant chercherParNoEnseignant(Integer id) {
		
		Optional<Enseignant> res = enseignantRepository.findById(id);
		
		return res.isPresent() ? res.get() : null;
	}

	/**
	 * @param nom
	 * @return 
	 * @return enseigant
	 */
	@Override
	public  Enseignant chercherParNom(String nom) {
	
		return enseignantRepository.findByNom(nom);
	}

	/**
	 * @param emailUbo
	 * @return enseignant
	 */
	@Override
	public Enseignant chercherParEmailUbo(String emailUbo) 
	{
		return enseignantRepository.findByEmailUbo(emailUbo);
	}
	
	/**
	 * @param emailperso
	 * @return enseignant
	 */
	@Override
	public Enseignant chercherParEmailPerso(String emailPerso) {
		
		return enseignantRepository.findByEmailPerso(emailPerso);
	}

	/**
	 * @param id
	 * @return true si l'enseignant existe, false si il n'existe pas
	 */
	@Override
	public boolean supprimerEnseignantParId(Integer id) {
		
		try {
			
			enseignantRepository.deleteById(id);
		} catch (Exception e)
		{
			logger.error("Erreur dans la supprission de l'enseignant !"+e);
			return false;
		}
		return true;
	}

}
