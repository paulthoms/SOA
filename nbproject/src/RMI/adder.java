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
import RMI.Model.Student;
import java.rmi.*;
public interface adder extends Remote {
    public String getStudent(String string) throws RemoteException;
}
