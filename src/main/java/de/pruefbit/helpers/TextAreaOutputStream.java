package de.pruefbit.helpers;

import javax.swing.*;
import java.io.OutputStream;

/**
 * Implementation is my own, but follows a stream solution from the book "Java Cookbook"
 * of Ian F. Darwin (Ch. 14.11, 3rd Ed., O'Reilly 2014).
 */
public class TextAreaOutputStream extends OutputStream {

    private final JTextArea textArea;
    private final StringBuilder text = new StringBuilder();

    public TextAreaOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void flush() {
    }

    @Override
    public void close() {
    }

    @Override
    public void write(int b) {
        if (b == '\r') return;
        if (b == '\n') {
            textArea.append(text.toString());
            text.setLength(0);
        }
        text.append((char) b);
    }

}
