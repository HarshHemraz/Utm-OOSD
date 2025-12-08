/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

/**
 *
 * @author harsh
 */
public class CommisionEmployee extends Employee {
    protected int numberOfSales;
    protected double commissionRate;
    
    public CommisionEmployee() {
        System.out.println("Empty CommisionEmployee");
    }
    
    public CommisionEmployee(String s1, String s2, String s3, int s4, double s5) {
        employeeNIC = s1;
        firstName = s2;
        lastName = s3;
        numberOfSales = s4;
        commissionRate = s5;
    }
    
    public void setNumberOfSales(int j1) {
        numberOfSales = j1;
    }
    public void setCommisionRate(int j2) {
        commissionRate = j2;
    }
    public int getNumberOfSales() {
        return numberOfSales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    @Override
    public double calculateSalary() {
            return (numberOfSales * commissionRate) + 8000.0;
    }        
}
