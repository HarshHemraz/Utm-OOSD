/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

/**
 *
 * @author harsh
 */
public class Circle extends Shape {
    protected double radius;
    
    public Circle() {
        System.out.println("Empty Constructor");
    }
    
    public Circle(double rad, int ID, String name, String color) {
        radius = rad;
        shapeID = ID;
        shapeName = name;
        shapeColor = color;
    }
    
    public void setRadius(double s1) {
        radius = s1;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double calculateDiameter() {
       double diameter = radius * 2;
        return diameter;
    }
    public double calculateCircumferance() {
        double circumferance = 2 * Math.PI * radius;
        return circumferance;
    }
    public double calculateArea() {
       double area = Math.PI * (radius * radius);
        return area;
    }
    
}
