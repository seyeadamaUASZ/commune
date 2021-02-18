package com.sid.communeback.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sid.communeback.models.Etablissements;
import com.sid.communeback.repositories.EtablissementsRepository;

@RestController
@CrossOrigin(origins = "*")
public class EtablissementsRestController {
	@Autowired
    private EtablissementsRepository repos;
	
	
	@GetMapping("/etablissements/{id}")
	public List<Etablissements> listEtablissementsByPays(@PathVariable(name="id")Long id){
		 return repos.listEtablissementsByPays(id);
	}
	
	@GetMapping("/countEtablissements/{id}")
	public Integer countEtablissementtotal(@PathVariable(name="id")Long id) {
		return repos.countEtablissements(id);
	}
	
	@GetMapping("/countEtablissementsprives/{id}")
	public Integer countEtablissementsPrives(@PathVariable(name="id")Long id) {
		return repos.countEtablissementsByPrivee(id);
	}
	
	@GetMapping("/countEtablissementspublics/{id}")
	public Integer countEtablissementspublics(@PathVariable(name="id")Long id) {
		return repos.CountEtablissementsByPublics(id);
	}
	
	
	@GetMapping("/countEtablissementsbyType/{id}/{typeetab}")
	public Integer countEtablissementsbyType(@PathVariable(name="id")Long id,@PathVariable(name="typeetab")String typeetab) {
		return repos.countEtablissementsByType(id, typeetab);
	}
 
}
