/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package md19305buoi12;

import demothread.MyThread;
import demothread.MyThread2;
import demothread.MyThread2Cach2;
import demothread.MyThreadCach2;

/**
 *
 * @author syn
 */
public class MD19305Buoi12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cach 1
        // MyThread t1 = new MyThread();
        // t1.start();
        // MyThread2 t2 = new MyThread2();
        // t2.start();
        // Cach 2
        Thread t1 = new Thread(new MyThreadCach2(), "Thread thu nhat");
        t1.start();
//        System.out.println(t1.getName());
//        System.out.println(t1.getState());
        Thread t3 = new Thread(new MyThreadCach2());
        Thread t2 = new Thread(new MyThread2Cach2());
        t2.start();
//        System.out.println("So thread: " + Thread.activeCount());
    }
    
}
