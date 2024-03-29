/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package md19304buoi12;

import demothread.MyThread;
import demothread.MyThread2;
import demothread.MyThread2Cach2;
import demothread.MyThreadCach2;

/**
 *
 * @author syn
 */
public class MD19304Buoi12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cach 1
        // MyThread t1 = new MyThread();
        // t1.start();
        // MyThread2 t2 = new MyThread2();
        // t2.start();
        Thread t1 = new Thread(new MyThreadCach2());
        t1.start();

        Thread t2 = new Thread(new MyThread2Cach2(), "Thread thu hai");
        t2.start();
        System.out.println("So thread dang chay la: " + Thread.activeCount());
        System.out.println(t2.getName());
    }
    
}
