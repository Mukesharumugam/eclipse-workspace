package com.mybootjpa.mybootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.mybootjpa.mybootjpa.model.Student;
import com.mybootjpa.mybootjpa.*;

public interface StudentRepo extends CrudRepository<Student,Integer> {
	

}
