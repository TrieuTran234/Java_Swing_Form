/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class soSo extends Thread{
    private JTextField txt;
    
    public soSo(JTextField txt){
        this.txt=txt;
    }
    @Override
    public void run(){
        Date now = new Date();
        Random rnd = new Random(now.getTime());
        for (int i = 0; i < 100; i++) {
            try {
                int num = Math.abs(rnd.nextInt() % 10) ;
                txt.setText(""+num);
                Thread.sleep(20);
                
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
}
