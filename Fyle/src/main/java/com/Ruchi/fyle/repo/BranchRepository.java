package com.Ruchi.fyle.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Ruchi.fyle.entities.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
	
	@Query("SELECT t FROM Branch t WHERE " + "LOWER(t.city) LIKE LOWER(CONCAT('%',:data, '%'))"+" or LOWER(t.branch) LIKE LOWER(CONCAT('%',:data, '%')) "
	+" or LOWER(t.branch) LIKE LOWER(CONCAT('%',:data, '%'))"
	+" or LOWER(t.address) LIKE LOWER(CONCAT('%',:data, '%'))"
	+" or LOWER(t.district) LIKE LOWER(CONCAT('%',:data, '%'))"
	+" or LOWER(t.state) LIKE LOWER(CONCAT('%',:data, '%'))"
	+" or LOWER(t.ifsc) LIKE LOWER(CONCAT('%',:data, '%'))"
	+"order by t.ifsc")
	public List<Branch> getResult(@Param("data") String data);
}
