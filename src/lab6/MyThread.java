/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(" "+ i);
                
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
