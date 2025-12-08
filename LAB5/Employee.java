/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

/**
 *
 * @author harsh
 */
public class Employee {
    protected String employeeNIC;
    protected String firstName;
    protected String lastName;
    protected String homeAddress;
    protected int contactNumber;
    protected String jobPosition;
    protected String dataOfJoiningCompany;
    protected double salary;
    
    public Employee() {
        System.out.println("Empty Constructor");
    }
    public Employee(String s1, String s2, String s3) {
        s1 = employeeNIC;
        s2 = firstName;
        s3 = lastName;
    }
    public void setEmployeeNIC(String s1) {
        employeeNIC = s1;
    }
    public void setFirstName(String s2) {
        firstName = s2;
    }
    public void setLastName(String s3) {
        lastName = s3;
    }
    public void setHomeAddress(String s4) {
        homeAddress = s4;
    }
    public void setContactNumber(int s5) {
        contactNumber = s5;
    }
    public void setJobPosition(String s6) {
        jobPosition = s6;
    }
    public void setDataOfJoiningCompany(String s7) {
        dataOfJoiningCompany = s7;
    }
    public void setSalary(double s8) {
        salary = s8;
    }
    public String getEmployeeNIC() {
        return employeeNIC;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getHomeAddress() {
        return homeAddress;
    }
    public int getContactNumber() {
        return contactNumber;
    }
    public String getJobPosition() {
        return jobPosition;
    }
    public String getDataOfJoiningCompany() {
        return dataOfJoiningCompany;
    }
    public double getSalary() {
        return salary;
    }
    
    public double calculateSalary() {
        
        return 0.0;
    }
}
