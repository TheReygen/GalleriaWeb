package it.uniroma3.GalleriaWeb.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.GalleriaWeb.model.Opera;
import it.uniroma3.GalleriaWeb.repository.OperaRepository;

@Service
public class OperaService {
	  @Autowired
	    private OperaRepository operaRepository; 

	    public List<Opera> findAll() {
	    	List<Opera> opere = new ArrayList<>();
	    	opere.addAll((Collection<? extends Opera>) this.operaRepository.findAll());
	        return opere;
	    }

	    @Transactional
	    public void add(final Opera opera) {
	        this.operaRepository.save(opera);
	    }

		public Opera findbyId(Long id) {
			return this.operaRepository.findOne(id);
		}
		
		public void delete(Long id){
			this.operaRepository.delete(id);
		}
		
		public void update(Long id,Opera opera){
			this.operaRepository.save(opera);
		}
}
