/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class SanPham implements Serializable {
    public String ten;
    public double gia;

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

  
    public void setTen(String ten) {
        this.ten = ten;
    }


    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    
}
