/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author yağmur
 */
public class havayoluSistemGUI {
    private JFrame frame;
    private JButton ucusEkleButton;
    private JButton ucusListeleButton;
    private JButton biletAlButton;
    
    public havayoluSistemGUI(){
        frame = new JFrame("Havayolu Sistem GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        ucusEkleButton = new JButton("Uçuş Ekle");
        ucusEkleButton.setBounds(50, 50, 150, 30);
        frame.add(ucusEkleButton);
        
        ucusListeleButton = new JButton("Uçuşları Listele");
        ucusListeleButton.setBounds(50, 100, 150, 30);
        frame.add(ucusListeleButton);

        biletAlButton = new JButton("Bilet Al");
        biletAlButton.setBounds(50, 150, 150, 30);
        frame.add(biletAlButton);
        
        ucusEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Uçuş Ekleme Ekranını Aç
                UcusEklemeGui ucusEklemeGui = new UcusEklemeGui();
                ucusEklemeGui.setVisible(true);
            }
        });
         ucusListeleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Uçuşları Listeleme Ekranını Aç
                UcusListelemeGui ucusListelemeGui = new UcusListelemeGui();
                ucusListelemeGui.setVisible(true);
            }
        });

        biletAlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Bilet Alma Ekranını Aç
                BiletAlmaGui biletAlmaGui = new BiletAlmaGui();
                biletAlmaGui.setVisible(true);
            }
        });
    }
    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new havayoluSistemGUI().setVisible(true);
            }
        });
    }
}
    

