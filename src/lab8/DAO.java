/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
abstract public class DAO<Enity> {

    protected List<Enity> listE = new ArrayList<Enity>();

    public void add(Enity enity) {
        listE.add(enity);
    }

    public void remove(Enity enity) {
        listE.remove(enity);
    }

    abstract public void update(Enity enity);

    abstract public Enity find(Serializable id);

    public List<Enity> getList() {
        return listE;
    }
    public void store(String path){
        try {
            
        
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream(path));
        listE=(List<Enity>)ois.readObject();
        ois.close();
        } catch (Exception e) {
            System.out.println("Loi o ois ne");
        }
    }
    public void load(String path) {
        try {
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(listE);
        oos.close();
        } catch (Exception e) {
            System.out.println("Loi o oos");
        }
    }
}
