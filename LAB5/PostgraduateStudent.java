/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

/**
 *
 * @author harsh
 */
public class PostgraduateStudent extends Student {
    protected int busPassSerialNumber;
    
    public PostgraduateStudent() {
        System.out.println("Empty Constructor");
    }
    public PostgraduateStudent(int s1, int s2) {
        s1 = studentID;
        s2 = busPassSerialNumber;
    }
    
    public void setBussPassSerialNumber(int s1) {
        busPassSerialNumber = s1;
    }
    public int getBussPassSerialNumber() {
        return busPassSerialNumber;
    }
}
