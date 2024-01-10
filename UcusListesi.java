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
public class UcusListesi {

    private static UcusListesi instance;
    private List<ucus> ucuslar;

    private UcusListesi() {
        ucuslar = new ArrayList<>();
    }

    public static UcusListesi getInstance() {
        if (instance == null) {
            instance = new UcusListesi();
        }
        return instance;
    }

    public List<ucus> getUcuslar() {
        return ucuslar;
    }

    public void ucusEkle(ucus ucus) {
        ucuslar.add(ucus);
    }
}
