package com.Ruchi.fyle.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ruchi.fyle.entities.Branch;
import com.Ruchi.fyle.repo.BranchRepository;

@Service
public class BranchServiceImpl{
	
	@Autowired
	private BranchRepository br;
	
	public List<Branch> getResult(String data) {
		// TODO Auto-generated method stub
		int limit=3;
		List<Branch> result = br.getResult(data);
		return result;
	}
	public List<Branch> listAll() {
		// TODO Auto-generated method stub
		List<Branch> findAll = br.findAll();
		return findAll;
	}

}
