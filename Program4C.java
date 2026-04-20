package myprgm;

/*
Question:
Display message "Digital Clock is pressed" or "Hour Glass is pressed"
using JButton with images and ActionListener
*/

import javax.swing.*;
import java.awt.event.*;

public class Program4C {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Button Program");

        JLabel label = new JLabel("Press an image button");

        // NOTE: Put images inside project folder
        ImageIcon clockIcon = new ImageIcon("digital_clock.jpg");
        ImageIcon hourIcon = new ImageIcon("hour_glass.jpg");

        JButton clockBtn = new JButton(clockIcon);
        JButton hourBtn = new JButton(hourIcon);

        clockBtn.setBounds(50, 50, 120, 120);
        hourBtn.setBounds(200, 50, 120, 120);
        label.setBounds(50, 200, 300, 30);

        clockBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        hourBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.add(clockBtn);
        frame.add(hourBtn);
        frame.add(label);

        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}