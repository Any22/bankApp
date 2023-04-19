package com.spring.bankApp.entity;
import jakarta.persistence.*;
@Entity
@Table(name="customer_info")

public class Customer {
    @Id
    private String customerId;
    
    private String customerName;
    
    private int customerAge;
   
    private String accountType;

    public Customer() {

    }

    public Customer(String customerId, String customerName, int customerAge, String accountType) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.accountType = accountType;
    }




    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    @Column(name="customerName")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Column(name="customer_age")
    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }
    
    @Column(name="customerAccountType")
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

}
