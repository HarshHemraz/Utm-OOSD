package LAB4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SPACE4
 */
public class Pizza {
    protected int serialID;
    protected String name;
    protected String size;
    protected double price;
    protected String type;
    
    public Pizza() {
        System.out.println("Default Constructor");
    }
    public Pizza(int ID, String nameC, String sizeC, double priceC, String typeC) {
        serialID = ID;
        name = nameC;
        size = sizeC;
        price = priceC;
        type = typeC;
    }
    
    public int getSerialID() {
        return serialID;
    }
    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }
    public double getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
}
