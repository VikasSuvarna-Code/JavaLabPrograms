package myprgm;

/*
Question:
Create TabbedPane with RED, BLUE, GREEN and display color on selection
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Program5B {

    public static void main(String[] args) {

        JFrame frame = new JFrame("RGB Tabs");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        redPanel.setBackground(Color.RED);
        bluePanel.setBackground(Color.BLUE);
        greenPanel.setBackground(Color.GREEN);

        tabbedPane.add("RED", redPanel);
        tabbedPane.add("BLUE", bluePanel);
        tabbedPane.add("GREEN", greenPanel);

        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println("Selected Tab: " +
                        tabbedPane.getTitleAt(tabbedPane.getSelectedIndex()));
            }
        });

        frame.add(tabbedPane);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}