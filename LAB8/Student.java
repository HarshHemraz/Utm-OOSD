/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB8;

/**
 *
 * @author harsh
 */
public class Student extends Person {
    protected String studentID;
    
    public Student() {
        System.out.println("subclass student default constructor");    
    }
    public void setStudentID(String id) {
    studentID = id;
    }
    public String getStudentID() {
        return studentID;
    }
    public double calculateSalary(double amt) {
        return 0;
    }
    public double viewHoursCommunityServeiceWeekly() {
        return 5.0;
    }
    public String viewTrainingDay() {
        return "Saturday";
    }

}
