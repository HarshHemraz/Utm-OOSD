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
public class Payment {
    protected String paymentID;
    protected String type;
    protected double totalAmount;
    protected LocalDate date;
    
    public Payment() {
        System.out.println("Default Constructor");
    }
    
    public Payment(String s1, String s2, double s3, LocalDate s4) {
        paymentID= s1;
        type = s2;
        totalAmount = s3;
        date = s4;
    }
    
    public String getPaymentID() {
        return paymentID;
    }
    public String getType() {
        return type;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public LocalDate getDate() {
        return date;
    }
}
