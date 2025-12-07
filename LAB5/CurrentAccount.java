/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

/**
 *
 * @author harsh
 */
public class CurrentAccount extends BankAccount {
    protected double overdraftLimit;
    
    public CurrentAccount() {
        System.out.println("Empty Constructor");
    }
    public CurrentAccount(int s1, String s2, double s3, double s4) {
        accountNumber = s1;
        accountName = s2;
        accountBalance = s3;
        overdraftLimit = s4;
    }
    
    public void setOverdraftLimit(double s5) {
        overdraftLimit = s5;
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
