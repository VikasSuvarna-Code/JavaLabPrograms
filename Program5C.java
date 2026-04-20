package myprgm;

/*
Question:
Display capital of selected country from JList on console
*/

import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Program5C {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country-Capital List");

        String[] countries = {
                "USA", "India", "Vietnam", "Canada", "Denmark",
                "France", "Great Britain", "Japan", "Africa",
                "Greenland", "Singapore"
        };

        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Nairobi");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore City");

        JList<String> list = new JList<>(countries);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String country = list.getSelectedValue();
                    System.out.println(country + " Capital: " + capitalMap.get(country));
                }
            }
        });

        frame.add(new JScrollPane(list));

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}