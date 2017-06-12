package it.uniroma3.repository;

import java.util.List;
import it.uniroma3.GalleriaWeb.model.Autore;
import org.springframework.data.repository.CrudRepository;


public interface AutoreRepository extends CrudRepository<Autore, Long> {

	Autore findBynome(String nome);
	Autore findBycognome(String cognome);
	List<Autore> findByNazionalita(String nazionalità);

	
	
}
