/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demothread;

/**
 *
 * @author syn
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        for(int i = 0; true; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(2000);
            } catch(InterruptedException e) {
                break;
            }
        }
    } 
}
