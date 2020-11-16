package cogent.ecommerce.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.ecommerce.exception.*;
import cogent.ecommerce.dto.TaskRequest;
import cogent.ecommerce.entity.*;
import cogent.ecommerce.repository.*;



@RestController
@RequestMapping("/api/v1")
public class TaskController {

	@Autowired
    private TaskRepository taskRepository;
	
	@Autowired EmployeeRepository employeeRepository;

    @GetMapping("/tasks")
    public List <Task> getAllTask() {
        return taskRepository.findAll();
    }

    @GetMapping("/tasks/{tid}")
    public ResponseEntity <Task> getTaskById(@PathVariable(value = "tid") Long tid)
    throws ResourceNotFoundException {
        Task task = taskRepository.findById(tid)
            .orElseThrow(() -> new ResourceNotFoundException("Task not found for this id :: " + tid));
        return ResponseEntity.ok().body(task);
    }

    @PostMapping("/tasks")
    public Task createTask(@Valid @RequestBody Task task) {
        return taskRepository.save(task);
    }

    @PutMapping("/tasks/{tid}")
    public ResponseEntity <Task> updateTask(@PathVariable(value = "tid") Long tid,
        @Valid @RequestBody Task taskDetails) throws ResourceNotFoundException {
        Task task = taskRepository.findById(tid)
            .orElseThrow(() -> new ResourceNotFoundException("Department not found for this id :: " + tid));

        task.setJob(taskDetails.getJob());
       
        final Task updatedTask = taskRepository.save(task);
        return ResponseEntity.ok(updatedTask);
    }

    @DeleteMapping("/tasks/{tid}")
    public Map < String, Boolean > deleteDepartment(@PathVariable(value = "tid") Long tid)
    throws ResourceNotFoundException {
        Task task = taskRepository.findById(tid)
            .orElseThrow(() -> new ResourceNotFoundException("Task not found for this id :: " + tid));

        taskRepository.delete(task);
        Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    
    @PostMapping("/addJobs")
    public Employee addTask(@RequestBody TaskRequest request) {
    	return employeeRepository.save(request.getEmployee());
    }
    
    @GetMapping("findAllJobs")
    public List<Employee> findAllTasks(){
    	return employeeRepository.findAll();
    }
    
    
    
}
