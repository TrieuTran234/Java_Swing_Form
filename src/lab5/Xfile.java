/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Admin
 */
public class Xfile {

    public static byte[] read(String path) throws FileNotFoundException, IOException {

        FileInputStream fis = new FileInputStream(path);
        // lay dung luong file can doc
        int dungluongFile = fis.available();
        byte[] data = new byte[dungluongFile];
        fis.read(data);
        fis.close();
        return data;

    }

    public static byte write(String path, byte[] data) throws FileNotFoundException, IOException {

        FileOutputStream fos = new FileOutputStream(path);

        fos.write(data);
        fos.close();
        return 0;

    }

    public static Object docdoituong(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Object doituong = ois.readObject();
        ois.close();
        return doituong;
    }

    public static void ghidoituong(String path, Object doituong) throws FileNotFoundException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(doituong);
        oos.close();

    }
}
