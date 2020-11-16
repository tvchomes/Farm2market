package cogent.ecommerce.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import cogent.ecommerce.entity.*;

@CrossOrigin()
//@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	//Page<Employee> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

	//Page<Employee> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}
