/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI.Controller;

import Manager.manager;
import RMI.Model.Student;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class controller {
    
    public ArrayList<Student> getAllStudentController(){
        return manager.getInstance().getAllStudent();
    }
    
    public Student getStudentMSSV(String MSSV){
        return manager.getInstance().getStudentByMSSV(MSSV, manager.getInstance().getAllStudent());
    }
    
}
