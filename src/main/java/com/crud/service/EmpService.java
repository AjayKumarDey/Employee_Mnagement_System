package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Employee;
import com.crud.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private 	EmpRepository repo;
	public void addEmp(Employee e)
	{
		repo.save(e);
	}
	public List<Employee> getAllEmp()
	{
		return repo.findAll();
	}
	
	public  Employee getEmpById(int id )
	{
		Optional<Employee>e=repo.findById(id);
		if(e.isPresent())
		{
			return e.get();
		}
		return null;
	}
	
	public void deleteEmp(int id)
	{
		 repo.deleteById(id);
	}
}
