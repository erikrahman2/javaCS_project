/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadingdemo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author erik rahman
 */
public class ThreadExample3 {
     public static void startTask() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 3 - Count: " + i);
                try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });
        executor.shutdown();
    }
}
