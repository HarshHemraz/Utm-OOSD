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
public class Payment {
    protected int paymentID;
    protected String type;
    protected double totalAmount;
    protected LocalDate date;
    
    public Payment() {
        System.out.println("Default constructor");
    }
    
    public Payment(int ID, String typeC, double total, LocalDate dateC) {
        paymentID = ID;
        type = typeC;
        totalAmount = total;
        date = dateC;
    }
    
    public int getPaymentID(){
        return paymentID;
    }
    public String getType(){
        return type;
    }
    public double getTotalAmt(){
        return totalAmount;
    }
    public LocalDate getDate() {
        return date;
    }
    
}

