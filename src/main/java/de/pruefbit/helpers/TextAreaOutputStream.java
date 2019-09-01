package de.pruefbit.helpers;

import javax.swing.*;
import java.io.OutputStream;

/**
 * Implementation is my own, but follows a solution from the book "Java Cookbook"
 * of Ian F. Darwin (Ch. 14.11, 3rd Ed., O'Reilly 2014).
 */
public class TextAreaOutputStream extends OutputStream {

    private final JTextArea textArea;
    private final StringBuilder lineBuffer = new StringBuilder();

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
    public void write(int ch) {
        if (ch == '\r') return;
        if (ch == '\n') {
            textArea.append(lineBuffer.toString());
            lineBuffer.setLength(0);
        }
        lineBuffer.append((char) ch);
    }

}
