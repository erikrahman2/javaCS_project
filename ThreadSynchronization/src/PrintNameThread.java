/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erik rahman
 */
class PrintNameThread extends Thread {
    private String name;
    private static final Object lock = new Object();
    
    public PrintNameThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (lock) { 
            for (int i = 0; i < 50; i++) {
                System.out.print(name);
                try {
                    Thread.sleep(10); // Delay kecil untuk menyerupai pola output
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(); // Tambah newline agar pola lebih jelas
        }
    }
}
