
package lab6;


public class soChan extends Thread{
    @Override
    public void  run(){
        for (int i = 0; i < 20; i+=2) {
            System.out.println("" + i);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
        System.out.println();
    }
    
}
