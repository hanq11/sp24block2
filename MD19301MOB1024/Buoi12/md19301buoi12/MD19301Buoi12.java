/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package md19301buoi12;

import threaddemo.MyThread;
import threaddemo.MyThread2;
import threaddemo.MyThread2Cach2;
import threaddemo.MyThreadCach2;

/**
 *
 * @author syn
 */
public class MD19301Buoi12 {

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
        Thread t1 = new Thread(new MyThreadCach2(), "Thread thu hai");
        t1.start();
//        Thread t2 = new Thread(new MyThread2Cach2());
//        t2.start();
        Thread t2 = Thread.currentThread();
        System.out.println(t2.getName());
        System.out.println(Thread.activeCount());
    }
    
}
