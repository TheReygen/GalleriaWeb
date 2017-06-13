package it.uniroma3.GalleriaWeb.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import it.uniroma3.GalleriaWeb.model.Amministratore;
import it.uniroma3.GalleriaWeb.model.Autore;
import it.uniroma3.GalleriaWeb.model.Opera;

public interface OperaRepository extends CrudRepository<Opera, Long> {
	/*
	List<Amministratore> findBytitolo(String titolo);
	List<Amministratore> findByautore(Autore autore);
	List<Amministratore> findBydataRealizzazione(int data);
	*/

}
