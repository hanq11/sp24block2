/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threaddemo;

/**
 *
 * @author syn
 */
public class MyThread2Cach2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while(true) {
            try {
                System.out.println("Tien trinh thu hai: " + i);
                i++;
                Thread.sleep(2000);
            } catch(InterruptedException e) {
                break;
            }
        }
    }
}
