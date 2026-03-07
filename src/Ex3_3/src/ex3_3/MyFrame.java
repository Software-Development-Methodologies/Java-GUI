/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_3;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Tiger
 */
public class MyFrame extends JFrame {
    
    private JComboBox deliveryOptions;
    private JRadioButton smallBtn, mediumBtn, largeBtn;
    private JCheckBox pepeBtn, anchBtn;
    private JLabel messageLbl;
    
    public MyFrame() {
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Online Pizza Order Services");
        
        smallBtn = new JRadioButton("Small");
        smallBtn.setActionCommand("Small");
        mediumBtn = new JRadioButton("Medium");
        mediumBtn.setActionCommand("Medium");
        largeBtn = new JRadioButton("Large");
        largeBtn.setActionCommand("Large");
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallBtn);
        sizeGroup.add(mediumBtn);
        sizeGroup.add(largeBtn);
        
        JPanel p1 = new JPanel();
        p1.add(smallBtn);
        p1.add(mediumBtn);
        p1.add(largeBtn);
        p1.setBorder(new TitledBorder(new EtchedBorder(), "Size"));
        
        pepeBtn = new JCheckBox("Pepperoni");
        anchBtn = new JCheckBox("Anchovies");
        
        JPanel p2 = new JPanel();
        p2.add(pepeBtn);
        p2.add(anchBtn);
        p2.setBorder(new TitledBorder(new EtchedBorder(), "Toppings"));
        
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());
        
        String[] options = {"(Select a delivery option)", 
            "Eat-in", "Take out", "Home Delivery"};
        deliveryOptions = new JComboBox(options);
        deliveryOptions.setEditable(false);
        
        JPanel p3 = new JPanel();
        p3.add(deliveryOptions);
        p3.setBorder(new TitledBorder(new EtchedBorder(), "Delivery"));
        
        messageLbl = new JLabel("Message goes here");
        
        pane.add(p1);
        pane.add(p2);
        pane.add(p3);
        pane.add(messageLbl);
        
      
        this.setVisible(true);
    }
    
}
