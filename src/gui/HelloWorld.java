package gui;

import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {

    public HelloWorld() {
        setTitle("Привет МИР!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Привет МИР!", JLabel.CENTER);
        panel.add(label);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorld();
    }
}