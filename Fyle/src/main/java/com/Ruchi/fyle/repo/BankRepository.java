package com.Ruchi.fyle.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ruchi.fyle.entities.Banks;

public interface BankRepository extends JpaRepository<Banks, Integer> {

}
