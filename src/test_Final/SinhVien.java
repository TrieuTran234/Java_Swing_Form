/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_Final;


/**
 *
 * @author ASUS
 */
public class SinhVien {
    
    public String ten;
    public String lop;
    public double diem;
   
    
    public String kiemtra(){
        if(this.diem < 5){
            return "Không đạt";
        }
      
        return "Đạt";
    }
    
}
