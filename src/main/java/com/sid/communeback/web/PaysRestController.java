package com.sid.communeback.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sid.communeback.models.Pays;
import com.sid.communeback.repositories.PaysDao;

@RestController
@CrossOrigin(origins = "*")
public class PaysRestController {
	
	private final PaysDao paysdao;
    
	@Autowired
	public PaysRestController(PaysDao paysdao) {
		super();
		this.paysdao = paysdao;
	}
	
	@GetMapping("/pays")
	public List<Pays> getAllPays(){
		return paysdao.findAll();
	}
	

}
