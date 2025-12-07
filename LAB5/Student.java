/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

/**
 *
 * @author harsh
 */
public class Student {
    protected int studentID;
    protected String studentName;
    protected int contactNumber;
    protected String email;
    
    public Student() {
        System.out.println("Empty Constructor");
    }
    public Student(int s1, String s2, int s3, String s4) {
        studentID = s1;
        studentName = s2;
        contactNumber = s3;
        email = s4;
    }
    
    public void setStudentID(int s1) {
        studentID = s1;
    }
    public void setStudentName(String s2) {
        studentName = s2;
    }
    public void setContactNumber(int s3) {
        contactNumber = s3;
    }
    public void setEmail(String s4) {
        email = s4;
    }
    public int getStudentID() {
        return studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public int getContactNumber() {
        return contactNumber;
    }
    public String getEmail() {
        return email;
    }
}
