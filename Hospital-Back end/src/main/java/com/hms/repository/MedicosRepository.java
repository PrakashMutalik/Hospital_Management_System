package com.hms.repository;

import java.util.List;

import com.hms.model.Medicos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicosRepository extends JpaRepository<Medicos, Long>{

	@Query(value = "select * from #{#entityName} m where m.pid=?1", nativeQuery = true)
	public List<Medicos> getAllByPatientId(long pid);
}
