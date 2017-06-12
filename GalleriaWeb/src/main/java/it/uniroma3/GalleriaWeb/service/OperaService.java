package it.uniroma3.GalleriaWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.GalleriaWeb.model.Opera;
import it.uniroma3.repository.OperaRepository;


public class OperaService {
	  @Autowired
	    private OperaRepository operaRepository; 

	    public Iterable<Opera> findAll() {
	        return this.operaRepository.findAll();
	    }

	    @Transactional
	    public void add(final Opera opera) {
	        this.operaRepository.save(opera);
	    }

		public Opera findbyId(Long id) {
			return this.operaRepository.findOne(id);
		}

}
