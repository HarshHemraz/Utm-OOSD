/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

/**
 *
 * @author harsh
 */
public class SavingsAccount extends BankAccount {
    protected double interestAccrued;
    
    public SavingsAccount() {
        System.out.println("Empty Constructor");
    }
    public SavingsAccount(int s1, String s2, double s3, double s4) {
        accountNumber = s1;
        accountName = s2;
        accountBalance = s3;
        interestAccrued = s4;
    }
    public void setInterestAccrued(double j1) {
        interestAccrued = j1;
    }
    public double getInterestAccrued() {
        return interestAccrued;
    }
}
