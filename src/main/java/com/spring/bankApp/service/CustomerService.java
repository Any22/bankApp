/*******************************************************************************************************************
 * 3. created a CustomerService  class as Business Service class
 * In Spring service class is singleton when application startsup an instance of service is kept in the memory
 * we use @Service annotation which marks the class as Spring Business service
 * 4 . We inject the dependency of CustomerService in Controller class using @Autowired
 * 5. Now we are moving Arrays.aslist() from CustomerController Class to CustomerService
 ********************************************************************************************************************/
package com.spring.bankApp.service;
import com.spring.bankApp.dto.CustomerDTO;
import com.spring.bankApp.entity.Customer;
import com.spring.bankApp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CustomerService {
      @Autowired
      CustomerRepository customerRepository;
      /****************************************************************************************************************
     * Getting list of all customers from the repository and converting the entities stored in database into DTO.
     ******************************************************************************************************************/
       
      public List<CustomerDTO> getAllCustomersDTO(){
           List<Customer> customers = customerRepository.findAll();
     
           /****************************************************************************************************************
       *    Create an empty array to store all DTOs
       ****************************************************************************************************************/
           List<CustomerDTO> customerDTO = new ArrayList<>();
           for(Customer c:customers){
               customerDTO.add(CustomerDTO.toDTO(c));
           }
           return customerDTO;
       }

//        public CustomerDTO getCustomer( String id){
//
//           Optional<CustomerDTO> customer = customers.stream()
//                                           .filter( e-> e.getCustomerId().equals(id) )
//                                           .findFirst();
//
//                   if (customer.isPresent()){
//                       return customer.get();
//                   }
//                   else {
//                       return null;
//                   }
//    }

//       public void addCustomer (CustomerDTO customer){
//          customers.add(customer);
//       }
//
//        public void updateCustomer(CustomerDTO customer, String id){
//
//           for(int i=0 ; i<= customers.size(); i++) {
//               CustomerDTO c = customers.get(i);
//               if ( c.getCustomerId().equals(id)) {
//                   customers.set(i, customer);
//                   return;
//               }
//           }
//    }

//         public void deleteCustomer( String id) {
//           customers.removeIf(c-> c.getCustomerId().equals(id));
//
//        }
}
