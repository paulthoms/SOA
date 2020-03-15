/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

/**
 *
 * @author DELL
 */
import RMI.Controller.controller;
import RMI.Model.Student;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class server extends UnicastRemoteObject implements adder {

    public static ArrayList<Student> list = new ArrayList<>();
    private controller controller = new controller();

    public server() throws RemoteException {

    }

    //phương thức có thể gọi từ client
    @Override
    public String getStudent(String MSSV) throws RemoteException {
        if (controller.getStudentMSSV(MSSV) != null) {
            return controller.getStudentMSSV(MSSV).getMSSV() + "\n"
                    + controller.getStudentMSSV(MSSV).getFullName() + "\n"
                    + controller.getStudentMSSV(MSSV).getClassRoom() + "\n"
                    + controller.getStudentMSSV(MSSV).getEmail() + "\n"
                    + controller.getStudentMSSV(MSSV).getDOB() + "\n"
                    + controller.getStudentMSSV(MSSV).getAddress();
        }
        return "nothing";
    }

    public static void main(String args[]) throws RemoteException, AlreadyBoundException {
        try {
            //khởi tạo và đăng ký server
            Registry reg = LocateRegistry.createRegistry(5000);
            reg.bind("find student", new server());
        } catch (RemoteException e) {

        }
    }

}
