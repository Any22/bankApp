
/*******************************************************************************************************************
 * 2. created a customer DTO class to map all the data
 ********************************************************************************************************************/
package com.spring.bankApp.dto;

import com.spring.bankApp.entity.Customer;

public class CustomerDTO {

    private String customerId;
    private String customerName;
    private int customerAge;
    private String accountType;

   //no constructor is required in DTO class

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    /****************************************************************************************************************
     *    method : Converting entity object into DTO
     *    name : toDTO
     * @param  customer entity object
     * @return customerDTO object
     * By using DTOs, you can transfer only the data that is needed.
     * By converting the Entity objects to DTOs, you can strip away metadata and only transfer
     * the data that is relevant to the business logic.
     ****************************************************************************************************************/
    public static CustomerDTO toDTO(Customer customer){

        CustomerDTO customerDTO = new CustomerDTO();
        
        customerDTO.setCustomerId(customer.getCustomerId());
        customerDTO.setCustomerName(customer.getCustomerName());
        customerDTO.setCustomerAge(customer.getCustomerAge());
        customerDTO.setAccountType(customer.getAccountType());

        return customerDTO;
    }
}