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
        //khởi tạo client
        client c = new client();
        c.connectRemote();
    }

    private void connectRemote() {
        //đăng ký client
        try {
            Scanner sc = new Scanner(System.in);
            Registry reg = LocateRegistry.getRegistry("localhost", 5000);
            adder ad = (adder) reg.lookup("find student");
            String MSSV = "";
            while (!"end".equals(MSSV)) {
                System.out.println("Nhập mã sinh viên: ");
                MSSV = sc.nextLine();
                System.out.println("Thông tin sinh viên: ");
                System.out.println(ad.getStudent(MSSV));
                System.out.println("-----------------------");
            }

        } catch (Exception e) {
        }
    }

}
