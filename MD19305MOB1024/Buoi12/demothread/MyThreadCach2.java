/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demothread;

/**
 *
 * @author syn
 */
public class MyThreadCach2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; true; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                break;
            }
        }
    }    
}
