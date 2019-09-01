package com.example.babysteps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloWorldVisual extends JFrame {

    private HelloWorldVisual(String title) {
        super(title);

        JLabel helloWorldLabel = new JLabel("Hello, world!");
        helloWorldLabel.setPreferredSize(new Dimension(300, 50));
        helloWorldLabel.setVerticalAlignment(SwingConstants.CENTER);
        helloWorldLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel upperPanel = new JPanel();
        upperPanel.add(helloWorldLabel);

        JButton okButton = new JButton("Exit With Sound");
        okButton.addActionListener(e -> {
            Toolkit.getDefaultToolkit().beep();
            dispose();
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> dispose());

        JPanel lowerPanel = new JPanel();
        lowerPanel.add(okButton);
        lowerPanel.add(cancelButton);

        setResizable(false);
        setLayout(new BorderLayout());
        add(BorderLayout.CENTER, upperPanel);
        add(BorderLayout.SOUTH, lowerPanel);
        getRootPane().setDefaultButton(okButton);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        getRootPane().registerKeyboardAction(
                e -> dispose(),
                KeyStroke.getKeyStroke('\033'),
                JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT
        );
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new HelloWorldVisual("Hello World Visual").setVisible(true));
    }
}
