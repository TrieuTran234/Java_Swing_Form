/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class bai3_SanPhamManagement {
        public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException  {
        // TODO code application logic here
        SanPham sp1 = new SanPham("Vinmast", 5000000);
        SanPham sp2 = new SanPham("Oppo", 8000000);
        ProductDao dao = new ProductDao();
        dao.add(sp1);
        dao.add(sp2);
        dao.load("Z:/HocCode2/Java2/FileOutput/lab8.txt");
        ProductDao dao2 = new ProductDao();
        dao2.store("Z:/HocCode2/Java2/FileOutput/lab8.txt");
        SanPham sp = dao2.find("Oppo");
        System.out.println("Ten: " + sp.ten);
        System.out.println("\nGia: " + sp.gia);
    }
    
}
