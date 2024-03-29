/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threaddemo;

/**
 *
 * @author syn
 */
public class MyThreadCach2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        int i = 0;
        while(true) {
            try {
                System.out.println("Tien trinh thu nhat: " + i);
                i++;
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                break;
            }
        }
    }
}
