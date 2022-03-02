package com.dosi.soucleApplicatif;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dosi.soucleApplicatif.entities.Enseignant;
import com.dosi.soucleApplicatif.services.EnseignantService;

@SpringBootTest
class SoucleApplicatifApplicationTests {

	@Autowired
	EnseignantService enseignantService;
	
	@Test
	void contextLoads() 
	{
		assertThat(enseignantService).isNotNull();
	}
	
	@Test
	void verifierdonnee()
	{
		assertThat(enseignantService.chercherEnseignants()).isNotEmpty();
	}
	
	@Test
	void verfierUneDonne()
	{
		assertEquals(enseignantService.chercherParNoEnseignant(1).getNom(),"test");
	}

	@Test
	void verfierSuppression()
	{
		Enseignant e = new Enseignant();
		
		e.setNom("testsup");
		e.setPrenom("testsup");
		
		Enseignant res = enseignantService.ajouterEnseignant(e);
		
		assertThat(enseignantService.supprimerEnseignantParId(res.getNoEnseignant())).isTrue();
		
		assertThat(enseignantService.chercherParNoEnseignant(res.getNoEnseignant())).isNull();
	}
}
