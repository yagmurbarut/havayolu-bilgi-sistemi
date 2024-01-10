/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yağmur
 */
public class Main {
    public static void main(String[] args) {
      // Örnek bir Ucus oluşturalım
        ucus ucus = new ucus(1, "İstanbul-Ankara", "2023-12-20 12:00:00", new ucak("standart ucak", 200, 70, 50, 80, 10), new ArrayList<>(), new ArrayList<>(),2500);

        // Örnek bir Yolcu oluşturalım
        yolcu yolcu = new yolcu("Ahmet", 1, "İstanbul-Ankara", new ArrayList<>(),"VIP","standart");

        // Bilet fiyatını hesaplayalım
        double fiyat = BiletFiyatHesaplama.biletFiyatiHesapla(ucus, "VIP", "ekonomi");

        // Bilet oluşturalım
        Bilet bilet = new Bilet(ucus, yolcu, fiyat);

        // Bilet bilgilerini ekrana yazdıralım
        System.out.println("Bilet Bilgileri:");
        System.out.println("Uçuş No: " + bilet.getUcus().getSeferno());
        System.out.println("Yolcu Adı: " + bilet.getYolcu().getIsim());
        System.out.println("Fiyat: " + bilet.getFiyat());
    }   
        
 }

