package app.gestioncli.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Column(name = "DISCOUNT_CODE", length = 1, nullable = false)
    private char discountCode;

    @Column(name = "ZIP", length = 10, nullable = false)
    private String zip;

    @Column(name = "NAME", length = 30)
    private String name;

    @Column(name = "ADDRESSLINE1", length = 30)
    private String addressLine1;

    @Column(name = "ADDRESSLINE2", length = 30)
    private String addressLine2;

    @Column(name = "CITY", length = 25)
    private String city;

    @Column(name = "STATE", length = 2)
    private String state;

    @Column(name = "PHONE", length = 12)
    private String phone;

    @Column(name = "FAX", length = 12)
    private String fax;

    @Column(name = "EMAIL", length = 40)
    private String email;

    @Column(name = "CREDIT_LIMIT")
    private int creditLimit;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public char getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(char discountCode) {
        this.discountCode = discountCode;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    
}