/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;

/**
 *
 * @author harsh
 */
public abstract class Person {
    protected String lastName;
    protected String firstName;
    protected String NIC;
    
    public Person() {
        System.out.println("Default constructor");
    } 
    
    public void setLastName(String lName) {
        lastName = lName;
    }
    public void setFirstName(String nID) {
        NIC = nID;
    }
    
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getNIC() {
        return NIC;
    }
    
    public abstract double calculateSalary(double amt);
}
