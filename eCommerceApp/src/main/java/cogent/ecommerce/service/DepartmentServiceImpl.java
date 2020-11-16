/*
 * package cogent.ecommerce.service;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import cogent.ecommerce.entity.Department; import
 * cogent.ecommerce.entity.User; import
 * cogent.ecommerce.repository.DepartmentRepository;
 * 
 * import java.util.List;
 * 
 * @Service
 * 
 * @Transactional public class DepartmentServiceImpl implements
 * DepartmentService{
 * 
 * @Autowired private DepartmentRepository departmentRepository;
 * 
 * 
 * 
 * @Override public Department addDepartment(Department department) {
 * 
 * return departmentRepository.save(department); }
 * 
 * @Override public Department updateDepartment(Department department) {
 * 
 * return departmentRepository.save(department); }
 * 
 * @Override public void deleteDepartment(Long departmentid) {
 * departmentRepository.deleteById(departmentid); }
 * 
 * @Override public List<Department> findAllDepartments() { // TODO
 * Auto-generated method stub return null; }
 * 
 * }
 */   