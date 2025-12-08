/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

/**
 *
 * @author harsh
 */
public class HourlyEmployee extends Employee {
    protected int hoursWorked;
    protected double ratePerHour;
    
    public HourlyEmployee() {
        System.out.println("Empty hourly employee");
    }
    public HourlyEmployee(String s1, String s2, String s3, int s4, double s5) {
        employeeNIC = s1;
        firstName = s2;
        lastName = s3;
        hoursWorked = s4;
        ratePerHour = s5;
    }
    public void setHoursWorked(int j1) {
        hoursWorked = j1;
    }
    public void setRatePerHour(double j2) {
        ratePerHour = j2;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public double getRatePerHour() {
        return ratePerHour;
    }
    @Override
    public double calculateSalary() {
            return hoursWorked * ratePerHour;
    }
}
