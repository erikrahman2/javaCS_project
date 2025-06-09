/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erik rahman
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("tokitsu rume");
        PrintNameThread pnt1 = new PrintNameThread("A");
        PrintNameThread pnt2 = new PrintNameThread("B");
        PrintNameThread pnt3 = new PrintNameThread("C");
        PrintNameThread pnt4 = new PrintNameThread("D");

        pnt1.start();
        pnt2.start();
        pnt3.start();
        pnt4.start();

        try {
            pnt1.join();
            pnt2.join();
            pnt3.join();
            pnt4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

