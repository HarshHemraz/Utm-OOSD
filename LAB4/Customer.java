/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

/**
 *
 * @author SPACE4
 */
public class Customer {
    protected String custNIC;
    protected String name;
    protected String deliveryAdd;
    protected int contactNum;
    protected String email;
    protected String gender;
    
    public Customer() {
        System.out.println("Default Constructor");
    }
    
    public Customer(String NIC, String nameC, String address, int num, String mail, String gen) {
        custNIC = NIC;
        name = nameC;
        deliveryAdd = address;
        contactNum = num;
        email = mail;
        gender = gen;   
    }
    
    public String getCustNIC() {
        return custNIC;
    }
    public String getName() {
        return name;
    }
    public String getDeliveryAdd() {
        return deliveryAdd;
    }
    public int getContactNum() {
        return contactNum;
    }
    public String getEmail() {
        return email;
    }
    public String getGender() {
        return gender;
    }
}
