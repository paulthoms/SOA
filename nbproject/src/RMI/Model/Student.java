/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI.Model;

/**
 *
 * @author DELL
 */
public class Student {

    private String MSSV, FullName, Email, ClassRoom, DOB, Address;

    public Student(String MSSV, String FullName, String Email, String ClassRoom, String DOB, String Address) {
        this.MSSV = MSSV;
        this.FullName = FullName;
        this.Email = Email;
        this.DOB = DOB;
        this.ClassRoom = ClassRoom;
        this.Address = Address;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getClassRoom() {
        return ClassRoom;
    }

    public void setClassRoom(String ClassRoom) {
        this.ClassRoom = ClassRoom;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

}
