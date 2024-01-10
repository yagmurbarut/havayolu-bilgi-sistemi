/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

/**
 *
 * @author yağmur
 */
public class BiletFiyatHesaplama {
    public static double biletFiyatiHesapla(ucus ucus, String yolcuTipi, String koltukTipi) {
        double seferUcreti = getSeferUcreti(ucus);
        double indirimOrani = getYolcuIndirimOrani(yolcuTipi);
        double koltukFiyati = getKoltukFiyati(ucus, koltukTipi);

        // Bilet fiyatı hesapla
         double toplamFiyat = seferUcreti * (1 - indirimOrani) + koltukFiyati;
        return toplamFiyat;
    }

    private static double getSeferUcreti(ucus ucus) {
        // Sefer ücretini buradan alabilirsiniz
        // Örneğin: ucus.getSeferUcreti();
        return 100.0; // Örnek bir değer
    }

    private static double getYolcuIndirimOrani(String yolcuTipi) {
        if (yolcuTipi.equals("VIP")) {
            return 0.20; // VIP yolculara %20 indirim
        } else {
            return 0.0; // Diğer yolculara indirim yok
        }
    }

    private static double getKoltukFiyati(ucus ucus, String koltukTipi) {
        // Koltuk fiyatını buradan alabilirsiniz
        // Örneğin: ucus.getKoltukFiyati(koltukTipi);
        return 50.0; // Örnek bir değer
    }
}
