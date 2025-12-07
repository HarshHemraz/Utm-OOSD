/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

/**
 *
 * @author harsh
 */
public class Cylinder extends Circle {
    protected double height;
    
    public Cylinder() {
        System.out.println("Empty Constructor");
    }
    
    public Cylinder(double s1, double s2) {
        radius = s1;
        height = s2;
    }
    
    public void setHeight(double s3) {
        height = s3;
    }
    public double getHeight() {
        return height;
    }
    public double calculateSurfaceArea() {
        double surfaceArea = (2 * Math.PI * (radius * radius)) + (2 * Math.PI * radius * height);
        return surfaceArea;
    }
}
