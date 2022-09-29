/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentGD1;

import lab6.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author ASUS
 */
public class dongHobutton extends Thread{
    private JButton button;

    public dongHobutton(JButton button) {
        this.button = button;
    }
    
    public  void  run(){
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {            
            Date now = new Date();
            String st = sdf.format(now);
            button.setText(st);
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
