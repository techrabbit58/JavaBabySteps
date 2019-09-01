package com.example.babysteps;

import javax.swing.*;
import java.awt.*;

class FizzBuzzGui extends JFrame {

    private FizzBuzzGui() {
        super();
        setTitle("FizzBuzz");

        var text = new JTextArea(10, 24);
        text.setFont(new Font(Font.MONOSPACED, Font.BOLD, 14));

        text.append(" +--------+----------+ \n");
        text.append(" ! NUMBER ! FIZZBUZZ ! \n");
        text.append(" +--------+----------+ \n");

        for (var n = 1; n <= 100; n += 1) {
            text.append(String.format(" !   %3d  ! %8s ! \n", n, FizzBuzz.transform(n)));
        }

        text.append(" +--------+----------+ \n");

        add(new JScrollPane(text));

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        text.registerKeyboardAction(
                e -> dispose(),
                KeyStroke.getKeyStroke('\033'),
                JComponent.WHEN_FOCUSED
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void run() {
        setVisible(true);
    }

    public static void main(String[] args) {
        var gui = new FizzBuzzGui();
        EventQueue.invokeLater(gui::run);
    }

}
