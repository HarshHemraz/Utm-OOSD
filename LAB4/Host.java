/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

/**
 *
 * @author SPACE4
 */
public class Host {
    protected String hostNIC;
    protected String firstName;
    protected String lastName;
    protected String homeAddress;
    protected int contactNumber;
    protected String email;
    protected int taxNo;
    protected String gender;
    protected String nickname;
    
    public Host() {
        System.out.println("Default Constructor");
    }
    
    public Host(String s1, String s2, String s3, String s4, int s5,
                 String s6, int s7, String s8, String s9) {
        hostNIC = s1;
        firstName = s2;
        lastName = s3;
        homeAddress = s4;
        contactNumber = s5;
        email = s6;
        taxNo = s7;
        gender = s8;
        nickname = s9;
    }
    
    public String getHostNIC() {
        return hostNIC;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getHomeaddress() {
        return homeAddress;
    }
    public int getContactNumber() {
        return contactNumber;
    }
    public String getEmail() {
        return email;
    }
    public int getTaxNo() {
        return taxNo;
    }
    public String getGender() {
        return gender;
    }
    public String getNickname() {
        return nickname;
    }
}
