/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

import java.util.ArrayList;
import java.util.List;


public class ucus {
     int seferno;
    String rota;
    String kalkis_zamani;
    ucak ucak1;
    double seferUcreti;
    List<personel> personellistesi;
    List<yolcu> yolculistesi;
    List<ucus> ucuslarinlistesi=new ArrayList<>();

    public ucus(int seferno, String rota, String kalkis_zamani, ucak ucak1, List<personel> personellistesi, List<yolcu> yolculistesi, double seferUcreti) {
        this.seferno = seferno;
        this.rota = rota;
        this.kalkis_zamani = kalkis_zamani;
        this.ucak1 = ucak1;
        this.personellistesi = personellistesi;
        this.yolculistesi = yolculistesi;
        this.seferUcreti= seferUcreti;
    }
    public List<ucus> getucuslarinlistesi(){
        return ucuslarinlistesi;
        
    }
    public double getSeferUcreti() {
        return seferUcreti;
    }

    public String getRota() {
        return rota;
    }

    String getKalkisZamani() {
        return kalkis_zamani;
    }

    Object getPersonellistesi() {
        return personellistesi;
    }

    Object getYolculistesi() {
       return yolculistesi;
    }

    int getSeferno() {
       return seferno;
    }
}
