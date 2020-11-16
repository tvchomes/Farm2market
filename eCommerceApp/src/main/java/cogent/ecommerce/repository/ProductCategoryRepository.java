
  package cogent.ecommerce.repository;
  
  import org.springframework.data.jpa.repository.JpaRepository; import
  org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import
  org.springframework.web.bind.annotation.CrossOrigin;
  
  import cogent.ecommerce.entity.ProductCategory;
  
  @CrossOrigin("http://localhost:4200")
  @RepositoryRestResource(collectionResourceRel = "productCategory", path ="product-category") 
  @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
  public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
	  
	  
  }
 