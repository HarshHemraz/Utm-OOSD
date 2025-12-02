/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

/**
 *
 * @author harsh
 */
public class Customer {
    protected String custNIC;
    protected String name;
    protected String deliveryAddress;
    protected int contactNumber;
    protected String email;
    protected String gender;
    
    
    public Customer(String NIC, String n, String d, int c, String e, String g) {
        custNIC=NIC;
        name=n;
        deliveryAddress=d;
        contactNumber=c;
        email=e;
        gender=g;
    }
   public String getcustNIC() {
       return custNIC;
   }
   public String getname() {
       return custNIC;
   }
   public String getdeliveryAddress() {
       return deliveryAddress;
   }
   public int getcontactNumber() {
       return contactNumber;
   }
   public String getemail() {
       return email;
   }
   public String getgender() {
       return gender;
   }
}
