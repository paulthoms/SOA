/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import RMI.Model.Student;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class manager {

    private static manager Instance;
    private manager() {

    }

    public static manager getInstance() {
        if (Instance == null) {
            Instance = new manager();
        }
        return Instance;
    }

    public ArrayList getAllStudent() {

        ArrayList<Student> listStudent = new ArrayList<>();

        listStudent.add(new Student("17020962","Tran Hong Phuc" ,"hongphuc@gmail.com", "K62CB", "02/01/1999", "Thanh Hoa"));
        listStudent.add(new Student("17020963", "Tran Hong Ha","hongha@gmail.com", "K62CB", "03/01/1999", "Ha Noi"));

        return listStudent;
    }

    public Student getStudentByMSSV(String MSSV, ArrayList<Student> listStudent) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getMSSV().equals(MSSV)) {
                return listStudent.get(i);
            }
        }
        return null;
    }

}
