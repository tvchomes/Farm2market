package cogent.ecommerce.dto;

import cogent.ecommerce.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class TaskRequest {
	
	private Employee employee;
	
	
	
	
	public TaskRequest(Employee employee) {
		
		this.employee = employee;
	}

	public TaskRequest() {
		
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "TaskRequest [employee=" + employee + "]";
	}
	

}
