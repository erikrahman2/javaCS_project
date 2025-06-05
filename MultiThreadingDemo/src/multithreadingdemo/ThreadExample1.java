/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadingdemo;

/**
 *
 * @author erik rahman
 */
public class ThreadExample1 extends Thread{
     public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 - Count: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
