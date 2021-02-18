package com.sid.communeback.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sid.communeback.models.Commune;
import com.sid.communeback.repositories.CommuneDao;

@RestController
@CrossOrigin(origins = "*")
public class CommuneRestController {
	private final CommuneDao dao;

	@Autowired
	public CommuneRestController(CommuneDao dao) {
		super();
		this.dao = dao;
	}
	
	//list commune by pays
	
	@GetMapping("/communes/{id}")
	public List<Commune> listCommune(@PathVariable(name="id")Long id){
		return dao.listCommuneByPays(id);
	}
	
	

}
