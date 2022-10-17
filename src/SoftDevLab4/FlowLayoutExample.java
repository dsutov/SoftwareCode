package SoftDevLab4;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    private JButton theBTN1 = new JButton("Button 1");
    private JButton theBTN2 = new JButton("2");
    private JButton theBTN3 = new JButton("Button 3");
    private JButton theBTN4 = new JButton("Long-named Button 4");
    private JButton theBTN5 = new JButton("Button 5");

    public FlowLayoutExample(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(theBTN1);
        getContentPane().add(theBTN2);
        getContentPane().add(theBTN3);
        getContentPane().add(theBTN4);
        getContentPane().add(theBTN5);

        setSize(500, 75);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }

}
