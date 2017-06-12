package it.uniroma3.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.GalleriaWeb.model.Amministratore;


public interface AmministratoreRepository extends CrudRepository<Amministratore, Long>{
	
	 List<Amministratore> findByuser(String user);
}
