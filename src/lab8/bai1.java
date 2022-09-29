/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class bai1 {
       public static void main(String[] args) {
        // TODO code application logic here
        ArrayList listcuatui = new ArrayList();
        listcuatui.add(12);
        listcuatui.add(12.12);
        listcuatui.add(true);
        listcuatui.add("Xin Chao");
        int a=(Integer)listcuatui.get(0);
        double b=(Double)listcuatui.get(1);
        boolean c=(Boolean)listcuatui.get(2);
        String d=(String)listcuatui.get(3);
        System.out.println("So nguyen: "+a+"\nSo thuc: "+b+"\nGia tri boolean: "+c+"\nXau ky ty: "+d);
        
                
    }
    
}
