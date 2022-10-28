package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResult {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Milan vs Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(300, 150));

        JButton milan = new JButton("AC Milan");
        JButton madrid = new JButton("Real Madrid");

        JLabel result = new JLabel("Result: 0 x 0");
        JLabel scorer = new JLabel("Last scorer: N/A");
        JButton winner = new JButton("End match");

        panel.add(milan);
        panel.add(madrid);
        panel.add(result);
        panel.add(scorer);
        panel.add(winner);

        final int[] madrid_score = {0};
        final int[] milan_score = {0};
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scorer.setText("Last scorer: Milan");
                milan_score[0]++;
                result.setText(String.format("Result: %d x %d", milan_score[0], madrid_score[0]));
            }
        });
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scorer.setText("Last scorer: Madrid");
                madrid_score[0]++;
                result.setText(String.format("Result: %d x %d", milan_score[0], madrid_score[0]));
            }
        });
        winner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, madrid_score[0] > milan_score[0] ? "Winner: Real Madrid" : "Winner: AC Milan");
            }
        });
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}