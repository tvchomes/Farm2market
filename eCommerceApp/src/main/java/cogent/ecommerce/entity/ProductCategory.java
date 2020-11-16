package cogent.ecommerce.entity;


import org.apache.log4j.Logger;


import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


  import com.fasterxml.jackson.annotation.JsonBackReference;
  
  import lombok.Getter; import lombok.Setter;
  
  @Entity
  @Table
  (name="product_category") // @Data -- known bug
  
  @Getter
  @Setter 
  
  public class ProductCategory {
	  final static Logger loggy = Logger.getLogger(ProductCategory.class);
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  (name = "id") 
  private Long id;
  
  @Column
  (name = "categoryname") 
  private String categoryName;
  
  
  @JsonBackReference 
  @OneToMany(cascade = CascadeType.ALL, mappedBy ="category") 
  private Set<Product> products;
  
  
   public ProductCategory(String categoryName, Set<Product> products) {
	
	this.categoryName = categoryName;
	this.products = products;
}
public ProductCategory() {
	   
   }
  public Long getId() 
  { return id; }
  
  public void setId(Long id) 
  { this.id = id; }
  
  public String getCategoryName()
  { return categoryName; }
  
  public void setCategoryName(String categoryName) 
  { this.categoryName =categoryName; }
  
  public Set<Product> getProducts() 
  { return products; }
  
  public void setProducts(Set<Product> products) 
  { this.products = products; }
  
  
  
  
  }
  
  
  
  
  
  
  
 