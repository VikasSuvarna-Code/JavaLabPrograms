package myprgm;

import javax.swing.*;


import java.awt.*;


/*
Question:
Display message "Hello! VI C, Welcome to Swing Programming"
in blue color, plain font, size 32 using JFrame and JLabel
*/

public class Program4A {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Hello Program");

        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");

        label.setFont(new Font("Arial", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);

        frame.add(label);

        frame.setSize(800, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}