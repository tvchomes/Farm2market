package cogent.ecommerce.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.ForeignKey;
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
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "employees")
public class Employee {

	
	@Id
	@GeneratedValue
    private Long id;
	
	
	@Column(name = "name")
    private String name;
	
	
	
	@Column(name = "username", nullable = false)
    private String username;
	
	//@JsonBackReference
	@OneToMany(targetEntity = Task.class, cascade = CascadeType.ALL)
	@JoinColumn(name="emp_fk",  referencedColumnName = "id")
	private List<Task> tasks;

	
	//@JsonBackReference
	@OneToMany(targetEntity = Department.class, cascade = CascadeType.ALL)
	@JoinColumn(name="dept_fk",  referencedColumnName = "id")
	private List<Department> departments;
	
	
	
	
	 public Employee(String name, String username, List<Task> tasks, List<Department> departments) {
		
			this.name = name;
			this.username = username;
			this.tasks = tasks;
			this.departments = departments;
		}

	 
	 public Employee() {}
	
	
	public List<Task> getTasks() {
		return tasks;
	}



	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}



	public List<Department> getDepartments() {
		return departments;
	}



	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}


   public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



   @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", username=" + username + "]";
	}



	
}