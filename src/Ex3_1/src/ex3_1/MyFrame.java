/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Tiger
 */
public class MyFrame extends JFrame {
    
    private JTextField input1Tf, input2Tf;
    private JButton addBtn, subBtn, clearBtn;
    private JLabel answerLbl;
    
    public MyFrame() {
        this.setSize(400, 400);
        this.setTitle("Swing Add App");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        input1Tf = new JTextField();
        input2Tf = new JTextField();
        addBtn = new JButton("Add");
        subBtn = new JButton("Subtract");
        clearBtn = new JButton("Clear");
        answerLbl = new JLabel("Answer goes here.");
        
        input1Tf.setBounds(20, 20, 150, 30);
        input2Tf.setBounds(180, 20, 150, 30);
        addBtn.setBounds(30, 60, 80, 30);
        subBtn.setBounds(120, 60, 100, 30);
        clearBtn.setBounds(230, 60, 80, 30);
        answerLbl.setBounds(110, 90, 130, 30);
        
        this.add(input1Tf);
        this.add(input2Tf);
        this.add(addBtn);
        this.add(subBtn);
        this.add(clearBtn);
        this.add(answerLbl);
        
        this.setVisible(true);
    }
}
