package cogent.ecommerce;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude=(SecurityAutoConfiguration.class))
public class ECommerceAppApplication {
	
	final static Logger loggy = Logger.getLogger(ECommerceAppApplication.class);
	

	public static void main(String[] args) {
		
		loggy.setLevel(Level.INFO);
		
		loggy.info("Logging FarmingLife Backend");
		SpringApplication.run(ECommerceAppApplication.class, args);
		loggy.info("End of log FarmingLife Backend");
	
	}

}
