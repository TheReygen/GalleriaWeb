package it.uniroma3.GalleriaWeb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import it.uniroma3.GalleriaWeb.model.*;
import it.uniroma3.GalleriaWeb.service.OperaService;
@RestController
public class OperaController {
	@Autowired
	private OperaService operaService;
	
	@RequestMapping("/opere")
	public List<Opera> getOpere(){
		return operaService.findAll();
	}
	
	@RequestMapping("/opere/{id}")
	//per collegare {id} con id del metodo basta aggiungere @PathVariable
	//se il la variabile del metodo aveva un nome diverso era necessario aggiungere
	//@PathVariable("id")
	public Opera getOpera(@PathVariable Long id){
		return operaService.findbyId(id);
	}
	
	
	@RequestMapping(value="/opere",method=RequestMethod.POST)
	public void addOpera(@RequestBody Opera opera){
		operaService.add(opera);
	}
	
	//metodo per modificare un opera inserita
	@RequestMapping(value="/opere/{id}",method=RequestMethod.PUT)
	public void updateOpera(@PathVariable Long id,Opera opera){
		//Da implementare
		//operaService.update(id, opera);
	}
	
	//metodo per cancellare opera
	@RequestMapping(value="/opere/{id}",method=RequestMethod.DELETE)
	public void deleteOpera(@PathVariable Long id){
		operaService.delete(id);
	}
	

}
