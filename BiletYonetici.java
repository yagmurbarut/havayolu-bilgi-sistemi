/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

/**
 *
 * @author yağmur
 */
public class BiletYonetici {
    public static Bilet biletOlustur(ucus ucus, yolcu yolcu) {
        String yolcuTipi = yolcu.getTip();
        String koltukTipi = yolcu.getKoltukTipi();

        double fiyat = BiletFiyatHesaplama.biletFiyatiHesapla(ucus, yolcuTipi, koltukTipi);

        return new Bilet(ucus, yolcu, fiyat);
    }
}
