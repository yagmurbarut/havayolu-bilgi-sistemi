/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

/**
 *
 * @author yağmur
 */
public class Bilet {
    private ucus ucus;
    private yolcu yolcu;
    private double fiyat;

    public Bilet(ucus ucus, yolcu yolcu, double fiyat) {
        this.ucus = ucus;
        this.yolcu = yolcu;
        this.fiyat = fiyat;
    }
    public ucus getUcus(){
        return ucus;
    }
    public yolcu getYolcu(){
        return yolcu;
    }
    public double getFiyat(){
        return fiyat;
    }

    public void biletDetayiniGoster() {
        System.out.println("Bilet Detayı:");
        System.out.println("Yolcu Adı: " + yolcu.getIsim());
        System.out.println("Yolcu Tipi: " + yolcu.getTip());
        System.out.println("Koltuk Tipi: " + yolcu.getKoltukTipi());
        System.out.println("Uçuş Bilgisi: " + ucus.getRota() + " - " + ucus.getKalkisZamani());
        System.out.println("Bilet Fiyatı: " + fiyat + " TL");
    }
}
