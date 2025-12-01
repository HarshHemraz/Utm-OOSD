/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;
import java.time.LocalDate;

/**
 *
 * @author SPACE4
 */
public class Order {
    protected int orderID;
    protected LocalDate dateCreated;
    protected int custID;
    protected int serialID;
    protected LocalDate deliveryDate;
    protected int paymentID;
    protected String homedelivery;
    
    public Order() {
        System.out.println("Default Constructor"); 
    }
    public Order(int ID, LocalDate dateC, int cID, int sID, LocalDate dDate, int pID, String homeD) {
        orderID = ID;
        dateCreated = dateC;
        custID = cID;
        serialID = sID;
        deliveryDate = dDate;
        paymentID = pID;
        homedelivery = homeD; 
    }
    public int getOrderID(){
        return orderID;
    }
    public LocalDate getDateCreated(){
        return dateCreated;
    }
    public int getCustID(){
        return custID;
    }
    public int getSerialID(){
        return serialID;
    }
    public LocalDate getDeliveryDate(){
        return deliveryDate;
    }
    public int getPaymentID(){
        return paymentID;
    }
    public String getHomeDelivery(){
        return homedelivery;
    }
   
}
