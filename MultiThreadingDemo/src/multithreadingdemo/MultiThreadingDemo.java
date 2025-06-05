/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreadingdemo;

/**
 *
 * @author erik rahman
 */
public class MultiThreadingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ThreadExample1 t1 = new ThreadExample1();
        Thread t2 = new Thread(new ThreadExample2());

        t1.start();  // Jalankan Thread 1
        t2.start();  // Jalankan Thread 2

        ThreadExample3.startTask(); // Jalankan Thread 3 via ExecutorService

    }
    
}
