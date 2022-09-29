/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Nhanvien implements Serializable {

    private String hoten;
    private double luong;

    /**
     * @return the hoten
     */
    public String getHoten() {
        return hoten;
    }

    /**
     * @param hoten the hoten to set
     */
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    /**
     * @return the luong
     */
    public double getLuong() {
        return luong;
    }

    /**
     * @param luong the luong to set
     */
    public void setLuong(double luong) {
        this.luong = luong;
    }

}
