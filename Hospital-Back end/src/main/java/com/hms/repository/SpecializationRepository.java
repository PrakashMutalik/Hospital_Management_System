package com.hms.repository;

import com.hms.model.Specialization;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SpecializationRepository extends JpaRepository<Specialization, Long>{

	@Query(value = "select * from #{#entityName} s where s.SPEC_ID=?1", nativeQuery = true)
	public Specialization getById(long specId);
}
