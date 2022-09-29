
package lab5;
    


import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class HocSinh implements Serializable{
    private String hoten;
    private double diem;
    private String nganh;

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
     * @return the diem
     */
    public double getDiem() {
        return diem;
    }

    /**
     * @param tuoi the tuoi to set
     */
    public void setDiem(double diem) {
        this.diem = diem;
    }

    /**
     * @return the nganh
     */
    public String getNganh() {
        return nganh;
    }

    /**
     * @param nganh the nganh to set
     */
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public HocSinh(String hoten,double diem,String nganh){
        setHoten(hoten);
        setDiem(diem);
        setNganh(nganh);
    }
     public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        List<HocSinh> lisths = new ArrayList<HocSinh>();
        lisths.add(new HocSinh("Hải Triều", 9.5, "IT"));
        lisths.add(new HocSinh("Triều Triều", 8.5, "CNTT"));
        lisths.add(new HocSinh("Đông Triều", 6.5, "UDPM"));
        lisths.add(new HocSinh("Hồng Hồng", 3.5, "IT"));
        Xfile.ghidoituong("Z:/HocCode2/Java2/FileOutput/outputFile.txt", lisths);
        List<HocSinh> lisths2 = (List<HocSinh>) Xfile.docdoituong("Z:/HocCode2/Java2/FileOutput/outputFile.txt");
        for (HocSinh hs : lisths) {
            System.out.println("Họ và tên: " + hs.getHoten());
        }
    }
}

