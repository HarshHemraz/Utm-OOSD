/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

/**
 *
 * @author harsh
 */
public class Pizza {
    protected String serialID;
    protected String name;
    protected String size;
    protected int price;
    protected String type;
    
   public Pizza() {
       System.out.println("Default Constructor");
   }
   public Pizza(String s1, String s2, String s3, int s4, String s5) {
       serialID = s1;
       name = s2;
       size = s3;
       price = s4;
       type = s5;
   }
 
    
    public String getSerialID() {
        return serialID;
    }
    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }
    public int getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
    
}
