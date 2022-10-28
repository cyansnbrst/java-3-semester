package ru.mirea.lab5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class MainFrame extends JFrame {

    public MainFrame(String arg){
        this.setSize(800, 800);
        JLabel imgLabel = new JLabel("", new ImageIcon(getClass().getResource(arg)), SwingConstants.CENTER);
        getContentPane().add(imgLabel);
    }


}
