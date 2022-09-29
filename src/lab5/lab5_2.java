/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class lab5_2 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("Z:/HocCode2/Java2/FileOutput/outputFile.txt");
            //byte  dùng làm bộ đệm
            byte[] buffer = new byte[1024];
            //length chứa độ dài(byte đọc dc)
            int length;
            //đọc vào bộ đệm từ ký tự 0 đến 1024, trả về ký tự==== mà nó lớn hơn 0> trả chuỗi
            while((length=fis.read(buffer,0,1024))>0){
                String st = new String(buffer,0,length);
                System.out.println("read String: "+st);
            }
        } catch (Exception e) {
        }finally{
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(lab5_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
