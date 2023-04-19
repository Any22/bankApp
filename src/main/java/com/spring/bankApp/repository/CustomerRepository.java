/****************************************************************************************************************
 *    Spring automatically generates the implementation class of the interface and provides default
 *    implementations of the methods.
 ****************************************************************************************************************/
package com.spring.bankApp.repository;
import com.spring.bankApp.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
