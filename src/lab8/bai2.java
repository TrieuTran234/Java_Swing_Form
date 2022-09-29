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
public class bai2 {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> listcuatui = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            listcuatui.add(i);

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(listcuatui.get(i));
        }
    }
    
}
