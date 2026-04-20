package myprgm;

/*
Question:
Display message "India is pressed" or "SriLanka is pressed"
using JButton and ActionListener
*/

import javax.swing.*;
import java.awt.event.*;

public class Program4B{

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country Button Program");

        JButton indiaBtn = new JButton("India");
        JButton slBtn = new JButton("SriLanka");

        JLabel label = new JLabel("Press a button");

        indiaBtn.setBounds(50, 50, 100, 30);
        slBtn.setBounds(200, 50, 100, 30);
        label.setBounds(50, 100, 300, 30);

        indiaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        slBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("SriLanka is pressed");
            }
        });

        frame.add(indiaBtn);
        frame.add(slBtn);
        frame.add(label);

        frame.setLayout(null);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}