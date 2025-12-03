/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;
import java.time.LocalDate;
/**
 *
 * @author harsh
 */
public class Order {
    protected String orderID;
    protected LocalDate dateCreated;
    protected String custID;
    protected String serialID;
    protected LocalDate deliveryDate;
    protected String paymentID;
    protected String homeDelivery;
    
    public Order() {
        System.out.println("Default constructor");
    }
     public Order(String o, LocalDate d, String c, String s, LocalDate del, String p, String h) {
          orderID=o;
          dateCreated=d;
          custID=c;
          serialID=s;
          deliveryDate = del;
          paymentID = p;
          homeDelivery=h;
    }
     public String getorderID() {
         return orderID;
     }
     public LocalDate getdateCreated() {
         return dateCreated;
     }
     public String getcustID() {
         return custID;
     }
     public String getserialID() {
         return serialID;
     }
     public LocalDate getDeliveryDate() {
         return deliveryDate;
     }
     public String getPaymentID() {
         return paymentID;
     }
     public String getHomeDelivery() {
         return homeDelivery;
     }
     
}
