package myprgm;

/*
Question:
Create TabbedPane with Cyan, Magenta, Yellow
and display selected tab color
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Program5D{

    public static void main(String[] args) {

        JFrame frame = new JFrame("CMY Tabs");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        tabbedPane.add("CYAN", cyanPanel);
        tabbedPane.add("MAGENTA", magentaPanel);
        tabbedPane.add("YELLOW", yellowPanel);

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