/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Tiger
 */
public class MyFrame extends JFrame {
    
    private JButton button;
    private JTextField inputF;
    
    public MyFrame(){
        this.setSize(400, 400);
        this.setTitle("Testing Form[Calculator]");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        inputF = new JTextField();
        inputF.setHorizontalAlignment(JTextField.RIGHT);
        inputF.setEditable(false);
        
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        
        String[] operations = {"7", "8", "9", "+", 
                               "4", "5", "6", "-",
                               "1", "2", "3", "*",
                               "0", ".", "=", "/"};
        
        for (String btnLabel : operations) {
            button = new JButton(btnLabel);
            buttonPanel.add(button);
        }
        this.add(inputF, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);
        this.setVisible(true);
        
    }
}
