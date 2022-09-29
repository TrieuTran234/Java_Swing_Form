
package lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class bai3 {
    public static void main(String[] args) {
        soLe so1 = new soLe();
        soChan so2 = new soChan();
        
        so1.start();
        try {
            so1.join();
        } catch (InterruptedException ex) {
        }
        so2.start();
    }
    
}
