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
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class client {

    public static void main(String args[]) {
        client c = new client();
        c.connectRemote();
    }

    private void connectRemote() {
        try {
            Scanner sc = new Scanner(System.in);
            Registry reg = LocateRegistry.getRegistry("localhost", 5000);
            adder ad = (adder) reg.lookup("hi sever");

//            int a = sc.nextInt();
//            int b = sc.nextInt();
            String MSSV = "";
            while (MSSV != "end") {
                MSSV = sc.nextLine();
                System.out.println(ad.getStudent(MSSV));
            }

        } catch (Exception e) {
        }
    }

}
