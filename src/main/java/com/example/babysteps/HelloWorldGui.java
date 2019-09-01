package com.example.babysteps;

import de.pruefbit.helpers.TextAreaOutputStream;

import javax.swing.*;
import java.awt.*;
import java.io.PrintStream;

class HelloWorldGui extends JFrame {

    private static HelloWorldGui gui;
    private static PrintStream out;

    private HelloWorldGui() {
        super("Hello World GUI");

        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(12, 40);
        textArea.setPreferredSize(new Dimension(400, 300));
        add(BorderLayout.CENTER, new JScrollPane(textArea));

        pack();
        setLocationRelativeTo(null);

        out = new PrintStream(new TextAreaOutputStream(textArea));
    }

    public static void main(String[] args) {
        gui = new HelloWorldGui();
        EventQueue.invokeLater(() -> gui.setVisible(true));
        for (var i = 1; i <= 10; i += 1) {
            var s = String.format("%03d: Hello, world!", i);
            EventQueue.invokeLater(() -> out.println(s));
        }
    }
}
