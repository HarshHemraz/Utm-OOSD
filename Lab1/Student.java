/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;
/**
 *
 * @author SPACE4
 */

public class Student {
    public int student_id;
    public String student_name;
    public String student_address;
    public int contact_number;
    
public void setStudentID(int id) {
    student_id = id;
}
public void setStudentName(String name) {
   student_name = name;
}
public void setStudentAddress(String address) {
    student_address = address;
}
public void setContantNum(int contactNum) {
    contact_number = contactNum;
}

public int getStudentId() {
    return student_id;
}
public String getStudentName() {
    return student_name;
}
public String getStudentAddress() {
    return student_address;
}
public int getContactNumber(){
    return contact_number;
}
 }
