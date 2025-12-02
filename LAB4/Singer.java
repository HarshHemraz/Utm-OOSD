/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;
import java.time.LocalDate;
/**
 *
 * @author SPACE4
 */
public class Singer {
    protected int singerID;
    protected String singerName;
    protected String nationality;
    protected String gender;
    protected LocalDate date;
    
    public Singer() {
        System.out.println("Default Constructor");
    }
    
    public Singer(int s1, String s2, String s3, String s4, LocalDate s5) {
        singerID = s1;
        singerName = s2;
        nationality = s3;
        gender = s4;
        date = s5;
    }
    
    public int getSingerID(){
        return singerID;
    }
    public String getSingerName(){
        return singerName;
    }
    public String getNationality(){
        return nationality;
    }
    public String getGender(){
        return gender;
    }
    public LocalDate getDate(){
        return date;
    }
}
