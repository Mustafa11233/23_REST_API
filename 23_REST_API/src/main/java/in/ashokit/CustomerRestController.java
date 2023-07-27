package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Customer;

@RestController
public class CustomerRestController {
	
	@GetMapping("/")
	public Customer getCustomer() {
		Customer c =new Customer();
		c.setId(1);
		 c.setName("Raju");
		 c.setPhno(12345l);
		 c.setEmail("raju@gmail.com");
		 
		 return c;
	}
}
