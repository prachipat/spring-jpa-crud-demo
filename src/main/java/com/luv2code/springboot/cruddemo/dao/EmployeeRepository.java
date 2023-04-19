package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!
	
	/*
	 * @Query(value="Call myPrcedure(:inParam)",nativeQuery = true) public List<Employee>
	 * getAllEmployee(@Param("inParam") Integer in);
	 */
	
	/*
	 * @Procedure(name="myProcedure") public List<Employee>
	 * getAllEmployee(@Param("inParam") Integer in);
	 */

}
