/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author yağmur
 */
public class BiletAlmaGui extends JFrame {
     private JLabel labelUcusNo;
    private JTextField textFieldUcusNo;
    private JLabel labelYolcuAdi;
    private JTextField textFieldYolcuAdi;
    private JComboBox<String> comboBoxYolcuTipi;
    private JComboBox<String> comboBoxKoltukTipi;
    private JButton biletAlButton;

    public BiletAlmaGui() {
        setTitle("Bilet Alma Ekranı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);

        labelUcusNo = new JLabel("Uçuş No:");
        labelUcusNo.setBounds(10, 10, 80, 20);
        add(labelUcusNo);

        textFieldUcusNo = new JTextField();
        textFieldUcusNo.setBounds(100, 10, 150, 20);
        add(textFieldUcusNo);

        labelYolcuAdi = new JLabel("Yolcu Adı:");
        labelYolcuAdi.setBounds(10, 40, 80, 20);
        add(labelYolcuAdi);

        textFieldYolcuAdi = new JTextField();
        textFieldYolcuAdi.setBounds(100, 40, 150, 20);
        add(textFieldYolcuAdi);

        biletAlButton = new JButton("Bilet Al");
        biletAlButton.setBounds(100, 130, 100, 30);
        add(biletAlButton);
        
        comboBoxKoltukTipi=new JComboBox<>(new String[]{"VIP koltuk","ekonomi koltuk"});
        comboBoxKoltukTipi.setBounds(10,100,150,20);
        add(comboBoxKoltukTipi);
        
        comboBoxYolcuTipi=new JComboBox<>(new String[]{"VIP yolcu","standart yolcu"});
        comboBoxYolcuTipi.setBounds(10,70,150,20);
        add(comboBoxYolcuTipi);

        biletAlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Bilet alma işlemleri burada yapılabilir
                String ucusNo = textFieldUcusNo.getText();
                String yolcuAdi = textFieldYolcuAdi.getText();
                String koltukTipi = comboBoxKoltukTipi.getSelectedItem().toString();
                String yolcuTipi = comboBoxYolcuTipi.getSelectedItem().toString();

                String bilet = "Bilet Bilgileri:\nUçuş No: " + ucusNo +
                        "\nYolcu Adı: " + yolcuAdi +
                        "\nKoltuk Tipi: " + koltukTipi +
                        "\nYolcu Tipi: " + yolcuTipi;

                JOptionPane.showMessageDialog(null, bilet);
                dispose(); // Ekranı kapat
            }
        });
    }
     public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BiletAlmaGui biletAlmaGui = new BiletAlmaGui();
            biletAlmaGui.setVisible(true);
        });
}
}

   

