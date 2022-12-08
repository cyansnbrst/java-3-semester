package ru.mirea.lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Figures extends JFrame {
    public Figures() {
        setSize(600, 600);
        JFrame myWindow = new JFrame("Random Figures");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Paint");
        button.addActionListener((ActionEvent e) -> {
            repaint();
            setVisible(true);
        });
        myWindow.add(button);
        myWindow.pack();
        myWindow.setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void paint(Graphics g) {
        Graphics2D graph = (Graphics2D) g;
        graph.setPaint(new Color(240, 240, 240));
        graph.fillRect(0, 0, 600, 600);
        for (int i = 0; i < 20; i++) {
            Color color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            g.setColor(color);
            int[] arrayx = {(int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i};
            int[] arrayy = {(int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i, (int) (Math.random() * 50) + 50 * i};
            Polygon poly = new Polygon(arrayx, arrayy, 4);
            graph.drawPolygon(poly);
            graph.fillPolygon(poly);
        }

    }

    public static void main(String args[]) {
        Figures app = new Figures();
    }

}