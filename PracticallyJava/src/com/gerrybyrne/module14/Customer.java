package com.gerrybyrne.module14;

public class Customer implements java.io.Serializable {

    private int customerAccountNumber;
    private transient int customerAge;
    private String customerName;
    private  String customerAddress;
    private int customerYearsWithCompany;

    public Customer(int accountNumberPassedIn, int agePassedIn, String namePassedIn,
                    String addressPassedIn, int yearsPassedIn) {
        this.customerAccountNumber = accountNumberPassedIn;
        this.customerAge = agePassedIn;
        this.customerName = namePassedIn;
        this.customerAddress = addressPassedIn;
        this.customerYearsWithCompany = yearsPassedIn;
    }

    public int getCustomerAccountNumber() {
        return customerAccountNumber;
    }

    public void setCustomerAccountNumber(int customerAccountNumber) {
        this.customerAccountNumber = customerAccountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public int getCustomerYearsWithCompany() {
        return customerYearsWithCompany;
    }

    public void setCustomerYearsWithCompany(int customerYearsWithCompany) {
        this.customerYearsWithCompany = customerYearsWithCompany;
    }
}
