package it.uniroma3.GalleriaWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.GalleriaWeb.model.Autore;
import it.uniroma3.GalleriaWeb.repository.AutoreRepository;

@Service
public class AutoreService{
	@Autowired
    private AutoreRepository autoreRepository; 

   /* public Autore findBynome(String nome) {
        return this.autoreRepository.findBynome(nome);
    }
    public Autore findBycognome(String cognome) {
        return this.autoreRepository.findBycognome(cognome);
    }
    public Iterable<Autore> findBynazionalità(String nazionalità) {
        return this.autoreRepository.findByNazionalita(nazionalità);
    }*/

    @Transactional
    public void add(final Autore autore) {
        this.autoreRepository.save(autore);
    }

}
