package com.example.babysteps;

import javax.swing.*;
import java.awt.*;

class BorderLayoutDemo extends JFrame {

    private BorderLayoutDemo() {
        super("Demo");

        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(220, 20));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(BorderLayout.NORTH, new JButton("North"));
        add(BorderLayout.WEST, new JButton("West"));
        add(BorderLayout.EAST, new JButton("East"));
        add(BorderLayout.CENTER, new JButton("Center"));
        add(BorderLayout.SOUTH, new JButton("South"));

        pack();

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new BorderLayoutDemo().setVisible(true));
    }

}
