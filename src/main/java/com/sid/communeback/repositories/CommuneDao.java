package com.sid.communeback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sid.communeback.models.Commune;

public interface CommuneDao extends JpaRepository<Commune, Long>{
	
	@Query("select c from Commune c,Pays p where c.pays.id=p.id and p.id=:id")
	public List<Commune> listCommuneByPays(@Param("id")Long id);

}
