/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author yağmur
 */
public class UcusListelemeGui extends JFrame{
    private JTextArea textAreaUcuslar;
    private JButton listeleButton;

    public UcusListelemeGui() {
        setTitle("Uçuş Listeleme Ekranı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);

        textAreaUcuslar = new JTextArea();
        textAreaUcuslar.setBounds(10, 10, 250, 100);
        add(textAreaUcuslar);

        listeleButton = new JButton("Uçuşları Listele");
        listeleButton.setBounds(10, 120, 150, 30);
        add(listeleButton);

        listeleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Uçuş listeleme işlemleri burada yapılabilir
                personel personel1= new personel("ayse hanım","hostes",new ArrayList<ucus>());
                
                ucus ucus1= new ucus(21,"antalya","22-08-2024",new ucak("standart",100,50,20,30,8),new ArrayList<personel>(),new ArrayList<yolcu>(),250);
                ucak ucak1= new ucak("business",100,20,70,10,8);
                ArrayList<personel> personellistesi= new ArrayList<>();
                personellistesi.add(personel1);
              
                textAreaUcuslar.setText("sefer no: "+ucus1.getSeferno() +"\n" +"kalkıs zamani: "+ ucus1.getKalkisZamani() +"\n" +"ucak bilisi :" +ucak1.getTip() +"\n" +"uçak kapasitesi: "+ucak1.getToplam_kapasite() +"\n" +"personel listesi: "+ ucus1.getPersonellistesi() 
                +"\n"+"yolcu listesi :" +ucus1.getYolculistesi());
                
            }
        });
    }
  
}


