package personel;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yağmur
 */
public class personel {
    String isim;
    String gorev;
    List<ucus> ucuslarinlistesi=new ArrayList<>();

    public personel(String isim, String gorev,List<ucus> ucuslarinlistesi) {
        this.isim = isim;
        this.gorev = gorev;
        this.ucuslarinlistesi=ucuslarinlistesi;
    }
    public void bilgilerigoster(){
        System.out.println("isim: "+isim);
        System.out.println("görev: " +gorev);
    }
    public  List<ucus> ucuslarilistele(){
        return ucuslarinlistesi;
    }

    public String getIsim() {
        return isim;
    }

    public String getGorev() {
        return gorev;
    }

    public List<ucus> getUcuslarinlistesi() {
        return ucuslarinlistesi;
    }

    @Override
    public String toString() {
        return "personel{" + "isim=" + isim + ", gorev=" + gorev + '}';
    }
    
}
