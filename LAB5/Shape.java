/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5;

/**
 *
 * @author harsh
 */
public class Shape {
    protected int shapeID;
    protected String shapeName;
    protected String shapeColor;
    
    public Shape() {
        System.out.println("Empty Constructor");
    }
    
    public Shape(int id, String name, String color) {
        shapeID = id;
        shapeName = name;
        shapeColor = color;
    }
    
    public void setShapeID(int s1) {
        shapeID = s1;
    }
    public void setShapeName(String s2) {
        shapeName = s2;
    }
    public void setShapeColor(String s3) {
        shapeColor = s3;
    }
    
    public int getShapeID() {
        return shapeID;
    }
    public String getShapeName() {
        return shapeName;
    }
    public String getShapeColor() {
        return shapeColor;
    }
}
