package cogent.ecommerce.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cogent.ecommerce.entity.*;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Data
@Entity
@Table(name = "department")

public class Department implements Serializable{
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deptid")
    private Long deptid;
	 
	 
    @Column(name = "departments") 
    private String departments;
	/*
	 * @ManyToOne(fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name="leadid", referencedColumnName = "id") private User lead;
	 */
	/*
	 * @ManyToOne(fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name="leadid", referencedColumnName= "id") private DAOUser lead;
	 */
    
	/*
	 * @JsonBackReference
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "department" ) private
	 * Set<Employee> employees;
	 */
 	
    
    public Department() {}

	
    public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	/*
	 * public Set<Employee> getEmployees() { return employees; }
	 * 
	 * public void setEmployees(Set<Employee> employees) { this.employees =
	 * employees; }
	 */

	public long getDeptid() {
		return deptid;
	}

	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}


	/*
	 * public DAOUser getLead() { return lead; }
	 */


	/*
	 * public void setLead(DAOUser lead) { this.lead = lead; }
	 */

	/*
	 * public User getLead() { return lead; }
	 * 
	 * 
	 * public void setLead(User lead) { this.lead = lead; }
	 */
	
    
	
    
}
