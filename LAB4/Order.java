/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

/**
 *
 * @author harsh
 */
public class Order {
    protected String orderID;
    protected String dateCreated;
    protected String custID;
    protected String serialID;
    protected String deliveryDate;
    protected String paymentID;
    protected String homeDelivery;
    
     public Order(String o, String d, String c, String s, String del, String p, String h) {
          orderID=o;
          dateCreated=d;
          custID=c;
          serialID=s;
          deliveryDate = del;
          paymentID = p;
          homeDelivery=h;
    }
     public String setorderID() {
         return orderID;
     }
     public String setdateCreated() {
         return dateCreated;
     }
     public String setcustID() {
         return custID;
     }
     public String setserialID() {
         return serialID;
     }
     
}
