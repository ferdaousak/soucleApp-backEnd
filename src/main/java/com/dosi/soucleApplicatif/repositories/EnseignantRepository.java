package com.dosi.soucleApplicatif.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dosi.soucleApplicatif.entities.Enseignant;


/**
 * 
 * @author ferdaous
 * repository de l'entity enseignant
 *
 */
@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant, Integer>
{
	/**
	 * 
	 * @param nom
	 * @return enseignant
	 */
	public Enseignant findByNom(String nom);
	
	/**
	 * 
	 * @param emailUbo
	 * @return enseignant
	 */
	public Enseignant findByEmailUbo(String emailUbo);
	
	/**
	 * 
	 * @param emailPerso
	 * @return enseignant
	 */
	public Enseignant findByEmailPerso(String emailPerso);
}
