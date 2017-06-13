package it.uniroma3.GalleriaWeb.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import it.uniroma3.GalleriaWeb.model.Amministratore;


public interface AmministratoreRepository extends CrudRepository<Amministratore, Long>{
	
	/* List<Amministratore> findByuser(String user);*/
}
