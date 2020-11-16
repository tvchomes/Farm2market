package cogent.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name="task")
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tid;

    @Column(name="job")
    private String job;

    
   
    
    
		/*
		 * @ManyToOne(fetch = FetchType.EAGER)
		 * 
		 * @JoinColumn(name="empid", referencedColumnName = "id") private DAOUser
		 * employee;
		 */
    
    public Task(String job) {
		
		this.job = job;
	}

    
    
    
    public Task() {
    	
    }
    
    
   public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	



	


	/*
	 * public User getEmployee() { return employee; }
	 * 
	 * 
	 * 
	 * public void setEmployee(User employee) { this.employee = employee; }
	 */


	@Override
	public String toString() {
		return "Task [tid=" + tid + ", job=" + job + "]";
	}





	
	
	
    
   }
