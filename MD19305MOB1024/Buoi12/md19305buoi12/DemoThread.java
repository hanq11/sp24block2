/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package md19305buoi12;

/**
 *
 * @author syn
 */
public class DemoThread {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for(int i = 0; true; i++) {
                    System.out.println("Thread 1: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        break;
                    }
                }
            }
        }.start();
        
        new Thread(new Runnable() {
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
        }).start();
    }
}
