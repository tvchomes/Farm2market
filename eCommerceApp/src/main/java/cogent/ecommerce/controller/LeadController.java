/*
 * package cogent.ecommerce.controller;
 * 
 * import cogent.ecommerce.entity.*; import cogent.ecommerce.service.*; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import java.util.List; import java.util.Set; import
 * java.util.stream.Collectors;
 * 
 * @RestController public class LeadController {
 * 
 * @Autowired private TaskService taskService;
 * 
 * @GetMapping("/api/lead/employees/{leadid}") public ResponseEntity<?>
 * findAllEmployeesOfLead(@PathVariable Long leadid){ List<Set<Employee>>
 * employees = taskService.findAllEmployeesofLead(leadid).stream() .map(ts ->
 * ts.getEmployees()) .collect(Collectors.toList()); return new
 * ResponseEntity<>(employees, HttpStatus.OK); } }
 */