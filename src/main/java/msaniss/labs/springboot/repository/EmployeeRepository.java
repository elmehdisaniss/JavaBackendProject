package msaniss.labs.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import msaniss.labs.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	

}
