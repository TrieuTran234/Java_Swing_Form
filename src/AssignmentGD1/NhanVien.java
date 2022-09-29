/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentGD1;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class NhanVien implements Serializable{
    private String MaNV;
    private String HoTen;
    private int tuoi;
    private String Email;
    private double Luong;

    /**
     * @return the MaNV
     */
    public String getMaNV() {
        return MaNV;
    }

    /**
     * @param MaNV the MaNV to set
     */
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    /**
     * @return the HoTen
     */
    public String getHoTen() {
        return HoTen;
    }

    /**
     * @param HoTen the HoTen to set
     */
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    /**
     * @return the tuoi
     */
    public int getTuoi() {
        return tuoi;
    }

    /**
     * @param tuoi the tuoi to set
     */
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Luong
     */
    public double getLuong() {
        return Luong;
    }

    /**
     * @param Luong the Luong to set
     */
    public void setLuong(double Luong) {
        this.Luong = Luong;
    }
    
    
}
