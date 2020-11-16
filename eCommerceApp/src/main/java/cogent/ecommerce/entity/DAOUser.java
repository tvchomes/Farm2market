/*
 * package cogent.ecommerce.entity;
 * 
 * import com.fasterxml.jackson.annotation.JsonIgnore;
 * 
 * import lombok.Data;
 * 
 * import javax.persistence.*;
 * 
 * @Data
 * 
 * @Entity
 * 
 * @Table(name = "user") public class DAOUser {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
 * 
 * @Column private String name;
 * 
 * @Column private String username;
 * 
 * @Column private String password;
 * 
 * 
 * @Enumerated(EnumType.STRING)
 * 
 * @Column(name="role") private Role role;
 * 
 * 
 * public DAOUser(){
 * 
 * }
 * 
 * 
 * 
 * 
 * public DAOUser(String name, String username, String password, Role role) {
 * super(); this.name = name; this.username = username; this.password =
 * password; this.role = role; }
 * 
 * public Role getRole() { return role; }
 * 
 * 
 * public void setRole(Role role) { this.role = role; }
 * 
 * 
 * public String getUsername() { return username; }
 * 
 * public void setUsername(String username) { this.username = username; }
 * 
 * public String getPassword() { return password; }
 * 
 * public void setPassword(String password) { this.password = password; }
 * 
 * public long getId() { return id; }
 * 
 * public void setId(long id) { this.id = id; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * @Override public String toString() { return "DAOUser [id=" + id + ", name=" +
 * name + ", username=" + username + ", password=" + password + ", role=" + role
 * + "]"; }
 * 
 * 
 * }
 */