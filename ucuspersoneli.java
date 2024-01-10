/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

import java.util.List;

/**
 *
 * @author yağmur
 */
public class ucuspersoneli extends personel{
     public ucuspersoneli(String isim, String gorev, List<ucus> ucuslarinlistesi) {
        super(isim, gorev, ucuslarinlistesi);
    }
   @Override
    public void bilgilerigoster(){
        System.out.println("personel adi: "+this.isim);
        System.out.println("gorevi: "+this.gorev);
        System.out.println("atandigi ucuslar: "+this.ucuslarinlistesi);
        
    }
    
}
