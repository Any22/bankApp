/****************************************************************************************************************
 * 1. we created a spring boot application then we created a controller package to contain Controller class
 * We annotate the Controller class with @RestController
 * This is Spring MVC controller .
 * This class has particular method which will execute when a request map to that method
 * @RequestMapping is mvc annotation . it tells the spring when there is an URL with provided mapping the method
 * will be excuted .
 * By default, it maps only GET method
 * 6. Now calling method of CustomerService class getallCustomers().
 * {} represents variable in URL
 ****************************************************************************************************************/
package com.spring.bankApp.controller;
import com.spring.bankApp.dto.CustomerDTO;
import com.spring.bankApp.exception.ResourceNotFoundException;
import com.spring.bankApp.repository.CustomerRepository;
import com.spring.bankApp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/")
public class CustomerController {
	
    @Autowired
    private CustomerService customerService;
    
    // get all customers
    @GetMapping("/customers")
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() throws ResourceNotFoundException{
    	
    	List<CustomerDTO> customerDTO = customerService.getAllCustomersDTO();
    	
    	if (customerDTO.isEmpty()) {
    		throw new ResourceNotFoundException("No customer found");
    	}
      return new ResponseEntity<>(customerDTO, HttpStatus.OK);
    }

    //get a customer using id
//    @GetMapping("/customers/{id}")
//    public ResponseEntity<CustomerDTO> getCustomer (@PathVariable String id )throws ResourceNotFoundException {
//    	
//    	CustomerDTO customerDTO = customerService.getCustomer(id);
//    	return new ResponseEntity<>(customerDTO, HttpStatus.OK);
//    }

    //@RequestMapping(method=RequestMethod.POST,value="/customers") this is another way
//    @PostMapping ("/customers")
//    public  void addCustomer( @RequestBody CustomerDTO customer) {
//        customerRepository.save(customer);
//    }

    //updating the customer data
//    @PutMapping("/customers/{id}")
//    public void updateCustomer( @RequestBody CustomerDTO customer,@PathVariable String id) {
//        customerRepository
//    }

    //deleting the data
//    @DeleteMapping("/customers/{id}")
//    public void deleteCustomer(@PathVariable String id) {
//       customerRepository.deleteById(id);
//    }

}
