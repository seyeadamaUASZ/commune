package com.sid.communeback.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sid.communeback.models.Etablissements;

public interface EtablissementsRepository extends JpaRepository<Etablissements, Long>{
 //compte etablissements
	@Query("select count(e) from Etablissements e,Pays p where e.pays.id=p.id and p.id=:id")
	public Integer countEtablissements(@Param("id") Long id);
    
	@Query("select e from Etablissements e,Pays p where e.pays.id=p.id and p.id=:id")
	public List<Etablissements> listEtablissementsByPays(@Param("id")Long id);
	
	@Query("select count(e) from Etablissements e,Pays p where e.pays.id=p.id and p.id=:id and e.typeetablissement='Public'")
	public Integer CountEtablissementsByPublics(@Param("id")Long id);
	
	@Query("select count(e) from Etablissements e,Pays p where e.pays.id=p.id and p.id=:id and e.typeetablissement='Privé'")
	public Integer countEtablissementsByPrivee(@Param("id")Long id);
	
	
	@Query("select e from Etablissements e,Pays p where e.pays.id=p.id and p.id=:id and e.typeetablissement=:typeetab")
	public Integer countEtablissementsByType(@Param("id")Long id,@Param("typeetab")String typeetab);
	
}
