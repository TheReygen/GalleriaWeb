package it.uniroma3.GalleriaWeb.repository;

import java.util.List;
import it.uniroma3.GalleriaWeb.model.Autore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface AutoreRepository extends CrudRepository<Autore, Long> {

	/*Autore findBynome(String nome);
	Autore findBycognome(String cognome);
	List<Autore> findByNazionalita(String nazionalità);*/

	
	
}
