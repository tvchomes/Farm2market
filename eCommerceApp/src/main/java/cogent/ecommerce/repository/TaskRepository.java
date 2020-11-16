package cogent.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import cogent.ecommerce.entity.Task;



@CrossOrigin()
//@Repository
public interface TaskRepository extends JpaRepository<Task,Long>{

	//List<Task> findByDepartmentLeadId(Long leadid);

	//List<Task> findByEmloyeesId(Long eid);

}
