package cogent.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cogent.ecommerce.dto.TaskRequest;
import cogent.ecommerce.entity.Employee;
import cogent.ecommerce.repository.EmployeeRepository;
import cogent.ecommerce.repository.TaskRepository;

@RestController
public class TasksController {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired 
	private TaskRepository taskRepository;
	
	@PostMapping("/addsTask")
	public Employee createTask(@RequestBody TaskRequest request) {
		return employeeRepository.save(request.getEmployee());
	}
	
	@GetMapping("/findTasks")
	public List<Employee> findAllTask(){
		return employeeRepository.findAll();
	}

}
