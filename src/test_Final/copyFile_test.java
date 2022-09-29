
package test_Final;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class copyFile_test {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("z:/HocCode2/Java2/demojava.png");
        //khai báo biến int để chứ dung lượng của ảnh
        int dungLuongFile = fis.available();
        System.out.println(dungLuongFile);
       byte[] motLanDoc =  new byte[307679];
       fis.read(motLanDoc);
       
       FileOutputStream fos = new FileOutputStream("z:/HocCode2/Java2/demojava2.png");
       fos.write(motLanDoc);
       fos.close();
       fis.close();
    }
    
}
