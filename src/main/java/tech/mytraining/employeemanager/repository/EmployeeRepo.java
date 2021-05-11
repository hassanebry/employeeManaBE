package tech.mytraining.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.mytraining.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
