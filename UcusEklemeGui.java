/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author yağmur
 */
public class UcusEklemeGui extends JFrame{
    private JLabel labelSeferNo;
    private JTextField textFieldSeferNo;
    private JLabel labelRota;
    private JTextField textFieldRota;
    private JLabel labelKalkisZamani;
    private JTextField textFieldKalkisZamani;
    private JButton ekleButton;
    
    public UcusEklemeGui() {
        setTitle("Uçuş Ekleme Ekranı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);
        
        labelSeferNo = new JLabel("sefer no: ");
        labelSeferNo.setBounds(10, 10, 80, 20);
        add(labelSeferNo);

        textFieldSeferNo = new JTextField();
        textFieldSeferNo.setBounds(100, 10, 150, 20);
        add(textFieldSeferNo);

        labelRota = new JLabel("Rota:");
        labelRota.setBounds(10, 40, 80, 20);
        add(labelRota);

        textFieldRota = new JTextField();
        textFieldRota.setBounds(100, 40, 150, 20);
        add(textFieldRota);

        labelKalkisZamani = new JLabel("Kalkış Zamanı:");
        labelKalkisZamani.setBounds(10, 70, 80, 20);
        add(labelKalkisZamani);

        textFieldKalkisZamani = new JTextField();
        textFieldKalkisZamani.setBounds(100, 70, 150, 20);
        add(textFieldKalkisZamani);

        ekleButton = new JButton("Uçuş Ekle");
        ekleButton.setBounds(100, 100, 100, 30);
        add(ekleButton);

        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Uçuş ekleme işlemleri burada yapılabilir
                 String seferNo = textFieldSeferNo.getText();
                String rota = textFieldRota.getText();
                String kalkisZamani = textFieldKalkisZamani.getText();
                JOptionPane.showMessageDialog(null, "uçuş eklendi");
                setVisible(true);

                // Bu bilgileri kullanarak uçuş eklenmesi işlemi yapılabilir
                // Örneğin, bir listeye eklemek:
                
                dispose(); // Ekranı kapat
            }
        });
    }
}

