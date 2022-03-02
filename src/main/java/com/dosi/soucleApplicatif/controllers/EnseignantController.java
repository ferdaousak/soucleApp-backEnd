package com.dosi.soucleApplicatif.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dosi.soucleApplicatif.entities.Enseignant;
import com.dosi.soucleApplicatif.services.EnseignantService;
import com.dosi.soucleApplicatif.services.EnseignantServiceImp;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/enseignant")
public class EnseignantController 
{

	@Autowired
	EnseignantService enseignantservice;
	

	private static Logger logger =LogManager.getLogger(EnseignantController.class);
	
	/**
	 * 
	 * @return tout les enseignant
	 */
	@GetMapping("/all")
	public List<Enseignant> AfficherTout()
	{
		try 
		{
			return enseignantservice.chercherEnseignants();
		}
		catch(Exception e)
		{
			logger.error("Erreur dans le controller afficher tout !"+e);

			return null;
		}
	}
	
	/**
	 * 
	 * @param enseignant
	 * @return l'enseignant ajouter
	 */
	@PostMapping("/add")
	public Enseignant addEnseignant(@RequestBody Enseignant enseignant)
	{
		
		try 
		{
			return enseignantservice.ajouterEnseignant(enseignant);
			
		}
		catch(Exception e)
		{

			logger.error("Erreur dans le controller ajouter enseignant !"+e);
			return null;
		}
	}
	
	/**
	 * 
	 * @param id
	 * @return true si supprimer
	 */
	@DeleteMapping("/delete/{numero}")
	public boolean deleteEnseignant(@PathVariable int numero)
	{
		try {
			
			return enseignantservice.supprimerEnseignantParId(numero);
			
		} catch (Exception e) {
			
			logger.error("Erreur dans le controller delete by id !"+e);
			
			return false;
		}
	}
	
	/**
	 * 
	 * @param numero
	 * @return l'enseignant trouvé
	 */
	@GetMapping("/getByNumero/{numero}")
	public Enseignant getEnseignantByNumero(@PathVariable int numero)
	{
		try {
			
			return enseignantservice.chercherParNoEnseignant(numero);
			
		} catch (Exception e) {
			
			logger.error("Erreur dans le controller get by numero !"+e);
			
			return null;
		}
		
	}
	/**
	 * 
	 * @param nom
	 * @return l'enseignant trouvé
	 */
	@GetMapping("/getByNom/{nom}")
	public Enseignant getEnseignantByNumero(@PathVariable String nom)
	{
		try {
			
			return enseignantservice.chercherParNom(nom);
			
		} catch (Exception e) {
			
			logger.error("Erreur dans le controller get by nom !"+e);
			
			return null;
		}
		
	}
	
	/**
	 * 
	 * @param emailUbo
	 * @return l'enseignant trouvé
	 */
	@GetMapping("/getByEmailUbo/{emailUbo}")
	public Enseignant getEnseignantByEmailUbo(@PathVariable String emailUbo)
	{
		try {
			
			return enseignantservice.chercherParEmailUbo(emailUbo);
			
		} catch (Exception e) {
			
			logger.error("Erreur dans le controller get by email ubo !"+e);
			
			return null;
		}
		
	}
	
	
}
