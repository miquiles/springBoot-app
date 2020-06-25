package com.springboot.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Telefone;

@Repository
@org.springframework.transaction.annotation.Transactional
public interface TelefoneRepository extends CrudRepository<Telefone, Long>{
	
	

}
