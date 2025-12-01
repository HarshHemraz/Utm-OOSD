/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;
import java.time.LocalDate;
/**
 *
 * @author harsh
 */
public class CinemaTicket {
    private int ticketSerialNumber;
    private LocalDate date;
    private double price;
    private int seatNumber;
    private String theaterID;
    
    public CinemaTicket() {
        System.out.println("Default Constructor is called\n ----------------------");
        ticketSerialNumber = 0000;
        date = LocalDate.now();
        price = 0.0;
        seatNumber = 0;
        theaterID= "0A";
    }
    
    public void setTicketSerialNumber(int ticketNum) {
        ticketSerialNumber = ticketNum;
    }
    public void setDate(LocalDate today) {
        date = today;
    }
    public void setPrice(double pri) {
        price = pri;
    }
    public void setSeatNumber(int seatNum) {
        seatNumber = seatNum;
    }
    public void setTheaterID(String theaterNum) {
        theaterID = theaterNum;
    }
    
    public int getTicketSerialNumber() {
        return ticketSerialNumber;
    }
    public LocalDate getDate() {
        return date;
    }
    public double getPrice() {
        return price;
    }
    public int getSeatNumber() {
        return seatNumber;
    }
    public String getTheaterID() {
        return theaterID;
    }
    
}
