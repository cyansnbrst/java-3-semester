package ru.mirea.lab5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;


public class MainFrames extends JFrame {

    private final JLabel imgLabel;
    private int imgNum = 1;

    private MainFrames() {
        this.setSize(1200, 1200);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("1.jpg")), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(500, w -> nextImg());
        timer.start();
    }

    private void nextImg() {
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum) + ".jpg")));
        if (imgNum == 3) imgNum = 0;

    }

    public static void main(String[] args) {
        MainFrames mf = new MainFrames();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}