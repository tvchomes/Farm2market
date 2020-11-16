/*
 * package cogent.ecommerce.service;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import cogent.ecommerce.entity.Task; import
 * cogent.ecommerce.repository.TaskRepository;
 * 
 * 
 * @Service
 * 
 * @Transactional public class TaskServiceImpl implements TaskService {
 * 
 * @Autowired private TaskRepository taskRepository;
 * 
 * @Override public Task addTask(Task task){ return taskRepository.save(task); }
 * 
 * @Override public Task updateTask(Task task){ return
 * taskRepository.save(task); }
 * 
 * @Override public void deleteTask(Long taskId){
 * taskRepository.deleteById(taskId); }
 * 
 * @Override public List<Task> findAllTask(){ return taskRepository.findAll(); }
 * 
 * 
 * 
 * @Override public List<Task> findAllEmployeesofLead(Long leadid) { // TODO
 * Auto-generated method stub return
 * taskRepository.findByDepartmentLeadId(leadid); }
 * 
 * @Override public Task saveTask(Task task) { // TODO Auto-generated method
 * stub return taskRepository.save(task); }
 * 
 * @Override public List<Task> findAllDeparmentsOfEmployee(Long id) { // TODO
 * Auto-generated method stub return null; }
 * 
 * 
 * 
 * }
 */