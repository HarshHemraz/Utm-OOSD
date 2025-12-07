/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

/**
 *
 * @author harsh
 */
public class BankAccount {
    protected int accountNumber;
    protected String accountName;
    protected double accountBalance;
    
    public BankAccount() {
        System.out.println("Empty Constructor");
    }
    public BankAccount(int s1, String s2, double s3) {
        accountNumber = s1;
        accountName = s2;
        accountBalance = s3;
    }
    public void setAccountNumber(int j1) {
        accountNumber = j1;
    }
    public void setAccountName(String j2) {
        accountName = j2;
    }
    public void setAccountBalance(double j3) {
        accountBalance = j3;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
}
