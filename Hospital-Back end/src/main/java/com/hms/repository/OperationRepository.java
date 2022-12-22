package com.hms.repository;

import com.hms.model.Operation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OperationRepository extends JpaRepository<Operation, Long> {

	@Query(value = "select * from #{#entityName} o where o.oid=?1", nativeQuery = true)
	public Operation getById(long oid);
	
}
