
package AssignmentGD1;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class dongHotxt extends Thread{
      private JTextField txt;

    public dongHotxt(JTextField txt) {
        this.txt = txt;
    }

    dongHotxt(JLabel txtDongHo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

      @Override
    public  void  run(){
        SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss aa");
        while (true) {            
            Date now = new Date();
            String st = sdf.format(now);
            txt.setText(st);
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
}
