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
public class ProductDao extends DAO<SanPham> {

    @Override
    public void update(SanPham enity) {
      for(int i=0;i<listE.size();i++){
          if(listE.get(i).ten.equalsIgnoreCase(enity.ten)){
              listE.set(i, enity);
          }
      }
    }

    @Override
    public SanPham find(Serializable id) {
       for(SanPham p:listE){
           if(p.ten.equals(id)){
               return p;
           }
       }
        return null;
    }
    
}
